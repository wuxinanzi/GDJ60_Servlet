package com.iu.home.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iu.home.member.MemberDAO;
import com.iu.home.member.MemberDTO;
import com.iu.home.util.DBConnection;

public class ProductDAO {
	
	public List<ProductDTO> getProductList()throws Exception{
		//getMax
		public Long getProductNum()throws Exception{
			Connection con = DBConnection.getConnection();
			
			String sql ="SELECT PRODUCT_SEQ.NEXTVAL FROM DUAL";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			rs.next();
			
			Long num = rs.getLong(1);
			
			DBConnection.disConnection(rs, st, con);
			
			return num;
		}
		//--------------------------------------------------
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT PRODUCTNUM, PRODUCTNAME, PRODUCTJUMSU" 
				 +  "FROM PRODUCT ORDER BY PRODUCTJUMSU DESC";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setProductnum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductname(rs.getString("PRODUCTNAME"));
			productDTO.setProductjumsu(rs.getDouble("PRODUCTJUNSU"));
			ar.add(productDTO);
		}
		DBConnection.disConnection(rs, st, con);
		
		return ar;
	}
	
	public int setAddProduct(ProductDTO productDTO) throws Exception{
		
		Connection con =  DBConnection.getConnection();
		
		String sql ="INSERT INTO MEMBER(PRODUCTNUM, PRODUCTNAME,PRODUCTDETAIL,PRODUCTJUMSU)"
				+ "VALUSE(PRODUCT_SEQ.NEXTVAL,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, productDTO.getProductnum());
		st.setString(2, productDTO.getProductname());
		st.setString(3, productDTO.getProductdetail());
		st.setDouble(4, productDTO.getProductjumsu());
		
		
		int result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		
		return result;
		
		
		}
	public static void main1(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		try {
			List<ProductDTO> ar = productDAO.getProductList();
			System.out.println(ar.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			ProductDAO productDAO = new ProductDAO();
			ProductDTO productDTO = new ProductDTO();
			productDTO.setProductnum(null);
			productDTO.setProductname("pw1");
			productDTO.setProductdetail("name1");
			productDTO.setProductjumsu(0);
			
			try {
			int result	= productDAO.setAddProduct(productDTO);
			System.out.println(result != 0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
