package br.com.arquitetura.hexagonal.domain.repository;

import br.com.arquitetura.hexagonal.domain.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    Product findByName(String name);

    void save(Product product);
}
