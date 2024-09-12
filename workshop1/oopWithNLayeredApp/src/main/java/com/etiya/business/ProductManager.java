package com.etiya.business;

import com.etiya.core.logging.Logger;
import com.etiya.dataAccess.JdbcProductDao;
import com.etiya.dataAccess.ProductDao;
import com.etiya.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception { //ilerde response-req patterne gore yeniden impl edilecek
        // ürün bilgisi iş kurallarına uyuyor mu
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");
        }
        // Bir katman başka bir katmanın classını kullanırken sadece interfaceinden erişim kurmalıdır.
        //ProductDao productDao = new JdbcProductDao();
        productDao.add(product);

        for(Logger logger: loggers){ // [db, mail]
            logger.log(product.getName());
        }


    }
}
