package com.xxx.repositories;

import com.xxx.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseRepository <E extends BaseEntity, ID extends Serializable> extends JpaRepository<E, ID> {
}
