package com.discount.domain.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tb_discount")
public class Discount {

    @Id
    private  Integer id;
    private String discountCode;

    @OneToMany(mappedBy = "discountCode", cascade = {CascadeType.MERGE,  CascadeType.PERSIST})
    private List<UserDiscount> userDiscounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }
}
