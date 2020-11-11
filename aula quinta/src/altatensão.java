
import javax.swing.JOptionPane;


public class altatensão extends javax.swing.JFrame {

    public altatensão() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbFasico = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfCorrente = new javax.swing.JTextField();
        tfTensao = new javax.swing.JTextField();
        tfDistancia = new javax.swing.JTextField();
        cbQuebra = new javax.swing.JComboBox();
        jResultado = new javax.swing.JLabel();
        jCondutor = new javax.swing.JLabel();
        jMono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        cbFasico.setBackground(new java.awt.Color(0, 0, 0));
        cbFasico.setForeground(new java.awt.Color(255, 255, 255));
        cbFasico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MonoFasico", "Trifasico" }));
        cbFasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFasicoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Distancia  equipamento:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tensão:");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Corrente eletrica:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fases:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("queda de tensão:");

        jbCalcular.setBackground(new java.awt.Color(0, 0, 0));
        jbCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dimenssionamento de condutores");

        tfCorrente.setBackground(new java.awt.Color(0, 0, 0));
        tfCorrente.setForeground(new java.awt.Color(255, 255, 255));
        tfCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorrenteActionPerformed(evt);
            }
        });

        tfTensao.setBackground(new java.awt.Color(0, 0, 0));
        tfTensao.setForeground(new java.awt.Color(255, 255, 255));
        tfTensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTensaoActionPerformed(evt);
            }
        });

        tfDistancia.setBackground(new java.awt.Color(0, 0, 0));
        tfDistancia.setForeground(new java.awt.Color(255, 255, 255));
        tfDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDistanciaActionPerformed(evt);
            }
        });

        cbQuebra.setBackground(new java.awt.Color(0, 0, 0));
        cbQuebra.setForeground(new java.awt.Color(255, 255, 255));
        cbQuebra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cbQuebra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuebraActionPerformed(evt);
            }
        });

        jResultado.setBackground(new java.awt.Color(0, 0, 0));
        jResultado.setForeground(new java.awt.Color(255, 255, 255));
        jResultado.setText("resultado:");

        jCondutor.setBackground(new java.awt.Color(0, 0, 0));
        jCondutor.setForeground(new java.awt.Color(255, 255, 255));
        jCondutor.setText("Condutores Padronizados:");

        jMono.setBackground(new java.awt.Color(0, 0, 0));
        jMono.setForeground(new java.awt.Color(255, 255, 255));
        jMono.setText("Resultado Fases");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbFasico, javax.swing.GroupLayout.Alignment.TRAILING, 0, 245, Short.MAX_VALUE)
                        .addComponent(tfCorrente, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfDistancia, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbQuebra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfTensao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCondutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbCalcular)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbFasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbQuebra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCondutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCalcular)
                .addGap(74, 74, 74))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
       try {

            double n1;
            String lig = (String) cbFasico.getSelectedItem();
            String fase1 = (String) cbFasico.getSelectedItem();
            double dist = Double.parseDouble(tfDistancia.getText());
            double ten = Double.parseDouble(tfTensao.getText());
            double corre = Double.parseDouble(tfCorrente.getText());
            String v = (String) cbQuebra.getSelectedItem();
            n1 = Integer.parseInt(v);
            double resultado = 0;

            double fr = (double) 1 / 56;

            if (lig == "MonoFasico") {
                resultado = (200 * fr * dist * corre) / (ten * n1);
                 String r =Double.toString(resultado); 
        jResultado.setText (r);

            } else if (lig == "Trifasico") {
                resultado = (100 * Math.sqrt(3) * fr * dist * corre) / (ten * n1);
                 String r =Double.toString(resultado); 
        jResultado.setText (r);
            }

            double[] condutor = {1.5, 2.5, 4, 6, 10, 16, 25, 35, 50, 70, 95, 120, 150, 185, 240};
            String b = "0";
            for (int i = 0; i < condutor.length; i++) {
                if (resultado <= condutor[i]) {
                    b = Double.toString(condutor[i]);
                    jCondutor.setText(b);
                    break;

                }

            }
            double n26;
            n26 = Double.parseDouble(b);
            if (lig == "MonoFasico") {
                n1 =  (200 * fr * dist * corre) / (ten * n26);
                 String r =Double.toString(n1); 
        jMono.setText (r);

            } else if (lig == "Trifasico") {
                n1 =  (100 * Math.sqrt(3) * fr * dist * corre) / (ten * n26);
                String r =Double.toString(n1); 
        jMono.setText (r);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "<html><font color=red face=arial><i><b> ?? DIGITE UM NÚMERO ??   ");

        }
      
      
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void tfDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDistanciaActionPerformed

    private void tfTensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTensaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTensaoActionPerformed

    private void tfCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorrenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorrenteActionPerformed

    private void cbFasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFasicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFasicoActionPerformed

    private void cbQuebraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuebraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQuebraActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(altatensão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(altatensão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(altatensão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(altatensão.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new altatensão().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbFasico;
    private javax.swing.JComboBox cbQuebra;
    private javax.swing.JLabel jCondutor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jMono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jResultado;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JTextField tfCorrente;
    private javax.swing.JTextField tfDistancia;
    private javax.swing.JTextField tfTensao;
    // End of variables declaration//GEN-END:variables
}
