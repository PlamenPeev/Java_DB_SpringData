package com.example.db_json_processing.repositories;

import com.example.db_json_processing.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    Optional<List<Product>> findAllByPriceBetweenAndBuyerIsNullOrderByPrice
            (BigDecimal low, BigDecimal high);
}
