import java.io.*;
import java.util.ArrayList;
/**
 * Clase Logro representa un logro en un sistema de juego. 
 * Un logro tiene un nombre, una descripción, un criterio para ser desbloqueado, 
 * un estado (si está desbloqueado o no), y un tipo (puede estar relacionado con partidas o rachas).
 */
public class Logro
{
     // Atributos privados
    private String nombre;
    private String descripcion;
    private int criterio;
    private boolean estado;
    private String tipo;
    /**
     * Constructor vacío de la clase Logro.
     */
    public Logro(){
    }
    /**
     * Constructor que inicializa un logro con los detalles proporcionados.
     *
     * @param nombre      El nombre del logro.
     * @param descripcion La descripción del logro.
     * @param criterio    El valor necesario para desbloquear el logro (puede ser racha o número de partidas).
     * @param tipo        El tipo de logro (Partida o Racha).
     */
    public Logro(String nombre,String descripcion,int criterio,String tipo){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.criterio=criterio;
        this.estado=false;
        this.tipo=tipo;
    }
    /**
     * Devuelve el nombre del logro.
     *
     * @return El nombre del logro.
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve la descripción del logro.
     *
     * @return La descripción del logro.
     */
    public String getDescripcion(){
        return descripcion;
    }
    /**
     * Devuelve el estado del logro.
     *
     * @return true si el logro está desbloqueado, false de lo contrario.
     */
    public boolean getEstado(){
        return estado;
    }
    /**
     * Devuelve el criterio necesario para desbloquear el logro.
     *
     * @return El criterio del logro (puede ser racha o número de partidas).
     */
    public int getRequerimiento(){
        return criterio;
    }
    /**
     * Devuelve el tipo del logro.
     *
     * @return El tipo del logro (puede ser "Partida" o "Racha").
     */
    public String getTipo(){
        return tipo;
    }
    /**
     * Establece el nombre del logro.
     *
     * @param nombre El nuevo nombre del logro.
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Establece la descripción del logro.
     *
     * @param descripcion La nueva descripción del logro.
     */
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    /**
     * Cambia el estado del logro a desbloqueado si se cumple el criterio necesario.
     *
     * @param racha    La racha actual del jugador.
     * @param partida  El número actual de partidas jugadas.
     */
    public void setEstado(int racha, int partida) {
        if(tipo.equals("Partida") && criterio==partida)
                estado=true;
        else if(criterio==racha)
                estado=true;
    }
     /**
     * Establece el criterio necesario para desbloquear el logro.
     *
     * @param criterio El nuevo criterio del logro.
     */
    public void setRequerimiento(int criterio){
        this.criterio=criterio;
    }
    /**
     * Establece el tipo del logro (Partida o Racha).
     *
     * @param tipo El nuevo tipo del logro.
     */
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    /**
     * Cambia el estado del logro.
     *
     * @param estado true si el logro debe estar desbloqueado, false de lo contrario.
     */
    public void cambiar_estado(boolean estado){
        this.estado=estado;
    }
    /**
     * Guarda la lista de logros en un archivo.
     *
     * @param logros       La lista de logros que se van a guardar.
     * @param direc_logros La dirección del archivo donde se guardarán los logros.
     */
    public void guardarLogros(ArrayList<Logro> logros,String direc_logros) {
        File archivoLogros=new File(direc_logros
        );
        try (BufferedWriter escritorLogros = new BufferedWriter(new FileWriter(archivoLogros))) {
            for (Logro l : logros) {
                escritorLogros.write(l.getNombre() + "|" + l.getEstado() + "|" + l.getDescripcion());
                escritorLogros.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Crea una lista predefinida de logros y la devuelve.
     *
     * @return Una lista de logros predefinidos.
     */
    
    public ArrayList<Logro> lista_logros() {
        ArrayList<Logro> logros = new ArrayList<>();
        Logro act = new Logro("Primeros pasos", "Jugar 3 partidas", 3, "Partida");
        logros.add(act);
        Logro act1 = new Logro("Estas ardiendo", "Tener una racha de 3", 3, "Racha");
        logros.add(act1);
        Logro act2 = new Logro("Puedes hacerlo mejor", "Tener una racha de 0", 0, "Racha");
        logros.add(act2);
        Logro act3 = new Logro("Estas mejorando", "Jugar 6 partidas", 6, "Partida");
        logros.add(act3);
        Logro act4 = new Logro("Toma un descanso", "Jugar 12 partidas", 12, "Partida");
        logros.add(act4);
        return logros;
    }
    /**
     * Carga el estado de un logro a partir de una cadena de texto.
     *
     * @param contenido La cadena de texto que contiene el estado del logro.
     * @param act       El logro actual cuyo estado se actualizará.
     * @return El logro con el estado actualizado.
     */
    public Logro cargar_estado(String contenido,Logro act){
        int aux=0;
        int aux2=0;
        int cont=0;
        int n=0;
        for(char c: contenido.toCharArray()){
            if(c=='|' && cont==0 ){
                aux=n+1;
                cont++;
            }
            if(c=='|' && cont==1)
                aux2=n;
            n++;
        }
        String estado=contenido.substring(aux,aux2);
        if(estado.equals("true"))
            act.cambiar_estado(true);
        return act;
    }
    /**
     * Carga una lista de logros desde un archivo y actualiza su estado.
     *
     * @param direc_logros La dirección del archivo de logros.
     * @return Una lista de logros con sus estados actualizados.
     */
    public ArrayList<Logro> cargar_Logros(String direc_logros) {
        File archivo=new File(direc_logros);
        String contenido;
        ArrayList<Logro> lista = new ArrayList<>();
        lista=lista_logros();
        int aux=0;
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            contenido = lectura.readLine();
            while (contenido != null) {
                lista.set(aux,cargar_estado(contenido,lista.get(aux)));
                contenido = lectura.readLine();
                aux++;
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        return lista;
    }
}
