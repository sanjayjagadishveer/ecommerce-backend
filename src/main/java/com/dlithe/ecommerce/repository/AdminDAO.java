package com.dlithe.ecommerce.repository;

import com.dlithe.ecommerce.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO extends JpaRepository<Admin,Integer> {

    @Query(value ="select * from admin where email=?1 and password=?2",nativeQuery = true)
    Admin login(String email,String password);

}
