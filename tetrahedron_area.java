/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultra_cal;

/**
 *
 * @author 2
 */
public class tetrahedron_area extends javax.swing.JFrame {

    /**
     * Creates new form tetrahedron_area
     */
    public tetrahedron_area() {
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

        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        Topic = new javax.swing.JLabel();
        area_label = new javax.swing.JLabel();
        answer = new javax.swing.JLabel();
        length_input = new javax.swing.JTextField();
        length_lebel = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        height_input = new javax.swing.JTextField();
        height_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        Back.setFont(new java.awt.Font("CaskaydiaCove Nerd Font", 0, 24)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setText("");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        Topic.setFont(new java.awt.Font("CaskaydiaCove Nerd Font", 0, 23)); // NOI18N
        Topic.setForeground(new java.awt.Color(255, 255, 255));
        Topic.setText("Area > Solids > Tetrahedron");

        area_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        area_label.setForeground(new java.awt.Color(255, 255, 255));
        area_label.setText("Area :");

        answer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        answer.setForeground(new java.awt.Color(255, 255, 255));
        answer.setText("0");

        length_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        length_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        length_lebel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        length_lebel.setForeground(new java.awt.Color(255, 255, 255));
        length_lebel.setText("Base Length");

        calculate.setText("Calculate");
        calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateMouseClicked(evt);
            }
        });
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        height_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        height_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        height_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        height_label.setForeground(new java.awt.Color(255, 255, 255));
        height_label.setText("Height");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Topic)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(area_label, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(height_label)
                                .addGap(18, 18, 18)
                                .addComponent(height_input, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(length_lebel)
                                .addGap(18, 18, 18)
                                .addComponent(length_input, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Topic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(length_lebel)
                    .addComponent(length_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height_label)
                    .addComponent(height_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(calculate)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area_label)
                    .addComponent(answer))
                .addGap(0, 122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        solids_area solids_area = new solids_area();
        solids_area.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void calculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseClicked
        String lengthStr = length_input.getText();
        String heightStr = height_input.getText();
        double length = Double.parseDouble(lengthStr);
        double height = Double.parseDouble(heightStr);
        double tri_ar = (height*length)/2;
        double area = tri_ar*4;
        answer.setText(Double.toString(area));
    }//GEN-LAST:event_calculateMouseClicked

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateActionPerformed

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
            java.util.logging.Logger.getLogger(tetrahedron_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tetrahedron_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tetrahedron_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tetrahedron_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tetrahedron_area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Topic;
    private javax.swing.JLabel answer;
    private javax.swing.JLabel area_label;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField height_input;
    private javax.swing.JLabel height_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField length_input;
    private javax.swing.JLabel length_lebel;
    // End of variables declaration//GEN-END:variables
}
