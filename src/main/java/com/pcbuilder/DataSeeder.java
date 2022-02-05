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

    private static void seedCPU() throws Exception {
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        try (BufferedReader br = new BufferedReader(new FileReader("seed_data/CPU.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnValues = line.split("\\|");
                int id = Integer.parseInt(columnValues[0]);
                String brand = columnValues[1];
                String level = columnValues[2];
                String name = columnValues[3];
                int cores = Integer.parseInt(columnValues[4]);
                int threads = Integer.parseInt(columnValues[5]);
                String coreClock = columnValues[6];
                String boostClock = columnValues[7];
                String tdp = columnValues[8];
                String intergratedGraphics = columnValues[9];
                String chipset = columnValues[10];
                String price = columnValues[11];
                String amazonLink = columnValues[12];

                try {
                    CPU cpu = new CPU();
                    cpu.setId(id);
                    cpu.setBrand(brand);
                    cpu.setLevel(level);
                    cpu.setName(name);
                    cpu.setCores(cores);
                    cpu.setThreads(threads);
                    cpu.setCoreClock(coreClock);
                    cpu.setBoostClock(boostClock);
                    cpu.setTdp(tdp);
                    cpu.setIntergratedGraphics(intergratedGraphics);
                    cpu.setChipset(chipset);
                    cpu.setPrice(price);
                    cpu.setAmazonLink(amazonLink);

                    entityManager.persist(cpu);
                }catch (HibernateException e){
                    e.printStackTrace();
                }
            }
        }
        entityManager.getTransaction().commit();
    }

    private static void seedCPU_Cooler() throws Exception {
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        try (BufferedReader br = new BufferedReader(new FileReader("seed_data/CPU_Cooler.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnValues = line.split("\\|");
                int id = Integer.parseInt(columnValues[0]);
                String company = columnValues[1];
                String name = columnValues[2];
                String type = columnValues[3];
                String radiator = columnValues[4];
                String price = columnValues[5];
                String amazonLink = columnValues[6];

                try {
                    CPU_Cooler cpuCooler = new CPU_Cooler();
                    cpuCooler.setId(id);
                    cpuCooler.setCompany(company);
                    cpuCooler.setName(name);
                    cpuCooler.setType(type);
                    cpuCooler.setRadiator(radiator);
                    cpuCooler.setPrice(price);
                    cpuCooler.setAmazonLink(amazonLink);

                    entityManager.persist(cpuCooler);
                }catch (HibernateException e){
                    e.printStackTrace();
                }
            }
        }
        entityManager.getTransaction().commit();
    }

    private static void seedGPU() throws Exception {
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        try (BufferedReader br = new BufferedReader(new FileReader("seed_data/GPU.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnValues = line.split("\\|");
                int id = Integer.parseInt(columnValues[0]);
                String brand = columnValues[1];
                String name = columnValues[2];
                String chipset = columnValues[3];
                String memory = columnValues[4];
                String baseClock = columnValues[5];
                String boostClock = columnValues[6];
                String price = columnValues[7];
                String amazonLink = columnValues[8];

                try {
                    GPU gpu = new GPU();
                    gpu.setId(id);
                    gpu.setBrand(brand);
                    gpu.setName(name);
                    gpu.setChipset(chipset);
                    gpu.setMemory(memory);
                    gpu.setBaseClock(baseClock);
                    gpu.setBoostClock(boostClock);
                    gpu.setPrice(price);
                    gpu.setAmazonLink(amazonLink);

                    entityManager.persist(gpu);
                }catch (HibernateException e){
                    e.printStackTrace();
                }
            }
        }
        entityManager.getTransaction().commit();
    }

    private static void seedMotherboard() throws Exception {
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        try (BufferedReader br = new BufferedReader(new FileReader("seed_data/Motherboard.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnValues = line.split("\\|");
                int id = Integer.parseInt(columnValues[0]);
                String brand = columnValues[1];
                String name = columnValues[2];
                String socket = columnValues[3];
                int ramSlots = Integer.parseInt(columnValues[4]);
                String price = columnValues[5];
                String amazonLink = columnValues[6];

                try {
                    Motherboard motherboard = new Motherboard();
                    motherboard.setId(id);
                    motherboard.setBrand(brand);
                    motherboard.setName(name);
                    motherboard.setSocket(socket);
                    motherboard.setRamSlots(ramSlots);
                    motherboard.setPrice(price);
                    motherboard.setAmazonLink(amazonLink);

                    entityManager.persist(motherboard);
                }catch (HibernateException e){
                    e.printStackTrace();
                }
            }
        }
        entityManager.getTransaction().commit();
    }

    private static void seedPSU() throws Exception {
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        try (BufferedReader br = new BufferedReader(new FileReader("seed_data/PSU.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnValues = line.split("\\|");
                int id = Integer.parseInt(columnValues[0]);
                String brand = columnValues[1];
                String name = columnValues[2];
                String type = columnValues[3];
                String modular = columnValues[4];
                String efficiency = columnValues[5];
                String wattage = columnValues[6];
                String price = columnValues[7];
                String amazonLink = columnValues[8];

                try {
                    PSU psu = new PSU();
                    psu.setId(id);
                    psu.setBrand(brand);
                    psu.setName(name);
                    psu.setType(type);
                    psu.setModular(modular);
                    psu.setEfficiency(efficiency);
                    psu.setWattage(wattage);
                    psu.setPrice(price);
                    psu.setAmazonLink(amazonLink);

                    entityManager.persist(psu);
                }catch (HibernateException e){
                    e.printStackTrace();
                }
            }
        }
        entityManager.getTransaction().commit();
    }

    private static void seedRAM() throws Exception {
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        try (BufferedReader br = new BufferedReader(new FileReader("seed_data/RAM.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnValues = line.split("\\|");
                int id = Integer.parseInt(columnValues[0]);
                String brand = columnValues[1];
                String name = columnValues[2];
                String speed = columnValues[3];
                int modules = Integer.parseInt(columnValues[4]);
                String modulesSize = columnValues[5];
                String cas = columnValues[6];
                String price = columnValues[7];
                String amazonLink = columnValues[8];

                try {
                    RAM ram = new RAM();
                    ram.setId(id);
                    ram.setBrand(brand);
                    ram.setName(name);
                    ram.setSpeed(speed);
                    ram.setModules(modules);
                    ram.setModulesSize(modulesSize);
                    ram.setCas(cas);
                    ram.setPrice(price);
                    ram.setAmazonLink(amazonLink);

                    entityManager.persist(ram);
                }catch (HibernateException e){
                    e.printStackTrace();
                }
            }
        }
        entityManager.getTransaction().commit();
    }

    private static void seedSTORAGE() throws Exception {
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        try (BufferedReader br = new BufferedReader(new FileReader("seed_data/STORAGE.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columnValues = line.split("\\|");
                int id = Integer.parseInt(columnValues[0]);
                String brand = columnValues[1];
                String name = columnValues[2];
                String capacity = columnValues[3];
                String type = columnValues[4];
                String formFactor = columnValues[5];
                String price = columnValues[6];
                String amazonLink = columnValues[7];

                try {
                    STORAGE storage = new STORAGE();
                    storage.setId(id);
                    storage.setBrand(brand);
                    storage.setName(name);
                    storage.setCapacity(capacity);
                    storage.setType(type);
                    storage.setFormFactor(formFactor);
                    storage.setPrice(price);
                    storage.setAmazonLink(amazonLink);

                    entityManager.persist(storage);
                }catch (HibernateException e){
                    e.printStackTrace();
                }
            }
        }
        entityManager.getTransaction().commit();
    }
}
