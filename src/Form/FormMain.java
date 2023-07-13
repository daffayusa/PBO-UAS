
package Form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class FormMain extends javax.swing.JFrame {

   Connection conn = new ConnectionMySQL().getConnection();
   
    public FormMain() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Tanggal_sekarang();
        jamDigital();
        tampil_karyawan();
        tampil_kamar();
        tampil_Tamu();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        l_tanggal = new javax.swing.JLabel();
        l_jam = new javax.swing.JLabel();
        l_id_admin1 = new javax.swing.JLabel();
        l_id_admin = new javax.swing.JLabel();
        b_logout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_karyawan = new javax.swing.JPanel();
        b_refersh_karyawan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_karyawan = new javax.swing.JTable();
        b_tambah_karyawan = new javax.swing.JButton();
        b_edit_karyawan = new javax.swing.JButton();
        b_delete_karyawan = new javax.swing.JButton();
        b_cari_karyawan = new javax.swing.JButton();
        t_cari_karyawan = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_kamar = new javax.swing.JPanel();
        b_refersh_kamar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_kamar = new javax.swing.JTable();
        b_tambah_kamar = new javax.swing.JButton();
        b_edit_kamar = new javax.swing.JButton();
        b_delete_kamar = new javax.swing.JButton();
        b_cari_kamar = new javax.swing.JButton();
        t_cari_kamar = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_tamu = new javax.swing.JPanel();
        b_refersh_tamu = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_tamu = new javax.swing.JTable();
        b_tambah_tamu = new javax.swing.JButton();
        b_cekout = new javax.swing.JButton();
        b_history = new javax.swing.JButton();
        b_cari_kamar2 = new javax.swing.JButton();
        t_cari_tamu = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        l_admin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hotel-sign_527079.png"))); // NOI18N
        jLabel8.setText("APLIKASI PEMESANAN KAMAR HOTEL");

        l_tanggal.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        l_tanggal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_tanggal.setText("Tanggal");

        l_jam.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        l_jam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_jam.setText("Jam");

        l_id_admin1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        l_id_admin1.setText("Admin : ");

        l_id_admin.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        l_id_admin.setText("Admin");

        b_logout.setBackground(new java.awt.Color(255, 0, 51));
        b_logout.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/log-out_3596149.png"))); // NOI18N
        b_logout.setText("Log Out");
        b_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_logoutActionPerformed(evt);
            }
        });

        b_refersh_karyawan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_refersh_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh_561210.png"))); // NOI18N
        b_refersh_karyawan.setText("Refresh");
        b_refersh_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refersh_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refersh_karyawanActionPerformed(evt);
            }
        });

        tbl_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_karyawan);

        b_tambah_karyawan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_tambah_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/round-add-button.png"))); // NOI18N
        b_tambah_karyawan.setText("Tambah");
        b_tambah_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_tambah_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambah_karyawanActionPerformed(evt);
            }
        });

        b_edit_karyawan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_edit_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pen_10263451.png"))); // NOI18N
        b_edit_karyawan.setText("Edit");
        b_edit_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_edit_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_edit_karyawanActionPerformed(evt);
            }
        });

        b_delete_karyawan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_delete_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_3221845.png"))); // NOI18N
        b_delete_karyawan.setText("Delete");
        b_delete_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_delete_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_delete_karyawanActionPerformed(evt);
            }
        });

        b_cari_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_cari_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/magnifying-glass_44794.png"))); // NOI18N
        b_cari_karyawan.setText("Cari");
        b_cari_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cari_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cari_karyawanActionPerformed(evt);
            }
        });

        t_cari_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari_karyawan.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari_karyawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cari_karyawanKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setBackground(new java.awt.Color(102, 0, 102));
        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Data Karyawan");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
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
                    .addGroup(panel_karyawanLayout.createSequentialGroup()
                        .addComponent(b_cari_karyawan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cari_karyawan))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_karyawanLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_refersh_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_tambah_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_delete_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_edit_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_karyawanLayout.setVerticalGroup(
            panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_karyawanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_refersh_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_karyawanLayout.createSequentialGroup()
                        .addComponent(b_tambah_karyawan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_edit_karyawan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_delete_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_karyawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cari_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cari_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Karyawan", panel_karyawan);

        b_refersh_kamar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_refersh_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh_561210.png"))); // NOI18N
        b_refersh_kamar.setText("Refresh");
        b_refersh_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refersh_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refersh_kamarActionPerformed(evt);
            }
        });

        tbl_kamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_kamar);

        b_tambah_kamar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_tambah_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/round-add-button.png"))); // NOI18N
        b_tambah_kamar.setText("Tambah");
        b_tambah_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_tambah_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambah_kamarActionPerformed(evt);
            }
        });

        b_edit_kamar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_edit_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pen_10263451.png"))); // NOI18N
        b_edit_kamar.setText("Edit");
        b_edit_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_edit_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_edit_kamarActionPerformed(evt);
            }
        });

        b_delete_kamar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_delete_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_3221845.png"))); // NOI18N
        b_delete_kamar.setText("Delete");
        b_delete_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_delete_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_delete_kamarActionPerformed(evt);
            }
        });

        b_cari_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_cari_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/magnifying-glass_44794.png"))); // NOI18N
        b_cari_kamar.setText("Cari");
        b_cari_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cari_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cari_kamarActionPerformed(evt);
            }
        });

        t_cari_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari_kamar.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari_kamar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cari_kamarKeyTyped(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Data Kamar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_kamarLayout = new javax.swing.GroupLayout(panel_kamar);
        panel_kamar.setLayout(panel_kamarLayout);
        panel_kamarLayout.setHorizontalGroup(
            panel_kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kamarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_kamarLayout.createSequentialGroup()
                        .addComponent(b_cari_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cari_kamar))
                    .addGroup(panel_kamarLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_refersh_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_tambah_kamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_delete_kamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_edit_kamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_kamarLayout.setVerticalGroup(
            panel_kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_kamarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_refersh_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_kamarLayout.createSequentialGroup()
                        .addComponent(b_tambah_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_edit_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_delete_kamar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_kamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cari_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cari_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Kamar", panel_kamar);

        b_refersh_tamu.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_refersh_tamu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh_561210.png"))); // NOI18N
        b_refersh_tamu.setText("Refresh");
        b_refersh_tamu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refersh_tamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refersh_tamuActionPerformed(evt);
            }
        });

        tbl_tamu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbl_tamu);

        b_tambah_tamu.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_tambah_tamu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add-user_7542128.png"))); // NOI18N
        b_tambah_tamu.setText("Cek In");
        b_tambah_tamu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_tambah_tamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambah_tamuActionPerformed(evt);
            }
        });

        b_cekout.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_cekout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/trash_5510065.png"))); // NOI18N
        b_cekout.setText("Cek Out");
        b_cekout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cekout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cekoutActionPerformed(evt);
            }
        });

        b_history.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        b_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/history_565526.png"))); // NOI18N
        b_history.setText("History");
        b_history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_historyActionPerformed(evt);
            }
        });

        b_cari_kamar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_cari_kamar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/magnifying-glass_44794.png"))); // NOI18N
        b_cari_kamar2.setText("Cari");
        b_cari_kamar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cari_kamar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cari_kamar2ActionPerformed(evt);
            }
        });

        t_cari_tamu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari_tamu.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari_tamu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cari_tamuKeyTyped(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Data Tamu");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_tamuLayout = new javax.swing.GroupLayout(panel_tamu);
        panel_tamu.setLayout(panel_tamuLayout);
        panel_tamuLayout.setHorizontalGroup(
            panel_tamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tamuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_tamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tamuLayout.createSequentialGroup()
                        .addComponent(b_cari_kamar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cari_tamu))
                    .addGroup(panel_tamuLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_refersh_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_tamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_tambah_tamu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_cekout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_tamuLayout.setVerticalGroup(
            panel_tamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tamuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_tamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_refersh_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_tamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tamuLayout.createSequentialGroup()
                        .addComponent(b_tambah_tamu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cekout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_history, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_tamuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cari_kamar2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_cari_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tamu", panel_tamu);

        l_admin.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        l_admin.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(l_jam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_id_admin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_id_admin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_admin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(l_jam)
                        .addGap(18, 18, 18)
                        .addComponent(l_tanggal)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_id_admin)
                    .addComponent(b_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_id_admin1)
                    .addComponent(l_admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //perintah menampilkan tanggal
    public void Tanggal_sekarang(){
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("dd-MM-yyyy") ;
        l_tanggal.setText("Tanggal "+kal.format(sekarang));
    }
    
    // jam digital Konstruktor
    public void jamDigital() {
    // ActionListener untuk Keperluan Timer
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                // Membuat Date
                Date dt = new Date();
                // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
                if (nilai_jam <= 9) {
                  // Tambahkan "0" didepannya
                  nol_jam = "0";
                }
                // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
                if (nilai_menit <= 9) {
                  // Tambahkan "0" didepannya
                  nol_menit = "0";
                }
                // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
                if (nilai_detik <= 9) {
                  // Tambahkan "0" didepannya
                  nol_detik = "0";
                }
                // Membuat String JAM, MENIT, DETIK
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                // Menampilkan pada Layar
                l_jam.setText("Jam "+jam + ":" + menit + ":" + detik);
            }
        };
        // Timer
        new Timer(1000, taskPerformer).start();
    }
    
    private DefaultTableModel tabmode;
    
    public void tampil_karyawan(){
        Object []baris = {"ID Karyawan","Nama Karyawan","Jenis Kelamin","Alamat","No Tlp"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_karyawan.setModel(tabmode);
        try {
            String sql = "SELECT * FROM tb_karyawan order by id_karyawan asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id_karyawan = hasil.getString("id_karyawan");
                String nama_karyawan = hasil.getString("nama_karyawan");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String[] data = {id_karyawan, nama_karyawan, jenis_kelamin, alamat, no_tlp};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
        
    public void cari_Karyawan(){
        String cari = t_cari_karyawan.getText();
        Object []baris = {"ID Karyawan","Nama Karyawan","Jenis Kelamin","Alamat","No Tlp"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_karyawan.setModel(tabmode);
        try{
            String sql="Select * from tb_karyawan where id_karyawan like '%"+cari+"%' or nama_karyawan like '%"+cari+"%' or jenis_kelamin like '%"+cari+"%' or alamat like '%"+cari+"%' or no_tlp like '%"+cari+"%' order by id_karyawan asc";
            Statement stmt=conn.createStatement();
            ResultSet rslt=stmt.executeQuery(sql);
            while(rslt.next()){
                String id_karyawan=rslt.getString("id_karyawan");
                String nama_karyawan=rslt.getString("nama_karyawan");
                String jenis_kelamin=rslt.getString("jenis_kelamin");
                String alamat=rslt.getString("alamat");
                String no_tlp=rslt.getString("no_tlp");
                String[] data={id_karyawan,nama_karyawan,jenis_kelamin,alamat,no_tlp};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
        }
    }
    
    public void tampil_kamar(){
        Object []baris = {"Kode Kamar","Lantai","No Kamar","Tipe Kamar","Harga Per Malam"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_kamar.setModel(tabmode);
        try {
            String sql = "SELECT * FROM tb_kamar order by kode_kamar asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga_permalam = hasil.getString("harga_permalam");
                String[] data = {kode_kamar, lantai, no_kamar, tipe_kamar, harga_permalam};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void cari_Kamar(){
        String cari = t_cari_kamar.getText();
        Object []baris = {"Kode Kamar","Lantai","No Kamar","Tipe Kamar","Harga Per Malam"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_kamar.setModel(tabmode);
        try{
            String sql="Select * from tb_kamar where "
                    + "kode_kamar like '%"+cari+"%' "
                    + "or lantai like '%"+cari+"%' "
                    + "or no_kamar like '%"+cari+"%' "
                    + "or tipe_kamar like '%"+cari+"%' "
                    + "or harga_permalam like '%"+cari+"%' "
                    + "order by kode_kamar asc";
            Statement stmt=conn.createStatement();
            ResultSet hasil=stmt.executeQuery(sql);
            while(hasil.next()){
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga_permalam = hasil.getString("harga_permalam");
                String[] data = {kode_kamar, lantai, no_kamar, tipe_kamar, harga_permalam};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
        }
    }
    
    public void tampil_Tamu(){
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Tanggal Cek In","Jam Cek In"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_tamu.setModel(tabmode);
        try {
            String sql = "SELECT tb_tamu.*,  tb_kamar.* FROM tb_tamu, tb_kamar WHERE tb_tamu.kode_kamar=tb_kamar.kode_kamar ORDER BY tb_kamar.kode_kamar asc";
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
                String tgl_cek_in = hasil.getString("tgl_cek_in");
                String jam_cek_in = hasil.getString("jam_cek_in");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, tgl_cek_in, jam_cek_in};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void cari_Tamu(){
        String cari = t_cari_tamu.getText();
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Tanggal Cek In","Jam Cek In"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_tamu.setModel(tabmode);
        try{
            String sql = "SELECT tb_tamu.*, tb_kamar.* FROM tb_tamu INNER JOIN tb_kamar ON tb_tamu.kode_kamar=tb_kamar.kode_kamar WHERE "
                    + "no_tamu like '%"+cari+"%' "
                    + "OR nama_tamu like '%"+cari+"%' "
                    + "OR jenis_kelamin like '%"+cari+"%' "
                    + "OR alamat like '%"+cari+"%' "
                    + "OR no_tlp like '%"+cari+"%' "
                    + "OR tb_tamu.kode_kamar like '%"+cari+"%' "
                    + "OR lantai like '%"+cari+"%' "
                    + "OR no_kamar like '%"+cari+"%' "
                    + "OR tipe_kamar like '%"+cari+"%' "
                    + "OR tgl_cek_in like '%"+cari+"%' "
                    + "OR jam_cek_in like '%"+cari+"%' "
                    + "order by tb_tamu.kode_kamar asc";
            Statement stmt=conn.createStatement();
            ResultSet hasil=stmt.executeQuery(sql);
            while(hasil.next()){
                String no_tamu = hasil.getString("no_tamu");
                String nama_tamu = hasil.getString("nama_tamu");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("tb_tamu.kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String tgl_cek_in = hasil.getString("tgl_cek_in");
                String jam_cek_in = hasil.getString("jam_cek_in");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, tgl_cek_in, jam_cek_in};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
        }
    }
        
    private void b_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_logoutActionPerformed
        // TODO add your handling code here:
        new FormLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_logoutActionPerformed

    private void t_cari_tamuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cari_tamuKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Tamu();
        }
    }//GEN-LAST:event_t_cari_tamuKeyTyped

    private void b_cari_kamar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cari_kamar2ActionPerformed
        cari_Tamu();
    }//GEN-LAST:event_b_cari_kamar2ActionPerformed

    private void b_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_historyActionPerformed
        FormHistoryTamu form_history = new FormHistoryTamu(this, rootPaneCheckingEnabled);
        form_history.setVisible(true);
    }//GEN-LAST:event_b_historyActionPerformed

    private void b_cekoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cekoutActionPerformed
        FormCheckOut form_cekout = new FormCheckOut(this, rootPaneCheckingEnabled);
        form_cekout.ketemu_Tamu();
        form_cekout.l_judul.setText("CEK OUT");
        int baris = tbl_tamu.getSelectedRow();
        String kode = (String)tbl_tamu.getValueAt(baris, 0);
        form_cekout.c_no_tamu.setSelectedItem(kode);
        form_cekout.cari_ID_Tamu();
        form_cekout.cari_Kode_Kamar();
        form_cekout.hitung_Hari();
        form_cekout.hitung_TotalBayar();
        form_cekout.setVisible(true);
    }//GEN-LAST:event_b_cekoutActionPerformed

    private void b_tambah_tamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambah_tamuActionPerformed
        FormCheckIn form_cekin = new FormCheckIn(this, rootPaneCheckingEnabled);
        form_cekin.l_judul.setText("CEK IN");
        form_cekin.ketemu_kamar();
        form_cekin.setVisible(true);
    }//GEN-LAST:event_b_tambah_tamuActionPerformed

    private void b_refersh_tamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refersh_tamuActionPerformed
        // TODO add your handling code here:
        tampil_Tamu();
    }//GEN-LAST:event_b_refersh_tamuActionPerformed

    private void t_cari_kamarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cari_kamarKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Kamar();
        }
    }//GEN-LAST:event_t_cari_kamarKeyTyped

    private void b_cari_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cari_kamarActionPerformed
        cari_Kamar();
    }//GEN-LAST:event_b_cari_kamarActionPerformed

    private void b_delete_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_delete_kamarActionPerformed
        int baris = tbl_kamar.getSelectedRow();
        String kode = (String)tbl_kamar.getValueAt(baris, 0);
        int ok = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus data Kamar\n Dengan Kode Kamar : "+ kode +"..?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok == 0){
            try{
                String sql="DELETE FROM tb_kamar WHERE kode_kamar ='"+kode+"'";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Menghapus data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_kamar();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Meghapus data GAGAL"+e.getMessage(),"Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_b_delete_kamarActionPerformed

    private void b_edit_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_edit_kamarActionPerformed
        FormAddEditKamar f_t_e_kamar = new FormAddEditKamar(this, rootPaneCheckingEnabled);
        f_t_e_kamar.l_judul.setText("EDIT DATA KAMAR");
        int baris = tbl_kamar.getSelectedRow();
        String kode = (String)tbl_kamar.getValueAt(baris, 0);
        f_t_e_kamar.t_kode_kamar.setText(kode);
        f_t_e_kamar.t_kode_kamar.setEnabled(false);
        f_t_e_kamar.cari_Kode_kamar();
        f_t_e_kamar.setVisible(true);
    }//GEN-LAST:event_b_edit_kamarActionPerformed

    private void b_tambah_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambah_kamarActionPerformed
        FormAddEditKamar f_t_e_kamar = new FormAddEditKamar(this, rootPaneCheckingEnabled);
        f_t_e_kamar.l_judul.setText("TAMBAH KAMAR");
        f_t_e_kamar.t_kode_kamar.setText(null);
        f_t_e_kamar.t_kode_kamar.setEnabled(true);
        f_t_e_kamar.setVisible(true);
    }//GEN-LAST:event_b_tambah_kamarActionPerformed

    private void b_refersh_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refersh_kamarActionPerformed
        // TODO add your handling code here:
        tampil_kamar();
    }//GEN-LAST:event_b_refersh_kamarActionPerformed

    private void t_cari_karyawanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cari_karyawanKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Karyawan();
        }
    }//GEN-LAST:event_t_cari_karyawanKeyTyped

    private void b_cari_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cari_karyawanActionPerformed
        cari_Kamar();
    }//GEN-LAST:event_b_cari_karyawanActionPerformed

    private void b_delete_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_delete_karyawanActionPerformed
        int baris = tbl_karyawan.getSelectedRow();
        String id_karyawan = (String)tbl_karyawan.getValueAt(baris, 0);
        int ok = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus data Karyawan\n Dengan ID : "+ id_karyawan +"..?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok == 0){
            try{
                //panggil method koneksi
                String sql="DELETE FROM tb_karyawan WHERE id_karyawan ='"+id_karyawan+"'";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Menghapus data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_karyawan();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Meghapus data GAGAL");
            }
        }
    }//GEN-LAST:event_b_delete_karyawanActionPerformed

    private void b_edit_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_edit_karyawanActionPerformed
        // TODO add your handling code here:
        FormAddEditKaryawan f_t_e_karyawan = new FormAddEditKaryawan(this, rootPaneCheckingEnabled);
        f_t_e_karyawan.l_judul.setText("EDIT DATA KARYAWAN");
        int baris = tbl_karyawan.getSelectedRow();
        String id_karyawan = (String)tbl_karyawan.getValueAt(baris, 0);
        f_t_e_karyawan.t_id_karyawan.setText(id_karyawan);
        f_t_e_karyawan.t_id_karyawan.setEnabled(false);
        f_t_e_karyawan.cari_Id();
        f_t_e_karyawan.setVisible(true);
    }//GEN-LAST:event_b_edit_karyawanActionPerformed

    private void b_tambah_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambah_karyawanActionPerformed
        FormAddEditKaryawan f_t_e_karyawan = new FormAddEditKaryawan(this, rootPaneCheckingEnabled);
        f_t_e_karyawan.l_judul.setText("TAMBAH KARYAWAN");
        f_t_e_karyawan.t_id_karyawan.setText(null);
        f_t_e_karyawan.t_id_karyawan.setEnabled(true);
        f_t_e_karyawan.setVisible(true);
    }//GEN-LAST:event_b_tambah_karyawanActionPerformed

    private void b_refersh_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refersh_karyawanActionPerformed
        // TODO add your handling code here:
        tampil_karyawan();
        t_cari_karyawan.setText(null);
    }//GEN-LAST:event_b_refersh_karyawanActionPerformed
    
//    private void reset_tamu(){
//        c_id_tamu.setSelectedIndex(0);
//        l_nama_tamu.setText("-");
//        l_jk_tamu.setText("-");
//        l_alamat_tamu.setText("-");
//        l_no_hp_tamu.setText("-");
//    }
//    
//    public void ketemu_id_tamu(){
//        try {
//            String sql = "SELECT * FROM tb_tamu order by no_tamu asc";
//            Statement stat = conn.createStatement();
//            ResultSet hasil = stat.executeQuery(sql);
//            while (hasil.next()){
//                String no_tamu = hasil.getString("no_tamu");
//                c_id_tamu.addItem(no_tamu);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Kode Kamar TIDAK DITEMUKAN","Informasi", JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
//    
//    public void cari_id_tamu(){
//        String sql = "SELECT * FROM tb_tamu WHERE no_tamu='"+ c_id_tamu.getSelectedItem()+"'";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()){
//                l_nama_tamu.setText(rs.getString("nama_tamu"));
//                l_jk_tamu.setText(rs.getString("jenis_kelamin"));
//                l_alamat_tamu.setText(rs.getString("alamat"));
//                l_no_hp_tamu.setText(rs.getString("no_tlp"));
//                l_info.setText(null);
//            }
//            else {
//                l_info.setText("ID Tamu TIDAK COCOK");
//                reset_tamu();
//            }
//        } catch (SQLException | HeadlessException e) {
//            JOptionPane.showMessageDialog(null, e,"Informasi", JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
//    
//    public void tampil_transaksi_menu(){
//        Object []baris = {"Tanggal Transaksi","Nama Nama Menu","Harga","Jumlah Beli","Sub Total"};
//        tabmode = new DefaultTableModel(null, baris);
//        tbl_transaksi_penjualan.setModel(tabmode);
//        try {
//            String sql = "SELECT * FROM tb_transaksi_penjualan WHERE no_tamu='"+c_id_tamu.getSelectedItem()+"' order by tgl_transaksi asc";
//            Statement stat = conn.createStatement();
//            ResultSet hasil = stat.executeQuery(sql);
//            
//            while (hasil.next()){
//                String tgl_transaksi = hasil.getString("tgl_transaksi");
//                String nama_menu = hasil.getString("nama_menu");
//                String harga_menu = hasil.getString("harga_menu");
//                String jml_beli = hasil.getString("jml_beli");
//                //lama_menginap = Integer.parseInt(l_lama_meginap.getText());
//                int sub_total = Integer.parseInt(harga_menu) * Integer.parseInt(jml_beli);
//                String[] data = {tgl_transaksi, nama_menu, harga_menu, jml_beli, String.valueOf(sub_total)};
//                tabmode.addRow(data);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Menampilkan data Transaksi GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
    
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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cari_kamar;
    private javax.swing.JButton b_cari_kamar2;
    private javax.swing.JButton b_cari_karyawan;
    private javax.swing.JButton b_cekout;
    private javax.swing.JButton b_delete_kamar;
    public javax.swing.JButton b_delete_karyawan;
    private javax.swing.JButton b_edit_kamar;
    public javax.swing.JButton b_edit_karyawan;
    private javax.swing.JButton b_history;
    private javax.swing.JButton b_logout;
    private javax.swing.JButton b_refersh_kamar;
    public javax.swing.JButton b_refersh_karyawan;
    private javax.swing.JButton b_refersh_tamu;
    private javax.swing.JButton b_tambah_kamar;
    public javax.swing.JButton b_tambah_karyawan;
    private javax.swing.JButton b_tambah_tamu;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel l_admin;
    public javax.swing.JLabel l_id_admin;
    public javax.swing.JLabel l_id_admin1;
    private javax.swing.JLabel l_jam;
    private javax.swing.JLabel l_tanggal;
    private javax.swing.JPanel panel_kamar;
    private javax.swing.JPanel panel_karyawan;
    private javax.swing.JPanel panel_tamu;
    private javax.swing.JTextField t_cari_kamar;
    private javax.swing.JTextField t_cari_karyawan;
    private javax.swing.JTextField t_cari_tamu;
    private javax.swing.JTable tbl_kamar;
    private javax.swing.JTable tbl_karyawan;
    private javax.swing.JTable tbl_tamu;
    // End of variables declaration//GEN-END:variables
}
