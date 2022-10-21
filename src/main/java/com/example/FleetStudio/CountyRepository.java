package com.example.FleetStudio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountyRepository extends CrudRepository<County, String> {

    //@Query("SELECT * FROM tutorials t WHERE t.title LIKE %?1%")
    @Query("SELECT * FROM County c WHERE c.name = ?1")
    List<County> findByName(@Param("name") String name);

    //@Query("SELECT t FROM Tutorial t WHERE t.title LIKE %?1%")
    @Query("SELECT * FROM County c WHERE c.state = ?1")
    List<County> findByState(@Param("state") String state);

    //@Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
    @Query("SELECT * FROM County c WHERE c.state = ?1 and c.name = ?2")
    List<County> findByStateAndName(String state,String name);
}