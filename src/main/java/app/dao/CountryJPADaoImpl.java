package app.dao;

import app.model.Country;

import javax.persistence.*;
import java.util.List;

public class CountryJPADaoImpl implements DAO {

    private final EntityManagerFactory entityManagerFactory;

    public CountryJPADaoImpl() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("HibernateJPAApp");
    }

    @Override
    public void create(Object obj) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(obj);
        entityTransaction.commit();
    }

    @Override
    public Object read(Long id) {
        return entityManagerFactory
                .createEntityManager()
                .find(Country.class, id);
    }

    @Override
    public List<Country> readAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String query = "FROM Country";
        TypedQuery<Country> countryTypedQuery = entityManager.createQuery(query, Country.class);
        return countryTypedQuery.getResultList();
    }

    @Override
    public void update(Object obj) {

    }

    @Override
    public void delete(Object obj) {

    }
}
