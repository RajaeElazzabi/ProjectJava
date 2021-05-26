package com.util;

public class categorie {

	int idCategory;
	String nameCategorie;
	
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getNameCategorie() {
		return nameCategorie;
	}
	public void setNameCategorie(String nameCategorie) {
		this.nameCategorie = nameCategorie;
	}
	
	@Override
	public String toString() {
		return "categorie [idCategory=" + idCategory + ", nameCategorie=" + nameCategorie + "]";
	}
	
	
}
