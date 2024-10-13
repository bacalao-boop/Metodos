/**
 * Clase Menu que extiende de JFrame y representa el menú principal de la aplicación, donde el usuario puede acceder a distintas funcionalidades como jugar, ver logros, historial, y más.
 */
public class Menu extends javax.swing.JFrame {
    // Atributos de la clase
    public String direc_historial=" ";// Dirección del historial de partidas
    public String direc_logros=" ";// Dirección del archivo de logros
    public String usuario=" ";// Nombre del usuario
    /**
     * Constructor por defecto que inicializa los componentes del menú.
     */
    public Menu() {
        initComponents();
    }
    /**
     * Establece la dirección del archivo de historial de partidas.
     *
     * @param direc_Historial La dirección del archivo de historial.
     */
    public void setDirec_Historial(String direc_Historial) {
        this.direc_historial = direc_Historial;
    }
    /**
     * Establece la dirección del archivo de logros.
     *
     * @param direc_Logros La dirección del archivo de logros.
     */
    public void setDirec_Logros(String direc_Logros) {
        this.direc_logros = direc_Logros;
    }
    /**
     * Establece el nombre del usuario.
     *
     * @param usuario El nombre del usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * Inicializa los componentes de la interfaz gráfica del menú.
     * Este código es generado automáticamente por NetBeans y define los elementos visuales de la ventana.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lbl_logo = new javax.swing.JLabel();
        BT_jugar_pc = new javax.swing.JButton();
        BT_torneo = new javax.swing.JButton();
        BT_historial = new javax.swing.JButton();
        BT_logros = new javax.swing.JButton();
        BT_salir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setFont(new java.awt.Font("Imprint MT Shadow", 0, 40)); // NOI18N
        lbl_logo.setText("NIMBOR");
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 25, -1, -1));

        BT_jugar_pc.setText("Jugar con la PC");
        BT_jugar_pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_jugar_pcActionPerformed(evt);
            }
        });
        getContentPane().add(BT_jugar_pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 92, -1, -1));

        BT_torneo.setText("Modo Torneo");
        BT_torneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_torneoActionPerformed(evt);
            }
        });
        getContentPane().add(BT_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 133, -1, -1));

        BT_historial.setText("Historial");
        BT_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_historialActionPerformed(evt);
            }
        });
        getContentPane().add(BT_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 174, -1, -1));

        BT_logros.setText("Logros");
        BT_logros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_logrosActionPerformed(evt);
            }
        });
        getContentPane().add(BT_logros, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 215, -1, -1));

        BT_salir.setText("Salir");
        BT_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_salirActionPerformed(evt);
            }
        });
        getContentPane().add(BT_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 256, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción que se ejecuta al presionar el botón "Jugar con la PC".
     * Abre una nueva ventana para el modo de juego contra la PC.
     *
     * @param evt El evento de acción generado por el botón.
     */
    private void BT_jugar_pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_jugar_pcActionPerformed
        Juego_PC newframe=new Juego_PC();
        newframe.setUsuario(usuario);
        newframe.setDirec_Historial(direc_historial);
        newframe.setDirec_Logros(direc_logros);
        newframe.setNum_partida(newframe.obtener_num_partida(direc_historial));
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_jugar_pcActionPerformed
    /**
     * Acción que se ejecuta al presionar el botón "Modo Torneo".
     * Abre una nueva ventana para iniciar sesión en el modo Torneo.
     *
     * @param evt El evento de acción generado por el botón.
     */
    private void BT_torneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_torneoActionPerformed
        Iniciar_Sesion newframe=new Iniciar_Sesion();
        newframe.setUsuario1(usuario);
        newframe.setModo("Torneo");
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_torneoActionPerformed
    /**
     * Acción que se ejecuta al presionar el botón "Salir".
     * Cierra la aplicación.
     *
     * @param evt El evento de acción generado por el botón.
     */
    private void BT_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_salirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_BT_salirActionPerformed
    /**
     * Acción que se ejecuta al presionar el botón "Historial".
     * Abre una nueva ventana donde se muestra el historial del usuario.
     *
     * @param evt El evento de acción generado por el botón.
     */
    private void BT_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_historialActionPerformed
        Historial newframe = new Historial();
        newframe.setDireccion(direc_historial);
        newframe.setUsuario(usuario);
        newframe.cargar_historial();
        newframe.transparencia_BT_salir();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_historialActionPerformed
    /**
     * Acción que se ejecuta al presionar el botón "Logros".
     * Abre una nueva ventana donde se muestran los logros del usuario.
     *
     * @param evt El evento de acción generado por el botón.
     */
    private void BT_logrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_logrosActionPerformed
        Logro aux=new Logro();
        Logros newframe=new Logros();
        newframe.setDireccion(direc_logros);
        newframe.mostrar_logros(aux.cargar_Logros(direc_logros));
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_logrosActionPerformed
    /**
     * Método principal que ejecuta la interfaz gráfica del menú.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_historial;
    private javax.swing.JButton BT_jugar_pc;
    private javax.swing.JButton BT_logros;
    private javax.swing.JButton BT_salir;
    private javax.swing.JButton BT_torneo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_logo;
    // End of variables declaration//GEN-END:variables
}
