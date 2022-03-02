package com.example.A00444846_springApi.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

    public Hotel() {
    }

    public Hotel(int id, String hotelName, double price) {
        this.id = id;
        this.hotelName = hotelName;
        this.price = price;
    }

    public Hotel(String hotelName, double price) {
        this.hotelName = hotelName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Double getPrice() { return price; }

    public void setPrice(Double price) { this.price = price; }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String hotelName;
    private Double price;
}
