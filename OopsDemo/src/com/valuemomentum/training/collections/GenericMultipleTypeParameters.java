package com.valuemomentum.training.collections;
class Employee10
{
	private String name;

	public Employee10(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
interface pair<K,V>
{
	public K getKey();
	public V getvalue();
}
class OrderedPair<K,V> implements pair<K,V>
{
 private K key;
 private V value;
 
	public OrderedPair(K key, V value) {
	super();
	this.key = key;
	this.value = value;
}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getvalue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
public class GenericMultipleTypeParameters {

	public static void main(String[] args) {
	OrderedPair<Integer,String> op1=new OrderedPair<Integer,String>(101,"java");
    System.out.println(op1.getKey()+":"+op1.getvalue());
    OrderedPair<Integer,String> op2=new OrderedPair<Integer,String>(102,"hameeda");
    System.out.println(op2.getKey()+":"+op2.getvalue());
    OrderedPair<Integer, String> op3=new OrderedPair<Integer,String>(101,"java");
    System.out.println(op3.getKey()+":"+op3.getvalue());
	}

}
