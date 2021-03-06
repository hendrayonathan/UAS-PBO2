/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpussederhana;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;



public class formPinjam extends javax.swing.JFrame {
String judulPinjam[] = {"ID Pinjam","ID Anggota","Nomor Buku","Tanggal Pinjam","Tanggal Kembali"};
String sqlPinjam = "SELECT*from pinjam";
int lebarKolom[] = {100,100,100,150,300};

    public formPinjam() {
        initComponents();
        this.setLocationRelativeTo(null);
        new ConfigDB().tampilTabel(judulPinjam, sqlPinjam, JTablePinjam);
        new ConfigDB().aturLebarKolom(JTablePinjam, lebarKolom);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDPinjam = new javax.swing.JTextField();
        txtIDAnggota = new javax.swing.JTextField();
        txtTglPinjam = new com.toedter.calendar.JDateChooser();
        txtTglKembali = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePinjam = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtNoBuku = new javax.swing.JTextField();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID Pinjam");

        jLabel2.setText("ID Anggota");

        jLabel6.setText("Tanggal Pinjam");

        jLabel7.setText("Tanggal Kembali");

        jLabel4.setText("Nomor Buku");

        txtIDPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDPinjamActionPerformed(evt);
            }
        });
        txtIDPinjam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDPinjamKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDPinjamKeyReleased(evt);
            }
        });

        txtIDAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDAnggotaActionPerformed(evt);
            }
        });

        txtTglPinjam.setDateFormatString("yyyy-MM-dd");

        txtTglKembali.setDateFormatString("yyyy-MM-dd");

        JTablePinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTablePinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTablePinjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTablePinjam);

        btnSimpan.setText("PROSES PINJAMAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNoBuku, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIDAnggota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTglPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnHapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnClear)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKeluar)))
                        .addGap(0, 5, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIDPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)
                        .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSimpan)
                        .addComponent(btnHapus)
                        .addComponent(btnClear)
                        .addComponent(btnKeluar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDPinjamActionPerformed

    private void txtIDPinjamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDPinjamKeyPressed
  

    }//GEN-LAST:event_txtIDPinjamKeyPressed

    private void txtIDPinjamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDPinjamKeyReleased

    }//GEN-LAST:event_txtIDPinjamKeyReleased

    private void txtIDAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDAnggotaActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            if (txtIDPinjam.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"ID Peminjam belum diisi");
                txtIDPinjam.requestFocus();
            } else
            if (txtIDAnggota.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"ID Anggota belum diisi");
                txtIDAnggota.requestFocus();
            }else
            if (txtNoBuku.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Nomor Buku belum diisi");
                txtNoBuku.requestFocus();
            } else
            if (new ConfigDB().duplikasiData("pinjam","IDPinjam",txtIDPinjam.getText())==true){
                JOptionPane.showMessageDialog(null,"ID Peminjaman sudah terdaftar");
                Statement st = new ConfigDB().koneksi.createStatement();
                ResultSet rs = st.executeQuery("SELECT*FROM pinjam WHERE IDPinjam='"+txtIDPinjam.getText()+"'");
                if (rs.next()){
                    txtIDAnggota.setText(rs.getString("IDAnggota"));
                    txtNoBuku.setText(rs.getString("NoBuku"));
                    SimpleDateFormat p = new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd");
                    txtTglPinjam.setDate(p.parse(rs.getString("tgl_pinjam")));
                    txtTglKembali.setDate(k.parse(rs.getString("tgl_kembali")));
                }
            }else{
                SimpleDateFormat sdp = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                SimpleDateFormat sdk = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String TGLP =sdp.format(txtTglPinjam.getDate());
                String TGLK =sdk.format(txtTglKembali.getDate());
                
                String SQL="INSERT INTO pinjam VALUES ('"+txtIDPinjam.getText()
                +"','"+txtIDAnggota.getText()+"','"+txtNoBuku.getText()+"','"+TGLP+"','"+TGLK+"')";
                new ConfigDB().simpanData(SQL);
                new ConfigDB().tampilTabel(judulPinjam, sqlPinjam, JTablePinjam);
                new ConfigDB().aturLebarKolom(JTablePinjam, lebarKolom);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            if (
                (txtIDPinjam.getText().isEmpty()) && (txtIDAnggota.getText().isEmpty()) &&
                (txtNoBuku.getText().isEmpty()) && (txtTglPinjam.getDate().equals(null)) &&
                (txtTglKembali.getDate().equals(null))
            )
            {
                JOptionPane.showMessageDialog(null,"Silahkan Pilih Data dulu untuk proses Hapus");
                JTablePinjam.requestFocus();
            } else
            {
                String SQL="DELETE FROM pinjam WHERE IDPinjam='"+txtIDPinjam.getText()+"'";
                new ConfigDB().hapusData(SQL);
                new ConfigDB().tampilTabel(judulPinjam, sqlPinjam, JTablePinjam);
                new ConfigDB().aturLebarKolom(JTablePinjam, lebarKolom);
            }
        }
        catch (Exception e)
        {
            System.out.print(e.toString());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtNoBuku.setText(null);
        txtIDAnggota.setText(null);
        txtIDPinjam.setText(null);
        txtTglKembali.setDate(null);
        txtTglPinjam.setDate(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void JTablePinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablePinjamMouseClicked
    try {
        int baris = JTablePinjam.getSelectedRow();
        txtIDPinjam.setText(String.valueOf(JTablePinjam.getValueAt(baris,0)));
        txtIDAnggota.setText(String.valueOf(JTablePinjam.getValueAt(baris,1)));
        txtNoBuku.setText(String.valueOf(JTablePinjam.getValueAt(baris,2)));
        SimpleDateFormat sdp = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdk = new SimpleDateFormat("yyyy-MM-dd");
        txtTglPinjam.setDate(sdp.parse(String.valueOf(JTablePinjam.getValueAt(baris,3))));
        txtTglKembali.setDate(sdk.parse(String.valueOf(JTablePinjam.getValueAt(baris,4))));
        }
    catch (Exception e) {
        System.out.print(e.toString());
        }
    }//GEN-LAST:event_JTablePinjamMouseClicked

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(formPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablePinjam;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIDAnggota;
    private javax.swing.JTextField txtIDPinjam;
    private javax.swing.JTextField txtNoBuku;
    private com.toedter.calendar.JDateChooser txtTglKembali;
    private com.toedter.calendar.JDateChooser txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}
