package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.FlipkartOrder;
@Repository
public interface FlipkartOrderRepository extends JpaRepository<FlipkartOrder, Long>{
	

}
