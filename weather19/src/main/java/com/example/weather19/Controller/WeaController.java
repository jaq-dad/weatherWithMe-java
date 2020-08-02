package com.example.weather19.Controller;

import com.example.weather19.Pojo.Weather;
import com.example.weather19.Service.WeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/weather")
public class WeaController {
    @Autowired
    WeaService weaService;
    @GetMapping("/tem")
    public String findTem(){
        int id = 1;
        return weaService.findTemById(id);
    }
    @GetMapping("precipitation")
    public String findPrecipitation(){
        int id = 1;
        return weaService.findPrecipitationById(id);
    }
    @GetMapping("/wind")
    public String findWind(){
        int id = 1;
        return weaService.findWindById(id);
    }
    @GetMapping("/airqu")
    public String findAirQu(){
        int id = 1;
        return weaService.findAirQuById(id);
    }
    @GetMapping("today")
    public  String findToday(){
        int id = 2;
        return weaService.findTodayById(id);
    }
    @GetMapping("json1")
    public Weather getJson(){
        int id = 9;
        return weaService.jsonTest(id);
    }
}
