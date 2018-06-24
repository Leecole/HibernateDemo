import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        System.out.println("开始执行测试");

        //创建一个user对象，对user表进行增加一条数据
        User user =new User();

        //为user表添加一条数据
        user.setUsername("jack");
        user.setNickname("leefdfdsg");
        user.setSex("male");
        user.setEmail("190224554@qq.com");
        user.setPassword("123");
        user.setHeadImage("img/male.jpg");

        //使用hibernate api开发步骤
        //1.创建一个hibernate 配置configuration(必须是hibernate下面的包)
        Configuration conf=new Configuration();

        //2.构造会话工厂 SessionFactory
        SessionFactory sf=conf.buildSessionFactory();

        //3.打开会话 session
        Session s=sf.openSession();

        //4.启动事物 transaction
        Transaction tran=s.beginTransaction();

        //5.持久化对象 也就是保存，相当于直接给表插入数据了
        s.save(user);

        //6.提交事务
        tran.commit();

        //7.关闭资源
        s.close();
        sf.close();

    }

}



