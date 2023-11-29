package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.domain.Customers;

import java.util.List;

@Repository
public class HibernateRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Customers> personsByCity(String city) {
        var query = entityManager.createQuery("select customers from Customers customers  where customers.cityOfLiving = :city", Customers.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}

