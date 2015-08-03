package com.liams.services;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



public class Provider {

	private int providerId;
	private String providerName;

	public Provider() {
	}

	public Provider(int providerId, String providerName) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
	}

	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public String getProviderNAme() {
		return providerName;
	}

	public void setProviderNAme(String providerName) {
		this.providerName = providerName;
	}

}
