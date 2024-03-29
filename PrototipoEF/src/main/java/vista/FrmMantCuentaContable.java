/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Conexion;
import dominio.ClasificacionCuenta;
import dominio.CuentaContable;
import java.io.File;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
/*import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;*/

/**
 *
 * @author luis lee
 */
public class FrmMantCuentaContable extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMantCuentaContable
     */

    private void comboBox() {
        ClasificacionCuenta objClasificarCuenta = new ClasificacionCuenta();

        objClasificarCuenta.getTablaRegistros();

        int contI = 0;
        contI = objClasificarCuenta.getTablaRegistros().length;

        String[][] matrixData = new String[contI][3];

        for (int i = 0; i < contI; i++) {
            for (int j = 0; j < 3; j++) {
                matrixData[i][j] = objClasificarCuenta.getTablaRegistros()[i][j];
            }
        }

        for (int i = 0; i < contI; i++) {
            JCmbClasificacion.addItem(matrixData[i][0]);
        }

    }

    private void cargarTabla() {

        CuentaContable objCuenta = new CuentaContable();

        objCuenta.getTablaRegistros();

        int contI = 0;
        contI = objCuenta.getTablaRegistros().length;

        String[][] matrixData = new String[contI][5];

        for (int i = 0; i < contI; i++) {
            for (int j = 0; j < 5; j++) {
                matrixData[i][j] = objCuenta.getTablaRegistros()[i][j];
            }
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) JTableRegistros.getModel();
        modeloTabla.setRowCount(contI);
        modeloTabla.setColumnCount(5);

        for (int i = 0; i < contI; i++) {
            for (int j = 0; j < 5; j++) {
                JTableRegistros.setValueAt(matrixData[i][j], i, j);
            }
        }
    }

    

    public FrmMantCuentaContable() {
        initComponents();
        cargarTabla();
        comboBox();
        //habilitarAcciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTxtCodigoCuenta = new javax.swing.JTextField();
        JTxtNombre = new javax.swing.JTextField();
        JCmbClasificacion = new javax.swing.JComboBox<>();
        JCmbEstado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        BtnIng = new javax.swing.JButton();
        BtnMod = new javax.swing.JButton();
        BtnElim = new javax.swing.JButton();
        BtnBus = new javax.swing.JButton();
        BtnAyuda = new javax.swing.JButton();
        BtnPrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableRegistros = new javax.swing.JTable();

        setClosable(true);
        setTitle("Mantenimiento de Cuenta Contable");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Cuenta Contable"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Código de Cuenta Contable:");

        jLabel2.setText("Nombre de Cuenta Contable:");

        jLabel3.setText("Clasificación Cuenta Contable:");

        jLabel4.setText("Estado Cuenta Contable:");

        JCmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "I" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnIng.setText("Ingresar");
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        BtnMod.setText("Modificar");
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        BtnElim.setText("Eliminar");
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        BtnBus.setText("Buscar");
        BtnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusActionPerformed(evt);
            }
        });

        BtnAyuda.setText("?");
        BtnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAyuda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIng)
                    .addComponent(BtnElim)
                    .addComponent(BtnMod)
                    .addComponent(BtnBus)
                    .addComponent(BtnAyuda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnPrint.setText("Reporte");
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTxtCodigoCuenta)
                            .addComponent(JTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCmbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JCmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTxtCodigoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCmbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(BtnPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Cuenta", "Nombre de Cuenta Contable", "Clasificación de Cuenta Contable", "Estado de Cuenta Contable", "Monto"
            }
        ));
        jScrollPane1.setViewportView(JTableRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed
        CuentaContable objCuenta = new CuentaContable();

        var codigoClasificacion = JTxtCodigoCuenta.getText();
        var nombreCuenta = JTxtNombre.getText();
        var descripcionCuenta = JCmbClasificacion.getSelectedItem().toString();
        var estadoCuenta = JCmbEstado.getSelectedItem().toString();

        objCuenta.setCodigoCuentaContable(codigoClasificacion);
        objCuenta.setNombreCuentaContable(nombreCuenta);
        objCuenta.setClasificacionCuentaContable(descripcionCuenta);
        objCuenta.setEstadoCuentaContable(estadoCuenta);
        objCuenta.Insertar(objCuenta);




        cargarTabla();
        JTxtCodigoCuenta.setText("");
        JTxtNombre.setText("");
        JTxtCodigoCuenta.requestFocus();
    }//GEN-LAST:event_BtnIngActionPerformed

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed
        CuentaContable objCuenta = new CuentaContable();
        String codigoCuenta = JTxtCodigoCuenta.getText();

        objCuenta.Eliminar(codigoCuenta);

        cargarTabla();
    }//GEN-LAST:event_BtnElimActionPerformed

    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
        CuentaContable objCuenta = new CuentaContable();

        var codigoClasificacion = JTxtCodigoCuenta.getText();
        var nombreCuenta = JTxtNombre.getText();
        var descripcionCuenta = JCmbClasificacion.getSelectedItem().toString();
        var estadoCuenta = JCmbEstado.getSelectedItem().toString();

        objCuenta.setCodigoCuentaContable(codigoClasificacion);
        objCuenta.setNombreCuentaContable(nombreCuenta);
        objCuenta.setClasificacionCuentaContable(descripcionCuenta);
        objCuenta.setEstadoCuentaContable(estadoCuenta);
        objCuenta.Actualizar(objCuenta);
        cargarTabla();
    }//GEN-LAST:event_BtnModActionPerformed

    private void BtnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusActionPerformed
        CuentaContable objCuenta = new CuentaContable();

        var codigoClasificacion = JTxtCodigoCuenta.getText();

        objCuenta.setCodigoCuentaContable(codigoClasificacion);

        objCuenta.Buscar(objCuenta);


        JTxtCodigoCuenta.setText(objCuenta.Buscar(objCuenta)[0]);
        JTxtNombre.setText(objCuenta.Buscar(objCuenta)[1]);
        JCmbClasificacion.setSelectedItem(objCuenta.Buscar(objCuenta)[2]);
        JCmbEstado.setSelectedItem(objCuenta.Buscar(objCuenta)[4]);
        cargarTabla();
    }//GEN-LAST:event_BtnBusActionPerformed

    private void BtnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAyudaActionPerformed
        try {
            if ((new File("src\\main\\java\\Finanzas\\ayudas\\Ayuda_Mantenimiento_Clasificacion_Cuenta.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Finanzas\\ayudas\\Ayuda_Mantenimiento_Clasificacion_Cuenta.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_BtnAyudaActionPerformed

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
        /*JasperReport report;
        JasperPrint print;

        try {
            Connection conex = Conexion.getConnection();
            String ruta = "src\\main\\java\\Finanzas\\reportes\\CuentasContables.jasper";

            report = (JasperReport) JRLoader.loadObjectFromFile(ruta);

            JasperPrint jprint = JasperFillManager.fillReport(ruta, null, conex);

            JasperViewer jview = new JasperViewer(jprint, false);

            jview.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            jview.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

        BitacoraDao BitacoraDAO = new BitacoraDao();
        Bitacora AInsertar = new Bitacora();
        AInsertar.setId_Usuario(Login.usuarioFianzas);
        AInsertar.setAccion("Imprimir");
        AInsertar.setCodigoAplicacion("1003");
        AInsertar.setModulo("1000");
        try {
            BitacoraDAO.insert(AInsertar);

        } catch (UnknownHostException ex) {
            Logger.getLogger(FrmTipoTransaccion.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_BtnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAyuda;
    private javax.swing.JButton BtnBus;
    private javax.swing.JButton BtnElim;
    private javax.swing.JButton BtnIng;
    private javax.swing.JButton BtnMod;
    private javax.swing.JButton BtnPrint;
    private javax.swing.JComboBox<String> JCmbClasificacion;
    private javax.swing.JComboBox<String> JCmbEstado;
    private javax.swing.JTable JTableRegistros;
    private javax.swing.JTextField JTxtCodigoCuenta;
    private javax.swing.JTextField JTxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
