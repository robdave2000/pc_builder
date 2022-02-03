package com.pcbuilder;

import org.hibernate.HibernateException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.FileReader;

public class DataSeeder {

    private static EntityManagerFactory factory;

    public static void seedData() throws Exception {
        factory = Persistence.createEntityManagerFactory("pcbuilder-persistenceUnit");

        seedCase();
        //seedCPU();
        //seedCPU_Cooler();
        //seedGPU();
        //seedMotherboard();
        //seedPSU();
        //seedRAM();
        //seedSTORAGE();
    }

    private static void seedCase() throws Exception {
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        try (BufferedReader br = new BufferedReader(new FileReader("seed_data/Case.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnValues = line.split("\\|");
                int id = Integer.parseInt(columnValues[0]);
                String brand = columnValues[1];
                String name = columnValues[2];
                String type = columnValues[3];
                String color = columnValues[4];
                String price = columnValues[5];
                String amazonLink = columnValues[6];

                try {
                    Case casw = new Case();
                    casw.setId(id);
                    casw.setBrand(brand);
                    casw.setName(name);
                    casw.setType(type);
                    casw.setColor(color);
                    casw.setPrice(price);
                    casw.setAmazonLink(amazonLink);

                    entityManager.persist(casw);
                }catch (HibernateException e){
                    e.printStackTrace();
                }
            }
        }
        entityManager.getTransaction().commit();
    }

}
