package by.academy.task10_generics.test_6;

import java.io.Serializable;

import by.academy.classwork.lesson7.Car;

public class Solution <T extends CharSequence & Comparable<T>, V extends Car & Serializable, K extends Number> {
	
	private T objT;
	private V objV;
	private K objK;

	public Solution() {
		super();
	}
	
	public Solution(T objT, V objV, K objK) {
		super();
		this.objT = objT;
		this.objV = objV;
		this.objK = objK;	
	}
	
	public T getObjT() {
		return objT;
	}
	
	public V getObjV() {
		return objV;
	}
	
	public K getObjK() {
		return objK;
	}
	
	public void printObjectClasses() {
		System.out.println(objT.getClass().getName());
		System.out.println(objV.getClass().getName());
		System.out.println(objK.getClass().getName());
	}
	
}
