package miPaqueteKAJW;

public class CuadradoMagico {

	int size=3;
	int arreglo [][];

	public CuadradoMagico(){
		arreglo = new int[size][size];
		generar();
	}
	
	public void generar(){
		int mitad = size/2;
		int ubicacionC = mitad;
		int ubicacionF = 0;

		arreglo[ubicacionF][ubicacionC] = 1;

		for (int i = 2; i <= (Math.pow(arreglo.length, 2));i++){
			ubicacionF--;
			ubicacionC++;
			if ((ubicacionF<0 || ubicacionF>(arreglo.length-1)) && (ubicacionC>(arreglo.length-1)|| ubicacionC<0)){
				ubicacionF = 1;
				ubicacionC = arreglo.length-1;
			}
			if (ubicacionF<0 ){
				ubicacionF= arreglo.length-1;
			}
			if (ubicacionC>(arreglo.length-1)){
				ubicacionC= 0;
			}
			if (arreglo[ubicacionF][ubicacionC]==0){
				arreglo[ubicacionF][ubicacionC]= i;
			}
			else {
				ubicacionF= ubicacionF + 2;
				ubicacionC= ubicacionC - 1;
				if (ubicacionF<0 || ubicacionF>(arreglo.length-1)){
					ubicacionF= arreglo.length-1;
				}
				if (ubicacionC>(arreglo.length-1)|| ubicacionC<0){
					ubicacionC= 0;
				}
				arreglo[ubicacionF][ubicacionC]= i;
			}

		}
	}


	public void imprimirArreglo(){
		for(int i = 0; i<arreglo.length; i++){
			for (int j = 0; j<arreglo.length; j++){
				System.out.print(arreglo[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
