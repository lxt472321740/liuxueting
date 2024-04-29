package com.dao;

import com.entity.ChongwuzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuzhongleiVO;
import com.entity.view.ChongwuzhongleiView;


/**
 * 宠物种类
 * 
 * @author 
 * @email 
 * @date 2023-04-28 23:13:10
 */
public interface ChongwuzhongleiDao extends BaseMapper<ChongwuzhongleiEntity> {
	
	List<ChongwuzhongleiVO> selectListVO(@Param("ew") Wrapper<ChongwuzhongleiEntity> wrapper);
	
	ChongwuzhongleiVO selectVO(@Param("ew") Wrapper<ChongwuzhongleiEntity> wrapper);
	
	List<ChongwuzhongleiView> selectListView(@Param("ew") Wrapper<ChongwuzhongleiEntity> wrapper);

	List<ChongwuzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuzhongleiEntity> wrapper);
	
	ChongwuzhongleiView selectView(@Param("ew") Wrapper<ChongwuzhongleiEntity> wrapper);
	

}
