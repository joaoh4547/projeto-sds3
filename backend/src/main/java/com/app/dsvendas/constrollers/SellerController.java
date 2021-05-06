package com.app.dsvendas.constrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dsvendas.dto.SellerDTO;
import com.app.dsvendas.services.SellerService;

@RestController
@RequestMapping("/sellers")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public 	ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> sellerDTOs = sellerService.findAll();
		return ResponseEntity.ok().body(sellerDTOs);
	}
}
