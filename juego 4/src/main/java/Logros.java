import java.util.ArrayList;
/**
 * Clase Logros que extiende de JFrame y gestiona la interfaz gráfica para mostrar logros desbloqueados o no desbloqueados de un usuario.
 */
public class Logros extends javax.swing.JFrame {
     // Atributos de la clase
    public String usuario="";// Nombre del usuario
    public String direc_logros="";// Dirección donde se guardan los logros
    /**
     * Constructor por defecto que inicializa los componentes de la interfaz gráfica.
     */
    public Logros() {
        initComponents();
    }
    /**
     * Establece la dirección del archivo de logros.
     *
     * @param direc La dirección del archivo de logros.
     */
    public void setDireccion(String direc){
        this.direc_logros=direc;
    }
    /**
     * Establece el nombre de usuario.
     *
     * @param usuario El nombre del usuario.
     */    
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    /**
     * Inicializa los componentes de la interfaz gráfica de Logros.
     * Este código es generado automáticamente por NetBeans y define los elementos visuales de la ventana.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_logros = new javax.swing.JLabel();
        lbl_diseno = new javax.swing.JLabel();
        BT_Atras = new javax.swing.JButton();
        lbl_lista_logros_true = new javax.swing.JLabel();
        lbl_lista_logros_false = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logros.setBackground(new java.awt.Color(0, 0, 0));
        lbl_logros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_logros.setText("Logros");
        jPanel1.add(lbl_logros, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 6, -1, -1));

        lbl_diseno.setBackground(new java.awt.Color(0, 0, 0));
        lbl_diseno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_diseno.setText("NOMBRE | DESCRIPCION");
        jPanel1.add(lbl_diseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 44, -1, -1));

        BT_Atras.setText("Atras");
        BT_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(BT_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 261, -1, -1));

        lbl_lista_logros_true.setText(" ");
        jPanel1.add(lbl_lista_logros_true, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 66, -1, -1));

        lbl_lista_logros_false.setForeground(new java.awt.Color(204, 51, 0));
        lbl_lista_logros_false.setText(" ");
        jPanel1.add(lbl_lista_logros_false, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 88, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción que se ejecuta al presionar el botón "Atrás". Cambia la ventana actual por la ventana del menú.
     *
     * @param evt El evento de acción generado por el botón.
     */
    private void BT_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtrasActionPerformed
        Menu newframe= new Menu();
        newframe.setDirec_Historial("C:\\Users\\Cesia\\Desktop\\archivo\\"+usuario+"\\historial.txt");
        newframe.setDirec_Logros(direc_logros);
        newframe.setUsuario(usuario);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_AtrasActionPerformed
    /**
     * Método principal que ejecuta la interfaz gráfica de Logros.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Atras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_diseno;
    private static javax.swing.JLabel lbl_lista_logros_false;
    private static javax.swing.JLabel lbl_lista_logros_true;
    private javax.swing.JLabel lbl_logros;
    // End of variables declaration//GEN-END:variables
    /**
     * Muestra los logros desbloqueados y no desbloqueados en la interfaz gráfica.
     *
     * @param lista La lista de logros que se va a mostrar.
     */
    public void mostrar_logros(ArrayList<Logro> lista){
        String logro_false="";
        String logro_true="";
            for(Logro aux: lista){
                if(aux.getEstado()){
                    if(logro_true.equals("")){
                        logro_true=aux.getNombre()+" | "+aux.getDescripcion();
                    }else{
                        logro_true=logro_true+"<p>"+aux.getNombre()+" | "+aux.getDescripcion();
                    }
                }else{
                    if(logro_false.equals("")){
                        logro_false=aux.getNombre()+" | "+aux.getDescripcion();
                    }else{
                        logro_false=logro_false+"<p>"+aux.getNombre()+" | "+aux.getDescripcion();
                    }
                }
            }
        lbl_lista_logros_true.setText("<html>"+logro_true+"<html>");
        lbl_lista_logros_false.setText("<html>"+logro_false+"<html>");
    }
}
