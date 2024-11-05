
package co.edu.unicolombo.s3.poo.GestionCentroComercial.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.swing.Timer;

/**
 *
 * @author Daniel
 */
public class PrincipalAdminVentana extends javax.swing.JFrame {

    public PrincipalAdminVentana() {
        initComponents();
        // Configurar el temporizador para actualizar cada minuto
        Timer timer = new Timer(60000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setDateAndTime();
            }
        });
        timer.start();

        // Llamar una vez para establecer la fecha y hora al inicio
        setDateAndTime();
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdminVentana().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPnl = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        adminNameJl = new javax.swing.JLabel();
        cerrarSesionVentanaAdminBtn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LocalesBtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        reportesBoton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        parqueaderoBoton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        headerPan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 750));
        setPreferredSize(new java.awt.Dimension(1150, 750));
        setResizable(false);

        BackgroundPnl.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPnl.setForeground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(177, 133, 219));
        menu.setPreferredSize(new java.awt.Dimension(174, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/s3/poo/GestionCentroComercial/GUI/Images/avatar-de-usua.png"))); // NOI18N

        adminNameJl.setForeground(new java.awt.Color(255, 255, 255));
        adminNameJl.setText("           Nombre Admin");

        cerrarSesionVentanaAdminBtn1.setBackground(new java.awt.Color(98, 71, 170));
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

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Texto footer para info cualquiera");

        LocalesBtn.setBackground(new java.awt.Color(177, 133, 219));
        LocalesBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LocalesBtnMouseMoved(evt);
            }
        });
        LocalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LocalesBtnMouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/s3/poo/GestionCentroComercial/GUI/Images/LocaIcon.png"))); // NOI18N
        jLabel8.setText("    Locales");

        javax.swing.GroupLayout LocalesBtnLayout = new javax.swing.GroupLayout(LocalesBtn);
        LocalesBtn.setLayout(LocalesBtnLayout);
        LocalesBtnLayout.setHorizontalGroup(
            LocalesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocalesBtnLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        LocalesBtnLayout.setVerticalGroup(
            LocalesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LocalesBtnLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        reportesBoton.setBackground(new java.awt.Color(177, 133, 219));
        reportesBoton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                reportesBotonMouseMoved(evt);
            }
        });
        reportesBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportesBotonMouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/s3/poo/GestionCentroComercial/GUI/Images/ReporteIcon.png"))); // NOI18N
        jLabel9.setText("   Reportes");

        javax.swing.GroupLayout reportesBotonLayout = new javax.swing.GroupLayout(reportesBoton);
        reportesBoton.setLayout(reportesBotonLayout);
        reportesBotonLayout.setHorizontalGroup(
            reportesBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesBotonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        reportesBotonLayout.setVerticalGroup(
            reportesBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesBotonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        parqueaderoBoton.setBackground(new java.awt.Color(177, 133, 219));
        parqueaderoBoton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                parqueaderoBotonMouseMoved(evt);
            }
        });
        parqueaderoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                parqueaderoBotonMouseExited(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/s3/poo/GestionCentroComercial/GUI/Images/car2.png"))); // NOI18N
        jLabel10.setText("   Parqueadero");

        javax.swing.GroupLayout parqueaderoBotonLayout = new javax.swing.GroupLayout(parqueaderoBoton);
        parqueaderoBoton.setLayout(parqueaderoBotonLayout);
        parqueaderoBotonLayout.setHorizontalGroup(
            parqueaderoBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parqueaderoBotonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parqueaderoBotonLayout.setVerticalGroup(
            parqueaderoBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parqueaderoBotonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/s3/poo/GestionCentroComercial/GUI/Images/Linea.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/s3/poo/GestionCentroComercial/GUI/Images/Linea.png"))); // NOI18N
        jLabel12.setText("jLabel11");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parqueaderoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocalesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(cerrarSesionVentanaAdminBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminNameJl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(adminNameJl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LocalesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(parqueaderoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cerrarSesionVentanaAdminBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(17, 17, 17))
        );

        headerPan.setBackground(new java.awt.Color(98, 71, 170));
        headerPan.setPreferredSize(new java.awt.Dimension(174, 73));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SmartMall");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administración");

        time.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("00:00");

        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("{dia} {num} de {mes}, {año}");

        javax.swing.GroupLayout headerPanLayout = new javax.swing.GroupLayout(headerPan);
        headerPan.setLayout(headerPanLayout);
        headerPanLayout.setHorizontalGroup(
            headerPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(headerPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addGroup(headerPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanLayout.createSequentialGroup()
                        .addComponent(date)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanLayout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        headerPanLayout.setVerticalGroup(
            headerPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanLayout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerPanLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundPnlLayout = new javax.swing.GroupLayout(BackgroundPnl);
        BackgroundPnl.setLayout(BackgroundPnlLayout);
        BackgroundPnlLayout.setHorizontalGroup(
            BackgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPnlLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(BackgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPan, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BackgroundPnlLayout.setVerticalGroup(
            BackgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
            .addGroup(BackgroundPnlLayout.createSequentialGroup()
                .addComponent(headerPan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPnlLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cerrarSesionVentanaAdminBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionVentanaAdminBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionVentanaAdminBtn1ActionPerformed

    private void LocalesBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LocalesBtnMouseMoved
        LocalesBtn.setBackground(new Color(193,173,212));
    }//GEN-LAST:event_LocalesBtnMouseMoved

    private void LocalesBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LocalesBtnMouseExited
        LocalesBtn.setBackground(new Color(177,133,219));
    }//GEN-LAST:event_LocalesBtnMouseExited

    private void reportesBotonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesBotonMouseMoved
        reportesBoton.setBackground(new Color(193,173,212));
    }//GEN-LAST:event_reportesBotonMouseMoved

    private void reportesBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesBotonMouseExited
        reportesBoton.setBackground(new Color(177,133,219));
    }//GEN-LAST:event_reportesBotonMouseExited

    private void parqueaderoBotonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parqueaderoBotonMouseMoved
        parqueaderoBoton.setBackground(new Color(193,173,212));
    }//GEN-LAST:event_parqueaderoBotonMouseMoved

    private void parqueaderoBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parqueaderoBotonMouseExited
        parqueaderoBoton.setBackground(new Color(177,133,219));
    }//GEN-LAST:event_parqueaderoBotonMouseExited

    private void setDateAndTime() {
        Locale localeColombia = new Locale("es", "CO");

        // Formateo para la fecha completa
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy", localeColombia);
        String fechaString = date.format(formatter);
        
        // Formateo solo para la hora en minutos
        SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm");
        Date dateTime = new Date();
        String timeString = formatDate.format(dateTime);

        // Actualizar los JLabel
        this.time.setText(timeString);
        this.date.setText(fechaString);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPnl;
    private javax.swing.JPanel LocalesBtn;
    private javax.swing.JLabel adminNameJl;
    private javax.swing.JButton cerrarSesionVentanaAdminBtn1;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel date;
    private javax.swing.JPanel headerPan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel parqueaderoBoton;
    private javax.swing.JPanel reportesBoton;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
