package com.kodluyoruz.weekfour.repository;
import com.kodluyoruz.weekfour.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAllByNameContains(String name);
    List<Order> findAllByNameContainsOrDescriptionContains(String name);

}