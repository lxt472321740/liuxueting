package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FuwuxuanzeEntity;
import com.entity.view.FuwuxuanzeView;

import com.service.FuwuxuanzeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 服务选择
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-28 23:13:10
 */
@RestController
@RequestMapping("/fuwuxuanze")
public class FuwuxuanzeController {
    @Autowired
    private FuwuxuanzeService fuwuxuanzeService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuwuxuanzeEntity fuwuxuanze,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fuwuxuanze.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FuwuxuanzeEntity> ew = new EntityWrapper<FuwuxuanzeEntity>();

		PageUtils page = fuwuxuanzeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuxuanze), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuwuxuanzeEntity fuwuxuanze, 
		HttpServletRequest request){
        EntityWrapper<FuwuxuanzeEntity> ew = new EntityWrapper<FuwuxuanzeEntity>();

		PageUtils page = fuwuxuanzeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuxuanze), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuwuxuanzeEntity fuwuxuanze){
       	EntityWrapper<FuwuxuanzeEntity> ew = new EntityWrapper<FuwuxuanzeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuwuxuanze, "fuwuxuanze")); 
        return R.ok().put("data", fuwuxuanzeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuwuxuanzeEntity fuwuxuanze){
        EntityWrapper< FuwuxuanzeEntity> ew = new EntityWrapper< FuwuxuanzeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuwuxuanze, "fuwuxuanze")); 
		FuwuxuanzeView fuwuxuanzeView =  fuwuxuanzeService.selectView(ew);
		return R.ok("查询服务选择成功").put("data", fuwuxuanzeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuwuxuanzeEntity fuwuxuanze = fuwuxuanzeService.selectById(id);
        return R.ok().put("data", fuwuxuanze);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuwuxuanzeEntity fuwuxuanze = fuwuxuanzeService.selectById(id);
        return R.ok().put("data", fuwuxuanze);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuwuxuanzeEntity fuwuxuanze, HttpServletRequest request){
    	fuwuxuanze.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwuxuanze);
        fuwuxuanzeService.insert(fuwuxuanze);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuwuxuanzeEntity fuwuxuanze, HttpServletRequest request){
    	fuwuxuanze.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwuxuanze);
        fuwuxuanzeService.insert(fuwuxuanze);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FuwuxuanzeEntity fuwuxuanze, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuwuxuanze);
        fuwuxuanzeService.updateById(fuwuxuanze);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuwuxuanzeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
