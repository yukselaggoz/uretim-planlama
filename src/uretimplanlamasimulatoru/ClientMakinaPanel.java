package uretimplanlamasimulatoru;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientMakinaPanel extends javax.swing.JFrame implements FrameBehaviorMakina{
    public String makinaAdi;
    public String makinaTuru;
    public String makinaID;
    private static InetAddress host;
    public ClientMakina server = null; 

    public ClientMakinaPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtServerIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtServerPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMakinaAdi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMakinaID = new javax.swing.JTextField();
        btnConnnect = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMesaj = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMakinaMesajlari = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtMakinaTuru = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sunucu IP Adresi:");

        txtServerIP.setText("192.168.122.178");
        txtServerIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServerIPActionPerformed(evt);
            }
        });

        jLabel2.setText("Port:");

        txtServerPort.setText("1234");
        txtServerPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServerPortActionPerformed(evt);
            }
        });

        jLabel3.setText("Makina İsmi:");

        txtMakinaAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakinaAdiActionPerformed(evt);
            }
        });

        jLabel4.setText("Makina ID'si:");

        txtMakinaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakinaIDActionPerformed(evt);
            }
        });

        btnConnnect.setText("Sunucuya Bağlan");
        btnConnnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnnectActionPerformed(evt);
            }
        });

        jLabel5.setText("Personelin isteğini cevapla:");

        txtMesaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesajActionPerformed(evt);
            }
        });

        btnSend.setText("Gönder");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtMakinaMesajlari.setColumns(20);
        txtMakinaMesajlari.setRows(5);
        jScrollPane1.setViewportView(txtMakinaMesajlari);

        jLabel6.setText("Makina Türü:");

        txtMakinaTuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakinaTuruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMakinaTuru))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMakinaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMakinaID)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnConnnect))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMesaj))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSend)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnConnnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtServerPort)
                            .addComponent(txtServerIP)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMakinaAdi)
                            .addComponent(txtMakinaID)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMakinaTuru)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMesaj)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnnectActionPerformed
        try {
            makinaAdi = txtMakinaAdi.getText();
            makinaTuru = txtMakinaTuru.getText();
            makinaID = txtMakinaID.getText();
            host = InetAddress.getByName(txtServerIP.getText());
            Socket client = new Socket(host,Integer.parseInt(txtServerPort.getText()));
            server = new ClientMakina(client,this);
            server.myOutputMessages.add("MakinaAdi " + makinaAdi);
            server.myOutputMessages.add("MakinaTuru " + makinaTuru);
            server.myOutputMessages.add("MakinaID " + makinaID);
            printResult("Bağlanıldı.");
            btnConnnect.setEnabled(false);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientMakinaPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientMakinaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConnnectActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        server.myOutputMessages.add("Mesaj "+ txtMesaj.getText());
        printResult("Giden:" +  txtMesaj.getText());
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtServerIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServerIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServerIPActionPerformed

    private void txtServerPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServerPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServerPortActionPerformed

    private void txtMakinaAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakinaAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakinaAdiActionPerformed

    private void txtMakinaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakinaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakinaIDActionPerformed

    private void txtMesajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesajActionPerformed
        btnSendActionPerformed(evt);
    }//GEN-LAST:event_txtMesajActionPerformed

    private void txtMakinaTuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakinaTuruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakinaTuruActionPerformed

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
            java.util.logging.Logger.getLogger(ClientMakinaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMakinaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMakinaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMakinaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientMakinaPanel().setVisible(true);
            }
        });
    }

    @Override
    public void makeAction(String msg, ClientMakina sender) {
        printResult(msg);
        repaint();
    }
    
    public void printResult(String msg){
        txtMakinaMesajlari.setText(txtMakinaMesajlari.getText() + "\n"  + msg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnnect;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMakinaAdi;
    private javax.swing.JTextField txtMakinaID;
    private javax.swing.JTextArea txtMakinaMesajlari;
    private javax.swing.JTextField txtMakinaTuru;
    private javax.swing.JTextField txtMesaj;
    private javax.swing.JTextField txtServerIP;
    private javax.swing.JTextField txtServerPort;
    // End of variables declaration//GEN-END:variables

}
