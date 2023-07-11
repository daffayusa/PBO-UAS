/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import static Form.FormAddEditKaryawan.l_judul;
import static Form.FormAddEditKaryawan.t_id_karyawan;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 1001010
 */
public class FormAddEditKamar extends javax.swing.JDialog {

    public FormAddEditKamar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        l_judul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_kode_kamar = new javax.swing.JTextField();
        t_lantai = new javax.swing.JTextField();
        c_tipe_kamar = new javax.swing.JComboBox<>();
        t_no_kamar = new javax.swing.JTextField();
        b_simpan = new javax.swing.JButton();
        b_reset = new javax.swing.JButton();
        t_harga_perkamar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        l_judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_judul.setForeground(new java.awt.Color(255, 255, 255));
        l_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_judul.setText("JUDUL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Kode Kamar");

        jLabel2.setText("Lantai");

        jLabel3.setText("No Kamar");

        jLabel4.setText("Tipe Kamar");

        jLabel5.setText("Harga/Kamar");

        c_tipe_kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "VIP", "Bisnis", "Ekonomi" }));

        b_simpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/accept.png"))); // NOI18N
        b_simpan.setText("Simpan");
        b_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simpanActionPerformed(evt);
            }
        });

        b_reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); // NOI18N
        b_reset.setText("Reset");
        b_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_harga_perkamar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t_lantai)
                            .addComponent(t_no_kamar)
                            .addComponent(t_kode_kamar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_tipe_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(b_simpan)
                                        .addGap(18, 18, 18)
                                        .addComponent(b_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 80, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_kode_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_lantai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_no_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_tipe_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_harga_perkamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_simpan)
                    .addComponent(b_reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection conn = new ConnectionMySQL().getConnection();
    
    private void cek_judul(){
        l_judul.setText(l_judul.getText());
    }
    
    private void reset(){
        t_kode_kamar.setText(null);
        t_lantai.setText(null);
        t_no_kamar.setText(null);
        c_tipe_kamar.setSelectedIndex(0);
        t_harga_perkamar.setText(null);
    }
    
    public void cari_Kode_kamar(){
        String sql = "SELECT * FROM tb_kamar WHERE kode_kamar='"+ t_kode_kamar.getText() +"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                t_lantai.setText(rs.getString("lantai"));
                t_no_kamar.setText(rs.getString("no_kamar"));
                c_tipe_kamar.setSelectedItem(rs.getString("tipe_kamar"));
                t_harga_perkamar.setText(rs.getString("harga_permalam"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Kode kamar TIDAK DITEMUKAN","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e,"Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void update(){
        String sql="UPDATE tb_kamar set lantai=?, no_kamar=?, tipe_kamar=?, harga_permalam=? WHERE kode_kamar='"+ t_kode_kamar.getText() +"'";
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.setString(1, t_lantai.getText());
            stat.setString(2, t_no_kamar.getText());
            stat.setString(3, (String)c_tipe_kamar.getSelectedItem());
            stat.setString(4, t_harga_perkamar.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Update data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            FormMain form_utama = new FormMain();
            form_utama.tampil_kamar();
            this.dispose();
            reset();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Update data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void simpan(){
        String sql="INSERT INTO tb_kamar VALUES (?,?,?,?,?)";
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.setString(1, t_kode_kamar.getText());
            stat.setString(2, t_lantai.getText());
            stat.setString(3, t_no_kamar.getText());
            stat.setString(4, (String)c_tipe_kamar.getSelectedItem());
            stat.setString(5, t_harga_perkamar.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Menyimpan data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            FormMain form_utama = new FormMain();
            form_utama.tampil_kamar();
            this.dispose();
            reset();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Menyimpan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void b_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanActionPerformed
        if ("".equals(t_kode_kamar.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Kode Kamar masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_lantai.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Lantai masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_no_kamar.getText())){
            JOptionPane.showMessageDialog(null, "Kolom No Kamar masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(c_tipe_kamar.getSelectedItem()) || "--Pilih--".equals(c_tipe_kamar.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Pemilihan Tipe Kamar masih SALAH","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ("".equals(t_harga_perkamar.getText())){
            JOptionPane.showMessageDialog(null, "Kolom Harga masih KOSONG","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            cek_judul();
            if ("EDIT DATA KAMAR".equals(l_judul.getText())){
                update();
            }
            else if ("TAMBAH KAMAR".equals(l_judul.getText())){
                String sql = "SELECT * FROM tb_kamar WHERE kode_kamar='"+ t_kode_kamar.getText() +"'";
                try {
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()){
                        JOptionPane.showMessageDialog(null, "Kode Kamar "+ t_kode_kamar.getText() +" SUDAH ADA","Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        simpan();
                    }
                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_b_simpanActionPerformed

    private void b_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetActionPerformed
        reset();
    }//GEN-LAST:event_b_resetActionPerformed

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
            java.util.logging.Logger.getLogger(FormAddEditKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddEditKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddEditKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddEditKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAddEditKamar dialog = new FormAddEditKamar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_reset;
    private javax.swing.JButton b_simpan;
    private javax.swing.JComboBox<String> c_tipe_kamar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel l_judul;
    private javax.swing.JTextField t_harga_perkamar;
    public static javax.swing.JTextField t_kode_kamar;
    private javax.swing.JTextField t_lantai;
    private javax.swing.JTextField t_no_kamar;
    // End of variables declaration//GEN-END:variables
}
