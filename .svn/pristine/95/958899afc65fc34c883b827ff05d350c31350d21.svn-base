package com.t05g1.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.CommodityDao;
import com.t05g1.pojo.Commodity;
import com.t05g1.service.CommodityService;

@Service
public class CommmodityServiceImpl implements CommodityService {
	
	@Autowired
	private CommodityDao commodityDao;
	
	
    //查看商品列表
	@Override
	public List<Commodity> findAllcommodityList() {
		
		return commodityDao.findAllcommodityList();
	}

    //查看商品带分页
	@Override
	public List<Commodity> findAllcommodityListPage(String c_name,int c_categoryId,int c_brandId) {
		return commodityDao.findAllcommodityListPage(c_name,c_categoryId,c_brandId);
	}

    //统计商品总数
	@Override
	public int commodityAllCountxx() {
		
		return commodityDao.commodityAllCountxx();
	}
	
	//查看商品带分页
	@Override
	public List<Commodity> queryAllDataFromTable(int curr, int limit, String c_name,int c_categoryId,int c_brandId) {
        curr=(curr-1)*limit;
		// TODO Auto-generated method stub
		return commodityDao.queryAllDataFromTable(curr, limit, c_name, c_categoryId,c_brandId);
	}
	
	 //统计商品总数
	@Override
	public int queryAllCount(String c_name,int c_categoryId) {
		// TODO Auto-generated method stub
		return commodityDao.queryAllCount(c_name,c_categoryId);
	}
    
	//添加商品
	@Override
	public int addProduct(Commodity commodity) {
		// TODO Auto-generated method stub
		return commodityDao.addProduct(commodity);
	}
   //按ID删除商品
	@Override
	public int deleteProductById(Integer c_id) {
		// TODO Auto-generated method stub
		return commodityDao.deleteProductById(c_id);
	}

	//批量删除商品
	@Override
	public int deleteProductsById(String c_ids) {
			// TODO Auto-generated method stub
		 return commodityDao.deleteProductsById(c_ids);
		}
    //改变商品状态
	@Override
	public int isState(Integer c_id,String c_state) {
		// TODO Auto-generated method stub
		return commodityDao.isState(c_id,c_state);
	}
    //修改商品
	@Override
	public int updateProduct(Commodity commodity) {
		// TODO Auto-generated method stub
		return commodityDao.updateProduct(commodity);
	}
    //商品详情
	@Override
	public Commodity selectProductDetail(Integer c_id) {
		// TODO Auto-generated method stub
		return commodityDao.selectProductDetail(c_id);
	}
    //获取id
	@Override
	public Commodity selectId(String name) {
		// TODO Auto-generated method stub
		return commodityDao.selectId(name);
	}
	

}
