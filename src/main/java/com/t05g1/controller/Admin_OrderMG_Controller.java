package com.t05g1.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.t05g1.annotation.Log;
import com.t05g1.enums.OperationType;
import com.t05g1.enums.OperationUnit;
import com.t05g1.pojo.Delivery;
import com.t05g1.pojo.Order;
import com.t05g1.service.DeliveryService;
import com.t05g1.service.OrderService;


@Controller
@RequestMapping(value="/order")
public class Admin_OrderMG_Controller {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private DeliveryService deliveryService;
	
	
	//订单信息
	@RequestMapping(value="orderList.do")
	public ModelAndView orderlist(ModelAndView mv) {
		
		mv.setViewName("admin/transaction.html");
		
		return mv;
		
	}
	//订单列表
	@RequestMapping(value="orderinfoList.do")
	public ModelAndView orderinfolist(ModelAndView mv) {
		
		mv.setViewName("admin/order-list.html");
		
		return mv;
		
	}
	//订单列表
	@ResponseBody
	@RequestMapping(value="showOrderData.do")
	public Map<String, Object> methodx(@RequestParam(value = "page", required = false, defaultValue = "1") int curr,
			@RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
			@RequestParam(value = "orderNumber", required = false) String orderNumber,
			@RequestParam(value = "orderStatus", required = false, defaultValue = "0") int orderStatus,
			@RequestParam(value = "payStatus", required = false, defaultValue = "0") int  payStatus,
			@RequestParam(value = "payMode", required = false, defaultValue = "0") int payMode) {		
		List<Order> datas = orderService.queryAllDataFromTable(curr, limit, orderNumber, orderStatus, payStatus, payMode);
		int countx = orderService.queryAllCount(orderNumber, orderStatus, payStatus, payMode);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", countx);
		map.put("data", datas);

		return map;
	}
	//添加订单页面
	@RequestMapping(value="addOrder.do")
	public ModelAndView addOrder(ModelAndView mv) {
		
		//获取物流
		List<Delivery> delList = deliveryService.selectByExample();
		
		mv.addObject("delList",delList);
		mv.setViewName("admin/order-add.html");
		 
		return mv;	
	}
	/***
	 * 测试添加订单
	 * @param orderNumber
	 * @param productName
	 * @param consignee
	 * @param money
	 * @param amount
	 * @param buyerId
	 * @param payMode
	 * @param distrMode
	 * @param shopAddress
	 * @param phone
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="addNewOrder.do")
	public Map<String,Object> addVewOrder(String orderNumber,String productName,String consignee,String money,Integer amount,Integer buyerId,Integer orderStatus,Integer payStatus,Integer payMode,Integer distrMode,String shopAddress,String phone){
		
		Map<String,Object> map = new HashMap<>();
		//Date date = new Date();
		
		Order order = new Order();
		order.setOrderNumber(orderNumber);
		order.setProductName(productName);
		order.setConsignee(consignee);
		order.setMoney(money);
		order.setAmount(amount);
		order.setBuyerId(buyerId);
		order.setOrderStatus(orderStatus);
		order.setPayStatus(payStatus);
		order.setPayMode(payMode);
		order.setShopAddress(shopAddress);
		order.setDistrMode(distrMode);
		order.setPhone(phone);
		//order.setOrderTime(date);

		int res = orderService.insertSelective(order);
		
		System.out.println(res);
		
		map.put("res",res);
		
		return map;
		
		
	}
	/***
	 * 删除订单
	 * @param id
	 * @return
	 */
	@Log(detail = "删除订单操作",level = 1,operationUnit = OperationUnit.ORDER,operationType = OperationType.DELETE)
	@ResponseBody
	@RequestMapping(value="delorderById.do")
	public Map<String,Object> delorderById(Integer id){
		
		Map<String,Object> map = new HashMap<>();
		
		int res = orderService.deleteByPrimaryKey(id);
		
		map.put("res", res);
		
		return map;
	}
	/***
	 * 发货
	 * @param id
	 * @param orderStatus
	 * @return
	 */
	@Log(detail = "发货操作",level = 1,operationUnit = OperationUnit.ORDER,operationType = OperationType.UPDATE)
	@ResponseBody
	@RequestMapping(value="isdeliveryGoods.do")
	public Map<String,Object> deliveryGoods(Integer id,Integer orderStatus){
		
		System.out.println(id+"+"+orderStatus);
		
		Order record = new Order();
		
		record.setId(id);
		record.setOrderStatus(orderStatus);
		
		
		Map<String,Object> map = new HashMap<>();
		
	    int res = orderService.updateByPrimaryKeySelective(record);
		
		map.put("res",res);
		
      return map;
	}
	
	
	
}
