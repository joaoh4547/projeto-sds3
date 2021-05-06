package com.app.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
