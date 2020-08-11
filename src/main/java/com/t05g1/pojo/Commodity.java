package com.t05g1.pojo;

import java.io.Serializable;
import java.util.Date;

public class Commodity implements Serializable {
	
	private int c_id;//商品编号
	
	private String c_name;///商品名称
	
	private String c_title;//商品标题
	
	private Double c_price;//商品价格
	
	private Double c_discountprice;//商品优惠价
	
	private Date c_data;//录入时间
	
	private String c_uri;//商品图片
	
	private String c_uriDa;//商品大图	
	
	private Integer c_Stock;//库存
	
	private Integer c_salesvolume;//销量
	
	private String c_color;//颜色
	
	private String c_edition;//版本

	private Integer c_Seckill;//是否秒杀
	
	private Integer c_state;//是否启用
	
	private Integer  c_reduction;//是否满减
	
	private Integer c_categoryId;//商品类型

	private Integer c_brandId;//品牌


	private Category cat;//商品类型
	
	private Brand brand;//品牌
	
	

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_title() {
		return c_title;
	}

	public void setC_title(String c_title) {
		this.c_title = c_title;
	}

	public Double getC_price() {
		return c_price;
	}

	public void setC_price(Double c_price) {
		this.c_price = c_price;
	}

	public Double getC_discountprice() {
		return c_discountprice;
	}

	public void setC_discountprice(Double c_discountprice) {
		this.c_discountprice = c_discountprice;
	}

	public Date getC_data() {
		return c_data;
	}

	public void setC_data(Date c_data) {
		this.c_data = c_data;
	}
	
	public Integer getC_Stock() {
		return c_Stock;
	}

	public void setC_Stock(Integer c_Stock) {
		this.c_Stock = c_Stock;
	}

	public Integer getC_salesvolume() {
		return c_salesvolume;
	}

	public void setC_salesvolume(Integer c_salesvolume) {
		this.c_salesvolume = c_salesvolume;
	}
	
	public String getC_edition() {
		return c_edition;
	}

	public void setC_edition(String c_edition) {
		this.c_edition = c_edition;
	}

	public String getC_color() {
		return c_color;
	}

	public void setC_color(String c_color) {
		this.c_color = c_color;
	}

	public String getC_uri() {
		return c_uri;
	}

	public void setC_uri(String c_uri) {
		this.c_uri = c_uri;
	}

	public String getC_uriDa() {
		return c_uriDa;
	}

	public void setC_uriDa(String c_uriDa) {
		this.c_uriDa = c_uriDa;
	}
	
	public Integer getC_Seckill() {
		return c_Seckill;
	}

	public void setC_Seckill(Integer c_Seckill) {
		this.c_Seckill = c_Seckill;
	}

	public Integer getC_state() {
		return c_state;
	}

	public void setC_state(Integer c_state) {
		this.c_state = c_state;
	}
	
	public Integer getC_reduction() {
		return c_reduction;
	}

	public void setC_reduction(Integer c_reduction) {
		this.c_reduction = c_reduction;
	}

	public Integer getC_categoryId() {
		return c_categoryId;
	}

	public void setC_categoryId(Integer c_categoryId) {
		this.c_categoryId = c_categoryId;
	}

	public Integer getC_brandId() {
		return c_brandId;
	}

	public void setC_brandId(Integer c_brandId) {
		this.c_brandId = c_brandId;
	}
	
	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}
	

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Commodity [c_id=" + c_id + ", c_name=" + c_name + ", c_title=" + c_title + ", c_price=" + c_price
				+ ", c_discountprice=" + c_discountprice + ", c_data=" + c_data + ", c_uri=" + c_uri + ", c_uriDa="
				+ c_uriDa + ", c_Stock=" + c_Stock + ", c_salesvolume=" + c_salesvolume + ", c_color=" + c_color
				+ ", c_edition=" + c_edition + ", c_Seckill=" + c_Seckill + ", c_state=" + c_state + ", c_reduction="
				+ c_reduction + ", c_categoryId=" + c_categoryId + ", c_brandId=" + c_brandId + ", cat=" + cat
				+ ", brand=" + brand + "]";
	}
    
}
