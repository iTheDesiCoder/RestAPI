package com.springboot.restapi.repository;

import com.springboot.restapi.entity.JPA.StockMain;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StockMainRepository extends JpaRepository<StockMain, String> {

}