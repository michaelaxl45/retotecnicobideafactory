package com.booking.domain.dto.request;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class BookRequest {

    @Size(min = 9,max = 10, message = "ID must have minimum 9 and max 10 characters")
    @NotNull(message = "required property ID")
    private String id;

    @Size(min = 2,max = 50, message = "Name must have minimum 2 and max 50 characters")
    @NotNull(message = "required property Name")
    private String name;

    @Size(min = 2,max = 50, message = "Last name must have minimum 2 and max 50 characters")
    @NotNull(message = "required property lastName")
    private String lastName;
    @Range(min=18, max=100, message = "Age must between 18 and 100")
    @NotNull(message = "required property Age")
    private Integer age;

    @Size(min = 9,max = 20, message = "Phone Number must have minimum 9 and max 20 characters")
    @NotNull(message = "required property phone Number")
    private String phoneNumber;
    @NotNull(message = "required property start Date")
    private String startDate;

    @NotNull(message = "required property End Date")
    private String endDate;

    @Size(min = 6,max = 15, message = "HouseID must have minimum 6 and max 15 characters")
    @NotNull(message = "required property House Id")
    private String houseId;

    @Size(min = 8,max = 8, message = "DiscountCode must have minimum 8 and max 8 characters")
    @NotNull(message = "required property DiscountCODE")
    private String discountCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }
}
