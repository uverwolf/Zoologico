package com.uverwolf.zoologicoV;
import java.util.Scanner;

public class VampTest {

	public static void main(String[] args) {
		
		Vampiro vladimir = new Vampiro();
		vladimir.setEnergia(200);
		@SuppressWarnings("resource")
		Scanner sOpcion = new Scanner(System.in);
		boolean repetir = true;
		
		do {
			if (vladimir.displayEnergy()<=0) {
				System.out.println("El murcielago se quedo sin energia!");
				break;
			}else {
			System.out.println("Ingrese una opcion\n1)Comer humano\n2)Volar\n3)Atacar pueblo\n4)Mostar nivel de energia");
			int opcion =sOpcion.nextInt();
			switch (opcion) {
			case 1:
				vladimir.comerHumanos();
				break;
			case 2:
				vladimir.volar();
				break;
			case 3:
				vladimir.atacarPueblo();
				break;
			case 4:
				System.out.println("El nivel de energia del animal es : "+vladimir.displayEnergy());
				break;
			default:
				System.out.println("Seleccion incorrecta, ingrese un numero");
				repetir = true;
				break;
			}
			}
		} while (repetir);
		
	}

}
