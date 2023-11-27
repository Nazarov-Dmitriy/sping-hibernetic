package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.servise.HibernateServise;

@RestController
public class HibernateController {
    final private HibernateServise hibernateServise;

    public HibernateController(HibernateServise hibernateServise) {
        this.hibernateServise = hibernateServise;
    }

    @GetMapping("/persons/by-city")
    public String getPersonsByCity(@RequestParam("city") String city) {
        return hibernateServise.getPersonsByCity(city).toString();
    }
}
