package com.example.demo.mapper;

import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Param;

import javax.annotation.PreDestroy;
import java.util.List;

public interface ProductMapper {

    /**
     * 获取所有的商品，在添加销售的时候使用
     * @return
     */
    List<Product> getAllProducts();

    /**
     * 修改商品数量
     * @param id
     * @param quantity
     * @return
     */
    int updProductNumber(@Param("id") int id, @Param("quantity") int quantity);

    /**
     * 根据商品id，查询商品库存信息
     * @param id
     * @return
     */
    int getProductQuantityById(int id);

    Product getProductByName(String name);
}
