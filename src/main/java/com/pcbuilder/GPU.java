package com.pcbuilder;

import javax.persistence.*;

@Entity
@Table(name = "gpus")
public class GPU {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "name")
    private String name;

    @Column(name = "chipset")
    private String chipset;

    @Column(name = "memory")
    private String memory;

    @Column(name = "baseClock")
    private String baseClock;

    @Column(name = "boostClock")
    private String boostClock;

    @Column(name = "price")
    private String price;

    @Column(name = "amazon_link")
    private String amazonLink;

    public GPU() { }

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

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(String baseClock) {
        this.baseClock = baseClock;
    }

    public String getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(String boostClock) {
        this.boostClock = boostClock;
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
        return "pcbuilder.GPU{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", chipset='" + chipset + '\'' +
                ", memory='" + memory + '\'' +
                ", baseClock='" + baseClock + '\'' +
                ", boostClock='" + boostClock + '\'' +
                ", price='" + price + '\'' +
                ", amazonLink='" + amazonLink + '\'' +
                '}';
    }
}

