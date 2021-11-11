package com.soldier.modules.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soldier.common.utils.PageUtils;
import com.soldier.modules.business.entity.PapersGradeEntity;

import java.util.Map;

/**
 * 论文等级
 */
public interface PapersGradeService extends IService<PapersGradeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

