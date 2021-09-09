package com.devsuperior.dsvendas.dtos;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String SellerName;
    private Double sum;

    public SaleSumDto(){}

    public SaleSumDto(Seller seller, Double sum) {
        SellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        this.SellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
