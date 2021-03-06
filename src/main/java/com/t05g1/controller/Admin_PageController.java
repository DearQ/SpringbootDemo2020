package com.t05g1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.t05g1.pojo.Admins;
import com.t05g1.pojo.Brand;
import com.t05g1.pojo.Category;
import com.t05g1.pojo.Colour;
import com.t05g1.pojo.Commodity;
import com.t05g1.pojo.Commtypepricr;
import com.t05g1.pojo.PropertyValue;
import com.t05g1.service.AdminService;
import com.t05g1.service.BrandService;
import com.t05g1.service.CategoryService;
import com.t05g1.service.ColourService;
import com.t05g1.service.CommodityService;
import com.t05g1.service.CommotypepricrService;
import com.t05g1.service.PropertyValueService;

//专门用于显示页面的控制器
@Controller
@RequestMapping("")
public class Admin_PageController {
	
	@Autowired
	private AdminService adminService; 

	@Autowired
	private CommodityService commodityService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private BrandService brandService;

	@Autowired
	private ColourService colourService;

	@Autowired
	private CommotypepricrService commotypepricrService;


	@Autowired
	private PropertyValueService propertyValueService;		

	//登录页面
    @RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(){
    	   	
		return  "admin/login";
    } 
    
    //打开个人信息
    @RequestMapping("/personalinfomation.do")
    public ModelAndView personalinfomation(ModelAndView mv){
  	
    long id= 1;
    
    Admins admins = adminService.FindUserByUserId(id);
    
    System.out.println(admins.toString());
     mv.addObject("admins",admins);
      
     mv.setViewName("admin/updatefile.html");
  	
	return mv;
  }
    
    //打开品牌管理
    @RequestMapping("/brandlist.do")
    public ModelAndView  brandlist(ModelAndView mv){
  	
      mv.setViewName("admin/brand-list.html");
  	
		return mv;
  }
   
  //打开分类管理页
    @RequestMapping("/producttypelist.do")
    public ModelAndView  producttypelist(ModelAndView mv){
  	
      mv.setViewName("admin/product-typelist.html");
  	
		return mv;
  }
  //打开管理员列表页
    @RequestMapping("/adminlist.do")
    public ModelAndView adminlist(ModelAndView mv){
    	
    	mv.setViewName("admin/admin-list.html");
    	
		return mv;
    	    	
    }
  //打开角色列表页
    @RequestMapping("/adminrole.do")
    public ModelAndView adminrole(ModelAndView mv){
    	
    	mv.setViewName("admin/admin-role.html");
    	
		return mv;
    	    	
    }
  //打开权限列表页
    @RequestMapping("/adminrule.do")
    public ModelAndView adminrule(ModelAndView mv){
    	
    	mv.setViewName("admin/admin-rule.html");
    	
		return mv;
    	    	
    }
	// 商品列表页
	@RequestMapping("/productlist.do")
	public ModelAndView productlist(ModelAndView mv) {
		// 获取商品类型
		List<Category> catList = categoryService.selectByExample();
		// 获取品牌类型
		List<Brand> braList = brandService.selectByExample();

		mv.addObject("catList", catList);
		mv.addObject("braList", braList);

		mv.setViewName("admin/product-list.html");

		return mv;
	}
    
	// 添加商品页面
		@RequestMapping("/productadd.do")
		public ModelAndView productadd(ModelAndView mv) {
			// 获取商品类型
			List<Category> catList = categoryService.selectByExample();
			// 获取商品列表
			List<Brand> braList = brandService.selectByExample();
			// 获取颜色
			List<Colour> colList = colourService.selectByExample();
			// 获取版本
			List<Commtypepricr> comList = commotypepricrService.selectByExample();

			mv.addObject("braList", braList);
			mv.addObject("catList", catList);
			mv.addObject("colList", colList);
			mv.addObject("comList", comList);

			// mv.setViewName("admin/TestPage.html");
			mv.setViewName("admin/product-add.html");

			return mv;
		}
		

		// 查看商品页面
		@RequestMapping("/productdetail.do")
		public ModelAndView productDetail(ModelAndView mv) {

			mv.setViewName("admin/product-detail.html");

			return mv;
		}

		// 修改商品页面
		@RequestMapping("/productupdate.do")
		public ModelAndView productUpdate(ModelAndView mv) {

			// 获取商品类型
			List<Category> catList = categoryService.selectByExample();
			// 获取商品列表
			List<Brand> braList = brandService.selectByExample();
			// 获取颜色
			List<Colour> colList = colourService.selectByExample();
			// 获取版本
			List<Commtypepricr> comList = commotypepricrService.selectByExample();

			mv.addObject("braList", braList);
			mv.addObject("catList", catList);
			mv.addObject("colList", colList);
			mv.addObject("comList", comList);

			mv.setViewName("admin/product-update.html");

			return mv;
		}
		
		// 属性设置页
		@RequestMapping("/propertyValue_edit.do")
		public String edit(Model model, int c_id) {

			Commodity com = commodityService.selectProductDetail(c_id);
			propertyValueService.init(com);
			List<PropertyValue> pvs = propertyValueService.list(com.getC_id());
            for (PropertyValue propertyValue : pvs) {
				System.out.println(propertyValue.toString());
				
			}
			model.addAttribute("com", com);
			model.addAttribute("pvs", pvs);
			
			return "admin/TextPropertyValue.html";
		}
		
		// 图片管理页面
		@RequestMapping(value = "/imagesMG.do")
		public ModelAndView imagemg(ModelAndView mv,Integer cid) {

			mv.addObject("cid",cid);
			mv.setViewName("admin/product-Image.html");

			return mv;

		}
		//版本管理页面		
		@RequestMapping(value = "/colourMG.do")
		public ModelAndView colour(ModelAndView mv,Integer cid) {

			mv.addObject("cid",cid);
			mv.setViewName("admin/colour-list.html");

			return mv;

				}
		//添加版本页面
		@RequestMapping(value="/colouradd.do")
		public ModelAndView addColour(ModelAndView mv,Integer cid) {
			
			mv.addObject("cid",cid);
			mv.setViewName("admin/colour-add.html");
			return mv;
		}
		// 添加图片页面
		@RequestMapping(value = "/images.do")
		public ModelAndView addimagemg(ModelAndView mv, Integer commId) {

			// mv.addObject("cid",cid);
			// 测试

			List<Colour> colList = colourService.selectColorById(commId);
			mv.addObject("commId", commId);
			mv.addObject("colList", colList);
			mv.setViewName("admin/Test-imageadd.html");

			return mv;

		}
		
		 //编辑商品图片页面
		@RequestMapping(value = "/imagesupdate.do")
		public ModelAndView imageupdate(ModelAndView mv) {

				// mv.addObject("cid",cid);
			mv.setViewName("admin/image-update.html");

			return mv;

			}
		
		// 添加商品类型页面
		@RequestMapping("/categorytadd.do")
		public ModelAndView categoryadd(ModelAndView mv) {

			mv.setViewName("admin/product-addtype.html");

			return mv;
		}
		
		// 修改商品类型页面
		@RequestMapping("/productupdateCategory.do")
		public ModelAndView productUpdateCategory(ModelAndView mv) {

			mv.setViewName("admin/product-updateCategory.html");

			return mv;
		}
		
		// 添加品牌页面
		@RequestMapping("/brandAdd.do")
		public ModelAndView brandAdd(ModelAndView mv) {

			mv.setViewName("admin/brand-add.html");

			return mv;
		}
		
		// 修改品牌页面
		@RequestMapping(value = "/brandupdate.do")
		public ModelAndView brandupdate(ModelAndView mv) {

			mv.setViewName("admin/brand-update.html");

			return mv;

		}
		// 属性管理页
		@RequestMapping(value = "/showproperty.do")
		public ModelAndView showproperty(ModelAndView mv) {

			mv.setViewName("admin/product-property.html");
			return mv;
		}
		
		// 添加属性页面
		@RequestMapping(value = "/addProperty.do")
		public ModelAndView addProperty(ModelAndView mv, Integer cid) {

			mv.addObject("cid", cid);
			mv.setViewName("admin/product-addproperty.html");

			return mv;

		}
		
		// 编辑属性页
		@RequestMapping(value = "/propertyupdate.do")
		public ModelAndView updateProperty(ModelAndView mv) {

			mv.setViewName("admin/product-propertyupdate.html");

			return mv;

		}
		
		// 类型商品页面
		@RequestMapping("/categoryProduct.do")
		public ModelAndView categoryProduct(ModelAndView mv) {

			mv.setViewName("admin/category-productlist.html");

			return mv;
		}

		// 品牌商品页面
		@RequestMapping("/brandProduct.do")
		public ModelAndView brandProduct(ModelAndView mv) {

			mv.setViewName("admin/brand-productlist.html");

			return mv;
		}
    	//用户列表页
		@RequestMapping("/UsersList.do")
		public ModelAndView UsersList(ModelAndView mv) {

			mv.setViewName("admin/users-list.html");

			return mv;
		}
		
		//添加用户页面
		@RequestMapping("/UsersAdd.do")
		public ModelAndView UsersAdd(ModelAndView mv) {

			mv.setViewName("admin/users-add.html");

			return mv;
		}
		
		//编辑用户
		@RequestMapping("/edtilUser.do")
		  public ModelAndView edtilUser(ModelAndView mv){
		    	
		    mv.setViewName("admin/users-edit.html");
		    	
		    return mv;
		    
		  }
		
		//添加管理员页面
	    @RequestMapping("/addAddmin.do")
	    public ModelAndView addAdmin(ModelAndView mv){
	    	
	    	mv.setViewName("admin/admin-add.html");
	    	
			return mv;
	    	    	
	    }
	    //添加角色页面
	    @RequestMapping("/addRole.do")
	     public ModelAndView addRole(ModelAndView mv){
	    	
	    	mv.setViewName("admin/admin-addrole.html");
	    	
			return mv;
	    	    	
	    }
	    //添加权限页面
	    @RequestMapping("/addPermission.do")
	     public ModelAndView addPermission(ModelAndView mv){
	    	
	    	mv.setViewName("admin/admin-addrule.html");
	    	
			return mv;
	    	    	
	    }
	    //编辑权限页面
	    @RequestMapping("/updatePermission.do")
	    public ModelAndView updatePermission(ModelAndView mv){
	   	 
	   	mv.setViewName("admin/admin-updaterule.html"); 
	   	 
			return mv;
	   	 
	    }
	    //日志列表页面
	    @RequestMapping("/showlog.do")
	    public ModelAndView showLog(ModelAndView mv){
	   	 
	   	mv.setViewName("admin/systemlog-list.html"); 
	   	 
			return mv;
	   	 
	    }
		@RequestMapping("/unauthorized")
		public String noPerms() {
			return "admin/unauthorized";
		}
		

	   
}
