package com.omar.msproducts;

import com.omar.msproducts.models.entities.CategoryEntity;
import com.omar.msproducts.models.entities.DeletedProduct;
import com.omar.msproducts.models.entities.ProductEntity;
import com.omar.msproducts.models.entities.ProductStatus;
import com.omar.msproducts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void whenGetAll_ThenReturnAllProducts() {
        var list = productRepository.findAll(ProductStatus.NEW);
        assertEquals(3, list.size());
    }

    @Test
    void whenValidSave_ThenReturnProduct(){
        var productEntity = ProductEntity.builder()
                .name("Teclado")
                .stock(Double.valueOf(10))
                .price(BigDecimal.valueOf(300))
                .category(CategoryEntity.builder().id(1L).build())
                .build();
        productRepository.save(productEntity);

        var product = productRepository.findByCategoryAndDeleted(productEntity.getCategory(), DeletedProduct.CREATED);
        assertEquals(4, product.size());
    }
}
