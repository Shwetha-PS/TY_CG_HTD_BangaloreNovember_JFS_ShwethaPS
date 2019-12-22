package com.capgemini.module1.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.module1.bean.ProductBean;
import com.capgemini.module1.controller.HomePage;

public class ProductDaoImpl implements ProductDao {

	Scanner sc= new Scanner(System.in);
	private List<ProductBean>list= new ArrayList<ProductBean>();
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs= null;

	ProductBean bean1= new ProductBean();


	@Override
	public List<ProductBean> allProduct() {
		
		String dburl="jdbc:mysql://127.0.0.1:3306/FlipKart";
		System.out.println("enter the username and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="SELECT * FROM Product_Info";

		try(Connection conn =DriverManager.getConnection(dburl,user,password);
				Statement stmt=conn.createStatement();
				ResultSet rs= stmt.executeQuery(query))
		{
			while(rs.next())
			{
				System.out.println("Id:"+rs.getInt(1));
				System.out.println("name :"+rs.getString(2));
				System.out.println("cost :"+rs.getDouble(3));
				System.out.println("color: "+rs.getString(4));
				System.out.println("Description : "+rs.getString(5));
				System.out.println("NumberOfProduct: "+rs.getInt(6));
			}
			return list;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductBean> searchProduct(String name) {
		String dburl="jdbc:mysql://127.0.0.1:3306/Flipkart";
		System.out.println("enter the username and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="SELECT * FROM Product_Info where name=?";

		try(Connection conn =DriverManager.getConnection(dburl,user,password);
				PreparedStatement pstmt = conn.prepareStatement(query);)

		{
			System.out.println("enter the name you want to search");
			pstmt.setString(1, sc.nextLine());
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				rs.getString(rs.getString(1));
			}
			while(true)
			{
				
				System.out.println("enter the choice");
				System.out.println("1.Buy the Product\n2.Search the Product\n3.Main Menu");
				int ch= sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the product which you want to buy.......!!!");
					String prod = sc.next();
					System.out.println("Enter the 16 digit card number");
					long  digit = sc.nextLong();
					System.out.println("Enter the 3 Digit CVV");
					int cvv = sc.nextInt();
					break;
				case 2:
					System.out.println("Search the product");
					
					break;
				//case 3: return HomePage.main(args);
				

				}
			}
		}

		catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

}
