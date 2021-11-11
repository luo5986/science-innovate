package com.soldier.modules.business.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 教师-of-项目立项表
 */
@Data
@TableName("tb_teacher_of_proc")
public class TeacherOfProcEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long topcId;

	/**
	 * 教师id
	 */
	private Long teaId;

	/**
	 * 项目立项id
	 */
	private Long pcId;

	/**
	 * 教师类型:1-主持人 2-成员
	 */
	private Integer type;

}
