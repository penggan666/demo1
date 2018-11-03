package com.example.demo1.Repository;

import com.example.demo1.Bean.orign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface orignRepository extends JpaRepository<orign, String> {
    @Query(value = "select url from orign;", nativeQuery = true)
    List<String> getAllurl();

}


