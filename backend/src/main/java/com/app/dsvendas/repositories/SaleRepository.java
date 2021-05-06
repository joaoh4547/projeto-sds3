package com.app.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
