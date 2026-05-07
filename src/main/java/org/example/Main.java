package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Healthplan heplan = new Healthplan(1, "Jane", Plan.MEDIUM);
        System.out.println(heplan);

        String[] developers = new String[3];
        developers[0] = "Bob";
        developers[1]= "John";
        developers[2]= "Jane";
        Company com = new Company(1, "Vincent", 150000.00,developers);
        System.out.println(com);

        String[] plans = new String[3];
        plans[0] = Plan.BASIC.getName();
        plans[1] = Plan.MEDIUM.getName();
        plans[2] = Plan.PRO.getName();

        Employee emp = new Employee(1,"Sonya", "son@ya.com","123456", plans);
        System.out.println(emp);
    }
}