/**
 * Created by Alexander on 6/11/14.
 */
public class JuegodelaVida

{
    final int L = 25;
    char vida1[][] = new char[L][L]; char vida2[][] = new char[L][L];
    int x,f,c,universos;
    public JuegodelaVida(int universos) { // En el constructor, se genera el marco y las dos diagonales se rellenan de asteriscos.
    }

        public void juego () {
            x = 1;
            while (x <= universos) {
                generarUniverso();
                imprimirUniversos();
                intercambiarUniversos();
            }
        }

    private void generarUniverso()
    {

    }
    private void imprimirUniversos()
    {

    }
    private void intercambiarUniversos()
    { }
} // fin de la clase
