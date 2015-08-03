package com.liams.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "Produit", 
			serviceName = "ProduitService", 
			targetNamespace = "http://services.liams.com",
			portName="ProduitServicePort"
			)
public interface ProduitsService {

	@WebMethod(operationName = "ListOFCatalog")
	public List<String> getListOfCatalog();

	@WebMethod(operationName = "ListOFProductForCatalogID")
	public List<Produits> getListOfProduct(String catalogId) throws InputDataException;

}
