package com.example.onetoone.repository;

import com.example.onetoone.model.Onwer;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Onwer,Long> {
}
