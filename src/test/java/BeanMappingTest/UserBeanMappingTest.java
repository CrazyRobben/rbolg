package BeanMappingTest;

import model.UserBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 *
 * @author: Robben.Hu
 * @Description: user.hbm.xml Test Class
 * @Date: Created in 2017-10-17 20:24
 *
 */

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
    @Test
    public void userAddTest(){
        UserBean userBean = new UserBean();
        userBean.setUserPassword("8286565161");
        Transaction transaction = session.beginTransaction();
        session.save(userBean);
        transaction.commit();
        session.close();
    }
    @Test
    public void userDeleteTest(){
        UserBean userBean = session.get(UserBean.class, 2);
        Transaction transaction = session.beginTransaction();
        session.delete(userBean);
        transaction.commit();
        session.close();
    }
    @Test
    public void userUpdateTest(){
        UserBean userBean = session.get(UserBean.class, 1);
        userBean.setUserNickname("sb");
        Transaction transaction = session.beginTransaction();
        session.update(userBean);
        transaction.commit();
        session.close();
    }
}
