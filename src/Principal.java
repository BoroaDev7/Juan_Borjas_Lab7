
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author famil
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaCrear = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        NombreEquipo = new javax.swing.JTextField();
        guardarEquipo = new javax.swing.JButton();
        ventanaModificar = new javax.swing.JDialog();
        vetanaEliminar = new javax.swing.JDialog();
        ventanaCargarArchivo = new javax.swing.JDialog();
        ventanaSimular = new javax.swing.JDialog();
        boxEquipo1 = new javax.swing.JComboBox<>();
        boxEquipo2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ventanaTabla = new javax.swing.JDialog();
        barra = new javax.swing.JMenuBar();
        tabEquipos = new javax.swing.JMenu();
        Crear = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        cargarArchivo = new javax.swing.JMenuItem();
        tabPartidos = new javax.swing.JMenu();
        simulacion = new javax.swing.JMenuItem();
        tablaPosiciones = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Crear Equipos");

        labelnombre.setText("Nombre del Equipo");

        guardarEquipo.setText("Guardar");
        guardarEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarEquipoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventanaCrearLayout = new javax.swing.GroupLayout(ventanaCrear.getContentPane());
        ventanaCrear.getContentPane().setLayout(ventanaCrearLayout);
        ventanaCrearLayout.setHorizontalGroup(
            ventanaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaCrearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ventanaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCrearLayout.createSequentialGroup()
                        .addComponent(labelnombre)
                        .addGap(18, 18, 18)
                        .addGroup(ventanaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(NombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCrearLayout.createSequentialGroup()
                        .addComponent(guardarEquipo)
                        .addGap(159, 159, 159))))
        );
        ventanaCrearLayout.setVerticalGroup(
            ventanaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(ventanaCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(NombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(guardarEquipo)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaModificarLayout = new javax.swing.GroupLayout(ventanaModificar.getContentPane());
        ventanaModificar.getContentPane().setLayout(ventanaModificarLayout);
        ventanaModificarLayout.setHorizontalGroup(
            ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ventanaModificarLayout.setVerticalGroup(
            ventanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout vetanaEliminarLayout = new javax.swing.GroupLayout(vetanaEliminar.getContentPane());
        vetanaEliminar.getContentPane().setLayout(vetanaEliminarLayout);
        vetanaEliminarLayout.setHorizontalGroup(
            vetanaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        vetanaEliminarLayout.setVerticalGroup(
            vetanaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ventanaCargarArchivoLayout = new javax.swing.GroupLayout(ventanaCargarArchivo.getContentPane());
        ventanaCargarArchivo.getContentPane().setLayout(ventanaCargarArchivoLayout);
        ventanaCargarArchivoLayout.setHorizontalGroup(
            ventanaCargarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ventanaCargarArchivoLayout.setVerticalGroup(
            ventanaCargarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("0");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Simular");

        javax.swing.GroupLayout ventanaSimularLayout = new javax.swing.GroupLayout(ventanaSimular.getContentPane());
        ventanaSimular.getContentPane().setLayout(ventanaSimularLayout);
        ventanaSimularLayout.setHorizontalGroup(
            ventanaSimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaSimularLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(boxEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(boxEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(ventanaSimularLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(ventanaSimularLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaSimularLayout.setVerticalGroup(
            ventanaSimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaSimularLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(ventanaSimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxEquipo1))
                .addGap(18, 18, 18)
                .addGroup(ventanaSimularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaTablaLayout = new javax.swing.GroupLayout(ventanaTabla.getContentPane());
        ventanaTabla.getContentPane().setLayout(ventanaTablaLayout);
        ventanaTablaLayout.setHorizontalGroup(
            ventanaTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ventanaTablaLayout.setVerticalGroup(
            ventanaTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabEquipos.setText("Equipos");

        Crear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar.png"))); // NOI18N
        Crear.setText("Crear Equipo");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        tabEquipos.add(Crear);

        Modificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modificar.png"))); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        tabEquipos.add(Modificar);

        Eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminar.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        tabEquipos.add(Eliminar);

        cargarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cargarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CargarArchivo.png"))); // NOI18N
        cargarArchivo.setText("Cargar Archivo");
        tabEquipos.add(cargarArchivo);

        barra.add(tabEquipos);

        tabPartidos.setText("Partidos");

        simulacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        simulacion.setText("Simular");
        tabPartidos.add(simulacion);

        tablaPosiciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        tablaPosiciones.setText("Tabla de Posiciones");
        tabPartidos.add(tablaPosiciones);

        barra.add(tabPartidos);

        setJMenuBar(barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        // TODO add your handling code here:
        ejecutarCrear();
        
    }//GEN-LAST:event_CrearActionPerformed

    private void guardarEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarEquipoMouseClicked
        // TODO add your handling code here:
         EquiposFutbol team=new EquiposFutbol(NombreEquipo.getText(),0,0,0,0,0,0,0,0);
         equipos.add(team);
         DefaultComboBoxModel comb=(DefaultComboBoxModel) boxEquipo1.getModel();
          DefaultComboBoxModel comb2=(DefaultComboBoxModel) boxEquipo2.getModel();
          
         comb.addElement(equipos);
         comb2.addElement(equipos);
         boxEquipo1.setModel(comb);
         boxEquipo2.setModel(comb2);
         NombreEquipo.setText("");
         
        JOptionPane.showMessageDialog(this, "Equipo agregado Exitosamente");
         
    }//GEN-LAST:event_guardarEquipoMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

   private void ejecutarCrear(){
        ventanaCrear.setModal(true);
        ventanaCrear.pack();
        ventanaCrear.setLocationRelativeTo(this);
        ventanaCrear.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    ArrayList<EquiposFutbol> equipos=new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Crear;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JTextField NombreEquipo;
    private javax.swing.JMenuBar barra;
    private javax.swing.JComboBox<String> boxEquipo1;
    private javax.swing.JComboBox<String> boxEquipo2;
    private javax.swing.JMenuItem cargarArchivo;
    private javax.swing.JButton guardarEquipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JMenuItem simulacion;
    private javax.swing.JMenu tabEquipos;
    private javax.swing.JMenu tabPartidos;
    private javax.swing.JMenuItem tablaPosiciones;
    private javax.swing.JDialog ventanaCargarArchivo;
    private javax.swing.JDialog ventanaCrear;
    private javax.swing.JDialog ventanaModificar;
    private javax.swing.JDialog ventanaSimular;
    private javax.swing.JDialog ventanaTabla;
    private javax.swing.JDialog vetanaEliminar;
    // End of variables declaration//GEN-END:variables
}
