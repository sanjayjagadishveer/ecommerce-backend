package com.dlithe.ecommerce.repository;

import com.dlithe.ecommerce.entity.MainProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MainProductDAO extends JpaRepository<MainProduct,Integer> {

    @Query(value = "SELECT * FROM main_product" , nativeQuery = true)
    List<MainProduct> mainProductList();
}
