package com.pcbuilder;

import javax.persistence.*;

@Entity
@Table(name = "motherboards")
public class Motherboard {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "name")
    private String name;

    @Column(name = "socket")
    private String socket;

    @Column(name = "ramSlots")
    private int ramSlots;

    @Column(name = "price")
    private String price;

    @Column(name = "amazon_link")
    private String amazonLink;

    public Motherboard() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmazonLink() {
        return amazonLink;
    }

    public void setAmazonLink(String amazonLink) {
        this.amazonLink = amazonLink;
    }

    @Override
    public String toString() {
        return "pcbuilder.Motherboard{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", socket='" + socket + '\'' +
                ", ramSlots=" + ramSlots +
                ", price='" + price + '\'' +
                ", amazonLink='" + amazonLink + '\'' +
                '}';
    }
}
