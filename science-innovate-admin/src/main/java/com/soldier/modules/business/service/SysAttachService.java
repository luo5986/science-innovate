package com.soldier.modules.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soldier.common.utils.PageUtils;
import com.soldier.modules.business.entity.SysAttachEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统附件
 */
public interface SysAttachService extends IService<SysAttachEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 根据功能id查询项目所有附件
     */
    List<SysAttachEntity> queryByFunctionId(String functionId);

    /**
     * 根据功能id删除项目所有附件
     * @param functionId        功能id
     * @param removeSystemFile  是否删除系统中的文件：false-修改项目信息不删除  true-删除项目信息时删除
     */
    void removeByFunctionId(String functionId, boolean removeSystemFile);
}

