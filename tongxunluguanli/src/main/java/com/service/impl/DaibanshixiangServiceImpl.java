package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.DaibanshixiangDao;
import com.entity.DaibanshixiangEntity;
import com.service.DaibanshixiangService;
import com.entity.view.DaibanshixiangView;

/**
 * 待办事项 服务实现类
 */
@Service("daibanshixiangService")
@Transactional
public class DaibanshixiangServiceImpl extends ServiceImpl<DaibanshixiangDao, DaibanshixiangEntity> implements DaibanshixiangService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<DaibanshixiangView> page =new Query<DaibanshixiangView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
