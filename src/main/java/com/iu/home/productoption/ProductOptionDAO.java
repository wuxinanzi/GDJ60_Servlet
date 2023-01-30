package com.iu.home.productoption;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.iu.home.util.DBConnection;

public class ProductOptionDAO {
	
	public List<ProductOptionDTO>getProductOptionList()throws Exception{
	Connection con = DBConnection.getConnection();
	
	String sql = "SELECT * FROM PRODUCTOPTION";
	
	PreparedStatement st = con.prepareStatement(sql);
	
	ResultSet rs =st.executeQuery();
	
	while(rs.next()) {
		ProductOptionDTO productOptionDTO = new ProductOptionDTO();
		productOptionDTO.setOptionnum(rs.getLong("OPTIONNUM"));
		
	}
		return ar;
	}

	public int setAddProductOption(ProductOptionDTO productOptionDTO)
	
	Connection con = DBConnection.getConnection();
	
	String sql ="INSERT INTO PRODUCTOPTION(OPTIONNUM, PRODUCTIO"
	
	
	PreparedStatement st = con.prepareStatement(sql);
	st.setLong(1, productOptionDTO.getProductnum());
}
