package com.model;

public class CoffeeDTO {
	private String menuName;
	private int price;
	private String size;
	
	
	
	
	
	
	
	
	
	
	
	public CoffeeDTO(String menuName, int price, String size) {
		super();
		this.menuName = menuName;
		this.price = price;
		this.size = size;
	}
	
	public String getMenuName() {
		return menuName;
	}
	public int getPrice() {
		return price;
	}
	public String getSize() {
		return size;
	}

	//toString: 객체 내 정보를 보여주기 위한 메소드
	@Override
	public String toString() {
		return "CoffeeDTO [menuName=" + menuName + ", price=" + price + ", size=" + size + "]";
	}
	
	
}

