package com.soldier.modules.business.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 教学荣誉表
 *
 * @email 583403411@qq.com
 * @date 2020-05-28 10:33:27
 */
@Data
@TableName("tb_teaching_honor")
public class TeachingHonorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long thId;

	/**
	 * 荣誉称号
	 */
	private String name;

	/**
	 * 授予单位
	 */
	private String grantUnit;

	/**
	 * 获得时间
	 */
	private String honorTime;

	/**
	 * 授予等级 国家级等
	 */
	private Integer grade;

	/**
	 * 授予等次 一等奖等
	 */
	private Integer rank;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date updateTime;

	/**
	 * 项目负责人id
	 */
	@TableField(exist=false)
	private Long personId;

	/**
	 * 成员id
	 */
	@TableField(exist=false)
	private List<Long> memberIdList;

	/**
	 * 附件信息
	 */
	@TableField(exist=false)
	private List<SysAttachEntity> sysAttachEntityList;

	/**
	 * 教师信息
	 */
	@TableField(exist=false)
	private TeacherInfoEntity personInfo;//项目负责人
	@TableField(exist=false)
	private List<TeacherInfoEntity> memberInfoList;//项目成员
	@TableField(exist=false)
	private String membersName;//项目成员姓名

	/**
	 * 教师类型:1-主持人 2-成员
	 */
	@TableField(exist=false)
	private Integer type;
}
