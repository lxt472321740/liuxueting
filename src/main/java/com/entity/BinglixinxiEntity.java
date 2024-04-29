package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病例信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-28 23:13:10
 */
@TableName("binglixinxi")
public class BinglixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BinglixinxiEntity() {
		
	}
	
	public BinglixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 病例编号
	 */
					
	private String binglibianhao;
	
	/**
	 * 病例名称
	 */
					
	private String binglimingcheng;
	
	/**
	 * 服务封面
	 */
					
	private String fuwufengmian;
	
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
	 * 病例附件
	 */
					
	private String binglifujian;
	
	/**
	 * 症状
	 */
					
	private String zhengzhuang;
	
	/**
	 * 入院时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruyuanshijian;
	
	/**
	 * 出院时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chuyuanshijian;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：病例编号
	 */
	public void setBinglibianhao(String binglibianhao) {
		this.binglibianhao = binglibianhao;
	}
	/**
	 * 获取：病例编号
	 */
	public String getBinglibianhao() {
		return binglibianhao;
	}
	/**
	 * 设置：病例名称
	 */
	public void setBinglimingcheng(String binglimingcheng) {
		this.binglimingcheng = binglimingcheng;
	}
	/**
	 * 获取：病例名称
	 */
	public String getBinglimingcheng() {
		return binglimingcheng;
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
	 * 设置：病例附件
	 */
	public void setBinglifujian(String binglifujian) {
		this.binglifujian = binglifujian;
	}
	/**
	 * 获取：病例附件
	 */
	public String getBinglifujian() {
		return binglifujian;
	}
	/**
	 * 设置：症状
	 */
	public void setZhengzhuang(String zhengzhuang) {
		this.zhengzhuang = zhengzhuang;
	}
	/**
	 * 获取：症状
	 */
	public String getZhengzhuang() {
		return zhengzhuang;
	}
	/**
	 * 设置：入院时间
	 */
	public void setRuyuanshijian(Date ruyuanshijian) {
		this.ruyuanshijian = ruyuanshijian;
	}
	/**
	 * 获取：入院时间
	 */
	public Date getRuyuanshijian() {
		return ruyuanshijian;
	}
	/**
	 * 设置：出院时间
	 */
	public void setChuyuanshijian(Date chuyuanshijian) {
		this.chuyuanshijian = chuyuanshijian;
	}
	/**
	 * 获取：出院时间
	 */
	public Date getChuyuanshijian() {
		return chuyuanshijian;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
