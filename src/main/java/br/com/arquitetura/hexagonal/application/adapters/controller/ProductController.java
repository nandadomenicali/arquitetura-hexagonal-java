package br.com.arquitetura.hexagonal.application.adapters.controller;

import br.com.arquitetura.hexagonal.domain.dtos.ProductDTO;
import br.com.arquitetura.hexagonal.domain.dtos.StockDTO;
import br.com.arquitetura.hexagonal.domain.ports.IProductServicePort;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private final IProductServicePort productServicePort;

    public ProductController(IProductServicePort productServicePort) {this.productServicePort = productServicePort;}


    @PostMapping
    public void CreateProduct(@RequestBody ProductDTO productDTO){
        productServicePort.createProduct(productDTO);
    }

    @GetMapping("/products")
    List<ProductDTO> getProduct(){
        return productServicePort.FindProduct();
    }

    @PutMapping(value = "/{name}")
    public void updateStock(@PathVariable String name, @RequestBody StockDTO stockDTO) throws NotFoundException {
        productServicePort.updateStock(name, stockDTO);
    }

}
