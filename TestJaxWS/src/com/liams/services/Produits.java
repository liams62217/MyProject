package com.liams.services;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


public class Produits {

	private String name;
	private String sku;
	private double price;
	private List<Provider> listProviders;

	public Produits() {
	}

	public Produits(String name, String sku, double price,
			List<Provider> listProviders) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
		this.listProviders = listProviders;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public List<Provider> getListProviders() {
		return listProviders;
	}

	public void setListProviders(List<Provider> listProviders) {
		this.listProviders = listProviders;
	}

}
