/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.telas;
import backend.Cliente;
import backend.BancoDeDados;
import frontend.Logistica;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author jonny
 */
public class CadastroCliente extends javax.swing.JFrame {

    
    static BancoDeDados bancoDeDados;

   
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente(BancoDeDados banco) {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel3 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idadeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        codCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Top-guns");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setText("Nome");

        nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Idade");

        idadeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo Identificacao");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Faça o cadastro");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cadastrar)
                                    .addGap(51, 51, 51)
                                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(codCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(88, 88, 88)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idadeCliente)
                                        .addComponent(nomeCliente)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(voltar)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(voltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(codCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idadeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeClienteActionPerformed

    
    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        
        String erroMsg = null;
        
        try{
            
            int idade;
            idade = Integer.parseInt(idadeCliente.getText());
            
        }catch(Exception erro){
            
            erroMsg = "Erro";
            JOptionPane.showMessageDialog(null, "A idade nao foi preenchida com um numero inteiro! \n" + "Erro : " + erro + "\n");
            
        }
        
        if(erroMsg.equals("Erro")){
            
            JOptionPane.showMessageDialog(null, "Tente Novamente! \n");
            
        }else{
        
        int idade = Integer.parseInt(idadeCliente.getText().trim());
        String nome = nomeCliente.getText();
        String codigo = codCliente.getText();
        int compras = 0;
        
        if((idade < 18 || idade >= 120) && codigo.length() != 4){
                idadeCliente.setText("");
                codCliente.setText("");
                JOptionPane.showMessageDialog(null, "O codigo de identificacao esta incorreto, ele deve conter 4 digitos e a idade nao compreende o limite de 18 a 120 anos! \n");
            }else if(codigo.length() != 4){
                codCliente.setText("");
                JOptionPane.showMessageDialog(null, "O codigo de identificacao esta incorreto, ele deve conter 4 digitos! \n");
            }else if(idade < 18 || idade >= 120){
                idadeCliente.setText("");
                JOptionPane.showMessageDialog(null, "A idade nao compreende o limite de 18 a 120 anos! \n");
            }else{
       
        Cliente cliente = new Cliente(compras, nome, codigo, idade);
        
        int verificador = 0;
        
        for(int i = 0; i < bancoDeDados.clientes.size(); i++){
            if(bancoDeDados.clientes.get(i).getCodigoIdentificacao().equals(codCliente.getText())){
                verificador =1;
            }
        }
        
       if(verificador == 0){
           bancoDeDados.addCliente(cliente);
                      JOptionPane.showMessageDialog(null, "Usuario cadastrado! \n");
                      bancoDeDados.gravarClientes();

           
       }
        
       if(verificador == 1){
           JOptionPane.showMessageDialog(null, "Usuario já possui cadastro! \n");
       }
        
       for(int i = 0; i < bancoDeDados.clientes.size(); i++){
            System.out.println("nome: " + bancoDeDados.clientes.get(i).getNome());
        }
            }
        
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
         IdentificacaoCliente idcli = new IdentificacaoCliente(bancoDeDados);
        idcli.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente(bancoDeDados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField codCliente;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField idadeCliente;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

   
}
