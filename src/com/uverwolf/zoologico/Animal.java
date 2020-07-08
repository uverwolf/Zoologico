package com.uverwolf.zoologico;

public class Animal {
private int nivelEnergia =100;

public int displayEnergy() {
	
	return this.nivelEnergia;
}


public int desgaste(int desgaste) {
	
	return nivelEnergia -=desgaste;
}

public int alimentarse() {
	
	return nivelEnergia+=10;
}

}
