package com.iu.home.productoption;

import com.iu.home.product.ProductDAO;
import com.iu.home.product.ProductDTO;

public class ProductService {

	public static void main(String[] args) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductname("product1");
		productDTO.setProductdetail("detail1");
		
		ProductOptionDTO productOptionDTO = new ProductOptionDTO();  
		
		productOptionDTO.setOptionname("optionName1");
		productOptionDTO.setOptionprice(100L);
		productOptionDTO.setOptionnum(10L);
		productOptionDTO.setOptionNum(null);
		
		ProductOptionDTO2 productOptionDTO2 = new ProductOptionDTO2();
		productOptionDTO2.setOptionName("optionName1");
		productOptionDTO2.setOptionPrice(200L);
		productOptionDTO2.setOptionAmount(20L);
		productOptionDTO2.setOptionNum(null);
		
		try {
			Long num = productDAO.getProductNum();
			
			productDTO.setProductnum(num);
			
		    int result = productDAO.setAddProduct(productDTO);
		
		    productOptionDTO.setProductnum(num);
		
		    if(result>0) {
			    ProductDAO.setAddProductOption(productOptionDTO);
		}
		     
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
