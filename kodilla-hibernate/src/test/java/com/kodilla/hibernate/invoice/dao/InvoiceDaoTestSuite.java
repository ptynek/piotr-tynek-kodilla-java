
package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){

        Product product = new Product("Coffe");
        Item item = new Item(new BigDecimal(3), 5);
        Item item1 = new Item(new BigDecimal(4),10);
        item.setProduct(product);
        item1.setProduct(product);
        product.getItems().add(item);
        product.getItems().add(item1);
        Invoice invoice = new Invoice("13/12/2021");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);

        invoiceDao.save(invoice);
        int id = invoice.getId();

        assertNotEquals(0,id);

        invoiceDao.deleteById(id);
  }
}
