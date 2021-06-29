package exercicio03;

public class Informacoes extends javax.swing.JFrame {

    public Informacoes(Cliente c) {
        initComponents();
        
        lb_nome.setText(c.getNome());
        lb_idade.setText(String.valueOf(c.getIdade()));
        lb_telefone.setText(c.getTelefone());
        lb_sexo.setText(c.getSexo());
        lb_estado_civil.setText(c.getEstado_civil());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_nome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_idade = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_telefone = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_sexo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_estado_civil = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_nome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lb_nome.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Idade:");

        lb_idade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_idade.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        lb_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_telefone.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Sexo:");

        lb_sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_sexo.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Estado Civil:");

        lb_estado_civil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_estado_civil.setText("jLabel9");

        bt_voltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_voltar.setText("< Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
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
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lb_idade))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lb_telefone))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lb_sexo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lb_estado_civil))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lb_nome))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_voltar)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nome)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lb_idade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_telefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lb_sexo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lb_estado_civil))
                .addGap(18, 18, 18)
                .addComponent(bt_voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_bt_voltarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb_estado_civil;
    private javax.swing.JLabel lb_idade;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JLabel lb_telefone;
    // End of variables declaration//GEN-END:variables
}
