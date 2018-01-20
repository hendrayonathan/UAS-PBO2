/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpussederhana;

import javax.swing.JOptionPane;
import java.sql.*;

public class formBuku extends javax.swing.JFrame {

String judulKolom[] = {"Nomor Buku","Judul","Pengarang","Tahun","Jenis Buku"};
String sqlBuku = "SELECT*from buku";
int lebarKolom[] = {100,150,200,60,100};
    
public formBuku() {
        initComponents();
        this.setLocationRelativeTo(null); // untuk memposisikan form ditengah layar
        new ConfigDB().tampilTabel(judulKolom, sqlBuku, JTableBuku);
        new ConfigDB().aturLebarKolom(JTableBuku, lebarKolom);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNoBuku = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        cmbJenis = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableBuku = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("No. Buku");

        jLabel2.setText("Judul");

        jLabel3.setText("Pengarang");

        jLabel4.setText("Tahun");

        jLabel5.setText("Jenis Buku");

        txtNoBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoBukuActionPerformed(evt);
            }
        });

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });

        txtPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPengarangActionPerformed(evt);
            }
        });

        txtTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunActionPerformed(evt);
            }
        });

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".: Pilih Jenis Buku:.", "Sastra", "Fiksi", "Iptek", "Novel", "Komik", "Sejarah" }));

        JTableBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableBuku);

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
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

        jLabel7.setText("Pencarian Judul Buku");
        jLabel7.setName(""); // NOI18N

        txtCari.setName("txtCari"); // NOI18N
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear))
                            .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKeluar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh)
                    .addComponent(btnKeluar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoBukuActionPerformed

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void txtPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPengarangActionPerformed

    private void txtTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTahunActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    try {
        if (txtNoBuku.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Nomor Buku belum diisi");
        txtNoBuku.requestFocus();
        } else
        if (txtJudul.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Judul buku belum diisi");
        txtJudul.requestFocus();
        } else
        if (String.valueOf(cmbJenis.getSelectedItem())==".: Pilih Jenis Buku:."){
        JOptionPane.showMessageDialog(null,"Jenis Buku belum diisi");
        cmbJenis.requestFocus();
        } else
        if (txtTahun.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Tahun belum diisi");}
        if (txtPengarang.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Pengarang buku belum diisi");
        txtPengarang.requestFocus();
        }else
        if (new ConfigDB().duplikasiData("buku","NoBuku",txtNoBuku.getText())==true){
        JOptionPane.showMessageDialog(null,"Nomor Buku sudah terdaftar");
        Statement st = new ConfigDB().koneksi.createStatement();
        ResultSet rs = st.executeQuery("SELECT*FROM buku WHERE NoBuku='"+txtNoBuku.getText()+"'");
        if (rs.next()){
        txtJudul.setText(rs.getString("Judul"));
        txtPengarang.setText(rs.getString("Pengarang"));
        txtTahun.setText(rs.getString("Tahun"));
        cmbJenis.setSelectedItem(String.valueOf(rs.getString("JenisBuku")));
        }
        }else{
        String SQL="INSERT INTO buku VALUES ('"+txtNoBuku.getText()+"','"+txtJudul.getText()
        +"','"+txtPengarang.getText()+"','"+txtTahun.getText()+"','"+
        String.valueOf(cmbJenis.getSelectedItem()) +"')";
        new ConfigDB().simpanData(SQL);
        new ConfigDB().tampilTabel(judulKolom, sqlBuku, JTableBuku);
        new ConfigDB().aturLebarKolom(JTableBuku, lebarKolom);
        }
        } catch (Exception e) {  
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
    try {
        if (
        (txtNoBuku.getText().isEmpty()) && (txtJudul.getText().isEmpty()) &&
        (txtPengarang.getText().isEmpty()) && (txtTahun.getText().isEmpty()) &&
        (String.valueOf(cmbJenis.getSelectedItem())==".: Pilih Jenis Buku:.")
        )
        {
        JOptionPane.showMessageDialog(null,"Silahkan Pilih Data dulu untuk proses Ubah");
        JTableBuku.requestFocus();
        } else
        {
        String SQL="UPDATE buku SET judul='"+txtJudul.getText()+"', JenisBuku='"+String.valueOf(cmbJenis.getSelectedItem())
        +"', Tahun='"+txtTahun.getText()+"', Pengarang='"+txtPengarang.getText()+"',"
        + "WHERE NoBuku='"+txtNoBuku.getText()+"'";
        new ConfigDB().ubahData(SQL);
        new ConfigDB().tampilTabel(judulKolom, sqlBuku, JTableBuku);
        new ConfigDB().aturLebarKolom(JTableBuku, lebarKolom);
        }
        } catch (Exception e)
        {
        System.out.print(e.toString());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    try {
        if (
        (txtNoBuku.getText().isEmpty()) && (txtJudul.getText().isEmpty()) &&
        (txtPengarang.getText().isEmpty()) && (txtTahun.getText().isEmpty()) &&
        
        (String.valueOf(cmbJenis.getSelectedItem())==".: Pilih Jenis Buku:.")
        )
        {
        JOptionPane.showMessageDialog(null,"Silahkan Pilih Data dulu untuk proses Hapus");
        JTableBuku.requestFocus();
        } else
        {
        String SQL="DELETE FROM buku WHERE NoBuku='"+txtNoBuku.getText()+"'";
        new ConfigDB().hapusData(SQL);
        new ConfigDB().tampilTabel(judulKolom, sqlBuku, JTableBuku);
        new ConfigDB().aturLebarKolom(JTableBuku, lebarKolom);
        }
        }
    catch (Exception e)
        {
        System.out.print(e.toString());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    txtNoBuku.setText(null);
    txtJudul.setText(null);
    txtPengarang.setText(null);
    txtTahun.setText(null);
    cmbJenis.setSelectedItem(String.valueOf(".: Pilih Jenis Buku:."));
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
      
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        new ConfigDB().tampilTabel(judulKolom, sqlBuku, JTableBuku);
        new ConfigDB().aturLebarKolom(JTableBuku, lebarKolom);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void JTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableBukuMouseClicked
     try {
        int baris = JTableBuku.getSelectedRow();
        txtNoBuku.setText(String.valueOf(JTableBuku.getValueAt(baris,0)));
        txtJudul.setText(String.valueOf(JTableBuku.getValueAt(baris,1)));
        txtPengarang.setText(String.valueOf(JTableBuku.getValueAt(baris,2)));
        txtTahun.setText(String.valueOf(JTableBuku.getValueAt(baris,3)));
        cmbJenis.setSelectedItem(String.valueOf(JTableBuku.getValueAt(baris,4)));
        }
    catch (Exception e) {
        System.out.print(e.toString());
        }
    }//GEN-LAST:event_JTableBukuMouseClicked

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
      try {
            String SQL="SELECT*FROM buku WHERE judul like '%"+txtCari.getText()+"%'";
            new ConfigDB().cariData(judulKolom, SQL, JTableBuku);
        }
        catch (Exception e) {
            System.out.print(e.toString());
        }
    }//GEN-LAST:event_txtCariKeyPressed

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
            java.util.logging.Logger.getLogger(formBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableBuku;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtNoBuku;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
