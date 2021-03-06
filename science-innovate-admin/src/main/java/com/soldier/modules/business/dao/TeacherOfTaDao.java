package com.soldier.modules.business.dao;

import com.soldier.modules.business.entity.TeacherInfoEntity;
import com.soldier.modules.business.entity.TeacherOfTaEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 教师-of-教学成果表
 *  
 * @email 583403411@qq.com
 * @date 2020-05-28 10:33:26
 */
@Mapper
public interface TeacherOfTaDao extends BaseMapper<TeacherOfTaEntity> {

    /**
     * 查询已加入项目成员的teacherId
     */
    List<Long> queryChoiceTeaIdList(Serializable taId);

    /**
     * 查询项目负责人信息
     */
    TeacherInfoEntity queryPersonInfo(Long id);

    /**
     * 查询项目成员信息
     */
    List<TeacherInfoEntity> queryMemberInfo(Long id);

}
