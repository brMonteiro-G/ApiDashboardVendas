package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.dtos.SaleSuccessDto;
import com.devsuperior.dsvendas.dtos.SaleSumDto;
import com.devsuperior.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.dtos.SaleSumDto(obj.seller, SUM(obj.amount)) "
            + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDto> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.dtos.SaleSuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals))"
            +"FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDto> successGroupedBySeller();

}
