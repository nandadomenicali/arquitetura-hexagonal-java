package br.com.arquitetura.hexagonal.domain;

import br.com.arquitetura.hexagonal.domain.dtos.ProductDTO;

import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private double price;
    private double amount;

    public Product(){

    }

    public Product(UUID id, String name, double price, double amount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public UUID getId() {return id;}

    public String getName() {return name;}

    public double getPrice() {return price;}

    public double getAmount() {return amount;}

    public Product(ProductDTO productDTO){
        this.name = productDTO.getName();
        this.price = productDTO.getPrice();
        this.amount = productDTO.getAmount();
    }

    public void UpdateStock(double amount){ this.amount = amount;}

    public ProductDTO toProductDTO(){
        return new ProductDTO(this.name,  this.price,  this.amount);
    }
}
