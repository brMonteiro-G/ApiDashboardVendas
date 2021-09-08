package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dtos.SellerDto;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired // estudar posteriormente se essa forma de injeção faz sentido nesse caso
    private SellerRepository sellerRepository;

    public List<SellerDto> findAll() {
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map((n) -> new SellerDto(n)).collect(Collectors.toList());
    }

}
