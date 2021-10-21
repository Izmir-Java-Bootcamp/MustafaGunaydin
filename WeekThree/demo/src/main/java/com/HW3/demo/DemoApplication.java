package com.HW3.demo;

import com.HW3.demo.categories.SubCategory;
import com.HW3.demo.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Scanner scanner = new Scanner(System.in);


		Product p01 = Product.builder().name("Pepper").price(4.2).description("test").build();
		Product p10 = Product.builder().name("Doritos").price(7).description("test").build();
		Product p11 = Product.builder().name("Tadelle").price(2.5).description("test").build();
		Product p20 = Product.builder().name("Lacto-free").price(3).description("test").build();
		Product p21 = Product.builder().name("Cheese").price(12.4).description("test").build();



		SubCategory c2 = new SubCategory("Fruit & Vegetable","Vegetable");
		c2.addProduct(p01);

		SubCategory c3 = new SubCategory("Snack","Chips");
		c3.addProduct(p10);

		SubCategory c4 = new SubCategory("Snack","Chocolate");
		c4.addProduct(p11);

		SubCategory c5 = new SubCategory("Breakfast","Milk");
		c5.addProduct(p20);

		SubCategory c6 = new SubCategory("Breakfast","Delicatessen");
		c6.addProduct(p21);



	}


}
