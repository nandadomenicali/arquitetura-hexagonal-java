package br.com.domain.repository;

import br.com.domain.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    Product findByName(String name);

    void save(Product product);
}
