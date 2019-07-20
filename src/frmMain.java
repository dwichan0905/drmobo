
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dwi Candra Permana
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        cmb_motherboard = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cmb_Bunyi = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtAnalysis = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dr. Mobo - Sistem Pakar Analisis Masalah Motherboard Komputer");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Merk Motherboard"));

        cmb_motherboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- PILIH MOTHERBOARD --", "AMIBIOS", "AWARD BIOS", "DELL", "IBM BIOS", "MACINTOSH", "PHOENIX BIOS" }));
        cmb_motherboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmb_motherboardMouseReleased(evt);
            }
        });
        cmb_motherboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_motherboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_motherboard, 0, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_motherboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pola Bunyi Beep"));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_Bunyi, 0, 317, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_Bunyi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Cek");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Hasil Analisis"));

        txtAnalysis.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAnalysis.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAnalysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAnalysis, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("Tentang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 242, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_motherboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_motherboardActionPerformed
        DefaultComboBoxModel mdl = new DefaultComboBoxModel();
        switch (cmb_motherboard.getSelectedIndex() ){
            case 0 :
                break;
            case 1 :
                mdl.addElement("1 Pendek");
                mdl.addElement("2 Pendek");
                mdl.addElement("3 Pendek");
                mdl.addElement("4 Pendek");
                mdl.addElement("5 Pendek");
                mdl.addElement("6 Pendek");
                mdl.addElement("7 Pendek");
                mdl.addElement("8 Pendek");
                mdl.addElement("9 Pendek");
                mdl.addElement("10 Pendek");
                mdl.addElement("11 Pendek");
                mdl.addElement("1 Panjang, 3 Pendek");
                mdl.addElement("1 Panjang, 8 Pendek");
                mdl.addElement("Dua Nada yang berbeda");
                break;
            case 2 :
                mdl.addElement("1 Panjang, 2 Pendek");
                mdl.addElement("1 Panjang, 3 Pendek");
                mdl.addElement("Berulang tanpa henti");
                mdl.addElement("Berulang-ulang dan bernada tinggi ketika PC dihidupkan");
                mdl.addElement("Bunyi nada tinggi dan nada rendah berulang-ulang");
 
                break;
            case 3 :
                mdl.addElement("1 Pendek");
                mdl.addElement("2 Pendek");
                mdl.addElement("3 Pendek");
                mdl.addElement("4 Pendek");
                mdl.addElement("5 Pendek");
                mdl.addElement("6 Pendek");
                mdl.addElement("7 Pendek");
                
                break;
            case 4 :
                mdl.addElement("Tidak ada bunyi");
                mdl.addElement("1 bunyi pendek");
                mdl.addElement("2 bunyi pendek");
                mdl.addElement("Bunyi terus-menerus");
                mdl.addElement("Bunyi pendek berulang-ulang");
                mdl.addElement("1 panjang dan 1 pendek");
                mdl.addElement("1 panjang dan 2 pendek");
                mdl.addElement("1 panjang dan 3 pendek");
                mdl.addElement("3 panjang");
                mdl.addElement("1 bunyi, tampilan kosong atau kacau");
                break;
            case 5 :
                mdl.addElement("Nada Error (dua bentuk nada berbeda)");
                mdl.addElement("Bunyi startup, putaran disk, tidak ada tampilan");
                mdl.addElement("Power menyala, tidak ada bunyi");
                mdl.addElement("Bunyi keras, 4 bunyi lebih keras");
                break;
            case 6 :
                mdl.addElement("1-1-1-1");
                mdl.addElement("1-1-1-3");
                mdl.addElement("1-1-2-1");
                mdl.addElement("1-1-2-3");
                mdl.addElement("1-1-3-1");
                mdl.addElement("1-1-3-2");
                mdl.addElement("1-1-3-3");
                mdl.addElement("1-1-4-1");
                mdl.addElement("1-1-4-3");
                mdl.addElement("1-2-1-1");
                mdl.addElement("1-2-1-2");
                mdl.addElement("1-2-1-3");
                mdl.addElement("1-2-2-1");
                mdl.addElement("1-2-2-3");
                mdl.addElement("1-2-3-1");
                mdl.addElement("1-2-3-3");
                mdl.addElement("1-2-4-1");
                mdl.addElement("1-3-1-1");
                mdl.addElement("1-3-1-3");
                mdl.addElement("1-3-2-1");
                mdl.addElement("1-3-3-1");
                mdl.addElement("1-3-3-3");
                mdl.addElement("1-3-4-1");
                mdl.addElement("1-3-4-3");
                mdl.addElement("1-4-1-3");
                mdl.addElement("1-4-2-4");
                mdl.addElement("1-4-3-1");
                mdl.addElement("1-4-3-2");
                mdl.addElement("1-4-3-3");
                mdl.addElement("1-4-4-1");
                mdl.addElement("1-4-4-2");
                mdl.addElement("2-1-1-1");
                mdl.addElement("2-1-1-3");
                mdl.addElement("2-1-2-1");
                mdl.addElement("2-1-2-3");
                mdl.addElement("2-1-2-4");
                mdl.addElement("2-1-3-1");
                mdl.addElement("2-1-3-2");
                mdl.addElement("2-1-3-3");
                mdl.addElement("2-1-4-1");
                mdl.addElement("2-1-4-3");
                mdl.addElement("2-2-1-1");
                mdl.addElement("2-2-1-3");
                mdl.addElement("2-2-2-1");
                mdl.addElement("2-2-2-3");
                mdl.addElement("2-2-3-1");
                mdl.addElement("2-2-3-3");
                mdl.addElement("2-2-4-1");
                mdl.addElement("2-3-1-1");
                mdl.addElement("2-3-1-3");
                mdl.addElement("2-3-2-1");
                mdl.addElement("2-3-2-3");
                mdl.addElement("2-3-3-1");
                mdl.addElement("2-3-3-3");
                mdl.addElement("2-3-4-1");
                mdl.addElement("2-3-4-3");
                mdl.addElement("2-4-1-1");
                mdl.addElement("2-4-1-3");
                mdl.addElement("2-4-2-1");
                mdl.addElement("2-4-2-3");
                mdl.addElement("2-4-4-1");
                mdl.addElement("2-4-4-3");
                mdl.addElement("3-1-1-1");
                mdl.addElement("3-1-1-3");
                mdl.addElement("3-1-2-1");
                mdl.addElement("3-1-2-3");
                mdl.addElement("3-1-3-1");
                mdl.addElement("3-1-3-3");
                mdl.addElement("3-1-4-1");
                mdl.addElement("3-1-4-1");
                mdl.addElement("3-2-1-1");
                mdl.addElement("3-2-1-2");
                mdl.addElement("3-2-1-3");
                mdl.addElement("3-2-2-1");
                mdl.addElement("3-2-2-3");
                mdl.addElement("3-2-3-1");
                mdl.addElement("3-2-3-3");
                mdl.addElement("3-2-4-1");
                mdl.addElement("3-2-4-3");
                mdl.addElement("3-3-1-1");
                mdl.addElement("3-3-1-3");
                mdl.addElement("3-3-3-1");
                mdl.addElement("3-3-3-3");
                mdl.addElement("3-3-4-1");
                mdl.addElement("3-3-4-3");
                mdl.addElement("3-4-1-1");
                mdl.addElement("3-4-1-3");
                mdl.addElement("3-4-2-1");
                mdl.addElement("3-4-2-3");
                mdl.addElement("3-4-3-1");
                mdl.addElement("3-4-4-1");
                mdl.addElement("3-4-4-3");
                mdl.addElement("3-4-4-4");
                
                mdl.addElement("4-1-1-1");
                mdl.addElement("4-2-1-1");
                mdl.addElement("4-2-1-3");
                mdl.addElement("4-2-2-1");
                mdl.addElement("4-2-2-3");
                mdl.addElement("4-2-3-1");
                mdl.addElement("4-2-3-3");
                mdl.addElement("4-2-4-1");
                mdl.addElement("4-3-1-3");
                mdl.addElement("4-3-1-4");
                mdl.addElement("4-3-2-1");
                
                mdl.addElement("4-3-2-2");
                mdl.addElement("4-3-2-3");
                mdl.addElement("4-3-2-4");
                mdl.addElement("4-3-3-1");
                mdl.addElement("4-3-3-2");
                mdl.addElement("4-3-3-3");
                mdl.addElement("4-3-3-4");
                mdl.addElement("4-3-4-1");
                mdl.addElement("4-3-4-2");
                mdl.addElement("4-3-4-3");
                mdl.addElement("two-tone siren");
                
                break;
        }
        cmb_Bunyi.setModel(mdl);
        txtAnalysis.setText("");
    }//GEN-LAST:event_cmb_motherboardActionPerformed

    private void cmb_motherboardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_motherboardMouseReleased
        // TODO add your handling code here:
        DefaultComboBoxModel mdl = new DefaultComboBoxModel();
        switch (cmb_motherboard.getSelectedIndex() ){
            case 0 :
                break;
            case 1 :
                mdl.addElement("1 Pendek");
                mdl.addElement("2 Pendek");
                mdl.addElement("3 Pendek");
                mdl.addElement("4 Pendek");
                mdl.addElement("5 Pendek");
                mdl.addElement("6 Pendek");
                mdl.addElement("7 Pendek");
                mdl.addElement("8 Pendek");
                mdl.addElement("9 Pendek");
                mdl.addElement("10 Pendek");
                mdl.addElement("11 Pendek");
                mdl.addElement("1 Panjang, 3 Pendek");
                mdl.addElement("1 Panjang, 8 Pendek");
                mdl.addElement("Dua Nada yang berbeda");
                break;
            case 2 :
                mdl.addElement("1 Panjang, 2 Pendek");
                mdl.addElement("1 Panjang, 3 Pendek");
                mdl.addElement("Berulang tanpa henti");
                mdl.addElement("Berulang-ulang dan bernada tinggi ketika PC dihidupkan");
                mdl.addElement("Bunyi nada tinggi dan nada rendah berulang-ulang");
 
                break;
            case 3 :
                mdl.addElement("1 Pendek");
                mdl.addElement("2 Pendek");
                mdl.addElement("3 Pendek");
                mdl.addElement("4 Pendek");
                mdl.addElement("5 Pendek");
                mdl.addElement("6 Pendek");
                mdl.addElement("7 Pendek");
                
                break;
            case 4 :
                mdl.addElement("Tidak ada bunyi");
                mdl.addElement("1 bunyi pendek");
                mdl.addElement("2 bunyi pendek");
                mdl.addElement("Bunyi terus-menerus");
                mdl.addElement("Bunyi pendek berulang-ulang");
                mdl.addElement("1 panjang dan 1 pendek");
                mdl.addElement("1 panjang dan 2 pendek");
                mdl.addElement("1 panjang dan 3 pendek");
                mdl.addElement("3 panjang");
                mdl.addElement("1 bunyi, tampilan kosong atau kacau");
                break;
            case 5 :
                mdl.addElement("Nada Error (dua bentuk nada berbeda)");
                mdl.addElement("Bunyi startup, putaran disk, tidak ada tampilan");
                mdl.addElement("Power menyala, tidak ada bunyi");
                mdl.addElement("Bunyi keras, 4 bunyi lebih keras");
                break;
            case 6 :
                mdl.addElement("1-1-1-1");
                mdl.addElement("1-1-1-3");
                mdl.addElement("1-1-2-1");
                mdl.addElement("1-1-2-3");
                mdl.addElement("1-1-3-1");
                mdl.addElement("1-1-3-2");
                mdl.addElement("1-1-3-3");
                mdl.addElement("1-1-4-1");
                mdl.addElement("1-1-4-3");
                mdl.addElement("1-2-1-1");
                mdl.addElement("1-2-1-2");
                mdl.addElement("1-2-1-3");
                mdl.addElement("1-2-2-1");
                mdl.addElement("1-2-2-3");
                mdl.addElement("1-2-3-1");
                mdl.addElement("1-2-3-3");
                mdl.addElement("1-2-4-1");
                mdl.addElement("1-3-1-1");
                mdl.addElement("1-3-1-3");
                mdl.addElement("1-3-2-1");
                mdl.addElement("1-3-3-1");
                mdl.addElement("1-3-3-3");
                mdl.addElement("1-3-4-1");
                mdl.addElement("1-3-4-3");
                mdl.addElement("1-4-1-3");
                mdl.addElement("1-4-2-4");
                mdl.addElement("1-4-3-1");
                mdl.addElement("1-4-3-2");
                mdl.addElement("1-4-3-3");
                mdl.addElement("1-4-4-1");
                mdl.addElement("1-4-4-2");
                mdl.addElement("2-1-1-1");
                mdl.addElement("2-1-1-3");
                mdl.addElement("2-1-2-1");
                mdl.addElement("2-1-2-3");
                mdl.addElement("2-1-2-4");
                mdl.addElement("2-1-3-1");
                mdl.addElement("2-1-3-2");
                mdl.addElement("2-1-3-3");
                mdl.addElement("2-1-4-1");
                mdl.addElement("2-1-4-3");
                mdl.addElement("2-2-1-1");
                mdl.addElement("2-2-1-3");
                mdl.addElement("2-2-2-1");
                mdl.addElement("2-2-2-3");
                mdl.addElement("2-2-3-1");
                mdl.addElement("2-2-3-3");
                mdl.addElement("2-2-4-1");
                mdl.addElement("2-3-1-1");
                mdl.addElement("2-3-1-3");
                mdl.addElement("2-3-2-1");
                mdl.addElement("2-3-2-3");
                mdl.addElement("2-3-3-1");
                mdl.addElement("2-3-3-3");
                mdl.addElement("2-3-4-1");
                mdl.addElement("2-3-4-3");
                mdl.addElement("2-4-1-1");
                mdl.addElement("2-4-1-3");
                mdl.addElement("2-4-2-1");
                mdl.addElement("2-4-2-3");
                mdl.addElement("2-4-4-1");
                mdl.addElement("2-4-4-3");
                mdl.addElement("3-1-1-1");
                mdl.addElement("3-1-1-3");
                mdl.addElement("3-1-2-1");
                mdl.addElement("3-1-2-3");
                mdl.addElement("3-1-3-1");
                mdl.addElement("3-1-3-3");
                mdl.addElement("3-1-4-1");
                mdl.addElement("3-1-4-1");
                mdl.addElement("3-2-1-1");
                mdl.addElement("3-2-1-2");
                mdl.addElement("3-2-1-3");
                mdl.addElement("3-2-2-1");
                mdl.addElement("3-2-2-3");
                mdl.addElement("3-2-3-1");
                mdl.addElement("3-2-3-3");
                mdl.addElement("3-2-4-1");
                mdl.addElement("3-2-4-3");
                mdl.addElement("3-3-1-1");
                mdl.addElement("3-3-1-3");
                mdl.addElement("3-3-3-1");
                mdl.addElement("3-3-3-3");
                mdl.addElement("3-3-4-1");
                mdl.addElement("3-3-4-3");
                mdl.addElement("3-4-1-1");
                mdl.addElement("3-4-1-3");
                mdl.addElement("3-4-2-1");
                mdl.addElement("3-4-2-3");
                mdl.addElement("3-4-3-1");
                mdl.addElement("3-4-4-1");
                mdl.addElement("3-4-4-3");
                mdl.addElement("3-4-4-4");
                
                mdl.addElement("4-1-1-1");
                mdl.addElement("4-2-1-1");
                mdl.addElement("4-2-1-3");
                mdl.addElement("4-2-2-1");
                mdl.addElement("4-2-2-3");
                mdl.addElement("4-2-3-1");
                mdl.addElement("4-2-3-3");
                mdl.addElement("4-2-4-1");
                mdl.addElement("4-3-1-3");
                mdl.addElement("4-3-1-4");
                mdl.addElement("4-3-2-1");
                
                mdl.addElement("4-3-2-2");
                mdl.addElement("4-3-2-3");
                mdl.addElement("4-3-2-4");
                mdl.addElement("4-3-3-1");
                mdl.addElement("4-3-3-2");
                mdl.addElement("4-3-3-3");
                mdl.addElement("4-3-3-4");
                mdl.addElement("4-3-4-1");
                mdl.addElement("4-3-4-2");
                mdl.addElement("4-3-4-3");
                mdl.addElement("two-tone siren");
                
                break;
        }
        cmb_Bunyi.setModel(mdl);
        txtAnalysis.setText("");
    }//GEN-LAST:event_cmb_motherboardMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mdlLibrary lib = new mdlLibrary();
        switch(cmb_motherboard.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(this, "Mohon pilih merk motheroard komputer yang akan dianalisis!", "Pilih motherboard", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                txtAnalysis.setText(lib.amibios(String.valueOf(cmb_Bunyi.getItemAt(cmb_Bunyi.getSelectedIndex()))));
                break;
            case 2:
                txtAnalysis.setText(lib.awardbios(String.valueOf(cmb_Bunyi.getItemAt(cmb_Bunyi.getSelectedIndex()))));
                break;
            case 3:
                txtAnalysis.setText(lib.dell(String.valueOf(cmb_Bunyi.getItemAt(cmb_Bunyi.getSelectedIndex()))));
                break;
            case 4:
                txtAnalysis.setText(lib.ibm(String.valueOf(cmb_Bunyi.getItemAt(cmb_Bunyi.getSelectedIndex()))));
                break;
            case 5:
                txtAnalysis.setText(lib.macintosh(String.valueOf(cmb_Bunyi.getItemAt(cmb_Bunyi.getSelectedIndex()))));
                break;
            case 6:
                txtAnalysis.setText(lib.phoenixbios(String.valueOf(cmb_Bunyi.getItemAt(cmb_Bunyi.getSelectedIndex()))));
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_Bunyi;
    private javax.swing.JComboBox<String> cmb_motherboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtAnalysis;
    // End of variables declaration//GEN-END:variables
}
