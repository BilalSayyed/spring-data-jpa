package com.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.entity.FlipkartOrder;
import com.flipkart.repository.FlipkartOrderRepository;

@Service
public class FlipkartOrderService {
@Autowired
private FlipkartOrderRepository flipkartOrderRepository;
public void addFlipkartOrder(FlipkartOrder flipkartOrder)
{
	//

	int a=10;
	String s="hi";
	flipkartOrderRepository.save(flipkartOrder);
}
}
