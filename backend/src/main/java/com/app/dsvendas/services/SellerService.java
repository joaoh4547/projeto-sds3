package com.app.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dsvendas.dto.SellerDTO;
import com.app.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll(){
		return sellerRepository.findAll().stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
	}
	
}
