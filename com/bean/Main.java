package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        System.out.println("开始执行测试");

        //创建一个user对象，对user表进行增加一条数据
        student stu =new student();

        //为user表添加一条数据
        stu.setUsername("jack");
        stu.setNickname("leefdfdsg");
        stu.setSex("male");
        stu.setEmail("190224554@qq.com");
        stu.setPassword("123");
        stu.setHeadImage("img/male.jpg");

        /**
         *   此时stu是 Transient(瞬时状态),还没有被session进行脱管
         *   即在session的缓存中，还没有stu该对象，
         *   通过session.save()之后，stu就是一个Persistent(持久化状态)对象了
         */


        //使用hibernate api开发步骤
        //1.创建一个hibernate 配置configuration(必须是hibernate下面的包)
        Configuration conf=new Configuration().configure();

        //2.构造会话工厂 SessionFactory
        SessionFactory sf=conf.buildSessionFactory();

        //hibernate 4.0版本之后
       /* ServiceRegistryBuilder serviceRegistryBuilder=new ServiceRegistryBuilder().applySettings(conf.getProperties());
        ServiceRegistry registry=serviceRegistryBuilder.buildServiceRegistry();
        SessionFactory sf=conf.buildSessionFactory(registry);*/

        //3.打开会话 session
        Session session=sf.openSession();

        //4.启动事物 transaction
        Transaction tran=session.beginTransaction();

        //5.持久化对象 也就是保存，相当于直接给表插入数据了
        session.saveOrUpdate(stu);//此时stu就是一个Persistent(持久化对象)

        //6.提交事务
        tran.commit();

        //7.关闭资源
        session.close();
       // session.evict(stu);//此时stu进入detached（脱管状态）了,也就是此时对user进行操作数据库将没有任何更新；

        sf.close();
    }
}

