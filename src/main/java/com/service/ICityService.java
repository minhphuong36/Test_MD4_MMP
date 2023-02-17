package com.service;


import com.model.City;

public interface ICityService extends IGeneralService<City> {
    City findCityByName(String cityName);
}
