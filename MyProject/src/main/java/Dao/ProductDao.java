package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import ConnectionDB.DBConnection;
import Model.Product;

public class ProductDao {
	String name$;
	public static void insertPRoduct(Product p) {
		try {
			Connection conn = DBConnection.craetConnection();
			String sql ="insert into product(sid,image,pname,pprice,pcategory) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getSid());
			pst.setString(2, p.getImage());
			pst.setString(3, p.getPname());
			pst.setDouble(4, p.getPprice());
			pst.setString(5, p.getPcategory());
			pst.executeUpdate();
			System.out.println("product uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
