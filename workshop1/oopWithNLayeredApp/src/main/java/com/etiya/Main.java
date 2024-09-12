package com.etiya;

import com.etiya.business.ProductManager;
import com.etiya.core.logging.DatabaseLogger;
import com.etiya.core.logging.FileLogger;
import com.etiya.core.logging.Logger;
import com.etiya.core.logging.MailLogger;
import com.etiya.dataAccess.HibernateProductDao;
import com.etiya.dataAccess.JdbcProductDao;
import com.etiya.entities.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 10000);
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}