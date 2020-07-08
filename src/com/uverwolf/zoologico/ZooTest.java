package com.uverwolf.zoologico;
import java.util.Scanner;
public class ZooTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla mono1 = new Gorilla();
		Scanner sOpcion = new Scanner(System.in);
		boolean repetir = true;
		
		do {
			if (mono1.displayEnergy()<=0) {
				System.out.println("El gorila se quedo sin energia!");
				break;
			}else {
			System.out.println("Ingrese una opcion\n1)Alimentar al gorila\n2)Trepar\n3)Lanzar objeto\n4)Mostar nivel de energia");
			int opcion =sOpcion.nextInt();
			switch (opcion) {
			case 1:
				mono1.comerBananas();
				break;
			case 2:
				mono1.trepar();
				break;
			case 3:
				mono1.lanzarAlgo();
				break;
			case 4:
				System.out.println("El nivel de energia del animal es : "+mono1.displayEnergy());
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
