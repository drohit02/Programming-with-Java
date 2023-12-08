package com.BookCode;

public class Book {
	//field Member
	String bookName ;
	String author ;
	int price ;
	
	//Setter method
	void setBookName(String bname) {
		this.bookName = bname ;
	}
	void setAuthor(String authorName) {
		this.author = authorName; 
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	//Getter method
	String getBookName() {
		return this.bookName;
	}
	String getAuthor() {
		return this.author;
	}
	int getPrice() {
		return this.price;
	}
	
	//Default Constructor
	Book(){
		this.bookName = "Not Given";
		this.author = "Not Given" ;
		this.price = 0 ;
	}
	//Parameterized constructor
	Book(String bname,String authorName,int price){
		this.bookName  = bname ;
		this.author = authorName ;
		this.price = price ;
	}
	//Display Method
	
	void display() {
		System.out.println("Title of the Book : "+this.bookName+" Author is : "+this.author+" price is : "+this.price);
	}
	
	public static void main(String[] args) {
		

	}

}
