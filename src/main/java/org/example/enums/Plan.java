package org.example.enums;

public enum Plan {
    BASIC("Basic",100),
    MEDIUM("Medium", 150),
    PRO("Professional", 300);

    private String name;
    private Integer price;

    Plan(){};

    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
