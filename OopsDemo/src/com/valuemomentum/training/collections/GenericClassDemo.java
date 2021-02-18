package com.valuemomentum.training.collections;
class Sample<T>//Generic class
{
	private T data;
	

	public Sample(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {//T refers to type
		this.data = data;
	}
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample <Integer> s1=new Sample<Integer>(15);//creating a object of generic object
		//taking integer as argument
		//s1.setData(15);
		System.out.println("display from the type of integer"+s1.getData());
		Sample <String> s2=new Sample<String>("hameeda");//creating a object of generic object
		//taking integer as argument
		//s1.setData(15);
		System.out.println("display from the type of string"+s2.getData());
		Sample <Float> s3=new Sample<Float>(0.006f);//creating a object of generic object
		//taking integer as argument
		//s3.setData(0.054f);
		System.out.println("display from the type float"+s3.getData());
	}

}
