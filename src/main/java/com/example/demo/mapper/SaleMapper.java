package com.example.demo.mapper;

import com.example.demo.entity.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleMapper {

    int addSale(Sale sale);

    List<Sale> getSalesByOrder(@Param("order") String order);
}
