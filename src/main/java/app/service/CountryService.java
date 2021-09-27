package app.service;

import app.dao.CountryDaoImpl;
import app.model.Country;

import java.util.List;

public class CountryService {

    private final CountryDaoImpl countryDao;

    public CountryService() {
        this.countryDao = new CountryDaoImpl();
    }

    public void create(Country country) {
        countryDao.create(country);
    }

    public List<Country> findAll() {
        return countryDao.readAll();
    }
}
