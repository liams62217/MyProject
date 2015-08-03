package com.liams.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(endpointInterface = "com.liams.services.ProduitsServiceImpl",
           portName="ProduitsServiceImpl")
public class ProduitsServiceImpl implements ProduitsService {

	@Override
	@WebResult(name = "Catalogue", partName = "Catalogue")
	public List<String> getListOfCatalog() {
		List<String> listCat = new ArrayList<String>();
		listCat.add("AM");
		listCat.add("TAILLESSIME");
		listCat.add("PM");
		return listCat;
	}

	@Override
	@WebResult(name = "Produit", partName = "Produit")
	public List<Produits> getListOfProduct(
			@WebParam(partName="catalogIdPart",name="catalogId") String catalogId) throws InputDataException {


			if (catalogId.toUpperCase().equals("AM")) {
				return listOFAM();
			} else {

				throw new InputDataException("Invalid Input Data " + catalogId, new Throwable("Tech"),false,true);
			}

	}

	private List<Produits> listOFAM() {
		List<Produits> lam = new ArrayList<Produits>();
		List<Provider> lop = new ArrayList<Provider>();

		for (int i = 0; i < 3; i++) {
			Provider provider = new Provider(i, "provider " + i);
			lop.add(provider);
		}

		lam.add(new Produits("AM 1 ", "1234", 13.99, lop));
		lam.add(new Produits("AM 2 ", "5678", 232.99, lop));
		lam.add(new Produits("AM 3 ", "AZERT", 613.99, lop));
		lam.add(new Produits("AM 4 ", "QERTY", 11.99, lop));

		return lam;
	}
}
