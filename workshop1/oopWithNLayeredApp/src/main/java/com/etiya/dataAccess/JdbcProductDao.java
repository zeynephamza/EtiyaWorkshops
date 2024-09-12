package com.etiya.dataAccess;

import com.etiya.entities.Product;

public class JdbcProductDao implements ProductDao { //data access object - bir veritabanı nesnesi
    public void add(Product product){
        //sadece db erisim kodlari buraya yazılır
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}


