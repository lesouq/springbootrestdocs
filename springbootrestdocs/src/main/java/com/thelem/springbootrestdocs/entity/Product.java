package com.thelem.springbootrestdocs.entity;

public class Product {

    private String code;
    private String name;
    private String description;
    private double price;
    private long stock;


    public Product(String code, String name, String description, double price, long stock) {
        this.setCode(code);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setStock(stock);
    }


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public long getStock() {
		return stock;
	}


	public void setStock(long stock) {
		this.stock = stock;
	}
   
    
}
