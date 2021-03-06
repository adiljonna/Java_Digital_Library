/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Muhammad Adil FAYYAZ
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        process = new javax.swing.JLabel();
        load = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 0, 255));
        setMaximumSize(new java.awt.Dimension(820, 530));
        setMinimumSize(new java.awt.Dimension(820, 530));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(820, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 530));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/splash.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 20, 503, 366);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/splash_1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 420, 480, 70);

        ProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        ProgressBar.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(ProgressBar);
        ProgressBar.setBounds(0, 520, 820, 14);

        process.setForeground(new java.awt.Color(255, 255, 255));
        process.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        process.setText("jLabel4");
        process.setToolTipText("");
        jPanel1.add(process);
        process.setBounds(730, 500, 80, 20);

        load.setForeground(new java.awt.Color(255, 255, 255));
        load.setText("jLabel4");
        jPanel1.add(load);
        load.setBounds(0, 500, 360, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(820, 530));
        jLabel1.setMinimumSize(new java.awt.Dimension(820, 530));
        jLabel1.setPreferredSize(new java.awt.Dimension(820, 530));
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JProgressBar getProgressBar() {
        return ProgressBar;
    }

    public void setProgressBar(JProgressBar ProgressBar) {
        this.ProgressBar = ProgressBar;
    }
    public JLabel getProcess() {
        return process;
    }

    public void setProcess(JLabel process) {
        this.process = process;
    }

    public JLabel getLoad() {
        return load;
    }

    public void setLoad(JLabel load) {
        this.load = load;
    }

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel load;
    private javax.swing.JLabel process;
    // End of variables declaration//GEN-END:variables
}
