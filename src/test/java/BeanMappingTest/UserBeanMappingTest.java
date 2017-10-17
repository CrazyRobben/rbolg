package BeanMappingTest;

import model.UserBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class UserBeanMappingTest {
    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    Session session = sessionFactory.openSession();
    @Test
    public void userQueryTest(){
        UserBean userBean = session.get(UserBean.class, 1);
        System.out.println(userBean.getUserId()+"->"+userBean.getUserNickname());
        session.close();
    }
}
