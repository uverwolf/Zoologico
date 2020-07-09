package com.uverwolf.zoologico;

public class Animal {
private int nivelEnergia =100;

public int displayEnergy() {
	
	return nivelEnergia;
}
public void setEnergia(int valor) {
	nivelEnergia +=valor;
}

public int desgaste(int desgaste) {
	
	return nivelEnergia -=desgaste;
}

public int alimentarse(int comida) {
	
	return nivelEnergia+=comida;
}

}
