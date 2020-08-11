package com.t05g1.dao;

import java.util.List;

import com.t05g1.pojo.Commodity;
import com.t05g1.pojo.User_Commodity;

public interface User_CommodityDao {

	List<User_Commodity> showcommodity();

	List<User_Commodity> showcommoditybySeckill();

	User_Commodity commodityByIdInfo(Integer cId);

	User_Commodity commodityByIdPropertyByValueInfo(Integer cId);

	User_Commodity commodityByIdPropertyByValueInfo1(Integer cId);

	User_Commodity commodityByIdPropertyByValueInfo2(Integer cId);

	User_Commodity commodityByIdPropertyByValueInfo3(Integer cId);

	List<Commodity> selCommodityByName(String c_name);


}
