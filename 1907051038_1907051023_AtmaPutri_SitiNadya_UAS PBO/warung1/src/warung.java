import javax.swing.JOptionPane;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author User
 */
public class warung extends javax.swing.JFrame {
 
    private int total;
 
    /**
     * Creates new form warung1
     */
    public warung() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
 
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cbpaket = new javax.swing.JComboBox<>();
        txtpajak = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnpesan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        txtjumlah = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Warung Eresha");
        setBackground(new java.awt.Color(255, 102, 102));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
 
        txtarea.setColumns(20);
        txtarea.setRows(5);
        txtarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtarea);
 
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 180));
 
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("JUMLAH PESANAN");
        jLabel1.setAutoscrolls(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, 30));
 
        cbpaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - PILIH PAKET DISINI- - - ", "PAKET 1", "PAKET 2", "PAKET 3" }));
        cbpaket.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbpaketItemStateChanged(evt);
            }
        });
        cbpaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpaketActionPerformed(evt);
            }
        });
        getContentPane().add(cbpaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 190, -1));
        getContentPane().add(txtpajak, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 100, -1));
 
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("PAJAK 10%");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, 30));
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 100, -1));
 
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("TOTAL BAYAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 30));
 
        btnpesan.setText("PESAN");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });
        getContentPane().add(btnpesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 90, -1));
 
        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 80, -1));
 
        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 40, -1));
 
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/akk.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));
 
        setSize(new java.awt.Dimension(627, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>                        
 
    private void cbpaketActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }                                       
 
    private void cbpaketItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
         int nasi, ayam_bakar, tahu, tempe, lalap ,telor;
        int air_mineral,sambal, sayur_asem, ikan_bakar;
 
        int menu=cbpaket.getSelectedIndex();
        switch(menu){
            case 0:
                break;
            case 1:
                txtjumlah.setText("");
                txttotal.setText("");
                txtpajak.setText("");
                txtarea.setText(" PAKET 1 \n");
                nasi=3000;
                txtarea.append(" Nasi                : "+nasi);
                ayam_bakar=7000;
                txtarea.append("\n Ayam Bakar   : "+ayam_bakar);
                tahu=1000;
                txtarea.append("\n Tahu               : "+tahu);
                tempe=1000;
                txtarea.append("\n Tempe           : "+tempe);
                sambal=1000;
                txtarea.append("\n Sambal          : " +sambal);
                lalap=2000;
                txtarea.append("\n Lalapan         : " +lalap);
                air_mineral=3000;
                txtarea.append("\n Air Mineral     : " +air_mineral);
                total = nasi+ayam_bakar+tahu+tempe+sambal+lalap+air_mineral;
                txtarea.append("\n ----------------------------");
                txtarea.append("\n Total Harga Paket 1 = "+total);
                break;
            case  2:
                txtjumlah.setText("");
                txttotal.setText("");
                txtpajak.setText("");
                txtarea.setText(" PAKET 2 \n");
                nasi=3000;
                txtarea.append(" Nasi                : "+nasi);
                ikan_bakar=5000;
                txtarea.append("\n Ikan Bakar     : "+ikan_bakar);
                tahu=1000;
                txtarea.append("\n Tahu               : "+tahu);
                tempe=1000;
                txtarea.append("\n Tempe           : "+tempe);
                sambal=1000;
                txtarea.append("\n Sambal          : " +sambal);
                lalap=2000;
                txtarea.append("\n Lalapan         : " +lalap);
                air_mineral=3000;
                txtarea.append("\n Air Mineral     : " +air_mineral);
                total=(nasi+ikan_bakar+tahu+tempe+sambal+lalap+air_mineral);
                txtarea.append("\n ----------------------------");
                txtarea.append("\n Total Harga Paket 2 = "+total);
                break;
                case  3:
                txtjumlah.setText("");
                txttotal.setText("");
                txtpajak.setText("");
                txtarea.setText(" PAKET 3 \n");
                nasi=3000;
                txtarea.append(" Nasi                : "+nasi);
                telor=5000;
                txtarea.append("\n Telor               : "+telor);
                sayur_asem=1500;
                txtarea.append("\n Sayur Asem  : "+sayur_asem);
                tahu=1000;
                txtarea.append("\n Tahu               : "+tahu);
                tempe=1000;
                txtarea.append("\n Tempe           : "+tempe);
                lalap=2000;
                txtarea.append("\n Lalapan         : " +lalap);
                air_mineral=3000;
                txtarea.append("\n Air Mineral     : " +air_mineral);
                total=(nasi+telor+sayur_asem+tahu+tempe+lalap+air_mineral);
                txtarea.append("\n ----------------------------");
                txtarea.append("\n Total Harga Paket 3 = "+total);
                break;
        }
    }                                        
 
    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int jumlah_pesanan = Integer.parseInt(txtjumlah.getText());
               int jumlah_total=total*jumlah_pesanan;
               int pajak = (jumlah_total)*10/100;
               txtpajak.setText(String.valueOf(pajak));
               int total_bayar = pajak+jumlah_total;
               txttotal.setText(String.valueOf(total_bayar));
    }                                         
 
    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         int jumlah_pesanan = Integer.parseInt(txtjumlah.getText());
               int jumlah_total=total*jumlah_pesanan;
               int pajak = (jumlah_total)*10/100;
               txtpajak.setText(String.valueOf(pajak));
               int total_bayar = pajak+jumlah_total;
               txttotal.setText(String.valueOf(total_bayar));
               JOptionPane.showMessageDialog(null,"Terima Kasih Anda Sudah Memesan!\n\nTotal Yang Harus Anda Bayar = "+total_bayar);
    }                                        
 
    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
                txtjumlah.setText("");
                txttotal.setText("");
                txtpajak.setText("");
                txtarea.setText("");
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
            java.util.logging.Logger.getLogger(warung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(warung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(warung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(warung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new warung().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnpesan;
    private javax.swing.JComboBox<String> cbpaket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtpajak;
    private javax.swing.JTextField txttotal;
    // End of variables declaration
}