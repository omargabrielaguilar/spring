package com.omar.msproducts.repositories;

import com.omar.msproducts.models.entities.CategoryEntity;
import com.omar.msproducts.models.entities.DeletedProduct;
import com.omar.msproducts.models.entities.ProductEntity;
import com.omar.msproducts.models.entities.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query("FROM ProductEntity WHERE deleted = com.omar.msproducts.models.entities.DeletedProduct.CREATED AND ((:status IS NULL) OR (status = :status))")
    List<ProductEntity> findAll(@Param("status") ProductStatus status);

    List<ProductEntity> findByCategoryAndDeleted(CategoryEntity category, DeletedProduct deleted);
}
