package com.app.dsvendas.constrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dsvendas.dto.SaleDTO;
import com.app.dsvendas.dto.SaleSuccessDTO;
import com.app.dsvendas.dto.SaleSumDTO;
import com.app.dsvendas.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> find(Pageable pageable){
		Page<SaleDTO> page = saleService.findAll(pageable);
		return ResponseEntity.ok().body(page);
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller(){
		List<SaleSumDTO> list = saleService.amountGroupBySeller();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller(){
		List<SaleSuccessDTO> list = saleService.sucessGroupBySeller();
		return ResponseEntity.ok().body(list);
	}
}
