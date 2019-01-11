package uretimplanlamasimulatoru;

public class ServerMerkezPanel extends javax.swing.JFrame implements FrameBehaviorMakina,FrameBehaviorPersonel{
    

    public ServerMerkezPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtServerPort = new javax.swing.JTextPane();
        btnServerStart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPersonelEmirleri = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMakinaRaporlari = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtServerPort.setText("1234");
        jScrollPane1.setViewportView(txtServerPort);

        btnServerStart.setText("Sunucuyu Başlat");
        btnServerStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServerStartActionPerformed(evt);
            }
        });

        txtPersonelEmirleri.setColumns(20);
        txtPersonelEmirleri.setRows(5);
        jScrollPane2.setViewportView(txtPersonelEmirleri);

        txtMakinaRaporlari.setColumns(20);
        txtMakinaRaporlari.setRows(5);
        jScrollPane3.setViewportView(txtMakinaRaporlari);

        jLabel1.setText("Port:");

        jLabel2.setText("Personel Üretim Emirleri:");

        jLabel3.setText("Makina Bitiş Raporları:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnServerStart))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnServerStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnServerStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServerStartActionPerformed
        ServerListenerPersonel newHostingPersonel = new ServerListenerPersonel(txtServerPort.getText(), this);
        newHostingPersonel.start();
        printPersonelResult("Server Started");
        //ServerListenerMakina newHostingMakina = new ServerListenerMakina(txtServerPort.getText(), this);
        //newHostingMakina.start();
        //printMakinaResult("Server Started");
        btnServerStart.setEnabled(false);
    }//GEN-LAST:event_btnServerStartActionPerformed

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
            java.util.logging.Logger.getLogger(ServerMerkezPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerMerkezPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerMerkezPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerMerkezPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerMerkezPanel().setVisible(true);
            }
        });
    }

    @Override
    public void makeAction(String msg, ClientMakina sender) {
        String mParsed[] = msg.split(" ");
       
        if(mParsed.length >= 3)
        {
            if(mParsed[0].equals("MakinaAdi"))
            {
                sender.makinaAdi = mParsed[1];
            }
            if (mParsed[2].equals("MakinaTuru")) {
                sender.makinaTuru = mParsed[3];
            }
            if(mParsed[0].equals("Mesaj"))
            {
                for (ClientPersonel clt : InfoPersoneller.clientpersoneller) {
                    clt.myOutputMessages.add("Makina Adı: " + sender.makinaAdi + "Makina Türü: " + sender.makinaTuru + " Mesaj: " + msg);
                }
            }
        }
        printMakinaResult(msg);
        repaint();
    }

    @Override
    public void makeAction(String msg, ClientPersonel sender) {
        String mParsed[] = msg.split(" ");
       
        if(mParsed.length >= 2)
        {
            if(mParsed[0].equals("KullaiciAdi"))
            {
                sender.kullaniciAdi = mParsed[1];
            }
            if (mParsed[2].equals("Sifre")) {
                sender.sifre = mParsed[3];
            }
            if(mParsed[0].equals("Mesaj"))
            {
                for (ClientPersonel clt : InfoPersoneller.clientpersoneller) {
                    clt.myOutputMessages.add("Kullanici: " + sender.kullaniciAdi + " Mesaj " + msg);
                }
            }
        }
        printPersonelResult(msg);
        repaint();
    }
    
    public void printMakinaResult(String msg){
        txtMakinaRaporlari.setText(txtMakinaRaporlari.getText() + "\n"  + msg);
    }
    public void printPersonelResult(String msg){
        txtPersonelEmirleri.setText(txtPersonelEmirleri.getText() + "\n"  + msg);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnServerStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtMakinaRaporlari;
    private javax.swing.JTextArea txtPersonelEmirleri;
    private javax.swing.JTextPane txtServerPort;
    // End of variables declaration//GEN-END:variables

}
