package com.example.weather19.Service;

import com.example.weather19.Mapper.WeaMapper;
import com.example.weather19.Pojo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaService {
    @Autowired
    WeaMapper weaMapper;
    public String findTemById(int id){
        return weaMapper.findTemById(id);
    }
    public String findPrecipitationById(int id){
        return weaMapper.findPrecipitationById(id);
    }
    public String findWindById(int id){
        return weaMapper.findWindById(id);
    }
    public String findAirQuById(int id) {
        return weaMapper.findAirQuById(id);
    }
    public String findTodayById(int id){
        String wind = weaMapper.findWindById(id);
        String airQu = weaMapper.findAirQuById(id);
        String tem = weaMapper.findTemById(id);
        return wind+" "+airQu +" "+tem;
    }
    public Weather jsonTest(int id){
        Weather wea = new Weather();
        wea.setWind(weaMapper.findWindById(id));
        wea.setTem(weaMapper.findTemById(id));
        wea.setPrecipitation(weaMapper.findPrecipitationById(id));
        wea.setAirQu(weaMapper.findAirQuById(id));
        wea.setId(id);
        return wea;
    }
}
