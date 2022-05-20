package br.com.arquitetura.hexagonal;

import br.com.arquitetura.hexagonal.infrastructure.adapters.repository.ISpringProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = ISpringProductRepository.class)
public class ArquiteturaHexagonalApplication {

    public static void main(String[] args){
        SpringApplication.run(ArquiteturaHexagonalApplication.class, args);
    }

}
