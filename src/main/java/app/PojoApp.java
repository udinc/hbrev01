package app;

import domain.Pojo;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class PojoApp {

    public static void main(String[] args) {

        Date date = new Date();
        Pojo pojo = new Pojo();

        pojo.setAdi("test");
        pojo.setIslemTarihi(date);


        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(pojo);

        transaction.commit();

    }
}
