package app.dao;

import app.model.Country;
import app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CountryDaoImpl implements DAO {

    @Override
    public void create(Object obj) {
        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
    }

    @Override
    public Object read(Long id) {
        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();
        Country country = session.get(Country.class, id);
        session.close();
        return country;
    }

    @Override
    public List<Country> readAll() {
        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();
        List<Country> countries = session
                .createQuery("from Country", Country.class)
                .getResultList();
        session.close();
        return countries;
    }

    @Override
    public void update(Object obj) {

    }

    @Override
    public void delete(Object obj) {

    }
}
