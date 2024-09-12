package com.etiya.dataAccess;

import com.etiya.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        //sadece db erisim kodlari buraya yazılır
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
