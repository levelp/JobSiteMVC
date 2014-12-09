package levelp.mvc.model;

/**
 * Created by darya on 09/12/14.
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.ejb.Ejb3Configuration;

import java.io.File;

public class HibernateUtil {
 /*   private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new AnnotationConfiguration().configure(
                    new File("hibernate.cgf.xml")).buildSessionFactory();

        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }*/

    public static final Log logger = LogFactory.getLog(HibernateUtil.class
            .getName());

    private static final SessionFactory sessionFactory;

    private static final Ejb3Configuration ejb3Configuration;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new AnnotationConfiguration().configure()
                    .buildSessionFactory();
            ejb3Configuration = new Ejb3Configuration()
                    .configure("/hibernate.cfg.xml");
        } catch (Throwable ex) {
            logger.error("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Ejb3Configuration getEjb3Configuration() {
        return ejb3Configuration;
    }

}
