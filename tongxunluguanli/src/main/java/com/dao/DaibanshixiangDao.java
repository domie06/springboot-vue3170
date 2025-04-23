package com.dao;

import com.entity.DaibanshixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DaibanshixiangView;

/**
 * 待办事项 Dao 接口
 *
 * @author 
 */
public interface DaibanshixiangDao extends BaseMapper<DaibanshixiangEntity> {

   List<DaibanshixiangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
