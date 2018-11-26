/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_assignment.Graphics;

import hci_assignment.BG_COLOR.BACKGROUND_COLOR;
import javax.swing.JFrame;

/**
 *
 * @author Janek
 */
public class GraphicsCompatibilitySettings extends javax.swing.JFrame {

    private GraphicsCompatibilitySettings thisClass;
    private javax.swing.JFrame previousWindow;
    //private javax.swing.JLabel BG_image;
    /**
     * Creates new form SoundSettings
     */
    public GraphicsCompatibilitySettings(javax.swing.JFrame previousWindow) {
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
        OffScreenDrawingText = new javax.swing.JLabel();
        FrameBufferTexturesText = new javax.swing.JLabel();
        FrameBufferAccessText = new javax.swing.JLabel();
        OffScreenSrawingBox = new javax.swing.JComboBox<>();
        FramebufferTexturesBox = new javax.swing.JComboBox<>();
        FramebufferAccessBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        AlphaMultiPassText = new javax.swing.JLabel();
        MaskBitText = new javax.swing.JLabel();
        AdvancedBlendingText = new javax.swing.JLabel();
        ScanlinesText = new javax.swing.JLabel();
        ScanlineBrightnessText = new javax.swing.JLabel();
        LineModeText = new javax.swing.JLabel();
        UnfilteredFrameBufferUpdatesText = new javax.swing.JLabel();
        Force15Text = new javax.swing.JLabel();
        ScreenSmoothingText = new javax.swing.JLabel();
        DisableScreensaverText = new javax.swing.JLabel();
        GteAccuracyText = new javax.swing.JLabel();
        ColorDitheringText = new javax.swing.JLabel();
        AlphaMultiPassTick = new javax.swing.JCheckBox();
        MaskBitTick = new javax.swing.JCheckBox();
        AdvancedBlendingTick = new javax.swing.JCheckBox();
        ScanlinesTick = new javax.swing.JCheckBox();
        ScanlineBrightnessInput = new javax.swing.JTextField();
        LineModeTick = new javax.swing.JCheckBox();
        UnfilteredFramebufferUpdatesTick = new javax.swing.JCheckBox();
        Force15Tick = new javax.swing.JCheckBox();
        ScreenSmoothingTick = new javax.swing.JCheckBox();
        DisableScreensaverTick = new javax.swing.JCheckBox();
        GteAccuracyTick = new javax.swing.JCheckBox();
        ColorDitheringTick = new javax.swing.JCheckBox();
        SaveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        SpecialGameFixesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(java.awt.Color.pink);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 440));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OffScreenDrawingText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OffScreenDrawingText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OffScreenDrawingText.setText("Off-Screen Drawing");
        MainPanel.add(OffScreenDrawingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 170, 40));

        FrameBufferTexturesText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FrameBufferTexturesText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FrameBufferTexturesText.setText("Framebuffer Textures");
        MainPanel.add(FrameBufferTexturesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 170, 40));

        FrameBufferAccessText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FrameBufferAccessText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FrameBufferAccessText.setText("Framebuffer access");
        MainPanel.add(FrameBufferAccessText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 170, 40));

        OffScreenSrawingBox.setBackground(new java.awt.Color(204, 204, 204));
        OffScreenSrawingBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None - fastest", "Minimum - Missing screens", "Standard", "Enhanced", "Extended - can cause garbage" }));
        OffScreenSrawingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffScreenSrawingBoxActionPerformed(evt);
            }
        });
        MainPanel.add(OffScreenSrawingBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 240, -1));

        FramebufferTexturesBox.setBackground(new java.awt.Color(204, 204, 204));
        FramebufferTexturesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emulated VRAM", "Black", "Graphics card's buffer", "Graphics card & RAM buffer" }));
        FramebufferTexturesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FramebufferTexturesBoxActionPerformed(evt);
            }
        });
        MainPanel.add(FramebufferTexturesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 240, -1));

        FramebufferAccessBox.setBackground(new java.awt.Color(204, 204, 204));
        FramebufferAccessBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emulated VRAM", "Graphics card Reads", "Graphics card Moves", "Graphics card Reads & Moves", "FULL Software drawing" }));
        FramebufferAccessBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FramebufferAccessBoxActionPerformed(evt);
            }
        });
        MainPanel.add(FramebufferAccessBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 240, -1));
        MainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 670, 10));

        AlphaMultiPassText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AlphaMultiPassText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AlphaMultiPassText.setText("Alpha MultiPass");
        MainPanel.add(AlphaMultiPassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 20));

        MaskBitText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaskBitText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MaskBitText.setText("Mask bit");
        MainPanel.add(MaskBitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 50, 20));

        AdvancedBlendingText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AdvancedBlendingText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AdvancedBlendingText.setText("Advanced blending");
        MainPanel.add(AdvancedBlendingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 110, 20));

        ScanlinesText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ScanlinesText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ScanlinesText.setText("Scanlines");
        MainPanel.add(ScanlinesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 50, 20));

        ScanlineBrightnessText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ScanlineBrightnessText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ScanlineBrightnessText.setText("Scanline brightness");
        MainPanel.add(ScanlineBrightnessText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, 20));

        LineModeText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LineModeText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LineModeText.setText("Line mode");
        MainPanel.add(LineModeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 60, 20));

        UnfilteredFrameBufferUpdatesText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UnfilteredFrameBufferUpdatesText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UnfilteredFrameBufferUpdatesText.setText("Unfiltered framebuffer updates");
        MainPanel.add(UnfilteredFrameBufferUpdatesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 170, 20));

        Force15Text.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Force15Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Force15Text.setText("Force 15 bit framebuffer updates");
        MainPanel.add(Force15Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 190, 20));

        ScreenSmoothingText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ScreenSmoothingText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ScreenSmoothingText.setText("Screen smoothing");
        MainPanel.add(ScreenSmoothingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, 20));

        DisableScreensaverText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisableScreensaverText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DisableScreensaverText.setText("Disable screensaver");
        MainPanel.add(DisableScreensaverText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 110, 20));

        GteAccuracyText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GteAccuracyText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GteAccuracyText.setText("Gte accuracy");
        MainPanel.add(GteAccuracyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 80, 20));

        ColorDitheringText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ColorDitheringText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ColorDitheringText.setText("Color dithering");
        MainPanel.add(ColorDitheringText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 80, 20));
        MainPanel.add(AlphaMultiPassTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));
        MainPanel.add(MaskBitTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));
        MainPanel.add(AdvancedBlendingTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));
        MainPanel.add(ScanlinesTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        ScanlineBrightnessInput.setText("255");
        MainPanel.add(ScanlineBrightnessInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 60, -1));
        MainPanel.add(LineModeTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));
        MainPanel.add(UnfilteredFramebufferUpdatesTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));
        MainPanel.add(Force15Tick, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));
        MainPanel.add(ScreenSmoothingTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));
        MainPanel.add(DisableScreensaverTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));
        MainPanel.add(GteAccuracyTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));
        MainPanel.add(ColorDitheringTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        SaveBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        MainPanel.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        BackBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        MainPanel.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        SpecialGameFixesBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpecialGameFixesBtn.setText("Special Game Fixes");
        SpecialGameFixesBtn.setToolTipText("Game specific fixes");
        SpecialGameFixesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialGameFixesBtnActionPerformed(evt);
            }
        });
        MainPanel.add(SpecialGameFixesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void SpecialGameFixesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialGameFixesBtnActionPerformed
       java.awt.EventQueue.invokeLater(() -> {
            SpecialGameFixes gcs = new SpecialGameFixes(thisClass);
            thisClass.setVisible(false);
            gcs.setVisible(true);
        });
    }//GEN-LAST:event_SpecialGameFixesBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void OffScreenSrawingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffScreenSrawingBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OffScreenSrawingBoxActionPerformed

    private void FramebufferTexturesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FramebufferTexturesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FramebufferTexturesBoxActionPerformed

    private void FramebufferAccessBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FramebufferAccessBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FramebufferAccessBoxActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            previousWindow.setVisible(true);
            thisClass.dispose();
        });
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdvancedBlendingText;
    private javax.swing.JCheckBox AdvancedBlendingTick;
    private javax.swing.JLabel AlphaMultiPassText;
    private javax.swing.JCheckBox AlphaMultiPassTick;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel ColorDitheringText;
    private javax.swing.JCheckBox ColorDitheringTick;
    private javax.swing.JLabel DisableScreensaverText;
    private javax.swing.JCheckBox DisableScreensaverTick;
    private javax.swing.JLabel Force15Text;
    private javax.swing.JCheckBox Force15Tick;
    private javax.swing.JLabel FrameBufferAccessText;
    private javax.swing.JLabel FrameBufferTexturesText;
    private javax.swing.JComboBox<String> FramebufferAccessBox;
    private javax.swing.JComboBox<String> FramebufferTexturesBox;
    private javax.swing.JLabel GteAccuracyText;
    private javax.swing.JCheckBox GteAccuracyTick;
    private javax.swing.JLabel LineModeText;
    private javax.swing.JCheckBox LineModeTick;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MaskBitText;
    private javax.swing.JCheckBox MaskBitTick;
    private javax.swing.JLabel OffScreenDrawingText;
    private javax.swing.JComboBox<String> OffScreenSrawingBox;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField ScanlineBrightnessInput;
    private javax.swing.JLabel ScanlineBrightnessText;
    private javax.swing.JLabel ScanlinesText;
    private javax.swing.JCheckBox ScanlinesTick;
    private javax.swing.JLabel ScreenSmoothingText;
    private javax.swing.JCheckBox ScreenSmoothingTick;
    private javax.swing.JButton SpecialGameFixesBtn;
    private javax.swing.JLabel UnfilteredFrameBufferUpdatesText;
    private javax.swing.JCheckBox UnfilteredFramebufferUpdatesTick;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}