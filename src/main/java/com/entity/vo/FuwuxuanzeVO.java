package com.entity.vo;

import com.entity.FuwuxuanzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 服务选择
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-28 23:13:10
 */
public class FuwuxuanzeVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服务项目
	 */
	
	private String fuwuxiangmu;
		
	/**
	 * 服务类型
	 */
	
	private String fuwuleixing;
		
	/**
	 * 服务封面
	 */
	
	private String fuwufengmian;
		
	/**
	 * 服务价格
	 */
	
	private Float fuwujiage;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 宠物昵称
	 */
	
	private String chongwunicheng;
		
	/**
	 * 宠物种类
	 */
	
	private String chongwuzhonglei;
		
	/**
	 * 宠物性别
	 */
	
	private String chongwuxingbie;
		
	/**
	 * 宠物品种
	 */
	
	private String chongwupinzhong;
		
	/**
	 * 宠物毛色
	 */
	
	private String chongwumaose;
		
	/**
	 * 选择日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xuanzeriqi;
		
	/**
	 * 内容
	 */
	
	private String neirong;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：服务项目
	 */
	 
	public void setFuwuxiangmu(String fuwuxiangmu) {
		this.fuwuxiangmu = fuwuxiangmu;
	}
	
	/**
	 * 获取：服务项目
	 */
	public String getFuwuxiangmu() {
		return fuwuxiangmu;
	}
				
	
	/**
	 * 设置：服务类型
	 */
	 
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
	}
				
	
	/**
	 * 设置：服务封面
	 */
	 
	public void setFuwufengmian(String fuwufengmian) {
		this.fuwufengmian = fuwufengmian;
	}
	
	/**
	 * 获取：服务封面
	 */
	public String getFuwufengmian() {
		return fuwufengmian;
	}
				
	
	/**
	 * 设置：服务价格
	 */
	 
	public void setFuwujiage(Float fuwujiage) {
		this.fuwujiage = fuwujiage;
	}
	
	/**
	 * 获取：服务价格
	 */
	public Float getFuwujiage() {
		return fuwujiage;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：宠物昵称
	 */
	 
	public void setChongwunicheng(String chongwunicheng) {
		this.chongwunicheng = chongwunicheng;
	}
	
	/**
	 * 获取：宠物昵称
	 */
	public String getChongwunicheng() {
		return chongwunicheng;
	}
				
	
	/**
	 * 设置：宠物种类
	 */
	 
	public void setChongwuzhonglei(String chongwuzhonglei) {
		this.chongwuzhonglei = chongwuzhonglei;
	}
	
	/**
	 * 获取：宠物种类
	 */
	public String getChongwuzhonglei() {
		return chongwuzhonglei;
	}
				
	
	/**
	 * 设置：宠物性别
	 */
	 
	public void setChongwuxingbie(String chongwuxingbie) {
		this.chongwuxingbie = chongwuxingbie;
	}
	
	/**
	 * 获取：宠物性别
	 */
	public String getChongwuxingbie() {
		return chongwuxingbie;
	}
				
	
	/**
	 * 设置：宠物品种
	 */
	 
	public void setChongwupinzhong(String chongwupinzhong) {
		this.chongwupinzhong = chongwupinzhong;
	}
	
	/**
	 * 获取：宠物品种
	 */
	public String getChongwupinzhong() {
		return chongwupinzhong;
	}
				
	
	/**
	 * 设置：宠物毛色
	 */
	 
	public void setChongwumaose(String chongwumaose) {
		this.chongwumaose = chongwumaose;
	}
	
	/**
	 * 获取：宠物毛色
	 */
	public String getChongwumaose() {
		return chongwumaose;
	}
				
	
	/**
	 * 设置：选择日期
	 */
	 
	public void setXuanzeriqi(Date xuanzeriqi) {
		this.xuanzeriqi = xuanzeriqi;
	}
	
	/**
	 * 获取：选择日期
	 */
	public Date getXuanzeriqi() {
		return xuanzeriqi;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
