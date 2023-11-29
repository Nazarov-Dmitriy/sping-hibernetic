package ru.netology.hibernate.servise;

import org.springframework.stereotype.Service;
import ru.netology.hibernate.domain.Customers;
import ru.netology.hibernate.repository.HibernateRepository;

import java.util.List;

@Service
public class HibernateServise {
    private final HibernateRepository repository;

    public HibernateServise(HibernateRepository repository) {
        this.repository = repository;
    }

    public List<Customers> getPersonsByCity(String city) {
        return repository.personsByCity(city);
    }
}
