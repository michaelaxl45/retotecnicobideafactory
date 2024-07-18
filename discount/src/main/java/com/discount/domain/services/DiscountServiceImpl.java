package com.discount.domain.services;

import com.discount.application.DiscountService;
import com.discount.domain.entities.Discount;
import com.discount.infrastructure.repositories.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Transactional
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountRepository discountRepository;
    @Override
    public Discount get(String discountCode) {
       Optional<Discount> discount =  discountRepository.findByDiscountCode(discountCode);
       if(discount.isEmpty())
           throw new NullPointerException();
       return discount.get();
    }
}
