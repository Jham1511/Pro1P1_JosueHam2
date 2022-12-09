/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pro1p1_josueham;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author SKX Kafei
 */
public class Recursion extends javax.swing.JFrame {

    static Random aleatorio = new Random();

    public Recursion() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        BtnMultiplicacionRec = new javax.swing.JButton();
        BtnConvertidor = new javax.swing.JButton();
        BtnMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Recursión ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnMultiplicacionRec.setBackground(new java.awt.Color(153, 153, 153));
        BtnMultiplicacionRec.setForeground(new java.awt.Color(255, 255, 255));
        BtnMultiplicacionRec.setText("Multiplicar matrices");
        BtnMultiplicacionRec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMultiplicacionRec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMultiplicacionRec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMultiplicacionRecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnMultiplicacionRecMouseExited(evt);
            }
        });
        BtnMultiplicacionRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicacionRecActionPerformed(evt);
            }
        });

        BtnConvertidor.setBackground(new java.awt.Color(153, 153, 153));
        BtnConvertidor.setForeground(new java.awt.Color(255, 255, 255));
        BtnConvertidor.setText("Convertidor Binario");
        BtnConvertidor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnConvertidor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnConvertidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnConvertidorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnConvertidorMouseExited(evt);
            }
        });
        BtnConvertidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConvertidorActionPerformed(evt);
            }
        });

        BtnMenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        BtnMenuPrincipal.setForeground(new java.awt.Color(255, 102, 102));
        BtnMenuPrincipal.setText("Menu Principal");
        BtnMenuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnMultiplicacionRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnConvertidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnConvertidor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BtnMultiplicacionRec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BtnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
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

    private void BtnMultiplicacionRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicacionRecActionPerformed
        String fil = JOptionPane.showInputDialog(null, "Filas de la matriz: ", "Filas de la matriz", 1);
        int filas = Integer.parseInt(fil);
        String col = JOptionPane.showInputDialog(null, "Columnas de la matriz: ", "Columnas de la matriz", 1);
        int columnas = Integer.parseInt(col);

        int[][] matriz1 = new int [filas][columnas];
        crear(matriz1, filas, columnas);

        String fil2 = JOptionPane.showInputDialog(null, "Filas de la matriz 2: ", "Filas de la matriz", 1);
        int filas2 = Integer.parseInt(fil2);
        String col2 = JOptionPane.showInputDialog(null, "Columnas de la matriz 2: ", "Columnas de la matriz", 1);
        int columnas2 = Integer.parseInt(col2);

        int[][] matriz2 = new int [filas2][columnas2];
        crear(matriz2, filas2, columnas2);

        if (columnas == filas2) {

        }//Fin if
        else {
            JOptionPane.showMessageDialog(null, "Las columnas de la matriz 1 deben ser iguales a las filas de la matriz 2");
        }//Fin else


    }//GEN-LAST:event_BtnMultiplicacionRecActionPerformed

    private void BtnConvertidorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConvertidorMouseEntered
        BtnConvertidor.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnConvertidorMouseEntered

    private void BtnConvertidorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConvertidorMouseExited
        BtnConvertidor.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_BtnConvertidorMouseExited

    private void BtnConvertidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConvertidorActionPerformed
        MenuConversiones conversiones = new MenuConversiones();
        conversiones.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnConvertidorActionPerformed

    private void BtnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuPrincipalActionPerformed
        BtnMenuPrincipal.setBackground(Color.red);
        BtnMenuPrincipal.setForeground(Color.white);
        Menu ventana = new Menu();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnMenuPrincipalActionPerformed

    private void BtnMultiplicacionRecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMultiplicacionRecMouseEntered
       BtnMultiplicacionRec.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnMultiplicacionRecMouseEntered

    private void BtnMultiplicacionRecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMultiplicacionRecMouseExited
        BtnMultiplicacionRec.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_BtnMultiplicacionRecMouseExited

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
            java.util.logging.Logger.getLogger(Recursion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recursion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recursion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recursion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recursion().setVisible(true);
            }
        });
    }

    public static int[][] crear(int[][] matriz, int filas, int columnas) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(10);
            }
        }
        return matriz;
    }//Fin del metodo crear matriz

    public static String imprimir(int[][] numeros, int filas, int columnas, String cad) {

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                cad += "[" + numeros[i][j] + "]";
            }
            cad += "\n";
        }
        return cad;
    }//Fin metodo imprimir


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConvertidor;
    private javax.swing.JButton BtnMenuPrincipal;
    private javax.swing.JButton BtnMultiplicacionRec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}