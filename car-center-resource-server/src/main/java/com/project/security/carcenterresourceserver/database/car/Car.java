package com.project.security.carcenterresourceserver.database.car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Year;
import java.util.Calendar;

@Entity
public class Car {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    private String type;
    @Column(name = "brand")
    private String brand;
    @Column(name = "engine")
    private String engine;
    @Column(name = "fuel")
    private String fuel;
    @Column(name = "production_year")
    private Integer production_year;
    @Column(name = "net_price")
    private Float net_price;
    @Column(name = "vin")
    private String vin;

    public Car(String type, String brand, String engine, String fuel,
               Integer production_year, Float net_price, String vin) {
        this.type = type;
        this.brand = brand;
        this.engine = engine;
        this.fuel = fuel;
        this.production_year = production_year;
        this.net_price = net_price;
        this.vin = vin;
    }

    public Car() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getProduction_year() {
        return production_year;
    }

    public void setProduction_year(Integer production_year) {
        this.production_year = production_year;
    }

    public Float getNet_price() {
        return net_price;
    }

    public void setNet_price(Float net_price) {
        this.net_price = net_price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
