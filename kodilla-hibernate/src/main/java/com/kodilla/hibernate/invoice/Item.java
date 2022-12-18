package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private BigDecimal price;
    private int qauntity;
    private BigDecimal vaule;
    private Product product;
    private Invoice invoice;

    public Item() {}

    public Item(BigDecimal price, int qauntity) {
        this.price = price;
        this.qauntity = qauntity;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "QAUNTITY")
    public int getQauntity() {
        return qauntity;
    }

    @Column(name = "VAULE")
    public BigDecimal getVaule() {
        return price.multiply(new BigDecimal(qauntity));
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQauntity(int qauntity) {
        this.qauntity = qauntity;
    }

    private void setVaule(BigDecimal vaule) {
        this.vaule = vaule;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @NotNull
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
