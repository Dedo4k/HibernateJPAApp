package app.service;

import app.dao.CountryJPADaoImpl;
import app.model.Country;

import java.util.List;

public class CountryJPAService {

    private final CountryJPADaoImpl countryJPADao;

    public CountryJPAService() {
        this.countryJPADao = new CountryJPADaoImpl();
    }

    public void create(Country country) {
        countryJPADao.create(country);
    }

    public Country find(Long id) {
        return (Country) countryJPADao.read(id);
    }

    public List<Country> findAll() {
        return countryJPADao.readAll();
    }
}
