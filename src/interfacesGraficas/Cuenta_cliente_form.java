package interfacesGraficas;

import imagenes.PosicionImagenes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class Cuenta_cliente_form extends javax.swing.JFrame {
    
    PosicionImagenes imagenes = new PosicionImagenes();

    /**
     * Creates new form AtencionClienteForm
     */
    public Cuenta_cliente_form() {
        initComponents();
        imagenes.escaralarLabel(LabelLogo, "/imagenes/logome.png");
        imagenes.escaralarLabel(labelRegresar, "/imagenes/regresar.png");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelLogo = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelVerProductos = new javax.swing.JLabel();
        panelRegresar = new javax.swing.JPanel();
        labelRegresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Historial de venta");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 290, 60));
        panelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 280, 30));

        LabelLogo.setText("jLabel2");

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 200, 140));

        tablaHistorial.setBackground(new java.awt.Color(255, 255, 255));
        tablaHistorial.setForeground(new java.awt.Color(0, 0, 0));
        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Monto", "Cantidad", "Fecha"
            }
        ));
        tablaHistorial.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablaHistorial);

        panelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 510, 470));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mi cuenta");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 230, 80));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        labelVerProductos.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        labelVerProductos.setForeground(new java.awt.Color(255, 255, 255));
        labelVerProductos.setText(" Ver Productos");
        labelVerProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelVerProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVerProductosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVerProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVerProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 250, 80));

        labelRegresar.setText("jLabel3");
        labelRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRegresarLayout = new javax.swing.GroupLayout(panelRegresar);
        panelRegresar.setLayout(panelRegresarLayout);
        panelRegresarLayout.setHorizontalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        panelRegresarLayout.setVerticalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegresarMouseClicked
        // TODO add your handling code here:
        Prototipo regresar = new Prototipo();
        this.setVisible(false);
        regresar.setVisible(true);
        
    }//GEN-LAST:event_labelRegresarMouseClicked

    private void labelVerProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVerProductosMouseClicked
        // TODO add your handling code here:
        ProductosFrom llamadaProductos = new  ProductosFrom();
        llamadaProductos.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_labelVerProductosMouseClicked

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
            java.util.logging.Logger.getLogger(Cuenta_cliente_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuenta_cliente_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuenta_cliente_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuenta_cliente_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuenta_cliente_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelRegresar;
    private javax.swing.JLabel labelVerProductos;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRegresar;
    private javax.swing.JTable tablaHistorial;
    // End of variables declaration//GEN-END:variables
}