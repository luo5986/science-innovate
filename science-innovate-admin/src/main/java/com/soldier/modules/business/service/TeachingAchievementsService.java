package com.soldier.modules.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soldier.common.utils.PageUtils;
import com.soldier.modules.business.entity.TeachingAchievementsEntity;

import java.util.List;
import java.util.Map;

/**
 * 教学成果表
 */
public interface TeachingAchievementsService extends IService<TeachingAchievementsEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<TeachingAchievementsEntity> queryList(Map<String, Object> params);

    TeachingAchievementsEntity details(Long taId);
}

