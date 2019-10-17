package com.example.demo.entity;

import com.example.demo.common.utils.BigDecimalUtil;

import java.math.BigDecimal;
import java.util.Date;

public class Sale {
    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal totalPrice;
    private Date saleDate;

    private int userId;
    private int productId;
    private String userName;
    private String productName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", saleDate=" + saleDate +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
