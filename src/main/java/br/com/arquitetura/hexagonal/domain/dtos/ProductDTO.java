package br.com.arquitetura.hexagonal.domain.dtos;

public class ProductDTO {

    private String name;
    private double price;
    private double amount;

    public ProductDTO(){}

    public ProductDTO(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }
}
