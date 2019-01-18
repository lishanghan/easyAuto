# 概要
* 很容易平台是一个接口(REST)自动化测试平台.
* 支持依赖数据的组织测试
* 支持可调度的测试
* 所有操作基于平台完成,无需代码基础
* 主要使用技术(如未标明版本,则为2018.05对应的最新版本):
    JDK 1.8  
    Springboot  
    Mybatis 3.0  
    alibaba druid  
    pagehelper SpringBoot starter 1.1.2  
    httpclient-github:com.arronlong  
    testng  

快速启动项目:  
    1.jdk1.8或以上  
    2.安装idea,必要的设置(设置encoding=utf8,安装lombok插件)  
    3.安装git,推荐新版本  
      克隆项目到本地:git clone https://github.com/hryOrgan/hryAuto.git  
    4.安装maven(非必需,idea自带maven插件)  
    5.idea打开本地项目,将hryrun和hryweb设置为module,按maven包导入,hryweb项目需要在Facets标记Spring和Web属性  
    6.maven依赖下载,可配置aliyun镜像  
        <mirror>  
            <id>nexus-aliyun</id>  
            <mirrorOf>*</mirrorOf>  
            <name>Nexus aliyun</name>  
            <url>http://maven.aliyun.com/nexus/content/groups/public</url>  
        </mirror>  
    7.module-hryrun:testng框架,直接在cases类中右键run,或者run testng.xml  
    8.module-hryweb:springboot + mybatis框架,run Application启动项目  


##模块:项目结构图  
|__pom.xml-------------------------------------------------------maven配置  
|__src-----------------------------------------------------------  
|  |__main-------------------------------------------------------  
|  |  |__java----------------------------------------------------  
|  |  |  |__com--------------------------------------------------  
|  |  |  |  |__haier---------------------------------------------  
|  |  |  |  |  |__Application.java-------------------------------springboot启动,自动配置入口  
|  |  |  |  |  |__aspect-----------------------------------------spring aop  
|  |  |  |  |  |__config-----------------------------------------配置类@Configuration  
|  |  |  |  |  |  |__LoginConfig.java----------------------------登录拦截器配置  
|  |  |  |  |  |__controllers------------------------------------控制器@Controller  
|  |  |  |  |  |__enums------------------------------------------枚举类  
|  |  |  |  |  |__exception--------------------------------------异常类  
|  |  |  |  |  |  |__HryException.java---------------------------自定义异常类  
|  |  |  |  |  |  |__HryExceptionHandle.java---------------------  
|  |  |  |  |  |__interceptor------------------------------------拦截器  
|  |  |  |  |  |  |__LoginInterceptor.java-----------------------登录拦截器  
|  |  |  |  |  |__mapper-----------------------------------------mybatis mapper及mapper.xml  
|  |  |  |  |  |__po---------------------------------------------实体对象  
|  |  |  |  |  |__response---------------------------------------返回对象  
|  |  |  |  |  |__service----------------------------------------服务  
|  |  |  |  |  |  |__impl----------------------------------------实现类  
|  |  |  |  |  |__testng-----------------------------------------testng相关  
|  |  |  |  |  |  |__listener------------------------------------测试监听器  
|  |  |  |  |  |  |__provider------------------------------------参数化方法  
|  |  |  |  |  |  |__run-----------------------------------------测试运行  
|  |  |  |  |  |  |__test----------------------------------------测试类  
|  |  |  |  |  |__util-------------------------------------------工具类  
|  |  |__resources-----------------------------------------------  
|  |  |  |__application.yml--------------------------------------springboot 核心配置文件  
|  |  |  |__static-----------------------------------------------静态资源目录  

# 框架结构  
[sysplat]:https://github.com/lishanghan/easyAuto/blob/master/hrySysPlatform.png
![sysplat]





