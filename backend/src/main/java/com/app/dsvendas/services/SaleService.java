package com.app.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dsvendas.dto.SaleDTO;
import com.app.dsvendas.dto.SaleSuccessDTO;
import com.app.dsvendas.dto.SaleSumDTO;
import com.app.dsvendas.repositories.SaleRepository;
import com.app.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		return saleRepository.findAll(pageable).map(sale -> new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> sucessGroupBySeller(){
		return saleRepository.successGroupedBySeller();
	}
}
