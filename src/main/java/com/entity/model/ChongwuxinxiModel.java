package com.entity.model;

import com.entity.ChongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宠物信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-28 23:13:10
 */
public class ChongwuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物昵称
	 */
	
	private String chongwunicheng;
		
	/**
	 * 宠物种类
	 */
	
	private String chongwuzhonglei;
		
	/**
	 * 宠物图片
	 */
	
	private String chongwutupian;
		
	/**
	 * 宠物性别
	 */
	
	private String chongwuxingbie;
		
	/**
	 * 宠物习性
	 */
	
	private String chongwuxixing;
		
	/**
	 * 宠物品种
	 */
	
	private String chongwupinzhong;
		
	/**
	 * 宠物毛色
	 */
	
	private String chongwumaose;
		
	/**
	 * 宠物年龄
	 */
	
	private String chongwunianling;
		
	/**
	 * 宠物重量
	 */
	
	private String chongwuzhongliang;
		
	/**
	 * 先天疾病
	 */
	
	private String xiantianjibing;
		
	/**
	 * 宠物详情
	 */
	
	private String chongwuxiangqing;
		
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
	 * 设置：宠物图片
	 */
	 
	public void setChongwutupian(String chongwutupian) {
		this.chongwutupian = chongwutupian;
	}
	
	/**
	 * 获取：宠物图片
	 */
	public String getChongwutupian() {
		return chongwutupian;
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
	 * 设置：宠物习性
	 */
	 
	public void setChongwuxixing(String chongwuxixing) {
		this.chongwuxixing = chongwuxixing;
	}
	
	/**
	 * 获取：宠物习性
	 */
	public String getChongwuxixing() {
		return chongwuxixing;
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
	 * 设置：宠物年龄
	 */
	 
	public void setChongwunianling(String chongwunianling) {
		this.chongwunianling = chongwunianling;
	}
	
	/**
	 * 获取：宠物年龄
	 */
	public String getChongwunianling() {
		return chongwunianling;
	}
				
	
	/**
	 * 设置：宠物重量
	 */
	 
	public void setChongwuzhongliang(String chongwuzhongliang) {
		this.chongwuzhongliang = chongwuzhongliang;
	}
	
	/**
	 * 获取：宠物重量
	 */
	public String getChongwuzhongliang() {
		return chongwuzhongliang;
	}
				
	
	/**
	 * 设置：先天疾病
	 */
	 
	public void setXiantianjibing(String xiantianjibing) {
		this.xiantianjibing = xiantianjibing;
	}
	
	/**
	 * 获取：先天疾病
	 */
	public String getXiantianjibing() {
		return xiantianjibing;
	}
				
	
	/**
	 * 设置：宠物详情
	 */
	 
	public void setChongwuxiangqing(String chongwuxiangqing) {
		this.chongwuxiangqing = chongwuxiangqing;
	}
	
	/**
	 * 获取：宠物详情
	 */
	public String getChongwuxiangqing() {
		return chongwuxiangqing;
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
			
}
