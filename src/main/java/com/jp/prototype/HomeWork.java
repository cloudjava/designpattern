package com.jp.prototype;

public abstract class HomeWork implements Cloneable {
	public HomeWork clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return (HomeWork)clone;
	}
	protected String getContent(){
		return "homework";
	}
	protected String author;
	protected void setAuthor(String author){
		this.author=author;
	}
	protected String getAuthor(){
		return author;
	}
}
