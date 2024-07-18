package com.discount.infrastructure.repositories;

import com.discount.domain.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Integer> {

   Optional<Discount> findByDiscountCode(String discountCode);
}
