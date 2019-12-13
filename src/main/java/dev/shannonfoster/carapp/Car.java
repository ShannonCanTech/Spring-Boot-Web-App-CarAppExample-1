package dev.shannonfoster.carapp;

import sun.jvm.hotspot.gc.shared.Generation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car implements Vehicle {
    /* Instance variables */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand;
    private String model;
    private String exteriorColor;
    private boolean availability;
    private String type;
    private String interior;
    private int seats;

/* Constructor overloading */
    public Car(){}

    public Car(String brand, String model, String exteriorColor, boolean availability, String type, String interior, int seats){
        this.brand = brand;
        this.model = model;
        this.exteriorColor = exteriorColor;
        this.availability = availability;
        this.type = type;
        this.interior = interior;
        this.seats = seats;
    }

    /* Getters */
    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getExteriorColor(){
        return exteriorColor;
    }

    public boolean getAvailability(){
        return availability;
    }

    public String getType(){
        return type;
    }

    public String getInterior(){
        return interior;
    }

    public int getSeats(){
        return seats;
    }

    /* Setters */
    public void setBrand(String brand){ this.brand = brand; }
    public void setModel(String model){ this.model = model; }
    public void setExteriorColor(String exteriorColor) { this.exteriorColor = exteriorColor; }
    public void setAvailability(boolean setAvailability){ this.availability = availability; }
    public void setType(String type){ this.type = type; }
    public void setInterior(String interior){ this.interior = interior; }
    public void setSeats(int seats){ this.seats = seats; }

//    Method overriding of abstract methods
    public void starting(){}
    public void stopping(){}
    public void hornSound(){}
    public void speeding(){}
    public void accelerates(){}
}
