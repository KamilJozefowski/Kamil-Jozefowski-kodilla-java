package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;


    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("chocolate");
        Product product2 = new Product("chips");
        Product product3 = new Product("cookies");


        Item item1 = new Item(product1, new BigDecimal(10.3), 5);
        Item item2 = new Item(product2, new BigDecimal(4.2), 12);
        Item item3 = new Item(product3, new BigDecimal(7.77), 10);


        Invoice invoice = new Invoice("14/2020");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        productDao.save(product3);
        int product3Id = product3.getId();

        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();
        itemDao.save(item3);
        int item3Id = item3.getId();

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, product1Id);
        assertNotEquals(0, item1Id);
        assertNotEquals(0, invoiceId);


        //CleanUp
        try {
//            productDao.deleteById(product1Id);
//            productDao.deleteById(product2Id);
//            productDao.deleteById(product3Id);
//            itemDao.deleteById(item1Id);
//            itemDao.deleteById(item2Id);
//            itemDao.deleteById(item3Id);
//            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
