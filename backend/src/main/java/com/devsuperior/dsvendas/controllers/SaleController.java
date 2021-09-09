package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dtos.SaleDto;
import com.devsuperior.dsvendas.dtos.SaleSuccessDto;
import com.devsuperior.dsvendas.dtos.SaleSumDto;
import com.devsuperior.dsvendas.dtos.SellerDto;
import com.devsuperior.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        return  ResponseEntity.ok(saleService.findAll(pageable));
    }

    @GetMapping(value="sum_by_seller")
    public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller( ){
        return  ResponseEntity.ok(saleService.amountGroupedBySeller());
    }

    @GetMapping(value="success_by_seller")
    public ResponseEntity<List<SaleSuccessDto>> saleSuccessGroupedBySeller( ){
        return  ResponseEntity.ok(saleService.saleSuccessGroupedBySeller());
    }

}
