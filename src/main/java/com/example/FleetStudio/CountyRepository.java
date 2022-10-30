package com.example.FleetStudio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountyRepository extends CrudRepository<County, String> {

    @Query(value = "SELECT * FROM County WHERE name = ?1 LIMIT 5", nativeQuery = true)
    List<County> findByName(@Param("name") String name);

    @Query(value = "SELECT * FROM County WHERE state = ?1 LIMIT 5", nativeQuery = true)
    List<County> findByState(@Param("state") String state);

    @Query(value = "SELECT * FROM County WHERE state = ?1 and name = ?2 LIMIT 5", nativeQuery = true)
    List<County> findByStateAndName(String state,String name);
}