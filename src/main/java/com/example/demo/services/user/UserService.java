package com.example.demo.services.user;

import com.example.demo.mybatis.dao.CityDao;
import com.example.demo.mybatis.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private CityDao cityDao;

    public City getCityById(long id){
        return cityDao.selectCityById(id);
    }
}
