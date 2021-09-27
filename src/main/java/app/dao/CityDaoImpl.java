package app.dao;

import app.model.City;
import app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityDaoImpl implements DAO {

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
        City city = session.get(City.class, id);
        session.close();
        return city;
    }

    @Override
    public List<City> readAll() {
        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();
        List<City> cities = session
                .createQuery("from City", City.class)
                .getResultList();
        session.close();
        return cities;
    }

    @Override
    public void update(Object obj) {

    }

    @Override
    public void delete(Object obj) {

    }
}
