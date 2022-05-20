package br.com.domain.ports;

import br.com.domain.dtos.ProductDTO;
import br.com.domain.dtos.StockDTO;
import javassist.NotFoundException;

import java.util.List;

public interface IProductServicePort {

    List<ProductDTO> FindProduct();

    void createProduct(ProductDTO productDTO);

    void updateStock(String name, StockDTO stockDTO) throws NotFoundException;
}
