package com.kodluyoruz.weekfour.repository;
import com.kodluyoruz.weekfour.model.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Integer> {
    List<Basket> findAllByNameContains(String name);
    List<Basket> findAllByNameContainsOrDescriptionContains(String name);

}
