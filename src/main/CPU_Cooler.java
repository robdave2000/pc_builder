package main;

import javax.persistence.*;

@Entity
@Table(name = "cpu_coolers")
public class CPU_Cooler {

    @Id
    @Column(name = "cpu_cooler_id")
    private int id;

    @Column(name = "company")
    private String company;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "radiator")
    private String radiator;

    @Column(name = "price")
    private String price;

    @Column(name = "amazon_link")
    private String amazonLink;

    public CPU_Cooler() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRadiator() {
        return radiator;
    }

    public void setRadiator(String radiator) {
        this.radiator = radiator;
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
        return "CPU_Cooler{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", radiator='" + radiator + '\'' +
                ", price='" + price + '\'' +
                ", amazonLink='" + amazonLink + '\'' +
                '}';
    }
}