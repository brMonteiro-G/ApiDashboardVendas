package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // por padrão JpaRepository já é um componente, então é opcional colocar essa anotação
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
