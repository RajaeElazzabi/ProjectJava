package com.util;

public class Livre {

	int idBook;
	String nameBook, author;
	
	int idCategory;
	public int getIdBook() {
		return idBook;
	}
	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	@Override
	public String toString() {
		return "Livre [idBook=" + idBook + ", nameBook=" + nameBook + ", author=" + author + ", idCategory="
				+ idCategory + "]";
	}
	
	
}
