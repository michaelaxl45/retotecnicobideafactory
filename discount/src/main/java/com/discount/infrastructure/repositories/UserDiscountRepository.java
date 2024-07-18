package com.discount.infrastructure.repositories;

import com.discount.domain.entities.UserDiscount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDiscountRepository extends JpaRepository<UserDiscount, Integer> {
}
