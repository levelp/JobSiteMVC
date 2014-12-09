package levelp.mvc;

/**
 * Created by darya on 09/12/14.
 */

import levelp.mvc.model.*;

import javax.persistence.*;

public class HibernateTest {

   // public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JobSite");
    //public static EntityManager em = emf.createEntityManager();

    EntityManager em = getEntityManager();

    public static void main(String[] args) {
        User user1 = new User();
        user1.setEmail("dah@mail.ru");
        user1.setUserId(1);
        user1.setfName("Ivan");
        user1.setsName("Ivanov");
        user1.setPassword("123456");
        user1.setPhone(9998887766l);

        em.getTransaction().begin();
        em.persist(user1);
        em.getTransaction().commit();
    }
}
