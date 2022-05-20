package br.com.arquitetura.hexagonal.infrastructure.configuration;

import br.com.arquitetura.hexagonal.domain.adapters.service.OrderedServiceImpl;
import br.com.arquitetura.hexagonal.domain.ports.IProductServicePort;
import br.com.arquitetura.hexagonal.domain.repository.IProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    IProductServicePort productServicePort(IProductRepository productRepository){
        return new OrderedServiceImpl(productRepository);
    }

}
