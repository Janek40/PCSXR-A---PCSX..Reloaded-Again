/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_assignment.Sounds;

import hci_assignment.BG_COLOR.BACKGROUND_COLOR;
import javax.swing.JFrame;

/**
 *
 * @author Janek
 */
public class AdvancedSoundSettings extends javax.swing.JFrame {

    private AdvancedSoundSettings thisClass;
    private javax.swing.JFrame previousWindow;
    /**
     * Creates new form SoundSettings
     */
    public AdvancedSoundSettings(javax.swing.JFrame previousWindow) {
        initComponents();
        thisClass = this;
        this.previousWindow = previousWindow;
        MainPanel.setBackground(BACKGROUND_COLOR.color);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        XAMusic = new javax.swing.JLabel();
        SPUIQR = new javax.swing.JLabel();
        MonoSound = new javax.swing.JLabel();
        FreqResponse = new javax.swing.JLabel();
        BG_image = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        DebugMode = new javax.swing.JLabel();
        SoundRecWindow = new javax.swing.JLabel();
        XAMusicTick1 = new javax.swing.JCheckBox();
        SPUIQRTick = new javax.swing.JCheckBox();
        MonoSoundTick = new javax.swing.JCheckBox();
        FreqResponseTick = new javax.swing.JCheckBox();
        DebugModeTick = new javax.swing.JCheckBox();
        SoundRecWindowTick = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(java.awt.Color.pink);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 440));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        XAMusic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        XAMusic.setText("XA Music");
        MainPanel.add(XAMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 40));

        SPUIQR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SPUIQR.setText("SPU IQR");
        MainPanel.add(SPUIQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 70, 40));

        MonoSound.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MonoSound.setText("Mono Sound");
        MainPanel.add(MonoSound, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 40));

        FreqResponse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FreqResponse.setText("Frequency Response");
        MainPanel.add(FreqResponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 40));

        BG_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/Settings_advanced_bg.png"))); // NOI18N
        MainPanel.add(BG_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 680, 390));

        SaveBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        MainPanel.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        BackBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        MainPanel.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        DebugMode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DebugMode.setText("Debug Mode");
        MainPanel.add(DebugMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 40));

        SoundRecWindow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SoundRecWindow.setText("Sound recording window");
        MainPanel.add(SoundRecWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, 40));

        XAMusicTick1.setMaximumSize(new java.awt.Dimension(32, 32));
        XAMusicTick1.setMinimumSize(new java.awt.Dimension(32, 32));
        MainPanel.add(XAMusicTick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        SPUIQRTick.setMaximumSize(new java.awt.Dimension(32, 32));
        SPUIQRTick.setMinimumSize(new java.awt.Dimension(32, 32));
        MainPanel.add(SPUIQRTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        MonoSoundTick.setMaximumSize(new java.awt.Dimension(32, 32));
        MonoSoundTick.setMinimumSize(new java.awt.Dimension(32, 32));
        MainPanel.add(MonoSoundTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        FreqResponseTick.setMaximumSize(new java.awt.Dimension(32, 32));
        FreqResponseTick.setMinimumSize(new java.awt.Dimension(32, 32));
        MainPanel.add(FreqResponseTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        DebugModeTick.setMaximumSize(new java.awt.Dimension(32, 32));
        DebugModeTick.setMinimumSize(new java.awt.Dimension(32, 32));
        MainPanel.add(DebugModeTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        SoundRecWindowTick.setMaximumSize(new java.awt.Dimension(32, 32));
        SoundRecWindowTick.setMinimumSize(new java.awt.Dimension(32, 32));
        MainPanel.add(SoundRecWindowTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        System.out.println("Advanced settings");
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                previousWindow.setVisible(true);
                thisClass.dispose();
            }
        });
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_image;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel DebugMode;
    private javax.swing.JCheckBox DebugModeTick;
    private javax.swing.JLabel FreqResponse;
    private javax.swing.JCheckBox FreqResponseTick;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MonoSound;
    private javax.swing.JCheckBox MonoSoundTick;
    private javax.swing.JLabel SPUIQR;
    private javax.swing.JCheckBox SPUIQRTick;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel SoundRecWindow;
    private javax.swing.JCheckBox SoundRecWindowTick;
    private javax.swing.JLabel XAMusic;
    private javax.swing.JCheckBox XAMusicTick1;
    // End of variables declaration//GEN-END:variables
}
