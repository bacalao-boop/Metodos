import java.io.*;
/**
 * La clase Iniciar_Sesion permite al usuario ingresar un nombre de usuario y contraseña
 * para iniciar sesión en la aplicación "NIMBOR". Si el usuario no tiene una cuenta,
 * puede crear una nueva desde esta ventana.
 * 
 * Dependiendo del modo (PC o Torneo), la aplicación toma diferentes rutas para la autenticación
 * y la interacción con el usuario.
 * 
 * @version 1.0
 */
public class Iniciar_Sesion extends javax.swing.JFrame {
    /**
     * Modo de la aplicación. Puede ser "PC" o "Torneo".
     */
    public String modo="PC";
     /**
     * Nombre del usuario actual que inició sesión.
     */
    public String usuario1=" ";
    /**
     * Dirección principal donde se almacenan los archivos de usuario.
     */
    private String Direccion_Principal="C:\\Users\\Cesia\\Desktop\\archivo\\";
    /**
     * Constructor por defecto que inicializa los componentes gráficos.
     */
    public Iniciar_Sesion() {
        initComponents();
    }
    /**
     * Inicializa los componentes gráficos del formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_logro = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        lbl_contrasena = new javax.swing.JLabel();
        PFContrasena = new javax.swing.JPasswordField();
        BTiniciar_sesion = new javax.swing.JButton();
        lbl_linea = new javax.swing.JLabel();
        BTCrear_usuario = new javax.swing.JButton();
        lbl_aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logro.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        lbl_logro.setText("NIMBOR");
        getContentPane().add(lbl_logro, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 12, -1, 51));

        lbl_usuario.setText("Usuario:");
        getContentPane().add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 98, -1, -1));

        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 95, 183, -1));

        lbl_contrasena.setText("Contraseña:");
        getContentPane().add(lbl_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 134, -1, -1));

        PFContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(PFContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 131, 183, -1));

        BTiniciar_sesion.setText("Iniciar Sesion");
        BTiniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTiniciar_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(BTiniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 171, -1, -1));

        lbl_linea.setText("________________________________________");
        getContentPane().add(lbl_linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 200, -1, -1));

        BTCrear_usuario.setText("Crear Usuario");
        BTCrear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCrear_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(BTCrear_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 228, -1, -1));

        lbl_aviso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_aviso.setForeground(new java.awt.Color(153, 0, 0));
        lbl_aviso.setText(" ");
        getContentPane().add(lbl_aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 69, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /**
     * Establece el nombre del usuario que inició sesión.
     * 
     * @param usuario El nombre del usuario que se va a establecer.
     */
    public void setUsuario1(String usuario) {
        this.usuario1 = usuario;
    }
    /**
     * Establece el modo de operación de la aplicación (PC o Torneo).
     * 
     * @param modo El modo de la aplicación.
     */
    public void setModo(String modo) {
        this.modo = modo;
    }
    /**
     * Acción que ocurre cuando el campo de texto del usuario recibe un evento.
     * Actualmente, este método no realiza ninguna acción.
     * 
     * @param evt El evento del campo de texto.
     */
    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFUsuarioActionPerformed
/**
     * Acción que ocurre cuando el botón "Iniciar Sesión" es presionado.
     * Verifica que el nombre de usuario y la contraseña sean correctos
     * y redirige al menú o al modo torneo según sea el caso.
     * 
     * @param evt El evento de acción generado por presionar el botón.
     */
    private void BTiniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTiniciar_sesionActionPerformed
        File direcUsuarios=new File("C:\\Users\\Cesia\\Desktop\\archivo\\Usuarios.txt");
        String nombre=TFUsuario.getText();
        String contrasena=PFContrasena.getText();
        Usuario us1=new Usuario(nombre,contrasena);
        if(!nombre.equals("") && !contrasena.equals("")){
            if(modo.equals("PC") && us1.Usuario_Existe(direcUsuarios,nombre) && us1.Confirmar_Contrasena(direcUsuarios,nombre,contrasena)){
                Menu newframe=new Menu();
                newframe.setUsuario(nombre);
                newframe.setDirec_Historial(Direccion_Principal+nombre+"\\historial.txt");
                newframe.setDirec_Logros(Direccion_Principal+nombre+"\\logros.txt");
                newframe.setVisible(true);
                this.dispose();
            }else if(modo.equals("Torneo")){
                String direccion=Direccion_Principal+"\\Torneo\\"+usuario1+"_"+nombre+".txt";
                File historial= new File(direccion);
                try{
                    if(historial.createNewFile()){
                        System.out.println(".");
                    }else{
                        System.out.println(".\n.\n.");
                    }
                }catch(IOException exepcion){
                    exepcion.printStackTrace(System.out);
                }
                Juego_Torneo newframe= new Juego_Torneo();
                newframe.setUsuario1(usuario1);
                newframe.setUsuario2(nombre);
                newframe.setDirec_Historial(direccion);
                newframe.setNum_partida(newframe.obtener_num_partida(direccion));
                newframe.setVisible(true);
                newframe.cargar_datos();
                this.dispose();
            }
            lbl_aviso.setText("<html>Usuario/Contraseña incorrecta<p>Intentelo de nuevo<html>");
        }
        if(nombre.equals("") || contrasena.equals(""))
        lbl_aviso.setText("<html>Ingrese sus datos para iniciar sesion<html>");
        
    }//GEN-LAST:event_BTiniciar_sesionActionPerformed
 /**
     * Acción que ocurre cuando el botón "Crear Usuario" es presionado.
     * Redirige a la ventana de registro de nuevo usuario.
     * 
     * @param evt El evento de acción generado por presionar el botón.
     */
    private void BTCrear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCrear_usuarioActionPerformed
        Crear_nuevo_usuario newframe=new Crear_nuevo_usuario();
        newframe.setUsuario1(usuario1);
        newframe.setModo(modo);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTCrear_usuarioActionPerformed
/**
     * Acción que ocurre cuando el campo de contraseña recibe un evento.
     * Actualmente, este método no realiza ninguna acción.
     * 
     * @param evt El evento del campo de contraseña.
     */
    private void PFContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFContrasenaActionPerformed

    }//GEN-LAST:event_PFContrasenaActionPerformed
/**
     * Método principal que ejecuta la ventana de inicio de sesión.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCrear_usuario;
    private javax.swing.JButton BTiniciar_sesion;
    private javax.swing.JPasswordField PFContrasena;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JLabel lbl_aviso;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_linea;
    private javax.swing.JLabel lbl_logro;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables

}