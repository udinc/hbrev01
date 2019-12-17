package hibernate;

import domain.Pojo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionfactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try {
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(Pojo.class);

                SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
                return sessionFactory;

            } catch (Exception e) {
            System.out.println("Session factory oluşturulurken hata oluştu"+e);
            throw new ExceptionInInitializerError(e);

        }
    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }
}
