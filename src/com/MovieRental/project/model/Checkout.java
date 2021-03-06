package com.MovieRental.project.model;

import java.util.*;

public class Checkout {
    private CreditCard paymentType;
    private List<Rental> rentals;
    private float totalPrice;

    public CreditCard getPaymentType() {
        return paymentType;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setPaymentType(CreditCard paymentType) {
        this.paymentType = paymentType;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
