package com.example;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class MyClass {

    public static final int version = 1;//数据库版本号
    public static final String entityPackageName = "com.jboob.greendao.model.entity";//实体生存的包名
    public static final String entityClassName = "UserInfo";//实体的类名
    public static final String daoPackageName = "com.jboob.greendao.model.dao";//指定dao层模板的包

    //自动生成模板类存放的绝对地址，也就是你的module创建的session文件夹 也就是java-gen
    public static final String autoGenerateJavaPath = "I:\\Jboob\\GreenDao\\app\\src\\main\\java";

    public static void main(String [] args) throws Exception{

        Schema schema = new Schema(version, entityPackageName);
        schema.setDefaultJavaPackageDao(daoPackageName);//如果不指定 默认与entityPackageName一致
        Entity entity=schema.addEntity(entityClassName);

        entity.addIdProperty();//主键
        entity.addStringProperty("user_name");//表的列名
        entity.addStringProperty("user_pass");//表的列名
        entity.addStringProperty("userNum");//表的列名

        entity.setClassNameDao("UserInfoDao");//设置dao类的名称
        entity.setJavaDoc("auto greenDao generate javaBean by Jboob");

        entity.setTableName("tb_user");//设置表名,默认是entityClassName(NOTE)的大写形式

        //自动生成java模板类
        new DaoGenerator().generateAll(schema,autoGenerateJavaPath);

    }
}
