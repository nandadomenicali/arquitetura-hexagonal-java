package br.com.arquitetura.hexagonal.infrastructure.adapters.repository;

import br.com.arquitetura.hexagonal.domain.Product;
import br.com.arquitetura.hexagonal.domain.repository.IProductRepository;
import br.com.arquitetura.hexagonal.infrastructure.adapters.entity.ProductEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductRepository implements IProductRepository {

    private final ISpringProductRepository springProductRepository;

    public ProductRepository(ISpringProductRepository springProductRepository){ this.springProductRepository = springProductRepository;}

    @Override
    public List<Product> findAll() {
        List<ProductEntity> entities = this.springProductRepository.findAll();
        return entities.stream().map(ProductEntity::toProduct).collect(Collectors.toList());
    }

    @Override
    public Product findByName(String name) {
        Optional<ProductEntity> entity = this.springProductRepository.findByName(name);

        if(entity.isPresent())
            return entity.get().toProduct();

        throw new RuntimeException("Product does not exist");
    }

    @Override
    public void save(Product product) {
        ProductEntity productEntity;

        if(Objects.isNull(product.getId())){
            productEntity = new ProductEntity(product);
        } else {
            productEntity = this.springProductRepository.findById(product.getId()).get();
        }

        this.springProductRepository.save(productEntity);

    }
}
