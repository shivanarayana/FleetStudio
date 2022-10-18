package com.example.FleetStudio;

import org.springframework.data.repository.CrudRepository;

public interface CountyRepository extends CrudRepository<County, String> {

//    <S extends T> S save(List<CountySuggestion> entity);
//
////    Optional<T> findById(ID primaryKey);
//
//    Iterable<T> findAll();
//
//    long count();
//
//    void delete(T entity);
//
//    boolean existsById(ID primaryKey);

    // … more functionality omitted.
}