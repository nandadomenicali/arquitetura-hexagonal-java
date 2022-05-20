package br.com.arquitetura.hexagonal.infrastructure.adapters.repository;

import br.com.arquitetura.hexagonal.infrastructure.adapters.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ISpringProductRepository extends JpaRepository<ProductEntity, UUID> {

    Optional<ProductEntity> findByName(String name);
}
