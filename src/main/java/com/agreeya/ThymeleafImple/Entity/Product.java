package com.agreeya.ThymeleafImple.Entity;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name="product_name")
    public String productName;

    @Column(name="product_desc")
    public String productDescription;

    @Column(name="product_qty")
    public String productQty;

    @Column(name="product_price")
    public int productPrice;

    public Product() {
    }

    public Product(int id, String productName, String productDescription, String productQty, int productPrice) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productQty='" + productQty + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
