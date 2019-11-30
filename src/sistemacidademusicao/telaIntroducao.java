package sistemacidademusicao;

import java.awt.Color;
import javax.swing.JOptionPane;

public class telaIntroducao extends javax.swing.JFrame {

    /**
     * Creates new form telaIntroducao
     */
    public telaIntroducao() {
        initComponents();
        jPanel1.setBackground(new Color(0,0,153,145));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        buttonRealizarVenda = new javax.swing.JButton();
        buttonCadastrarCaixa = new javax.swing.JButton();
        buttonCadastrarCliente = new javax.swing.JButton();
        buttonConsEstoque = new javax.swing.JButton();
        buttonConsVendas = new javax.swing.JButton();
        buttonConsFornecedores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(396, 235));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel1.setText("Bem-vindo ao sistema de vendas do Cidade Musicão");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setText("O que deseja fazer?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/rsz_close-x-cross-multiply-delete-cancel-modal-error-no-512.png"))); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        buttonRealizarVenda.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        buttonRealizarVenda.setText("Realizar Venda");
        buttonRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRealizarVendaActionPerformed(evt);
            }
        });

        buttonCadastrarCaixa.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        buttonCadastrarCaixa.setText("Cadastrar Empregado");
        buttonCadastrarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarCaixaActionPerformed(evt);
            }
        });

        buttonCadastrarCliente.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        buttonCadastrarCliente.setText("Cads. Cliente");
        buttonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarClienteActionPerformed(evt);
            }
        });

        buttonConsEstoque.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        buttonConsEstoque.setText("Cons. Estoque");
        buttonConsEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsEstoqueActionPerformed(evt);
            }
        });

        buttonConsVendas.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        buttonConsVendas.setText("Consultar Vendas");
        buttonConsVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsVendasActionPerformed(evt);
            }
        });

        buttonConsFornecedores.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        buttonConsFornecedores.setText("Cons. Fornecedores");
        buttonConsFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsFornecedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonCadastrarCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonRealizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonConsFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonConsEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonConsVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarCaixa)
                    .addComponent(buttonRealizarVenda)
                    .addComponent(buttonConsVendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarCliente)
                    .addComponent(buttonConsFornecedores)
                    .addComponent(buttonConsEstoque))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/rsz_21.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConsEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsEstoqueActionPerformed
        Gerente gen = new Gerente();
        if(JOptionPane.showInputDialog("Digite a senha do gerente: ").equals(gen.getSenha())){
            dispose();
            telaEstoque tela = new telaEstoque();
            tela.setLocationRelativeTo(null);
            tela.show();
        }
        else JOptionPane.showMessageDialog(null, "Senha incorreta");
    }//GEN-LAST:event_buttonConsEstoqueActionPerformed

    private void buttonRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRealizarVendaActionPerformed
        dispose();
        telaVenda tela = new telaVenda();
        tela.setLocationRelativeTo(rootPane);
        tela.show();
    }//GEN-LAST:event_buttonRealizarVendaActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void buttonCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarClienteActionPerformed
        telaCliente tela = new telaCliente();
        tela.setLocationRelativeTo(null);
        tela.show();
    }//GEN-LAST:event_buttonCadastrarClienteActionPerformed

    private void buttonCadastrarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarCaixaActionPerformed
        Gerente gen = new Gerente();
        if(JOptionPane.showInputDialog("Digite a senha do gerente: ").equals(gen.getSenha())){
            dispose();
            telaFuncionario tela = new telaFuncionario();
            tela.setLocationRelativeTo(null);
            tela.show();
        }
        else JOptionPane.showMessageDialog(null, "Senha incorreta");
    }//GEN-LAST:event_buttonCadastrarCaixaActionPerformed

    private void buttonConsFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsFornecedoresActionPerformed
        Gerente gen = new Gerente();
        if(JOptionPane.showInputDialog("Digite a senha do gerente: ").equals(gen.getSenha())){
            dispose();
            telaFornecedores tela = new telaFornecedores();
            tela.setLocationRelativeTo(null);
            tela.show();
        }
        else JOptionPane.showMessageDialog(null, "Senha incorreta");
    }//GEN-LAST:event_buttonConsFornecedoresActionPerformed

    private void buttonConsVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsVendasActionPerformed
        Gerente gen = new Gerente();
        if(JOptionPane.showInputDialog("Digite a senha do gerente: ").equals(gen.getSenha())){
            dispose();
            telaVendas tela = new telaVendas();
            tela.setLocationRelativeTo(null);
            tela.show();
        }
        else JOptionPane.showMessageDialog(null, "Senha incorreta");
    }//GEN-LAST:event_buttonConsVendasActionPerformed

    
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
            java.util.logging.Logger.getLogger(telaIntroducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaIntroducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaIntroducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaIntroducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaIntroducao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarCaixa;
    private javax.swing.JButton buttonCadastrarCliente;
    private javax.swing.JButton buttonConsEstoque;
    private javax.swing.JButton buttonConsFornecedores;
    private javax.swing.JButton buttonConsVendas;
    private javax.swing.JButton buttonRealizarVenda;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
