package miPaqueteKAJW;

import java.util.Scanner;
public class JuegosKAJW {


	public static void main(String[] args) {
			
		Scanner objScn = new Scanner(System.in);
		int x;
		
		
		System.out.println("Este programa le permitira usar: \n -1 Cuadrado magico \n -2 Juego de la vida \n -3 Usar metodos sobrecargados");
		System.out.println("¿Que desea hacer?");
		x = objScn.nextInt();
		
		if (x==1)
		{
			CuadradoMagico ObjCubo = new CuadradoMagico();
			ObjCubo.imprimirArreglo();
		}
		else 
			if (x==2){
				
				JuegoDeLaVida ObjJuego = new JuegoDeLaVida();
				ObjJuego.jugar();
			}
			else 
				if (x ==3){
					ArreglosKAJW ObjArreglo = new ArreglosKAJW();
					
					//ObjArreglo.
				}

	}

}
