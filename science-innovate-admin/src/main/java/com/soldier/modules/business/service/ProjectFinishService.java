package com.soldier.modules.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soldier.common.utils.PageUtils;
import com.soldier.modules.business.entity.ProjectFinishEntity;

import java.io.Serializable;
import java.util.Map;

/**
 * 项目结题表
 */
public interface ProjectFinishService extends IService<ProjectFinishEntity> {

    PageUtils queryPage(Map<String, Object> params);

    ProjectFinishEntity details(Long pfId);

    /**
     * 根据项目立项id删除结题信息、附件
     */
    void removeByPcId(Serializable pcId);
}

