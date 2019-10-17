package com.example.demo.service.impl;

import com.example.demo.common.exception.CustomException;
import com.example.demo.entity.Sale;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.mapper.SaleMapper;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Transactional(rollbackFor = Exception.class)
@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    SaleMapper saleMapper;

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean addSale(Sale sale) {
        //得到销售的数量
        int saleQuantity = sale.getQuantity();
        //得到商品的id
        int productId = sale.getProductId();
        //从数据库当中查询该商品的库存
        int quantity = productMapper.getProductQuantityById(productId);
        //如果销售的数量大于库存的数量就不能销售，需要抛出异常。
        if(saleQuantity > quantity) {
            //throw 的作用有点类似于return，当执行之后就无法再执行后续的语句
            throw new CustomException("商品库存不足，无法完成销售");
        }
        //调用修改库存的方法完成库存的修改
        int row = productMapper.updProductNumber(productId,saleQuantity);
        if(row <= 0) {
            throw new CustomException("修改库存失败");
        }
        sale.setSaleDate(new Date());
        //计算销售总价，总价等于单价乘以数量，multiply就是Bigdecimal的相乘的方法
        sale.setTotalPrice(sale.getPrice().multiply(new BigDecimal(sale.getQuantity())));
        row = saleMapper.addSale(sale);
        if(row <= 0) {
            throw new CustomException("添加销售失败");
        }
        return true;
    }

    @Override
    public List<Sale> getSalesByOrder(String order) {
        return saleMapper.getSalesByOrder(order);
    }
}
