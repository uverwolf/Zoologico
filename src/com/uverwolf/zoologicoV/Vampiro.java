package com.uverwolf.zoologicoV;
import com.uverwolf.zoologico.Animal;


public class Vampiro extends Animal{
	
	
	public int volar() {
		System.out.println("El Murcielago vuela!, pierde 50 de energia");
		return super.desgaste(50);
	}
	public int comerHumanos() {
		System.out.println("Se comio un humano..bueno no importa,Recupera 25 de energia!");
		return super.alimentarse(25);
	}
	public int atacarPueblo() {
		System.out.println("*Se quema la ciudad*, pierde 100 de energia!!");
		return super.desgaste(100);
	}
}
