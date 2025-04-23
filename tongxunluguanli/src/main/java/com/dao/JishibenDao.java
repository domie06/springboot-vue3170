package com.dao;

import com.entity.JishibenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JishibenView;

/**
 * 记事本 Dao 接口
 *
 * @author 
 */
public interface JishibenDao extends BaseMapper<JishibenEntity> {

   List<JishibenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
