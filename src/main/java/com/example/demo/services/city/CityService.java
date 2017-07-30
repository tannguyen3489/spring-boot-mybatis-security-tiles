package com.example.demo.services.city;

import com.example.demo.mybatis.dao.CityDao;
import com.example.demo.mybatis.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityDao cityDao;

    public City getCityById(long id){
        return cityDao.selectCityById(id);
    }
}
