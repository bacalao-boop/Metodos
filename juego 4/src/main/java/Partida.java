import java.io.*;
/**
 * Clase Partida que representa una partida de un juego, incluyendo el número de la partida y su estado final.
 */
public class Partida
{
    private int num;// Número de la partida
    private String finalPartida;// Estado final de la partida
     /**
     * Constructor por defecto de la clase Partida.
     */
    public Partida(){
    }
    /**
     * Constructor que inicializa el número de la partida y su estado final.
     *
     * @param num    Número de la partida.
     * @param estado Estado final de la partida.
     */
    public Partida(int num,String estado){
        this.num=num;
        finalPartida=estado;
    }
    /**
     * Establece el estado final de la partida en función del resultado entre el jugador y la computadora.
     *
     * @param pc      Resultado de la computadora.
     * @param jugador Resultado del jugador.
     */
    public void setFinal_Partida(int pc,int jugador){
        if (jugador == pc)
                 finalPartida= "Empate";
        if ((jugador==1&&pc==3)||(jugador==2&&pc==1)||(jugador==3&&pc==2))
                 finalPartida="Ganaste";
        finalPartida="Perdiste";
    }
    /**
     * Obtiene el estado final de la partida.
     *
     * @return El estado final de la partida.
     */
    public String getFinal_Partida(){
        return finalPartida;
    }
    /**
     * Establece el número de la partida.
     *
     * @param num El número de la partida.
     */
    public void setNum(int num){
        this.num=num;
    }
    /**
     * Obtiene el número de la partida.
     *
     * @return El número de la partida.
     */
    public int getNum(){
        return num;
    }
    /**
     * Guarda el historial de la partida en un archivo.
     *
     * @param act             La partida actual que se va a guardar.
     * @param direc_historial La dirección del archivo donde se guarda el historial.
     */
    public void guardarHistorial(Partida act,String direc_historial) {
        File archivoHistorial=new File(direc_historial);
        FileWriter escribir;
        PrintWriter linea;
        try {
            escribir = new FileWriter(archivoHistorial,true);
            linea = new PrintWriter(escribir);
            if(archivoHistorial.length() == 0)
                escribir.write(act.getNum()+"|"+act.getFinal_Partida());
            else
                escribir.write("\n"+act.getNum()+"|"+act.getFinal_Partida());
            linea.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la partida en el archivo: " + e.getMessage());
        }
    }
}

