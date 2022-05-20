package br.com.arquitetura.hexagonal.domain.ports;

import br.com.arquitetura.hexagonal.domain.dtos.ProductDTO;
import br.com.arquitetura.hexagonal.domain.dtos.StockDTO;
import javassist.NotFoundException;

import java.util.List;

public interface IProductServicePort {

    List<ProductDTO> FindProduct();

    void createProduct(ProductDTO productDTO);

    void updateStock(String name, StockDTO stockDTO) throws NotFoundException;
}
