package com.example.demo.service;

import com.example.demo.entity.Sale;

import java.util.List;

public interface SaleService {
    /**
     * 添加销售
     */
    boolean addSale(Sale sale);

    /**
     * 根据排序的条件查询销售信息
     * @param order
     * @return
     */
    List<Sale> getSalesByOrder(String order);
}
