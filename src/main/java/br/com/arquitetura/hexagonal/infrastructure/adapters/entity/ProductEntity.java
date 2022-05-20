package br.com.arquitetura.hexagonal.infrastructure.adapters.entity;

import br.com.arquitetura.hexagonal.domain.Product;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private double price;
    private double amount;

    public ProductEntity(){

    }
    public ProductEntity(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.amount = product.getAmount();
    }

    public void update(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.amount = product.getAmount();
    }

    public Product toProduct(){ return new Product(this.id, this.name, this.price, this.amount);}
}
