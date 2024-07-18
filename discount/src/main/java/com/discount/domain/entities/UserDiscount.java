package com.discount.domain.entities;

import javax.persistence.*;


@Entity
@Table(name="tb_user_discount")
public class UserDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userId;
    private String houseId;
    @ManyToOne
    private Discount discountCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public Discount getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(Discount discountCode) {
        this.discountCode = discountCode;
    }
}
