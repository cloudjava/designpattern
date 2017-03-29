package com.jp.prototype;

public class Student {
	private HomeWork doHomeWork(String type) {
		return Coper.copyHomeWork(type);
	}

	public static void main(String[] args) {
		Student xiaoming = new Student();
		HomeWork xiaomingHomework = xiaoming.doHomeWork("math");
		xiaomingHomework.setAuthor("xiaoming");
        System.out.println(xiaomingHomework.getAuthor()+"'s homework"+xiaomingHomework+" Content is"+xiaomingHomework.getContent());
		Student xiaohua = new Student();
		HomeWork xiaohuaHomework = xiaohua.doHomeWork("math");
		xiaohuaHomework.setAuthor("xiaohua");
		System.out.println(xiaohuaHomework.getAuthor()+"'s homework"+xiaohuaHomework+" Content is"+xiaohuaHomework.getContent());

	}
}
