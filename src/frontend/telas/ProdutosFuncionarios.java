/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.telas;

import backend.BancoDeDados;
import backend.ProdutoExcluido;
import javax.swing.JOptionPane;

/**
 *
 * @author jonny
 */
public class ProdutosFuncionarios extends javax.swing.JFrame {

    
    static BancoDeDados bancoDeDados;
    /**
     * Creates new form ProdutosFuncionarios
     */
    public ProdutosFuncionarios(BancoDeDados banco) {
        initComponents();
        
        this.bancoDeDados = banco;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListar = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtNovaQuant = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnExcluirProd = new javax.swing.JButton();
        txtExcluiProd = new javax.swing.JTextField();
        btnListarProdExcluidos = new javax.swing.JButton();
        btnSemEstoque = new javax.swing.JButton();
        btnFat = new javax.swing.JButton();
        faturamento = new javax.swing.JLabel();
        txtFat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Funcionario");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Top-guns");

        btnVoltar.setText("Sair");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar todos Produtos");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        txtListar.setColumns(20);
        txtListar.setRows(5);
        jScrollPane1.setViewportView(txtListar);

        btnCadastrar.setText("Cadastrar novo Produto");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar Produto");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo");

        jLabel4.setText("Nova Quantidade");

        jButton1.setText("Vendas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Verificar Vendas");

        jLabel6.setText("Verificar clientes");

        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo para Excluir Produto");

        btnExcluirProd.setText("Excluir Produto");
        btnExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdActionPerformed(evt);
            }
        });

        btnListarProdExcluidos.setText("Listar Produtos Excluidos");
        btnListarProdExcluidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProdExcluidosActionPerformed(evt);
            }
        });

        btnSemEstoque.setText("Listar sem Estoque");
        btnSemEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemEstoqueActionPerformed(evt);
            }
        });

        btnFat.setText("Faturamento");
        btnFat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListarProdExcluidos))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(btnSemEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(faturamento)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(txtFat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(btnExcluirProd, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(txtExcluiProd, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNovaQuant, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNovaQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFat)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(faturamento)
                                .addComponent(txtFat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExcluiProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirProd)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnCliente))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButton1))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListar)
                            .addComponent(btnCadastrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListarProdExcluidos)
                            .addComponent(btnSemEstoque))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        
        dispose();
        loginFuncionario logFun = new loginFuncionario(bancoDeDados);
        logFun.setVisible(true);
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        
        txtListar.setText("");
        
        String armazenaProdutos = null;
        
        for(int i = 0; i < bancoDeDados.produtos.size(); i++){
            armazenaProdutos = ("Nome: " + bancoDeDados.produtos.get(i).getNome() + " | Categoria: " + bancoDeDados.produtos.get(i).getCategoria() 
                    + " | Codigo: " + bancoDeDados.produtos.get(i).getCodigo() + " | Estoque: " 
                    + bancoDeDados.produtos.get(i).getQuantEstoque() + " | Preco: " + bancoDeDados.produtos.get(i).getPreco() + " R$\n");
            txtListar.append(armazenaProdutos);
        }
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastrosProdutos cadPro = new CadastrosProdutos(bancoDeDados);
        cadPro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        String erroMsg = null;
        
        try{
            
            int codigoDigitado;
            codigoDigitado = Integer.parseInt(txtCodigo.getText());
            int quantDigitada;
            quantDigitada = Integer.parseInt(txtNovaQuant.getText());
            
        }catch(Exception erro){
            
            erroMsg = "Erro";
            JOptionPane.showMessageDialog(null, "O campo preenchido com a informacao contida nessa mensagem possui um erro! \n" + "Erro : " + erro + "\n");
            
        }
        
        if(erroMsg.equals("Erro")){
            
            JOptionPane.showMessageDialog(null, "Tente Novamente! \n");
            
        }else{
        
        int codigoDigitado = Integer.parseInt(txtCodigo.getText());
        int quantDigitada = Integer.parseInt(txtNovaQuant.getText());
        int pegaQuantEstoque = 0;
        int resultado = 0;
        
        
        if(codigoDigitado <= 0 || codigoDigitado >= 100){
            txtCodigo.setText("");
            JOptionPane.showMessageDialog(null, "O codigo do produto esta incorreto, eles variam de 1 ate 100! \n");
        }else if(quantDigitada <= 0){
            
            txtNovaQuant.setText("");
            JOptionPane.showMessageDialog(null, "Quantidade selecionada nao eh um numero inteiro ou eh menor ou igual a zero! \n");
            
        }else{
        
        for(int i = 0; i < bancoDeDados.produtos.size(); i++){
            if(codigoDigitado == (bancoDeDados.produtos.get(i).getCodigo())){
                pegaQuantEstoque = bancoDeDados.produtos.get(i).getQuantEstoque();
                resultado = pegaQuantEstoque + quantDigitada;
                bancoDeDados.produtos.get(i).setQuantEstoque(resultado);
            }
        }
        JOptionPane.showMessageDialog(null, "Produto Editado! \n");
        bancoDeDados.gravarProdutos();
        txtCodigo.setText("");
        txtNovaQuant.setText("");
        }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        dispose();
        
        VendasFuncionario vendaFun = new VendasFuncionario(bancoDeDados);
        vendaFun.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdActionPerformed
        // TODO add your handling code here:
        
        int codSelecionado = Integer.parseInt(txtExcluiProd.getText());
        
        if(codSelecionado <= 0 || codSelecionado >= 100){
            
            txtExcluiProd.setText("");
            JOptionPane.showMessageDialog(null, "O codigo do produto esta incorreto, eles variam de 1 ate 100! \n");
            
        }else{
        
        int verificador = 0;
        for(int i = 0; i < bancoDeDados.produtos.size(); i++){
             if(txtExcluiProd.getText().equals(String.valueOf(bancoDeDados.produtos.get(i).getCodigo()))){
                verificador = 1;
             }
        }

        if(verificador == 1){
            
            for(int i = 0; i < bancoDeDados.produtos.size(); i++){
            if(txtExcluiProd.getText().equals(String.valueOf(bancoDeDados.produtos.get(i).getCodigo()))){
                ProdutoExcluido produtoExcluido = new ProdutoExcluido(bancoDeDados.produtos.get(i).getPreco(), bancoDeDados.produtos.get(i).getNome(), 
                        bancoDeDados.produtos.get(i).getCodigo(), bancoDeDados.produtos.get(i).getQuantEstoque(), bancoDeDados.produtos.get(i).getCategoria());
                bancoDeDados.produtosExcluidos.add(produtoExcluido);
                bancoDeDados.produtos.remove(i);
                JOptionPane.showMessageDialog(null, "Produto Excluido! \n");
            }
        }
        }
        if(verificador == 0){
             JOptionPane.showMessageDialog(null, "Produto não cadastrado! \n");
        }
        }
        bancoDeDados.gravarProdExcluidos();
        bancoDeDados.gravarProdutos();
    }//GEN-LAST:event_btnExcluirProdActionPerformed

    private void btnListarProdExcluidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProdExcluidosActionPerformed
        // TODO add your handling code here:
        
        txtListar.setText("");
        
        String armazenaProdutosExcluidos = null;
        
        for(int i = 0; i < bancoDeDados.produtosExcluidos.size(); i++){
            armazenaProdutosExcluidos = ("Nome: " + bancoDeDados.produtosExcluidos.get(i).getNomeExcluido()+ " | Categoria: " 
                    + bancoDeDados.produtosExcluidos.get(i).getCategoriaExcluido()
                    + " | Codigo: " + bancoDeDados.produtosExcluidos.get(i).getCodigoExcluido()+ " | Estoque: " 
                    + bancoDeDados.produtosExcluidos.get(i).getQuantEstoqueExcluido()+ " | Preco: " + bancoDeDados.produtosExcluidos.get(i).getPrecoExcluido()+ " R$\n");
            txtListar.append(armazenaProdutosExcluidos);
        }
        
    }//GEN-LAST:event_btnListarProdExcluidosActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        
        dispose();
        ClientesFuncionarios cliFunci = new ClientesFuncionarios(bancoDeDados);
            
        cliFunci.setVisible(true);
        
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnSemEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemEstoqueActionPerformed
        // TODO add your handling code here:
        
        txtListar.setText("");
        
        String armazenaProdutosSemEstoque = null;
        
        for(int i = 0; i < bancoDeDados.produtos.size(); i++){
            if(bancoDeDados.produtos.get(i).getQuantEstoque() == 0){
            armazenaProdutosSemEstoque = ("Nome: " + bancoDeDados.produtos.get(i).getNome() + " | Categoria: " + bancoDeDados.produtos.get(i).getCategoria() 
                    + " | Codigo: " + bancoDeDados.produtos.get(i).getCodigo() + " | Estoque: " 
                    + bancoDeDados.produtos.get(i).getQuantEstoque() + " | Preco: " + bancoDeDados.produtos.get(i).getPreco() + " R$\n");
            txtListar.append(armazenaProdutosSemEstoque);
        }else{
                txtListar.setText("");
            }
        }
    }//GEN-LAST:event_btnSemEstoqueActionPerformed

    private void btnFatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatActionPerformed
        // TODO add your handling code here:
        txtFat.setText("");
        
        String fatura = null;
        fatura = "R$ " + String.valueOf(bancoDeDados.faturamento()) ;
        txtFat.setText(fatura);
    }//GEN-LAST:event_btnFatActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutosFuncionarios(bancoDeDados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluirProd;
    private javax.swing.JButton btnFat;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnListarProdExcluidos;
    private javax.swing.JButton btnSemEstoque;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel faturamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExcluiProd;
    private javax.swing.JTextField txtFat;
    private javax.swing.JTextArea txtListar;
    private javax.swing.JTextField txtNovaQuant;
    // End of variables declaration//GEN-END:variables
}
