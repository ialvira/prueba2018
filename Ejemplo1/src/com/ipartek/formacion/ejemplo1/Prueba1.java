package com.ipartek.formacion.ejemplo1;

public class Prueba1 {

	public static void main(String[] args) {		
		//TODO mejorar este ejemplo
		Punto p =new Punto(3,4);
		Punto p2=(Punto) p.clone();		
		p.setX(100);
		
		System.out.println(p.equals(p2));
		System.out.println(p);
		System.out.println(p2);
		//System.out.println(p.hashCode());
		//System.out.println(p2.hashCode());
		Object o =p;
		Punto pt1=(Punto) o ;
		System.out.println(pt1);
		
	}

}
