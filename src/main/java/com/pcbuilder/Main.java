package com.pcbuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        DataSeeder.seedData();

        Motherboard motherboard = entityManager.find(Motherboard.class, 1);
    }
}
