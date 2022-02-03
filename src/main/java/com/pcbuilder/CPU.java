package com.pcbuilder;

import javax.persistence.*;

@Entity
@Table(name = "cpus")
public class CPU {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "level")
    private String level;

    @Column(name = "name")
    private String name;

    @Column(name = "cores")
    private int cores;

    @Column(name = "threads")
    private int threads;

    @Column(name = "coreClock")
    private String coreClock;

    @Column(name = "boostClock")
    private String boostClock;

    @Column(name = "tdp")
    private String tdp;

    @Column(name = "intergratedGraphics")
    private String intergratedGraphics;

    @Column(name = "chipset")
    private String chipset;

    @Column(name = "price")
    private String price;

    @Column(name = "amazon_link")
    private String amazonLink;

    public CPU() { }

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(String coreClock) {
        this.coreClock = coreClock;
    }

    public String getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(String boostClock) {
        this.boostClock = boostClock;
    }

    public String getTdp() {
        return tdp;
    }

    public void setTdp(String tdp) {
        this.tdp = tdp;
    }

    public String getIntergratedGraphics() {
        return intergratedGraphics;
    }

    public void setIntergratedGraphics(String intergratedGraphics) {
        this.intergratedGraphics = intergratedGraphics;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
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
        return "pcbuilder.CPU{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", cores=" + cores +
                ", threads=" + threads +
                ", coreClock='" + coreClock + '\'' +
                ", boostClock='" + boostClock + '\'' +
                ", tdp='" + tdp + '\'' +
                ", intergratedGraphics='" + intergratedGraphics + '\'' +
                ", chipset='" + chipset + '\'' +
                ", price='" + price + '\'' +
                ", amazonLink='" + amazonLink + '\'' +
                '}';
    }
}
