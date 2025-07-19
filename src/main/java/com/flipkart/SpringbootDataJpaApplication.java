package com.flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.flipkart.entity.FlipkartOrder;

@SpringBootApplication
public class SpringbootDataJpaApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=	SpringApplication.run(SpringbootDataJpaApplication.class, args);
	FlipkartOrder flipkartOrder=new FlipkartOrder("IPHONE", 90000.00);
	FlipkartOrderService flipkartOrderService=applicationContext.getBean(FlipkartOrderService.class);
	flipkartOrderService.addFlipkartOrder(flipkartOrder);
	int i=10;
	int j=20;
	
	}

}
