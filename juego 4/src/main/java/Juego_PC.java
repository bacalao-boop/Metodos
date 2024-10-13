import java.io.*;
import java.util.Random;

/**
 * Clase Juego_PC que extiende javax.swing.JFrame.
 * Representa el juego de piedra, papel o tijeras contra la computadora.
 */
public class Juego_PC extends javax.swing.JFrame {
 /** La racha de victorias consecutivas del usuario. */
    public int racha=0;
    /** Número de la partida actual. */
    public int num_partida=0;
    /** Nombre del usuario que está jugando. */
    public String usuario="m";
     /** Dirección del archivo de historial. */
    public String direc_historial="";
    /** Dirección del archivo de logros. */
    public String direc_logros="";
    /**
     * Constructor de la clase Juego_PC.
     * Inicializa los componentes gráficos de la interfaz.
     */
    public Juego_PC() {
        initComponents();
    }
    /**
     * Establece el número de la partida actual.
     *
     * @param num_partida Número de partida actual.
     */
    public void setNum_partida(int num_partida) {
        this.num_partida = num_partida+1;
    }
    /**
     * Establece la dirección del archivo de historial.
     *
     * @param direc_historial La dirección del historial.
     */
    
    public void setDirec_Historial(String direc_historial) {
        this.direc_historial = direc_historial;
    }
    /**
     * Establece la dirección del archivo de logros.
     *
     * @param direc_logros La dirección de logros.
     */

    public void setDirec_Logros(String direc_logros) {
        this.direc_logros = direc_logros;
    }
    /**
     * Establece el nombre del usuario y lo muestra en la interfaz.
     *
     * @param us Nombre del usuario.
     */
    public void setUsuario(String us){
        this.usuario=us;
        lbl_usuario.setText(us);
    }
    /**
     * Establece la racha de victorias del usuario.
     *
     * @param racha La racha de victorias consecutivas.
     */
    public void setRacha(int racha){
        this.racha=racha;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_volver_al_menu = new javax.swing.JButton();
        BT_piedra = new javax.swing.JButton();
        BT_papel = new javax.swing.JButton();
        BT_tijeras = new javax.swing.JButton();
        lbl_mensaje = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_volver_al_menu.setText("<");
        BT_volver_al_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_volver_al_menuActionPerformed(evt);
            }
        });
        getContentPane().add(BT_volver_al_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        BT_piedra.setText("piedra");
        BT_piedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_piedraActionPerformed(evt);
            }
        });
        getContentPane().add(BT_piedra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        BT_papel.setText("papel");
        BT_papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_papelActionPerformed(evt);
            }
        });
        getContentPane().add(BT_papel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        BT_tijeras.setText("tijera");
        BT_tijeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_tijerasActionPerformed(evt);
            }
        });
        getContentPane().add(BT_tijeras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        lbl_mensaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_mensaje.setText("Selecciona tu jugada");
        getContentPane().add(lbl_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 98, -1, -1));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_usuario.setText("_________");
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 141, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción al presionar el botón "Volver al menú".
     * Navega de regreso al menú principal.
     *
     * @param evt Evento de acción.
     */
    private void BT_volver_al_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_volver_al_menuActionPerformed
        Menu newframe=new Menu();
        newframe.setUsuario(usuario);
        newframe.setDirec_Logros(direc_logros);
        newframe.setDirec_Historial(direc_historial);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_volver_al_menuActionPerformed
    /**
     * Acción al presionar el botón "Piedra".
     * Inicia el juego con la jugada "Piedra".
     *
     * @param evt Evento de acción.
     */
    private void BT_piedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_piedraActionPerformed
        juego_PC(1);
    }//GEN-LAST:event_BT_piedraActionPerformed
    /**
     * Acción al presionar el botón "Papel".
     * Inicia el juego con la jugada "Papel".
     *
     * @param evt Evento de acción.
     */
    private void BT_papelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_papelActionPerformed
        juego_PC(2);
    }//GEN-LAST:event_BT_papelActionPerformed
    /**
     * Acción al presionar el botón "Tijeras".
     * Inicia el juego con la jugada "Tijeras".
     *
     * @param evt Evento de acción.
     */
    private void BT_tijerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_tijerasActionPerformed
        juego_PC(3);
    }//GEN-LAST:event_BT_tijerasActionPerformed
    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego_PC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_papel;
    private javax.swing.JButton BT_piedra;
    private javax.swing.JButton BT_tijeras;
    private javax.swing.JButton BT_volver_al_menu;
    private static javax.swing.JLabel lbl_mensaje;
    private static javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
    /**
     * Genera un número aleatorio entre 1 y 3 para representar la jugada de la computadora.
     *
     * @return Un número aleatorio entre 1 y 3.
     */
    private int num_random() {
        Random rnd = new Random();
         return rnd.nextInt(3) + 1;
    }
    /**
     * Determina el ganador del juego entre el usuario y la computadora.
     *
     * @param usuario2 Jugada de la computadora (1=Piedra, 2=Papel, 3=Tijeras).
     * @param usuario1 Jugada del usuario (1=Piedra, 2=Papel, 3=Tijeras).
     * @return "Ganaste", "Perdiste" o "Empate" dependiendo del resultado.
     */
    private String ganador(int usuario2, int usuario1) {
        if (usuario1==usuario2)
            return "Empate";
        if ((usuario1 == 1 &&  usuario2== 3)||(usuario1 == 2 && usuario2 == 1)||(usuario1 == 3 && usuario2 == 2))
            return "Ganaste";
        return "Perdiste";
    }
    /**
     * Ejecuta el juego de piedra, papel o tijeras y determina el resultado.
     * Actualiza la racha, registra la partida y muestra los logros.
     *
     * @param jugada Jugada del usuario (1=Piedra, 2=Papel, 3=Tijeras).
     */
    private void juego_PC(int jugada) {
        int pc=num_random();
        String ganador=ganador(pc,jugada);
        if(ganador.equals("Ganador")){
            racha++;
        }else{
            racha=0;
        }
        Partida act=new Partida(num_partida,ganador);
        act.guardarHistorial(act, direc_historial);
        Logro aux=new Logro();
        
        Resultado_PC newframe=new Resultado_PC();
        newframe.setDirec_Historial(direc_historial);
        newframe.setDirec_Logros(direc_logros);
        newframe.obtener_logro(aux.cargar_Logros(direc_logros), racha, num_partida);
        newframe.setUsuario(usuario);
        newframe.setJugada_PC(pc);
        newframe.setJugada_Usuario(jugada);
        newframe.setNum_partida(num_partida);
        newframe.setRacha(racha);
        newframe.setFinal_Partida(ganador);
        newframe.cargar_datos();
        newframe.setVisible(true);
        this.dispose();
    }
    /**
     * Obtiene el número de partidas jugadas desde el archivo de historial.
     *
     * @param direc_historial La dirección del archivo de historial.
     * @return El número de partidas jugadas.
     */
    public int obtener_num_partida(String direc_historial) {
        File archivo=new File (direc_historial);
        String contenido="";
        int aux=-1;
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            while(contenido != null){
            contenido = lectura.readLine();
            aux++;
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        return aux;
    }
}
