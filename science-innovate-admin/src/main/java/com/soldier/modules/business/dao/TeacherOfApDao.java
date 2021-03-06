package com.soldier.modules.business.dao;

import com.soldier.modules.business.entity.TeacherInfoEntity;
import com.soldier.modules.business.entity.TeacherOfApEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/**
 * 教师-of-论文表
 *  
 * @email 583403411@qq.com
 * @date 2020-05-28 10:33:27
 */
@Mapper
public interface TeacherOfApDao extends BaseMapper<TeacherOfApEntity> {

    /**
     * 查询已加入项目成员的teacherId
     */
    List<Long> queryChoiceTeaIdList(Serializable apId);

    /**
     * 查询项目负责人信息
     */
    TeacherInfoEntity queryPersonInfo(Long id);

    /**
     * 查询项目成员信息
     */
    List<TeacherInfoEntity> queryMemberInfo(Long id);
}
