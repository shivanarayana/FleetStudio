package com.example.FleetStudio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountyRepository extends CrudRepository<County, String> {

//    @Query("select * from County c where c.name = :name")
//    List<County> findByName(@Param("name") String name);
//
//    @Query("select * from County c where c.state = :state")
//    List<County> findByState(@Param("state") String state);

    @Query(
            value = "SELECT * FROM County c WHERE c.state = ?1 and c.name = ?2",
            nativeQuery = true)
    List<County> findByStateAndName(String state,String name);
}