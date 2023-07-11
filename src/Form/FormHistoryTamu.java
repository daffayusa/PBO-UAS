
package Form;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormHistoryTamu extends javax.swing.JDialog {

   
    public FormHistoryTamu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampil_Tamu();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_karyawan = new javax.swing.JPanel();
        b_refersh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_history = new javax.swing.JTable();
        b_cari = new javax.swing.JButton();
        t_cari = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        b_refersh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_refersh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); // NOI18N
        b_refersh.setText("Refresh");
        b_refersh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refersh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refershActionPerformed(evt);
            }
        });

        tbl_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_history);

        b_cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search 24x24.png"))); // NOI18N
        b_cari.setText("Cari");
        b_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cariActionPerformed(evt);
            }
        });

        t_cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 82, 72));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Data History Tamu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_karyawanLayout = new javax.swing.GroupLayout(panel_karyawan);
        panel_karyawan.setLayout(panel_karyawanLayout);
        panel_karyawanLayout.setHorizontalGroup(
            panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_karyawanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                    .addGroup(panel_karyawanLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_refersh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_karyawanLayout.createSequentialGroup()
                        .addComponent(b_cari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cari)))
                .addContainerGap())
        );
        panel_karyawanLayout.setVerticalGroup(
            panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_karyawanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_refersh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Tamu();
        }
    }//GEN-LAST:event_t_cariKeyTyped

    private void b_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cariActionPerformed
        cari_Tamu();
    }//GEN-LAST:event_b_cariActionPerformed

    private void b_refershActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refershActionPerformed

    }//GEN-LAST:event_b_refershActionPerformed

    private DefaultTableModel tabmode;
    Connection conn = new ConnectionMySQL().getConnection();
    
    public void tampil_Tamu(){
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Harga/Malam","Tanggal Cek In","Tanggal Cek CekOut","Lama Menginap","Total Biaya"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_history.setModel(tabmode);
        try {
            String sql = "SELECT * FROM tb_history_tamu ORDER BY no_tamu asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String no_tamu = hasil.getString("no_tamu");
                String nama_tamu = hasil.getString("nama_tamu");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga = hasil.getString("harga_permalam");
                String tgl_cekin = hasil.getString("cek_in");
                String tgl_cekout = hasil.getString("cek_out");
                String lama_menginap = hasil.getString("lama_menginap");
                String total_biaya = hasil.getString("total_biaya");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, harga, tgl_cekin, tgl_cekout, lama_menginap, total_biaya};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void cari_Tamu(){
        String cari = t_cari.getText();
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Harga/Malam","Tanggal Cek In","Tanggal Cek CekOut","Lama Menginap","Total Biaya"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_history.setModel(tabmode);
        try{
            String sql = "SELECT * from tb_history_tamu WHERE "
                    + "no_tamu like '%"+cari+"%' "
                    + "OR nama_tamu like '%"+cari+"%' "
                    + "OR jenis_kelamin like '%"+cari+"%' "
                    + "OR alamat like '%"+cari+"%' "
                    + "OR no_tlp like '%"+cari+"%' "
                    + "OR kode_kamar like '%"+cari+"%' "
                    + "OR lantai like '%"+cari+"%' "
                    + "OR no_kamar like '%"+cari+"%' "
                    + "OR tipe_kamar like '%"+cari+"%' "
                    + "OR cek_in like '%"+cari+"%' "
                    + "OR cek_out like '%"+cari+"%' "
                    + "OR harga_permalam like '%"+cari+"%' "
                    + "OR lama_menginap like '%"+cari+"%' "
                    + "OR total_biaya like '%"+cari+"%' "
                    + "order by no_tamu asc";
            Statement stmt=conn.createStatement();
            ResultSet hasil=stmt.executeQuery(sql);
            while(hasil.next()){
                String no_tamu = hasil.getString("no_tamu");
                String nama_tamu = hasil.getString("nama_tamu");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga = hasil.getString("harga_permalam");
                String tgl_cekin = hasil.getString("cek_in");
                String tgl_cekout = hasil.getString("cek_out");
                String lama_menginap = hasil.getString("lama_menginap");
                String total_biaya = hasil.getString("total_biaya");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, harga, tgl_cekin, tgl_cekout, lama_menginap, total_biaya};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
        }
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
            java.util.logging.Logger.getLogger(FormHistoryTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHistoryTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHistoryTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHistoryTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormHistoryTamu dialog = new FormHistoryTamu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton b_cari;
    public javax.swing.JButton b_refersh;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_karyawan;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTable tbl_history;
    // End of variables declaration//GEN-END:variables
}
