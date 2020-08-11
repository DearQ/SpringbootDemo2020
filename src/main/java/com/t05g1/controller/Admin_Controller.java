package com.t05g1.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.t05g1.annotation.Log;
import com.t05g1.enums.OperationType;
import com.t05g1.enums.OperationUnit;
import com.t05g1.pojo.Admin_Users;
import com.t05g1.pojo.Admins;
import com.t05g1.pojo.Permission;
import com.t05g1.pojo.Role;
import com.t05g1.pojo.SystemLog;
import com.t05g1.service.AdminService;
import com.t05g1.service.ISystemLogService;
import com.t05g1.service.OrderService;
import com.t05g1.service.PermissionService;
import com.t05g1.service.RolePermissionService;
import com.t05g1.service.RoleService;
import com.t05g1.service.UserRoleService;
import com.t05g1.service.UserService;
import com.t05g1.util.IpUtils;

@Controller
@RequestMapping("admin")
public class Admin_Controller {
	
	@Autowired
	private AdminService adminService; 
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private RolePermissionService rolePermissionService;
	
	@Autowired
	private PermissionService permissionService;
	
	@Autowired
	private UserRoleService userRoleService;
	
	@Autowired
	private ISystemLogService systemLogservice;
	
	@Autowired
	private OrderService orderService;
	
	 /**上传地址*/
    @Value("${file.upload.path}")
    private String filePath;
    
   
    /***
     * 管理员列表
     * @param curr
     * @param limit
     * @param admin
     * @return
     */
    @Log(detail = "查看管理员操作",level = 1,operationUnit = OperationUnit.COMMODITY,operationType = OperationType.SELECT)
    @ResponseBody
    @RequestMapping("/showAdminData")
    public Map<String,Object> showAdmin(
    		@RequestParam(value = "a_adminName", required = false) String a_adminName,
			@RequestParam(value = "a_id", required = false, defaultValue = "0") int a_id,
    		@RequestParam(value = "page", required = false, defaultValue = "1") int curr,
			@RequestParam(value = "limit", required = false, defaultValue = "10") int limit			
			) { 
    	List<Admins> datas = adminService.queryAllDataFromTable(curr, limit,a_adminName, a_id);
    	int countx = adminService.queryAllCount(a_adminName, a_id);
    	Map<String,Object> map = new HashMap<>();    	

    	map.put("code", 0);
		map.put("msg", "");
		map.put("count", countx);
		map.put("data", datas);
    	
    	return map;
    }
    /***
     * 分配角色页面
     * @param mv
     * @param id
     * @return
     */
    @RequestMapping("assiginRoles.do")
     public ModelAndView addRole(ModelAndView mv,String id){

    	List<Role> roleList = roleService.list();
    	
    	
    	Admins admins = adminService.get(Integer.valueOf(id));
    	
    	List<Role> roles = roleService.listRoles(admins);
    	
    	mv.addObject("roleList",roleList);
    	mv.addObject("admins", admins);
    	mv.addObject("roles",roles);
    	
    	mv.setViewName("admin/admin-assiginroles.html");
    	
		return mv;
    	    	
    }
    /***
     * 分配角色
     * @param admins
     * @param roleIds
     * @return
     */
    @Log(detail = "角色分配操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.INSERT)
    @ResponseBody
    @RequestMapping("/assiginRoles")
	public Map<String,Object> update(Integer a_id, long[] roleIds) {
    	System.out.println(roleIds);
    	
    	Admins admins = new Admins();
    	admins.setA_id(a_id);
    	
		int res = userRoleService.setRoles(admins, roleIds);
		
		Map<String,Object> map = new HashMap<>();
		
		map.put("res",res);

		return map;

	}
    /***
     * 添加管理员
     * @param model
     * @param name
     * @param password
     * @return
     */
    @Log(detail = "添加管理员操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.INSERT)
     @ResponseBody
     @RequestMapping("/addAdmin")
     public Map<String,Object> add(Model model, String name, String password) {
    	 String salt = new SecureRandomNumberGenerator().nextBytes().toString();
    	 int times = 2;
    	 String  algorithmName = "md5";
    	 
    	 String encodePassword = new SimpleHash(algorithmName, password, salt,times).toString();
    	 
    	 Map<String, Object> map = new HashMap<>();
    	 
    	 Admins admin = new Admins();
    	 admin.setA_adminName(name);
    	 admin.setA_password(encodePassword);
    	 admin.setSalt(salt);
    	 int res = adminService.add(admin);
    	 
    	 map.put("res", res);
    	 
    	 return map;
     }
     /***
      * 删除管理员
      * @param a_id
      * @return
      */
     @Log(detail = "删除管理员操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.DELETE)
     @ResponseBody
     @RequestMapping("/delAdminById")
     public Map<String,Object> delAdminById(int a_id){
    	     	
    	 Map<String, Object> map = new HashMap<>();
    	 
    	 int res = adminService.delete(a_id);
    	 
    	 map.put("res", res);
    	 
    	 return map;
     }
     /***
      * 是否启用
      * @param a_id
      * @param a_holder
      * @return
      */
    @Log(detail = "改变管理员状态操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.UPDATE)
     @ResponseBody
     @RequestMapping("/isStart")
     public Map<String,Object> isStart(int a_id,String a_holder){
    	 
    	 Map<String, Object> map = new HashMap<>();
    	 
    	 int res = adminService.isState(a_id, a_holder);
    	 
    	 map.put("res", res);
    	 
    	 return map;
     }
     /***
      * 角色列表
      * @param curr
      * @param limit
      * @return
      */
    @Log(detail = "查看角色操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.SELECT)
     @ResponseBody
     @RequestMapping("/showRoleData")
     public Map<String,Object> showRoleData(
    			@RequestParam(value = "page", required = false, defaultValue = "1") int curr,
    			@RequestParam(value = "limit", required = false, defaultValue = "10") int limit){
    	 
    	 Map<String,Object> map = new HashMap<>();
    	 
    	 List<Role> datas = roleService.queryAllDataFromTable(curr, limit);   	 
    	
    	 int countx = roleService.queryAllCount();    	 
    	 map.put("code", 0);
 		 map.put("msg", "");
 		 map.put("count", countx);
 		 map.put("data", datas);
    	 
    	 return map;
     }
    /***
     * 删除角色
     * @param id
     * @return
     */
    @Log(detail = "删除角色操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.DELETE)
     @ResponseBody
     @RequestMapping("/delRoleById")
     public Map<String,Object> delRoleById(Long id){
    	     	
    	 Map<String, Object> map = new HashMap<>();
    	 
    	 int res = roleService.delete(id);
    	 
    	 map.put("res", res);
    	 
    	 return map;
     }
     /***
      * 配置权限页面
      * @param mv
      * @return
      */
     @RequestMapping("/editRole.do")
     public ModelAndView editRole(ModelAndView mv,Long id){

       Role role = roleService.get(id);
    	
       List<Permission> ps = permissionService.list();
       
       List<Permission> currentPermissions = permissionService.list(role);
       
       List<Long> psList = new ArrayList<>();
       
       for (Permission permission : currentPermissions) {
    	   psList.add(permission.getId());   	   
	}
       mv.addObject("psList",psList);
       mv.addObject("role", role);
       mv.addObject("ps", ps);
       //mv.addObject("currentPermissions", currentPermissions);
       mv.setViewName("admin/admin-editrole.html");
       	
   	return mv;
       	    	
       }
     /***
      * 配置权限
      * @param role
      * @param permissionIds
      * @return
      */
     @Log(detail = "权限配置操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.UPDATE)
     @ResponseBody
     @RequestMapping("/updateRole")
 	public Map<String,Object> update(Role role, long[] permissionIds) {
    	 
    	System.out.println(permissionIds);
    	
 		rolePermissionService.setPermissions(role, permissionIds);
 		int res = roleService.update(role);
 		
 		Map<String,Object> map = new HashMap<>();
 		map.put("res",res);
 		
 		return map;
 	}
     /***
      * 添加角色
      * @param name
      * @param desc_
      * @return
      */
     @Log(detail = "添加角色操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.INSERT)
     @ResponseBody
     @RequestMapping("/addRole")
     public Map<String,Object> addRole(String name,String desc_){
    	 
    	 Map<String,Object> map = new HashMap<>();
    	 
    	 Role role = new Role();
    	 role.setName(name);
    	 role.setDesc_(desc_);
    	 int res = roleService.add(role);
    	 
    	 map.put("res", res);
    	 
		return map;
     }
     /***
      * 查看权限
      * @param mv
      * @param id
      * @return
      */
     @ResponseBody
     @RequestMapping("/showRolePermission.do")
     public ModelAndView showRolePermission( ModelAndView mv,long id){
    	 
    	 Role role = roleService.get(id);     	
         
         List<Permission> currentPermissions = permissionService.list(role);
         
         mv.addObject("currentPermissions", currentPermissions);
         mv.setViewName("admin/admin-rolePermission.html");
         	
     	return mv;
         	    	
         }
     /***
      * 权限列表
      * @param curr
      * @param limit
      * @return
      */
     @Log(detail = "查看权限操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.SELECT)
     @ResponseBody
     @RequestMapping("/showPermissionData")
     public Map<String,Object> showPermissionDate(@RequestParam(value = "page", required = false, defaultValue = "1") int curr,
 			@RequestParam(value = "limit", required = false, defaultValue = "10") int limit){
    	 
    	 List<Permission> datas = permissionService.queryAllDataFromTable(curr, limit);
    	 int countx = permissionService.queryAllCount();
    	 Map<String,Object> map = new HashMap<>();
    	 
    	 map.put("code", 0);
 		 map.put("msg", "");
 		 map.put("count", countx);
 		 map.put("data", datas);
 		 
    	 return map;
     }
     /***
      * 删除权限
      * @param id
      * @return
      */
     @Log(detail = "删除权限操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.DELETE)
     @ResponseBody
     @RequestMapping("/delPermissionById")
     public Map<String,Object> delPermissionById(Long id){
    	     	
    	 Map<String, Object> map = new HashMap<>();
    	 
    	 int res = permissionService.delete(id);
    	 
    	 map.put("res", res);
    	 
    	 return map;
     }
     /***
      * 添加权限
      * @param name
      * @param desc_
      * @return
      */
     @Log(detail = "添加权限操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.INSERT)
     @ResponseBody
     @RequestMapping("/addPermission")
     public Map<String,Object> addPermission(String name,String desc_,String url){
    	 
    	 Map<String,Object> map = new HashMap<>();
    	 
    	Permission permission = new Permission();
    	permission.setName(name);
    	permission.setDesc_(desc_);
    	permission.setUrl(url);
    	
    	int res = permissionService.add(permission);
    	 
    	 map.put("res", res);
    	 
		return map;
     }
     /***
      * 编辑权限
      * @param ps
      * @return
      */
     @Log(detail = "修改权限操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.UPDATE)
    @ResponseBody
    @RequestMapping("/updatePermission")
    public Map<String,Object> updatePermission(Permission ps){
    	
    	Map<String,Object> map = new HashMap<>();
    	
    	int res = permissionService.update(ps);
    	
    	map.put("res",res);
    	
    	return map;
    	
    }

    //头像上传
    @RequestMapping(value="updatePersonalById.do")
    public @ResponseBody String updatePersonal(@RequestParam("file") MultipartFile file,@ModelAttribute Admins ui,HttpServletRequest request) throws IllegalStateException, IOException{
        //获取上传文件名
        String oldName = file.getOriginalFilename();
        //定义上传文件路径
        String path = filePath+"adminPhoto/";
        //改名卡
        String fileName = changeName(oldName);
        //文件相对路径
        String rappendix = "/img/upload/adminPhoto/" + fileName;
        //文件绝对路径
        fileName = path + File.separator + fileName;
       // 新建文件
        File file1 = new File(fileName);
        if(!file1.exists()){
            //先得到文件的上级目录，并创建上级目录，在创建文件
            file1.getParentFile().mkdir();
            try {
                //创建文件
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         // 写入文件
        file.transferTo(file1);

        String str = "{\"code\": 0,\"msg\": \"\",\"data\": {\"src\":\"" + rappendix + "\"}}";
        System.out.println(str);
        System.out.println(file1);
        return str;

    }
    //改名卡
    public static String changeName(String oldName){

        Random r = new Random();

        Date d = new Date();

        String newName = oldName.substring(oldName.indexOf('.'));

        newName = r.nextInt(99999999) + d.getTime() + newName;
        System.out.println(newName);
        return newName;

    }
    //修改管理员信息
    @Log(detail = "修改个人信息操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.UPDATE)
    @RequestMapping(value="updatePersonalByIdSuccess.do")
    public  String updatePersonalByIdSuccess(@ModelAttribute Admins ui){ 
        
        int a = adminService.Update(ui);

        if(a!=0){

            return "redirect:index.do";

        }

        return "error";

    }
    /***
     * 用户列表
     * @param u_name
     * @param u_type
     * @param curr
     * @param limit
     * @return
     */
    @Log(detail = "查看用户操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.SELECT)
    @ResponseBody
    @RequestMapping("/showUsersData.do")
    public Map<String,Object> showUsers(
    		@RequestParam(value = "u_name", required = false) String u_name,
			@RequestParam(value = "u_type",required = false, defaultValue = "0") Integer u_type,
    		@RequestParam(value = "page", required = false, defaultValue = "1") int curr,
			@RequestParam(value = "limit", required = false, defaultValue = "10") int limit
			) { 
    	System.out.println(u_name);
    	System.out.println(u_type);
    	List<Admin_Users> datas = adminService.queryAllDataFromByUsersTable(curr, limit, u_name, u_type);
    	int countx = adminService.queryAllByUsersCount(u_name, u_type);
    	Map<String,Object> map = new HashMap<>();
    	
    	map.put("code", 0);
		map.put("msg", "");
		map.put("count", countx);
		map.put("data", datas);
    	
    	return map;
    }
    /**
     * 添加用户
     * @param users
     * @return
     */
    @Log(detail = "添加用户操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.INSERT)
    @ResponseBody
    @RequestMapping("/addUser.do")
    public Map<String,Object> addUser(Admin_Users users){
    	
	    Map<String,Object> map = new HashMap<>();
    	
    	int res = adminService.insertSelective(users);
    	
    	map.put("res", res);
    	
    	return map;
    }
    /***
     * 删除用户
     * @param u_id
     * @return
     */
    @Log(detail = "删除用户操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.DELETE)
    @ResponseBody
    @RequestMapping("/delUser.do")
    public Map<String,Object> delUser(@RequestParam(value = "u_id")Integer u_id){
    	
    	Map<String,Object> map = new HashMap<>();
    	
    	int res = adminService.delUsers(u_id);
    	
    	map.put("res", res);
    	
    	return map;
    }
    /**
     * 编辑用户
     * @param users
     * @return
     */
   @Log(detail = "编辑用户信息操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.UPDATE)
   @ResponseBody
   @RequestMapping("/updateUser.do")
   public Map<String,Object> updateUser(Admin_Users users){
	   
	    Map<String,Object> map = new HashMap<>();
    	
    	int res = adminService.updateUsers(users);
    	
    	map.put("res", res);
	   
	   return map;
   }
   /**
    * 改变用户状态操作
    */
   @Log(detail = "改变用户状态操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.UPDATE)
   @ResponseBody
   @RequestMapping("/UserBlockOrStart.do")
   public Map<String,Object> UserBlockOrStart(int u_id,int u_type){
	   
	   int res = adminService.UserBlockOrStart(u_id, u_type);
	   Map<String,Object> map = new HashMap<>();
	   
	   map.put("res", res);
	   return map;
   }
   
   @Log(detail = "查看系统日志操作",level = 1,operationUnit = OperationUnit.ADMINS,operationType = OperationType.UPDATE)
   @ResponseBody
   @RequestMapping("/showLogData.do")
   public Map<String,Object> showLogData(
		@RequestParam(value = "page", required = false, defaultValue = "1") int curr,
		@RequestParam(value = "limit", required = false, defaultValue = "10") int limit) { 
		   	List<SystemLog> datas = systemLogservice.queryAllDataFromTable(curr, limit);
		   	int countx = systemLogservice.queryAllCount();
		   	Map<String,Object> map = new HashMap<>();
		   	
		   	map.put("code", 0);
			map.put("msg", "");
			map.put("count", countx);
			map.put("data", datas);
		   	
		   	return map;
		   }
   
   	//主页数据
       @RequestMapping("index.do")
         public ModelAndView index(ModelAndView mv){
       	
           mv.setViewName("admin/index.html");
       	
   		return mv;
       }
       
       //进入首页
       @RequestMapping("home.do")
       public ModelAndView comeindex(ModelAndView mv){
    
    	Calendar now = Calendar.getInstance();
    	int orderNum = orderService.queryAllCount(null, 0,0, 0);
    	int userNum = adminService.selectId();
    	int moneyNum = orderService.sumMoney();
    	
   	     mv.addObject("moneyNum",moneyNum);
    	 mv.addObject("userNum", userNum);
    	 mv.addObject("orderNum", orderNum);
    	 mv.addObject("years",now.get(Calendar.YEAR));
    	 mv.addObject("month",(now.get(Calendar.MONTH) + 1));
    	 mv.addObject("day",now.get(Calendar.DAY_OF_MONTH));
    	 mv.addObject("hour",now.get(Calendar.HOUR_OF_DAY));
    	 mv.addObject("minute",now.get(Calendar.MINUTE));
    	 mv.addObject("IP",IpUtils.intranetIp());
    	 
         mv.setViewName("admin/home.html");
     	
   		return mv;
       }


}
