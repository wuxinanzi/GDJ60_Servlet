package com.iu.home.productoption;

public class ProductOptionDTO {
	
	private Long optionnum;
	private Long productnum;
	private String optionname;
	private int optionprice;
	private int optioninventory;
	
	public Long getOptionnum() {
		return optionnum;
	}
	public void setOptionnum(Long optionnum) {
		this.optionnum = optionnum;
	}
	public Long getProductnum() {
		return productnum;
	}
	public void setProductnum(Long productnum) {
		this.productnum = productnum;
	}
	public String getOptionname() {
		return optionname;
	}
	public void setOptionname(String optionname) {
		this.optionname = optionname;
	}
	public int getOptionprice() {
		return optionprice;
	}
	public void setOptionprice(int optionprice) {
		this.optionprice = optionprice;
	}
	public int getOptioninventory() {
		return optioninventory;
	}
	public void setOptioninventory(int optioninventory) {
		this.optioninventory = optioninventory;
	}
	

}
