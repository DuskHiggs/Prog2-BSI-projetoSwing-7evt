package com.mycompany.bsi.prog2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PingPong extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger
            = java.util.logging.Logger.getLogger(PingPong.class.getName());

    int x = 100, y = 50;
    int direcaox = 2, direcaoy = 2;

    int barraX = 100;
    int pontos = 0;

    JPanel jogo;

    public PingPong() {
        initComponents();

        setResizable(false);
        setLocationRelativeTo(null);
        
        // painel do jogo
        jogo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // bola cor, formato e tamanho
                g.setColor(Color.WHITE);
                g.fillOval(x, y, 20, 20);

                // barra cor, formato e tamanho
                g.setColor(Color.BLUE);
                g.fillRect(barraX, getHeight() - 30, 80, 10);
             
            }
            
        };

        jogo.setBackground(Color.BLACK);
        jogo.setFocusable(true);

        // layout
        panPrincipal.setLayout(new BorderLayout());
        panPrincipal.add(jogo, BorderLayout.CENTER);

        // teclado
        jogo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
                    barraX -= 15;
                }
                if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                    barraX += 15;
                }

                // limites da tela
                if (barraX < 0) {
                    barraX = 0;
                }
                if (barraX > jogo.getWidth() - 80) {
                    barraX = jogo.getWidth() - 80;
                }
            }
        });

        // foco
        SwingUtilities.invokeLater(() -> jogo.requestFocusInWindow());

        // timer
        Timer timer = new Timer(10, e -> atualizar());
        timer.start();
    }

    public void atualizar() {
        x += direcaox;
        y += direcaoy;

        // paredes
        if (x <= 0 || x >= jogo.getWidth() - 20) {
            direcaox *= -1;
        }
        if (y <= 0) {
            direcaoy *= -1;
        }

        // colisão com barra
        if (y >= jogo.getHeight() - 40
                && x >= barraX && x <= barraX + 80) {

            direcaoy *= -1;
            pontos++;
            labPontos.setText("Pontos: " + pontos);
        }

        // perdeu
        if (y > jogo.getHeight()) {
            JOptionPane.showMessageDialog(this, "Perdeu!");

            x = 100;
            y = 50;
            pontos = 0;
            labPontos.setText("Pontos: 0");
        }

        jogo.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labPontos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        panPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panPrincipalKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        labPontos.setForeground(new java.awt.Color(255, 255, 255));
        labPontos.setText("Pontos: ");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("voltar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labPontos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(labPontos))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panPrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panPrincipalKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_LEFT) {
            barraX -= 15;
        }
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_RIGHT) {
            barraX += 15;
            
            
            
            
            
            
            
            
        }    }//GEN-LAST:event_panPrincipalKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaLogin usuario1 = new TelaLogin();

        String nome = usuario1.nome;
        int idade = usuario1.idade;
        new TelaInicial(nome, idade).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, (UnsupportedLookAndFeelException) ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PingPong().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labPontos;
    private javax.swing.JPanel panPrincipal;
    // End of variables declaration//GEN-END:variables

}
