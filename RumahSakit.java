/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_final;

/**
 *
 * @author laure
 */
public class RumahSakit extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public RumahSakit() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNama = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblHari = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();
        txtHari = new javax.swing.JTextField();
        lblJenis = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        lblHasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblNama.setBackground(new java.awt.Color(193, 174, 155));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("RUMAH SAKIT");

        lblNama.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lblNamaLayout = new javax.swing.GroupLayout(lblNama);
        lblNama.setLayout(lblNamaLayout);
        lblNamaLayout.setHorizontalGroup(
            lblNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNamaLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblNamaLayout.setVerticalGroup(
            lblNamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNamaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lbNama.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lbNama.setText("Nama Pasien:");

        txtNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblHari.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblHari.setText("Lama Perawatan :");

        cbJenis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Rawat Inap VIP", "Rawat Inap Reguler", "IGD", "Klinik Spesialis", "Klinik Umum" }));
        cbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisActionPerformed(evt);
            }
        });

        lblJenis.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblJenis.setText("Jenis Layanan :");

        btnHitung.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnHitung.setText("Hitung Biaya ");
        btnHitung.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        lblHasil.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lblHasil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHasil.setText("Total Biaya : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNama)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnHitung))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNama, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHari)
                                    .addComponent(lblJenis))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNama)
                                    .addComponent(txtHari)
                                    .addComponent(cbJenis, 0, 180, Short.MAX_VALUE)))
                            .addComponent(lblHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHari)
                    .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJenis))
                .addGap(18, 18, 18)
                .addComponent(btnHitung)
                .addGap(18, 18, 18)
                .addComponent(lblHasil)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisActionPerformed
    String jenis = cbJenis.getSelectedItem().toString();
        switch (jenis) {
            case "Rawat Inap VIP":
                lblHasil.setText("Biaya VIP: Rp 1.500.000 / hari");
                break;
            case "Rawat Inap Reguler":
                lblHasil.setText("Biaya Reguler: Rp 800.000 / hari");
                break;
            case "IGD":
                lblHasil.setText("Biaya IGD: Rp 500.000 / hari");
                break;
            case "Klinik Spesialis":
                lblHasil.setText("Biaya Spesialis: Rp 200.000 / hari + Rp 300.000");
                break;
            case "Klinik Umum":
                lblHasil.setText("Biaya Klinik Umum: Rp 200.000 / hari");
                break;
        }                                 
    }//GEN-LAST:event_cbJenisActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        String nama = txtNama.getText();
        int hari = Integer.parseInt(txtHari.getText());
        Pasien pasien = null;

        switch (cbJenis.getSelectedIndex()) {
            case 1:
                pasien = new PasienVIP(nama, hari);
                break;
            case 2:
                pasien = new PasienReguler(nama, hari);
                break;
            case 3:
                pasien = new PasienIGD(nama, hari);
                break;
            case 4:
                pasien = new PasienSpesialis(nama, hari);
                break;
            case 5:
                pasien = new PasienUmum(nama, hari);
                break;
        }

        lblHasil.setText("Total Biaya: Rp " + pasien.hitungBiaya());
    }//GEN-LAST:event_btnHitungActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new RumahSakit().setVisible(true));
    }
    
        /* Create and display the form */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lblHari;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JDesktopPane lblNama;
    private javax.swing.JTextField txtHari;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
