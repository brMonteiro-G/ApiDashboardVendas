package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dtos.SaleDto;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SaleService {


    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerService sellerService;

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable) {
        sellerService.findAll(); //armazenando vendedores em cache p/ evitar buscas repetidas, valido devido a qtd pequena de vendedores
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map((n) -> new SaleDto(n));
    }

}
