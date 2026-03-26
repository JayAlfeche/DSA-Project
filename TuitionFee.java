
import javax.swing.JOptionPane;

public class TuitionFee extends javax.swing.JFrame {

        public TuitionFee() {
                initComponents();
                setLocationRelativeTo(null);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                lblSC = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jComboBox2 = new javax.swing.JComboBox<>();
                jLabel4 = new javax.swing.JLabel();
                txtResult = new javax.swing.JTextField();
                btnOutput = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtAreaResult = new javax.swing.JTextArea();
                jComboBox1 = new javax.swing.JComboBox<>();
                jPanel1 = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("TUITION FEE CALCULATOR");
                jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

                lblSC.setText("Student Course");

                jLabel3.setText("Student Type");

                jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Scholar", "Working Student" }));
                jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox2ActionPerformed(evt);
                        }
                });

                jLabel4.setText("Units");

                txtResult.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtResultActionPerformed(evt);
                        }
                });

                btnOutput.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
                btnOutput.setText("CALCULATE TUITION FEE");
                btnOutput.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOutputActionPerformed(evt);
                        }
                });

                txtAreaResult.setColumns(20);
                txtAreaResult.setRows(5);
                txtAreaResult.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Result will display here: "));
                jScrollPane1.setViewportView(txtAreaResult);

                jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSIT", "BSCS", "BSIS" }));
                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtResult)
                                        .addComponent(btnOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(16, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57))))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private String studentCourse;
        private String studentType;
        private int units;

        private void btnOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputActionPerformed
                try {
                        int units = Integer.parseInt(txtResult.getText());
                        String selectCourse = jComboBox1.getSelectedItem().toString();
                        String studentType = jComboBox2.getSelectedItem().toString();

                        double ratePerUnit = 0;

                        switch (selectCourse) {
                                case "BSIT":
                                        ratePerUnit = 1500;
                                        break;
                                case "BSCS":
                                        ratePerUnit = 1600;
                                        break;
                                case "BSIS":
                                        ratePerUnit = 1400;
                                        break;
                                default:
                                        txtAreaResult.setText("Error: Invalid Course!");
                                        return;
                        }

                        double tuitionFee = units * ratePerUnit;
                        double discountRate = 0;

                        if (studentType.equals("Scholar")) {
                                discountRate = 0.50;
                        } else if (studentType.equals("Working Student")) {
                                discountRate = 0.20;
                        } else if (!studentType.equals("Regular")) {
                                txtAreaResult.setText("Error: Invalid Student Type!");
                                return;
                        }

                        double discountAmount = tuitionFee * discountRate;
                        double finalFee = tuitionFee - discountAmount;

                        txtAreaResult.setText(
                                "TUITION FEE COMPUTATION \n"
                                + "Course: " + selectCourse + "\n"
                                + "Units: " + units + "\n"
                                + "Rate per Unit: PHP " + ratePerUnit + "\n"
                                + "Total: " + units + " * " + ratePerUnit + " = PHP " + tuitionFee + "\n"
                                + "Discount(" + (int) (discountRate * 100) + "%): PHP " + discountAmount + "\n"
                                + "Final Tuition Fee: PHP " + finalFee
                        );

                } catch (NumberFormatException e) {
                        txtAreaResult.setText("Error: Invalid Units!");
                }

        }//GEN-LAST:event_btnOutputActionPerformed

        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jComboBox1ActionPerformed

        private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jComboBox2ActionPerformed

        private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtResultActionPerformed

        public static void main(String args[]) {
                /* Create and display the form */
                java.awt.EventQueue.invokeLater(() -> new TuitionFee().setVisible(true));
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnOutput;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblSC;
        private javax.swing.JTextArea txtAreaResult;
        private javax.swing.JTextField txtResult;
        // End of variables declaration//GEN-END:variables
}
