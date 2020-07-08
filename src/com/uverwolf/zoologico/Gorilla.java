package com.uverwolf.zoologico;

public class Gorilla extends Animal{

	public int lanzarAlgo () {
		System.out.println("El gorila arrojo algo! su energia bajo 5!!\n");
		return super.desgaste(5);
	}
	public int comerBananas() {
		System.out.println("El gorila recupera 10 de energia comiendo una deliciosa banana!\n");
		return super.alimentarse();
	}
	public int trepar() {
		System.out.println("El gorila esta trepando! su energia bajo 10!\n");
		return super.desgaste(10);
	}
}
