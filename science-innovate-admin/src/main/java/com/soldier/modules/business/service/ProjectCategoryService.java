package com.soldier.modules.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soldier.common.utils.PageUtils;
import com.soldier.modules.business.entity.ProjectCategoryEntity;

import java.util.Map;

/**
 * 项目类别
 */
public interface ProjectCategoryService extends IService<ProjectCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

