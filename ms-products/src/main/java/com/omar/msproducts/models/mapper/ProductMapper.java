package com.omar.msproducts.models.mapper;


import com.omar.msproducts.models.dto.ProductCreateRequestDTO;
import com.omar.msproducts.models.dto.ProductResponseDTO;
import com.omar.msproducts.models.entities.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    @Mapping(source = "entity.id", target = "id")
    @Mapping(source = "entity.name", target = "name")
    @Mapping(source = "entity.stock", target = "stock")
    @Mapping(source = "entity.price", target = "price")
    @Mapping(source = "entity.creationDate", target = "creationDate")
    @Mapping(source = "entity.updateDate", target = "updateDate")
    @Mapping(source = "entity.status", target = "status")
    @Mapping(source = "entity.category.id", target = "categoryId")
    @Mapping(source = "port", target = "port")
    ProductResponseDTO entityToResponse(ProductEntity entity, Integer port);

    @Mapping(source = "request.name", target = "name")
    @Mapping(source = "request.stock", target = "stock")
    @Mapping(source = "request.price", target = "price")
    @Mapping(source = "request.categoryId", target = "category.id")
    ProductEntity requestToEntity(ProductCreateRequestDTO request);
}