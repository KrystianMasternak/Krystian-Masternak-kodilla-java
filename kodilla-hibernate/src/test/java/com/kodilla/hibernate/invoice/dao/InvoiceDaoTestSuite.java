package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    private final String MILK = "Milk";
    private final String CHEESE = "Cheese";
    private final String BREAD = "Bread";


    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("2018/02/05");
        Product product1 = new Product(MILK);
        Product product2 = new Product(CHEESE);
        Product product3 = new Product(BREAD);

        Item item1 = new Item(new BigDecimal(2.5), 25);
        Item item2 = new Item(new BigDecimal(13.5), 40);
        Item item3 = new Item(new BigDecimal(3.5), 25);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int product1Id = product1.getId();
        String actualNameOFProduct1 = product1.getName();
        int numberOfItems = invoice.getItems().size();
        int id = invoice.getId();
        Invoice readInvoice = invoiceDao.findAllById(id);
        int numberOfItemOnInvoce = readInvoice.getItems().size();

        //Then
        assertEquals(MILK, actualNameOFProduct1);
        assertNotEquals(0, product1Id);
        assertEquals(3, numberOfItems);
        assertEquals(id, readInvoice.getId());
        assertEquals(3, numberOfItemOnInvoce);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}
