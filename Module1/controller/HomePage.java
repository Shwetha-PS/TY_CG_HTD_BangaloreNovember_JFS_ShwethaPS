package com.capgemini.module1.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.module1.bean.ProductBean;
import com.capgemini.module1.factory.Factory;
import com.capgemini.module1.services.ProductServices;
public class HomePage {
	public static void home() {
		ProductServices serv = Factory.getServ1();
		ProductBean bean = Factory.getBean();
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("1.Show All Product. \n2.Search Product. \n3.Return to home");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("AllProducts");
			List<ProductBean> l = serv.allProduct();
			if(l!=null) {
				System.out.println(l);
			}else {
				System.out.println("No Products Found");
			}
			break;
			case 2:System.out.println("Search Product");
			System.out.println("Enter the name to search");
			bean.setName(sc.next());
			List<ProductBean> l1 = serv.searchProduct(bean.getName());
			System.out.println(l1);

			String a1 ="y";
			while(a1 == "y") {
				System.out.println("1.Buy. \2.Search.\n3.Go back");
				int ch1 = sc.nextInt();
				switch(ch1) {
				case 1: System.out.println("Enter the product name to buy");
				System.out.println("\n");
				a1= sc.next();
				case 2: System.out.println("Enter the 16 digit Card number");
				long num = sc.nextLong();
				break;

				
			}
				break;
			}

			case 3:return ;
			default:System.exit(0);
			break;
			}
		}
	}
}