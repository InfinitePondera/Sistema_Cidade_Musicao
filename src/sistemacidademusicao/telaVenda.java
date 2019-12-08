package sistemacidademusicao;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class telaVenda extends javax.swing.JFrame {

    public telaVenda() {
        initComponents();
        jPanel1.setBackground(Color.red);
        jPanel2.setBackground(Color.blue);
        fieldID.setEditable(false);
        fieldID.setText("1");
    }

    public void saveNota(){
        JFileChooser save = new JFileChooser();
        save.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int result = save.showSaveDialog(null);
        
        if(result == JFileChooser.CANCEL_OPTION){
            return;
        }
        else if(result == JFileChooser.APPROVE_OPTION ){
            File comanda = save.getSelectedFile();
            try{
                FileWriter novo = new FileWriter(comanda);
                BufferedWriter writer = new BufferedWriter(novo);
                String nota1 = fieldID.getText();
                String nota2 = areaNotaFiscal.getText();
                String nota3 = fieldTotal.getText();
                writer.write("/" + nota1 + "\n");
                writer.write("/" + nota2 + "\n");
                writer.write("/" + nota3 + "\n");
                writer.flush();
                writer.close();
            }
            catch(IOException error){
                JOptionPane.showMessageDialog(rootPane, "Impossível Salvar Nota Fiscal");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaNotaFiscal = new javax.swing.JTextArea();
        buttonCadCliente = new javax.swing.JButton();
        fieldQuant = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldCod = new javax.swing.JTextField();
        buttonPagar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fieldCPFCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        areaNotaFiscal.setColumns(20);
        areaNotaFiscal.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        areaNotaFiscal.setRows(5);
        jScrollPane1.setViewportView(areaNotaFiscal);

        buttonCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/rsz_human-person-plus-user-icon-1320196276984981208.png"))); // NOI18N
        buttonCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadClienteActionPerformed(evt);
            }
        });

        fieldQuant.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fieldQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldQuantActionPerformed(evt);
            }
        });

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/rsz_add_plus-512.png"))); // NOI18N
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo do Produto:");

        fieldID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID da Nota Fiscal");

        fieldTotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        fieldTotal.setText("0");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/rsz_close-x-cross-multiply-delete-cancel-modal-error-no-512.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade:");

        fieldCod.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodActionPerformed(evt);
            }
        });

        buttonPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/output-onlinepngtools.png"))); // NOI18N
        buttonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF do Cliente(Caso Cadastrado):");

        fieldCPFCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                        .addComponent(fieldID)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldTotal))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldQuant)
                    .addComponent(fieldCod)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(buttonCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(fieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(fieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldQuantActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
        telaIntroducao tela = new telaIntroducao();
        tela.setLocationRelativeTo(null);
        tela.show();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void fieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodActionPerformed

    private void buttonCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadClienteActionPerformed
        telaCliente tela = new telaCliente();
        tela.setLocationRelativeTo(null);
        tela.show();
    }//GEN-LAST:event_buttonCadClienteActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        Produto pro = new Produto();
        pro = pro.buscaProduto(Integer.parseInt(fieldCod.getText()));
        List<Produto> prod = pro.getDBInfo(Integer.parseInt(fieldCod.getText()));
        areaNotaFiscal.setText(areaNotaFiscal.getText()+pro.getNome()+" Quant: "+fieldQuant.getText()+" Total: "+Double.toString(pro.getPreco()*Integer.parseInt(fieldQuant.getText()))+"\n");
        fieldTotal.setText(Double.toString(Double.parseDouble(fieldTotal.getText())+(pro.getPreco()*Integer.parseInt(fieldQuant.getText()))));
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagarActionPerformed
        Cliente cli = new Cliente();
        Venda vend = new Venda();

        if(!fieldCPFCliente.getText().equals("")){
            cli = cli.buscaCliente(Integer.parseInt(fieldCPFCliente.getText()));
            if(Integer.parseInt(fieldCPFCliente.getText()) == cli.getCPF()){
                fieldTotal.setText(Double.toString(Double.parseDouble(fieldTotal.getText())*0.85));
            }
        }
        saveNota();
        String idfun = JOptionPane.showInputDialog("Digite o ID do funcionario: ");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        Calendar date = null;
        String dat = dateFormat.format(date.getTimeInMillis());
        vend.insereVenda(Integer.parseInt(fieldID.getText()), dat, Double.parseDouble(fieldTotal.getText()), Integer.parseInt(idfun));
        fieldID.setText(Integer.toString(Integer.parseInt(fieldID.getText())+1));
        areaNotaFiscal.setText("");
        fieldTotal.setText("0.0");
        fieldCPFCliente.setText("");
    }//GEN-LAST:event_buttonPagarActionPerformed

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
            java.util.logging.Logger.getLogger(telaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNotaFiscal;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCadCliente;
    private javax.swing.JButton buttonPagar;
    private javax.swing.JLabel closeButton;
    private javax.swing.JTextField fieldCPFCliente;
    private javax.swing.JTextField fieldCod;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldQuant;
    private javax.swing.JTextField fieldTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
