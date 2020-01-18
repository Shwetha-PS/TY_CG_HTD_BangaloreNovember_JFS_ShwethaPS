package com.capgemini.module1.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.module1.bean.ProductBean;
import com.capgemini.module1.factory.Factory;
import com.capgemini.module1.services.ProductServices;

public class ProductController {
	public static void ProductController() {

		ProductServices serv = Factory.getServ1();
		ProductBean bean = Factory.getBean();
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			int i = sc.nextInt();
			System.out.println("1.Show All Products. \n2.Search Product ");
			switch(i) {
			case 1: System.out.println("All Products");
			List<ProductBean> bean1 = serv.allProduct();
			System.out.println(bean1);
			break;

			case 2:System.out.println(" Search Products");
			
			break;
			default:System.out.println("Invalid choice :");
			break;
			}
		}
	}

}
