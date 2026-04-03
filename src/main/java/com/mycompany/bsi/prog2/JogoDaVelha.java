
package com.mycompany.bsi.prog2;

import javax.swing.JLabel;
import javax.swing.*;

public class JogoDaVelha extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JogoDaVelha.class.getName());

    String jogador1 = "X";
    String jogador2 = "O";
    
    int rodada = 0;
    boolean restart = false;
    int pontoX = 0;
    int pontoO = 0;
    String jogadorX, jogadorO;
    
    public JogoDaVelha() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        jogadorX = JOptionPane.showInputDialog("Digite o nome do jogador 1:");
        jogadorO = JOptionPane.showInputDialog("Digite o nome do jogador 2:");
        labJogadorX.setText("" + jogadorX);
        labJogadorO.setText("" + jogadorO);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panPrincipal = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lab6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lab1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lab8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lab9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lab7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lab4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lab5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lab2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lab3 = new javax.swing.JLabel();
        labAviso = new javax.swing.JLabel();
        btnTelainicial = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        labPontoO = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        labPontoX = new javax.swing.JLabel();
        labJogadorX = new javax.swing.JLabel();
        labJogadorO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNovoJogo1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 90)); // NOI18N
        jLabel1.setText("X");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(0, 0, 51));
        panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTitulo.setBackground(new java.awt.Color(255, 255, 204));
        labTitulo.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        labTitulo.setForeground(new java.awt.Color(255, 255, 204));
        labTitulo.setText("Jogo da Velha");
        panPrincipal.add(labTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel1.setPreferredSize(new java.awt.Dimension(130, 130));

        lab6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab6.setForeground(new java.awt.Color(0, 0, 0));
        lab6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab6, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 219, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 130));

        lab1.setBackground(new java.awt.Color(204, 204, 255));
        lab1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab1.setForeground(new java.awt.Color(0, 0, 0));
        lab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 83, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel6.setPreferredSize(new java.awt.Dimension(130, 130));

        lab8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab8.setForeground(new java.awt.Color(0, 0, 0));
        lab8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab8, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 355, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel5.setPreferredSize(new java.awt.Dimension(130, 130));

        lab9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab9.setForeground(new java.awt.Color(0, 0, 0));
        lab9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab9, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 355, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel4.setPreferredSize(new java.awt.Dimension(130, 130));

        lab7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab7.setForeground(new java.awt.Color(0, 0, 0));
        lab7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab7, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 355, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel3.setPreferredSize(new java.awt.Dimension(130, 130));

        lab4.setBackground(new java.awt.Color(204, 204, 255));
        lab4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab4.setForeground(new java.awt.Color(0, 0, 0));
        lab4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab4, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 219, -1, -1));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel7.setPreferredSize(new java.awt.Dimension(130, 130));

        lab5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab5.setForeground(new java.awt.Color(0, 0, 0));
        lab5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 219, -1, -1));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel8.setPreferredSize(new java.awt.Dimension(130, 130));

        lab2.setBackground(new java.awt.Color(204, 204, 255));
        lab2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab2.setForeground(new java.awt.Color(0, 0, 0));
        lab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 83, -1, -1));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel9.setPreferredSize(new java.awt.Dimension(130, 130));

        lab3.setBackground(new java.awt.Color(204, 204, 255));
        lab3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lab3.setForeground(new java.awt.Color(0, 0, 0));
        lab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 83, -1, -1));

        labAviso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labAviso.setForeground(new java.awt.Color(255, 255, 255));
        labAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labAviso.setText("SUA VEZ!");
        panPrincipal.add(labAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 520, 400, -1));

        btnTelainicial.setBackground(new java.awt.Color(0, 102, 153));
        btnTelainicial.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnTelainicial.setForeground(new java.awt.Color(255, 255, 255));
        btnTelainicial.setText("Tela inicial");
        btnTelainicial.addActionListener(this::btnTelainicialActionPerformed);
        panPrincipal.add(btnTelainicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        jPanel10.setBackground(new java.awt.Color(0, 163, 212));
        jPanel10.setPreferredSize(new java.awt.Dimension(60, 60));

        labPontoO.setBackground(new java.awt.Color(255, 255, 255));
        labPontoO.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labPontoO.setForeground(new java.awt.Color(255, 255, 255));
        labPontoO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labPontoO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(labPontoO, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panPrincipal.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 60, 60));

        jPanel12.setBackground(new java.awt.Color(0, 163, 212));

        labPontoX.setBackground(new java.awt.Color(255, 255, 255));
        labPontoX.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labPontoX.setForeground(new java.awt.Color(255, 255, 255));
        labPontoX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labPontoX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labPontoX, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panPrincipal.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 60, 60));

        labJogadorX.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labJogadorX.setForeground(new java.awt.Color(255, 255, 255));
        labJogadorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panPrincipal.add(labJogadorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 120, 30));

        labJogadorO.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labJogadorO.setForeground(new java.awt.Color(255, 255, 255));
        labJogadorO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panPrincipal.add(labJogadorO, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 120, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pontuação");
        panPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 200, -1));

        btnNovoJogo1.setBackground(new java.awt.Color(102, 51, 255));
        btnNovoJogo1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnNovoJogo1.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoJogo1.setText("Novo Jogo");
        btnNovoJogo1.addActionListener(this::btnNovoJogo1ActionPerformed);
        panPrincipal.add(btnNovoJogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void lab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab1MouseClicked
        rodada(lab1);
    }//GEN-LAST:event_lab1MouseClicked

    private void lab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab2MouseClicked
         rodada(lab2);
    }//GEN-LAST:event_lab2MouseClicked

    private void lab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab3MouseClicked
        rodada(lab3);

    }//GEN-LAST:event_lab3MouseClicked

    private void lab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab4MouseClicked
        rodada(lab4);
    }//GEN-LAST:event_lab4MouseClicked

    private void lab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab5MouseClicked
        rodada(lab5);
    }//GEN-LAST:event_lab5MouseClicked

    private void lab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab6MouseClicked
        rodada(lab6);
    }//GEN-LAST:event_lab6MouseClicked

    private void lab7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab7MouseClicked
        rodada(lab7);
    }//GEN-LAST:event_lab7MouseClicked

    private void lab8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab8MouseClicked
        rodada(lab8);
    }//GEN-LAST:event_lab8MouseClicked

    private void lab9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab9MouseClicked
        rodada(lab9);
    }//GEN-LAST:event_lab9MouseClicked

    private void btnTelainicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelainicialActionPerformed
        restart = false;
        lab1.setText("");
        lab2.setText("");
        lab3.setText("");
        lab4.setText("");
        lab5.setText("");
        lab6.setText("");
        lab7.setText("");
        lab8.setText("");
        lab9.setText("");
        TelaLogin usuario1 = new TelaLogin();
        
        String nome = usuario1.nome;
        int idade = usuario1.idade;
        new TelaInicial(nome , idade).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTelainicialActionPerformed

    private void btnNovoJogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoJogo1ActionPerformed
        restart = false;
        lab1.setText("");
        lab2.setText("");
        lab3.setText("");
        lab4.setText("");
        lab5.setText("");
        lab6.setText("");
        lab7.setText("");
        lab8.setText("");
        lab9.setText("");
        rodada = 0;
    }//GEN-LAST:event_btnNovoJogo1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JogoDaVelha().setVisible(true));
    }

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoJogo1;
    private javax.swing.JButton btnTelainicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel lab9;
    private javax.swing.JLabel labAviso;
    private javax.swing.JLabel labJogadorO;
    private javax.swing.JLabel labJogadorX;
    private javax.swing.JLabel labPontoO;
    private javax.swing.JLabel labPontoX;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel panPrincipal;
    // End of variables declaration//GEN-END:variables
    

    void rodada(JLabel label){
        if(rodada % 2 == 0 && label.getText().equals("") && !restart){
            label.setText(jogador1);
            rodada ++;
            labAviso.setText("Vez do jogador 2");
                    verificaRodada();

        }else if(rodada % 2 != 0 && label.getText().equals("") && !restart){
            label.setText(jogador2);
            rodada ++;
            labAviso.setText("Vez do jogador 1");
                    verificaRodada();

        }
    }
    
    void verificaRodada(){
        if( //horizontais
            lab1.getText().equals(jogador1) && lab2.getText().equals(jogador1) && lab3.getText().equals(jogador1) || 
            lab4.getText().equals(jogador1) && lab5.getText().equals(jogador1) && lab6.getText().equals(jogador1) ||
            lab7.getText().equals(jogador1) && lab8.getText().equals(jogador1) && lab9.getText().equals(jogador1) ||
            //verticais   
            lab1.getText().equals(jogador1) && lab4.getText().equals(jogador1) && lab7.getText().equals(jogador1) || 
            lab2.getText().equals(jogador1) && lab5.getText().equals(jogador1) && lab8.getText().equals(jogador1) ||
            lab3.getText().equals(jogador1) && lab6.getText().equals(jogador1) && lab9.getText().equals(jogador1) ||
            //diagonal
            lab1.getText().equals(jogador1) && lab5.getText().equals(jogador1) && lab9.getText().equals(jogador1) || 
            lab3.getText().equals(jogador1) && lab5.getText().equals(jogador1) && lab7.getText().equals(jogador1) 
            ){
            pontoX ++;
            labPontoX.setText("" + pontoX);
            labAviso.setText("Jogador 1 Ganhou!!!");  
            restart = true;
        }else if(
            lab1.getText().equals(jogador2) && lab2.getText().equals(jogador2) && lab3.getText().equals(jogador2) || 
            lab4.getText().equals(jogador2) && lab5.getText().equals(jogador2) && lab6.getText().equals(jogador2) ||
            lab7.getText().equals(jogador2) && lab8.getText().equals(jogador2) && lab9.getText().equals(jogador2) ||
            //verticais   
            lab1.getText().equals(jogador2) && lab4.getText().equals(jogador2) && lab7.getText().equals(jogador2) || 
            lab2.getText().equals(jogador2) && lab5.getText().equals(jogador2) && lab8.getText().equals(jogador2) ||
            lab3.getText().equals(jogador2) && lab6.getText().equals(jogador2) && lab9.getText().equals(jogador2) ||
            //diagonal
            lab1.getText().equals(jogador2) && lab5.getText().equals(jogador2) && lab9.getText().equals(jogador2) || 
            lab3.getText().equals(jogador2) && lab5.getText().equals(jogador2) && lab7.getText().equals(jogador2) 
            ){
            pontoO++;
            labPontoO.setText("" + pontoO);
            labAviso.setText("Jogador 2 Ganhou!!!"); 
             restart = true;
        }else if(!lab1.getText().isEmpty() &&
                !lab2.getText().isEmpty() &&
                !lab3.getText().isEmpty() &&
                !lab4.getText().isEmpty() &&
                !lab5.getText().isEmpty() &&
                !lab6.getText().isEmpty() &&
                !lab7.getText().isEmpty() &&
                !lab8.getText().isEmpty() &&
                !lab9.getText().isEmpty()){
            labAviso.setText("Deu velha!");
            rodada = 0;
        }
    }




}
