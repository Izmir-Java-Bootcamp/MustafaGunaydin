package com.kodluyoruz.weekfour.repository;
import com.kodluyoruz.weekfour.model.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Integer> {
    List<Checkout> findAllByNameContains(String name);
    List<Checkout> findAllByNameContainsOrDescriptionContains(String name);

}