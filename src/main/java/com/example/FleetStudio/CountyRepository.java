package com.example.FleetStudio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountyRepository extends CrudRepository<County, String> {

    //@Query("SELECT * FROM tutorials t WHERE t.title LIKE %?1%")
    @Query(value = "SELECT * FROM County WHERE name = ?1", nativeQuery = true)
    List<County> findByName(@Param("name") String name);

    //@Query("SELECT t FROM Tutorial t WHERE t.title LIKE %?1%")
    @Query(value = "SELECT * FROM County WHERE state = ?1", nativeQuery = true)
    List<County> findByState(@Param("state") String state);

    //@Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
    @Query(value = "SELECT * FROM County WHERE state = ?1 and name = ?2", nativeQuery = true)
    List<County> findByStateAndName(String state,String name);
}