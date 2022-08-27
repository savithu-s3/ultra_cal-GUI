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
public class Volume extends javax.swing.JFrame {

    /**
     * Creates new form Volume
     */
    public Volume() {
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
        Topic = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        cuboid = new javax.swing.JButton();
        sphere = new javax.swing.JButton();
        tetrahedron = new javax.swing.JButton();
        cylinder = new javax.swing.JButton();
        cube = new javax.swing.JButton();
        pyramid = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        Topic.setFont(new java.awt.Font("CaskaydiaCove Nerd Font", 0, 24)); // NOI18N
        Topic.setForeground(new java.awt.Color(255, 255, 255));
        Topic.setText("Volume");

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

        cuboid.setText("Cuboid");
        cuboid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuboidMouseClicked(evt);
            }
        });
        cuboid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuboidActionPerformed(evt);
            }
        });

        sphere.setText("Sphere");
        sphere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sphereMouseClicked(evt);
            }
        });

        tetrahedron.setText("Tetrahedron");
        tetrahedron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tetrahedronMouseClicked(evt);
            }
        });
        tetrahedron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tetrahedronActionPerformed(evt);
            }
        });

        cylinder.setText("Cylinder");
        cylinder.setPreferredSize(new java.awt.Dimension(100, 23));
        cylinder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cylinderMouseClicked(evt);
            }
        });

        cube.setText("Cube");
        cube.setPreferredSize(new java.awt.Dimension(100, 23));
        cube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cubeMouseClicked(evt);
            }
        });
        cube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeActionPerformed(evt);
            }
        });

        pyramid.setText("Pyramid");
        pyramid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pyramidMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Topic)
                .addGap(0, 280, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sphere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cuboid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cube, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cylinder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pyramid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tetrahedron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(150, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Topic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 350, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(cube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cuboid)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(sphere)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cylinder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(pyramid)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tetrahedron)
                    .addContainerGap(121, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        Ultra_Cal menu = new Ultra_Cal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void cubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cubeActionPerformed

    private void cuboidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuboidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuboidActionPerformed

    private void tetrahedronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tetrahedronActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tetrahedronActionPerformed

    private void cubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cubeMouseClicked
        cube_volume cube_volume = new cube_volume();
        cube_volume.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cubeMouseClicked

    private void cuboidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuboidMouseClicked
        cuboid_volume cuboid_volume = new cuboid_volume();
        cuboid_volume.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cuboidMouseClicked

    private void sphereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sphereMouseClicked
        sphere_volume sphere_volume = new sphere_volume();
        sphere_volume.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sphereMouseClicked

    private void cylinderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cylinderMouseClicked
        cylinder_volume cylinder_volume = new cylinder_volume();
        cylinder_volume.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cylinderMouseClicked

    private void pyramidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pyramidMouseClicked
        pyramid_volume pyramid_volume = new pyramid_volume();
        pyramid_volume.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pyramidMouseClicked

    private void tetrahedronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tetrahedronMouseClicked
        tetrahedron_volume tetrahedron_volume = new tetrahedron_volume();
        tetrahedron_volume.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tetrahedronMouseClicked

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
            java.util.logging.Logger.getLogger(Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Volume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Topic;
    private javax.swing.JButton cube;
    private javax.swing.JButton cuboid;
    private javax.swing.JButton cylinder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pyramid;
    private javax.swing.JButton sphere;
    private javax.swing.JButton tetrahedron;
    // End of variables declaration//GEN-END:variables
}
