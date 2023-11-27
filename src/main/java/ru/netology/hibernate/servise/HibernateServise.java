package ru.netology.hibernate.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.domain.Customers;
import ru.netology.hibernate.repository.HibernateRepository;

import java.util.List;

@Service
public class HibernateServise {
    private @Autowired HibernateRepository repository;

    public List<Customers> getPersonsByCity(String city) {
        return repository.personsByCity(city);
    }
}
