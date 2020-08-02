package com.example.weather19.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
@Mapper
public interface WeaMapper {
    void save(int id,String city,String tem,String precipitation,String wind,String airQu,String time);
    String findTemById(int id);
    String findPrecipitationById(int id);
    String findWindById(int id);
    String findAirQuById(int id);
    String findAll(int id);
}
