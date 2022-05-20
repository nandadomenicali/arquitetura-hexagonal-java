package br.com.domain.adapters.service;

import br.com.domain.Product;
import br.com.domain.dtos.ProductDTO;
import br.com.domain.dtos.StockDTO;
import br.com.domain.ports.IProductServicePort;
import br.com.domain.repository.IProductRepository;
import javassist.NotFoundException; 

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OrderedServiceImpl implements IProductServicePort {

    private final IProductRepository repository;

    public OrderedServiceImpl(IProductRepository repository) {this.repository = repository;}

    @Override
    public List<ProductDTO> FindProduct() {
        List<Product> products = this.repository.findAll();
        List<ProductDTO> productsDTO = products.stream().map(Product::toProductDTO).collect(Collectors.toList());
        return productsDTO;
    }

    @Override
    public void createProduct(ProductDTO productDTO) {
        Product product = new Product(productDTO);
        this.repository.save(product);

    }

    @Override
    public void updateStock(String name, StockDTO stockDTO) throws NotFoundException {
        Product product = this.repository.findByName(name);

        if(Objects.isNull(product))
            throw new NotFoundException("Product not found");

        product.UpdateStock(stockDTO.getAmount());

        this.repository.save(product);

    }
}
