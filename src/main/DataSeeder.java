package main;

import org.hibernate.HibernateException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.Callable;

public class DataSeeder {

    private static EntityManagerFactory factory;

    public static void seedData() throws Exception {
        factory = Persistence.createEntityManagerFactory("hibernatefundamentals.m04.ex07");

        seedCase();
        seedCPU();
        seedCPU_Cooler();
        seedGPU();
        seedMotherboard();
        seedPSU();
        seedRAM();
        seedSTORAGE();
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
                    Case case = new Case();

                } catch (HibernateException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    entityManager.getTransaction().commit();
}
