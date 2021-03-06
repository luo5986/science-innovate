package com.soldier.modules.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soldier.common.utils.PageUtils;
import com.soldier.modules.business.entity.GainTypeEntity;

import java.util.Map;

/**
 * 成果类型
 *  
 * @email 583403411@qq.com
 * @date 2020-09-15 17:32:44
 */
public interface GainTypeService extends IService<GainTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

