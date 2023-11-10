package com.gen.DeCrochet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrderDetails")
public class OrderProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderDetails_id")
	private long idOrderDetails;
	
	@Column(name="price",nullable=false)
	private double price;
	
	@Column(name="quantity",nullable=false)
	private int quantity;

	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="Order_order_id",nullable=false)
	//private Orden orden;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="Product_product_id",nullable=false)
	//private Product product;
	
//	public OrderProduct() {
//		
//	}
//
//	public OrderProduct(long idOrderDetails, double price, int quantity, Product producto, Order orden) {
//		super();
//		this.idOrderDetails = idOrderDetails;
//		this.price = price;
//		this.quantity = quantity;
//		this.producto = producto;
//		this.orden = orden;
//	}

	public long getIdOrderDetails() {
		return idOrderDetails;
	}

	public void setIdOrderDetails(long idOrderDetails) {
		this.idOrderDetails = idOrderDetails;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	public Product getProducto() {
//		return producto;
//	}
//
//	public void setProducto(Product producto) {
//		this.producto = producto;
//	}
//
//	public Order getOrden() {
//		return orden;
//	}
//
//	public void setOrden(Order orden) {
//		this.orden = orden;
//	}
	
	
	
}
