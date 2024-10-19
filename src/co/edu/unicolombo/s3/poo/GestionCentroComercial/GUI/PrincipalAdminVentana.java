
package co.edu.unicolombo.s3.poo.GestionCentroComercial.GUI;

/**
 *
 * @author Daniel
 */
public class PrincipalAdminVentana extends javax.swing.JFrame {

    public PrincipalAdminVentana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPnl = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        adminNameJl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AdminConfiguracionBtn = new javax.swing.JButton();
        cerrarSesionVentanaAdminBtn1 = new javax.swing.JButton();
        gestioLocalesBtn1 = new javax.swing.JButton();
        gestioParqueaderoBtn = new javax.swing.JButton();
        ReportesBtn3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPnl.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPnl.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(60, 135, 171));
        jPanel1.setPreferredSize(new java.awt.Dimension(174, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/s3/poo/GestionCentroComercial/GUI/ajustes (1).png"))); // NOI18N

        adminNameJl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gestionar");

        AdminConfiguracionBtn.setBackground(new java.awt.Color(60, 143, 208));
        AdminConfiguracionBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AdminConfiguracionBtn.setForeground(new java.awt.Color(0, 0, 0));
        AdminConfiguracionBtn.setText("Configuración");
        AdminConfiguracionBtn.setBorder(null);
        AdminConfiguracionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminConfiguracionBtnActionPerformed(evt);
            }
        });

        cerrarSesionVentanaAdminBtn1.setBackground(new java.awt.Color(60, 143, 208));
        cerrarSesionVentanaAdminBtn1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        cerrarSesionVentanaAdminBtn1.setForeground(new java.awt.Color(0, 0, 0));
        cerrarSesionVentanaAdminBtn1.setText("Terminar sesión");
        cerrarSesionVentanaAdminBtn1.setToolTipText("");
        cerrarSesionVentanaAdminBtn1.setBorder(null);
        cerrarSesionVentanaAdminBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionVentanaAdminBtn1ActionPerformed(evt);
            }
        });

        gestioLocalesBtn1.setBackground(new java.awt.Color(60, 143, 208));
        gestioLocalesBtn1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        gestioLocalesBtn1.setForeground(new java.awt.Color(0, 0, 0));
        gestioLocalesBtn1.setText("Locales");
        gestioLocalesBtn1.setBorder(null);
        gestioLocalesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestioLocalesBtn1ActionPerformed(evt);
            }
        });

        gestioParqueaderoBtn.setBackground(new java.awt.Color(60, 143, 208));
        gestioParqueaderoBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        gestioParqueaderoBtn.setForeground(new java.awt.Color(0, 0, 0));
        gestioParqueaderoBtn.setText("Parqueadero");
        gestioParqueaderoBtn.setBorder(null);
        gestioParqueaderoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestioParqueaderoBtnActionPerformed(evt);
            }
        });

        ReportesBtn3.setBackground(new java.awt.Color(60, 143, 208));
        ReportesBtn3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ReportesBtn3.setForeground(new java.awt.Color(0, 0, 0));
        ReportesBtn3.setText("Reportes");
        ReportesBtn3.setBorder(null);
        ReportesBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesBtn3ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Texto footer para info cualquiera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(adminNameJl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel4))
            .addComponent(gestioLocalesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gestioParqueaderoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ReportesBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(AdminConfiguracionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cerrarSesionVentanaAdminBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(adminNameJl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(gestioLocalesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(gestioParqueaderoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ReportesBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(AdminConfiguracionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cerrarSesionVentanaAdminBtn1)
                .addGap(30, 30, 30)
                .addComponent(jLabel5))
        );

        jPanel2.setBackground(new java.awt.Color(60, 180, 208));
        jPanel2.setPreferredSize(new java.awt.Dimension(726, 73));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Centro Comercial");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Administración");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("00:00");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("{dia} {num} de {mes}, {año}");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundPnlLayout = new javax.swing.GroupLayout(BackgroundPnl);
        BackgroundPnl.setLayout(BackgroundPnlLayout);
        BackgroundPnlLayout.setHorizontalGroup(
            BackgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPnlLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(BackgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPnlLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)))
        );
        BackgroundPnlLayout.setVerticalGroup(
            BackgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(BackgroundPnlLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReportesBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportesBtn3ActionPerformed

    private void gestioParqueaderoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestioParqueaderoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestioParqueaderoBtnActionPerformed

    private void gestioLocalesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestioLocalesBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestioLocalesBtn1ActionPerformed

    private void cerrarSesionVentanaAdminBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionVentanaAdminBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionVentanaAdminBtn1ActionPerformed

    private void AdminConfiguracionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminConfiguracionBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminConfiguracionBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminConfiguracionBtn;
    private javax.swing.JPanel BackgroundPnl;
    private javax.swing.JButton ReportesBtn3;
    private javax.swing.JLabel adminNameJl;
    private javax.swing.JButton cerrarSesionVentanaAdminBtn1;
    private javax.swing.JButton gestioLocalesBtn1;
    private javax.swing.JButton gestioParqueaderoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
