# science-innovate

#### 项目介绍
高校教师业绩档案管理平台

#### 软件架构
技术要求：
>spring boot，spring mvc，mybatis，mybatis plus，Node-10 环境

#### 安装教程

1. idea自带数据库管理工具导入方式 创建science_innovate数据库命令：
```sql
CREATE SCHEMA science_innovate DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
```
2. maven引入jar包
```text
选择maven插件中的install 或 mvn install
```
3. 安装redis
4. 运行Application

#### 持续集成平台
>travis ci

**项目结构** 
```
science-innovate-admin
├─db  项目SQL语句
│
├─common 公共模块
│  ├─aspect 系统日志
│  ├─exception 异常处理
│  ├─validator 后台校验
│  └─xss XSS过滤
│ 
├─config 配置信息
│ 
├─modules 功能模块
│  ├─business 高校教师链式业绩管理信息
│  ├─app API接口模块(APP调用)
│  ├─job 定时任务模块
│  ├─oss 文件服务模块
│  └─sys 权限模块
│ 
├─RenrenApplication 项目启动类
│  
├──resources 
│  ├─mapper SQL对应的XML文件
│  └─static 静态资源

```
<br> 

**系统结构** 
```
教师系统
├─结构划分
│  └─梧州学院               学校school
│     └─大数据与软件工程学院  学院college
│        └─软件开发中心      教研室/实验室laboratory
│
├─角色划分
│  └─超级管理员                  soldier
│     └─学校管理员               wzxyGLY
│        └─二级学院管理员         dsjxyGLY
│           └─教研室/实验室管理员  laboratory_admin(后期可能会做)
│              └─教师           teacher
│ 
├─功能划分
│  ├─教师信息 teacher_info              ok
│  ├─学术论文 academic_papers           ok
│  ├─大创项目 innovate_project          ok
│  ├─项目立项 project_create            ok
│  ├─项目结题 project_finish            ok
│  ├─科研成果 research_gain             ok
│  ├─学生竞赛 student_competition       ok
│  ├─教师竞赛 teacher_competition       ok
│  ├─教学成果 teaching_achievements     ok
│  ├─教学荣誉 teaching_honor            ok
│  ├─自编教材管理 teaching_material      ok
│  ├─系统附件 sys_attach                ok
│  ├─部门管理 sys_dept                  ok
│  ├─二级学院管理员 sys_dept_admin_info  ok
│  ├─基础数据 tb_competition_grade、tb_competition_rank、tb_gain_type、tb_match_info、tb_papers_grade、tb_project_category
│  └─中间表 tb_teacher_of_**

```
<br> 
