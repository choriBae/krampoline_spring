package com.example.demo.controller;

import com.example.demo.service.WeatherService;
import com.example.demo.service.impl.WeatherServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/api/test")
    String createWeather(){
        return "Success";
    }
}
