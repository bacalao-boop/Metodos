import java.io.*;
/**
 * Clase Historial que extiende javax.swing.JFrame.
 * Representa la interfaz gráfica para mostrar el historial de resultados de un usuario.
 */
public class Historial extends javax.swing.JFrame {
 /** Nombre del usuario actual. */
    public String usuario="";
    /** Dirección del archivo de historial que se cargará. */
    public String direc_historial="";
    /**
     * Constructor de la clase Historial.
     * Inicializa los componentes gráficos de la interfaz.
     */
    public Historial() {
        initComponents();
    }
    /**
     * Establece la dirección del archivo de historial.
     *
     * @param direc La dirección del historial.
     */
    public void setDireccion(String direc){
        this.direc_historial=direc;
    }
    /**
     * Establece el nombre del usuario.
     *
     * @param usuario El nombre del usuario.
     */
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    /**
     * Método que se ejecuta al presionar el botón "Atrás".
     * Navega hacia el menú principal.
     *
     * @param evt Evento de acción.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_historial = new javax.swing.JLabel();
        lbl_diseno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_resultado = new javax.swing.JLabel();
        BT_menu = new javax.swing.JButton();
        BT_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_historial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_historial.setForeground(new java.awt.Color(255, 255, 255));
        lbl_historial.setText("Historial");
        jPanel1.add(lbl_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 11, -1, -1));

        lbl_diseno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_diseno.setForeground(new java.awt.Color(255, 255, 255));
        lbl_diseno.setText("N°|Resultado ");
        jPanel1.add(lbl_diseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 49, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setForeground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setToolTipText("");

        lbl_resultado.setText(" ");
        jScrollPane1.setViewportView(lbl_resultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, 376, 168));

        BT_menu.setText("Atras");
        BT_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_menuActionPerformed(evt);
            }
        });
        jPanel1.add(BT_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 261, -1, -1));

        BT_salir.setText("X");
        BT_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_salirActionPerformed(evt);
            }
        });
        jPanel1.add(BT_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 6, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_menuActionPerformed
        Menu newframe = new Menu();
        newframe.setDirec_Historial(direc_historial);
        newframe.setDirec_Logros("C:\\Users\\Cesia\\Desktop\\archivo\\"+usuario+"\\logros.txt");
        newframe.setUsuario(usuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_menuActionPerformed
/**
     * Método que se ejecuta al presionar el botón "Salir".
     * Cierra la aplicación.
     *
     * @param evt Evento de acción.
     */
    private void BT_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BT_salirActionPerformed
/**
     * Método main que ejecuta la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_menu;
    private javax.swing.JButton BT_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_diseno;
    private javax.swing.JLabel lbl_historial;
    private static javax.swing.JLabel lbl_resultado;
    // End of variables declaration//GEN-END:variables
    /**
     * Oculta el botón de "Atrás".
     */
    public void transparencia_BT_menu(){
        BT_menu.setVisible(false);
    }
    /**
     * Oculta el botón de "Salir".
     */
    public void transparencia_BT_salir(){
        BT_salir.setVisible(false);
    }
     /**
     * Carga y muestra el historial desde el archivo indicado.
     * El contenido del archivo se muestra en el componente de etiqueta.
     */
    public void cargar_historial(){
        File archivo=new File(direc_historial);
        String contenido="";
        String histo="";
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            while(contenido != null){
                if(histo.equals("")){
                    histo=contenido;
                }else{
                    histo=histo+"<p>"+contenido;
                }
                contenido = lectura.readLine();
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        lbl_resultado.setText("<html>"+histo+"<html>");
    }
}
