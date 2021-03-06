package com.soldier.modules.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soldier.common.utils.PageUtils;
import com.soldier.modules.business.entity.AcademicPapersEntity;

import java.util.List;
import java.util.Map;

/**
 * 学术论文
 *  
 * @email 583403411@qq.com
 * @date 2020-05-28 10:33:27
 */
public interface AcademicPapersService extends IService<AcademicPapersEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<AcademicPapersEntity> queryList(Map<String, Object> params);

    /**
     * 详情
     */
    AcademicPapersEntity details(Long apId);
}

