package by.jrr.telegrambot.service;

public abstract class Product {

    abstract public void showName ();
    abstract public void showInfo ();
    abstract public double calculatePrice ();
}

class Landing extends Product {

    private String name;
    private String information;
    private double price;

    public Landing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void showName() {
        getName();
    }

    @Override
    public void showInfo() {
        getInformation();
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}

