package app;

import app.dao.CountryJPADaoImpl;
import app.model.City;
import app.model.Country;
import app.service.CountryJPAService;
import app.service.CountryService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CountryService countryService = new CountryService();
        CountryJPAService countryJPAService = new CountryJPAService();

        Country country = new Country();
        country.setTitle("USA");

        City city = new City();
        city.setTitle("New-York");
        city.setCountry(country);

        City city1 = new City();
        city1.setTitle("Chicago");
        city1.setCountry(country);

        List<City> cityList = new ArrayList<>();
        cityList.add(city);
        cityList.add(city1);
        country.setCities(cityList);

//        countryService.create(country);
//        countryJPAService.create(country);

        System.out.println(countryJPAService.find((long) 5));

        for (Country c : countryJPAService.findAll()) {
            System.out.println(c);
        }
    }
}
