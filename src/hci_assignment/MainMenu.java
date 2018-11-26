/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_assignment;

import hci_assignment.BG_COLOR.BACKGROUND_COLOR;
import hci_assignment.BG_COLOR.ColorSettings;
import hci_assignment.CDROM.CDROMSettings;
import hci_assignment.CPU.CPUSettings;
import hci_assignment.CheatCodes.CheatCodesSettings;
import hci_assignment.MemoryCards.MemoryCardsSettings;
import hci_assignment.Controller.ControllerSettings;
import hci_assignment.Graphics.GraphicsSettings;
import hci_assignment.LanguageSettings.LanguageSettings;
import hci_assignment.PluginAndBIOS.GetUserDirectory;
import hci_assignment.PluginAndBIOS.PluginAndBIOS;
import hci_assignment.Sounds.SoundSettings;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Janek
 */
public class MainMenu extends javax.swing.JFrame {

    private MainMenu thisClass;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        thisClass = this;
        java.awt.EventQueue.invokeLater(() -> {
           // MainPanel.setBackground(BACKGROUND_COLOR.color);
            
            AddGamesBtnHidden1.setOpaque(false);
            AddGamesBtnHidden1.setContentAreaFilled(false);
            AddGamesBtnHidden1.setBorderPainted(false);
            StartGameBtnHidden.setOpaque(false);
            StartGameBtnHidden.setContentAreaFilled(false);
            StartGameBtnHidden.setBorderPainted(false);
            
            setResizable(false);
            
            setListDetails();
            addGame(null, null);
            addGame("/hci_assignment/images/Games/Spyro.png", "<html>Spyro the Dragon<br/> Last played: --/--/----</html>");
            addGame("/hci_assignment/images/Games/MetalGear.png", "<html>Metal Gear Solid<br/> Last played: 11/11/2018</html>");
            addGame("/hci_assignment/images/Games/ResidentEvil.png", "<html>Resident Evil<br/> Last played: 10/11/2018</html>");
            addGame("/hci_assignment/images/Games/SilentHill.png", "<html>Silent Hill<br/> Last played: 12/11/2018</html>");
            addGame("/hci_assignment/images/Games/Uno.png", "<html>Generic Game<br/> Last played: 13/13/4036</html>");
            addGame(null, null);
            addGame(null, null);
        });
    }
    
    public void setColorAgain()
    {
        MainPanel.setBackground(BACKGROUND_COLOR.color);
    }
    
    public void addGame(String imgLoc, String description)
    {
        if(imgLoc!=null && description!=null)
        {
            ImageIcon icon = new ImageIcon(getClass().getResource(imgLoc));
            DefaultTableModel model = (DefaultTableModel) GamesList.getModel();
            model.addRow(new Object[] {icon, description});
            GamesList.setRowHeight(GamesList.getRowCount()-1, icon.getIconHeight()+10);
        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) GamesList.getModel();
            model.addRow(new Object[] {null, null});
            GamesList.setRowHeight(GamesList.getRowCount()-1, 60);
        }
    }
    
    public void setListDetails()
    {
        String[] columns = {"Icon", "Description"};
        Object[][] rows = {  };
        
        //Allow images to appear
        DefaultTableModel model = new DefaultTableModel(rows, columns) {
            @Override
            public Class<?> getColumnClass(int column) {
                switch(column) {
                    case 0: return ImageIcon.class;
                    case 1: return String.class;
                    default: return Object.class;
                }
            }
        };
        GamesList.setModel(model);     
        
        //Prevent user selecting a value that is empty
        GamesList.setSelectionModel(new DefaultListSelectionModel()
        {
            @Override
            public boolean isSelectedIndex(final int index) 
            {
                boolean isSelected;
                if (GamesList.getModel().getValueAt(index, 0)==null) 
                {
                    isSelected = false;
                } 
                else 
                {
                    isSelected = super.isSelectedIndex(index);
                }
                return isSelected;
            }
        });
        
        //prevent users from editing anything
        GamesList.setDefaultEditor(Object.class, null);
        
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
        ColorSettings = new javax.swing.JButton();
        LanguageSettings = new javax.swing.JButton();
        LoadMoreGamesBtn = new javax.swing.JButton();
        StartGameBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GamesList = new javax.swing.JTable();
        StartGameBtnHidden = new javax.swing.JButton();
        AddGamesBtnHidden1 = new javax.swing.JButton();
        SearchBar = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SubPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        States = new javax.swing.JMenu();
        Load = new javax.swing.JMenu();
        LoadSlot1 = new javax.swing.JMenuItem();
        LoadSlot2 = new javax.swing.JMenuItem();
        LoadSlot3 = new javax.swing.JMenuItem();
        LoadOther = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenu();
        SaveSlot1 = new javax.swing.JMenuItem();
        SaveSlot2 = new javax.swing.JMenuItem();
        SaveSlot3 = new javax.swing.JMenuItem();
        SaveOther = new javax.swing.JMenuItem();
        Configuration = new javax.swing.JMenu();
        PluginAndBIOS = new javax.swing.JMenuItem();
        Graphics = new javax.swing.JMenuItem();
        Sound = new javax.swing.JMenuItem();
        Controllers = new javax.swing.JMenuItem();
        Advanced = new javax.swing.JMenu();
        CPU = new javax.swing.JMenuItem();
        CDROM = new javax.swing.JMenuItem();
        MemoryCards = new javax.swing.JMenuItem();
        Languages = new javax.swing.JMenuItem();
        CheatCodes = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ColorSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/ColorWheel.png"))); // NOI18N
        ColorSettings.setToolTipText("Background color settings");
        ColorSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorSettingsActionPerformed(evt);
            }
        });
        MainPanel.add(ColorSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 60, -1));

        LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/EnglishSmall.png"))); // NOI18N
        LanguageSettings.setToolTipText("Language Selection");
        LanguageSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanguageSettingsActionPerformed(evt);
            }
        });
        MainPanel.add(LanguageSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 80, -1));

        LoadMoreGamesBtn.setBackground(new java.awt.Color(204, 204, 204));
        LoadMoreGamesBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoadMoreGamesBtn.setText("Add Game");
        LoadMoreGamesBtn.setToolTipText("Add more games");
        LoadMoreGamesBtn.setActionCommand("Add Game");
        LoadMoreGamesBtn.setBorder(null);
        LoadMoreGamesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadMoreGamesBtnActionPerformed(evt);
            }
        });
        MainPanel.add(LoadMoreGamesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 110, 40));

        StartGameBtn.setBackground(new java.awt.Color(204, 204, 204));
        StartGameBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        StartGameBtn.setText("Start Game");
        StartGameBtn.setToolTipText("Start the selected game");
        StartGameBtn.setBorder(null);
        StartGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGameBtnActionPerformed(evt);
            }
        });
        MainPanel.add(StartGameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 110, 40));

        GamesList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GamesList.setModel(
            new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    //{null, null}
                },
                new String [] {
                    "Image", "Text"
                }
            ));
            jScrollPane1.setViewportView(GamesList);

            MainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 400, 570));

            StartGameBtnHidden.setToolTipText("Start the selected game");
            StartGameBtnHidden.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    StartGameBtnHiddenActionPerformed(evt);
                }
            });
            MainPanel.add(StartGameBtnHidden, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 110, 70));

            AddGamesBtnHidden1.setToolTipText("Add more games");
            AddGamesBtnHidden1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AddGamesBtnHidden1ActionPerformed(evt);
                }
            });
            MainPanel.add(AddGamesBtnHidden1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 110, 70));
            MainPanel.add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 150, -1));

            SearchBtn.setText("Search");
            SearchBtn.setToolTipText("Search for a game in the list");
            SearchBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SearchBtnActionPerformed(evt);
                }
            });
            MainPanel.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/MainBg_01.png"))); // NOI18N
            MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

            SubPanel.setBackground(new java.awt.Color(0, 0, 0));

            javax.swing.GroupLayout SubPanelLayout = new javax.swing.GroupLayout(SubPanel);
            SubPanel.setLayout(SubPanelLayout);
            SubPanelLayout.setHorizontalGroup(
                SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 550, Short.MAX_VALUE)
            );
            SubPanelLayout.setVerticalGroup(
                SubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 390, Short.MAX_VALUE)
            );

            MainPanel.add(SubPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 550, 390));

            States.setText("States");

            Load.setText("Load");
            Load.setToolTipText(null);
            Load.setPreferredSize(new java.awt.Dimension(120, 22));

            LoadSlot1.setText("Slot 1");
            LoadSlot1.setEnabled(false);
            LoadSlot1.setPreferredSize(new java.awt.Dimension(100, 22));
            Load.add(LoadSlot1);

            LoadSlot2.setText("Slot 2");
            LoadSlot2.setEnabled(false);
            Load.add(LoadSlot2);

            LoadSlot3.setText("Slot 3");
            LoadSlot3.setEnabled(false);
            Load.add(LoadSlot3);

            LoadOther.setText("Other");
            LoadOther.setEnabled(false);
            Load.add(LoadOther);

            States.add(Load);

            Save.setText("Save");
            Save.setToolTipText(null);

            SaveSlot1.setText("Slot 1");
            SaveSlot1.setEnabled(false);
            SaveSlot1.setPreferredSize(new java.awt.Dimension(100, 22));
            Save.add(SaveSlot1);

            SaveSlot2.setText("Slot 2");
            SaveSlot2.setEnabled(false);
            Save.add(SaveSlot2);

            SaveSlot3.setText("Slot 3");
            SaveSlot3.setEnabled(false);
            Save.add(SaveSlot3);

            SaveOther.setText("Other");
            SaveOther.setEnabled(false);
            Save.add(SaveOther);

            States.add(Save);

            jMenuBar1.add(States);

            Configuration.setText("Configuration");

            PluginAndBIOS.setText("Plugin & BIOS");
            PluginAndBIOS.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    PluginAndBIOSActionPerformed(evt);
                }
            });
            Configuration.add(PluginAndBIOS);

            Graphics.setText("Graphics");
            Graphics.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    GraphicsActionPerformed(evt);
                }
            });
            Configuration.add(Graphics);

            Sound.setText("Sound");
            Sound.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SoundActionPerformed(evt);
                }
            });
            Configuration.add(Sound);

            Controllers.setText("Controller(s)");
            Controllers.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ControllersActionPerformed(evt);
                }
            });
            Configuration.add(Controllers);

            Advanced.setText("Advanced");

            CPU.setText("CPU");
            CPU.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CPUActionPerformed(evt);
                }
            });
            Advanced.add(CPU);

            CDROM.setText("CD-ROM");
            CDROM.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CDROMActionPerformed(evt);
                }
            });
            Advanced.add(CDROM);

            MemoryCards.setText("Memory cards");
            MemoryCards.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MemoryCardsActionPerformed(evt);
                }
            });
            Advanced.add(MemoryCards);

            Languages.setText("Languages");
            Languages.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    LanguagesActionPerformed(evt);
                }
            });
            Advanced.add(Languages);

            CheatCodes.setText("Cheat codes");
            CheatCodes.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CheatCodesActionPerformed(evt);
                }
            });
            Advanced.add(CheatCodes);

            Configuration.add(Advanced);

            jMenuBar1.add(Configuration);

            About.setText("About");
            jMenuBar1.add(About);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void ColorSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorSettingsActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new ColorSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_ColorSettingsActionPerformed

    private void GraphicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphicsActionPerformed
         java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new GraphicsSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_GraphicsActionPerformed

    private void SoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new SoundSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_SoundActionPerformed

    private void LanguagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanguagesActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new LanguageSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_LanguagesActionPerformed

    private void PluginAndBIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PluginAndBIOSActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new PluginAndBIOS(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_PluginAndBIOSActionPerformed

    private void ControllersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControllersActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new ControllerSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_ControllersActionPerformed

    private void CPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPUActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new CPUSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_CPUActionPerformed

    private void CDROMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDROMActionPerformed
         java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new CDROMSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_CDROMActionPerformed

    private void MemoryCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemoryCardsActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new MemoryCardsSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_MemoryCardsActionPerformed

    private void CheatCodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheatCodesActionPerformed
         java.awt.EventQueue.invokeLater(() -> {
          //  thisClass.setVisible(false);
            new CheatCodesSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_CheatCodesActionPerformed

    private void LanguageSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanguageSettingsActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
           // thisClass.setVisible(false);
            new LanguageSettings(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_LanguageSettingsActionPerformed

    private void LoadMoreGamesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadMoreGamesBtnActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new GetUserDirectory(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_LoadMoreGamesBtnActionPerformed

    private void StartGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartGameBtnActionPerformed

    private void StartGameBtnHiddenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameBtnHiddenActionPerformed
        
    }//GEN-LAST:event_StartGameBtnHiddenActionPerformed

    private void AddGamesBtnHidden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGamesBtnHidden1ActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new GetUserDirectory(thisClass).setVisible(true);
        });
    }//GEN-LAST:event_AddGamesBtnHidden1ActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            String lookingFor = SearchBar.getText();
            int length = GamesList.getRowCount();
            for(int i=0;i<length;i++)
            {  
                String content = (String)GamesList.getValueAt(i, 1);
                if(content!=null)
                {
                    if(content.contains(lookingFor))
                   {
                        GamesList.setRowSelectionInterval(i, i);
                       return;
                    }
                }
            }
         });
    }//GEN-LAST:event_SearchBtnActionPerformed
    
    public void setLanguageFlag(int flag)
    {
        System.out.println(flag);
        //LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/EnglishSmall.png")));
        switch(flag)
        {
            case 0:
                 LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/EnglishSmall.png")));
                 break;
            case 1:
                 LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/NotEnglishSmall.png")));
                 break;
            case 2:
                 LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/Italian.png")));
                 break;
            case 3:
                 LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/Chinese.png")));
                 break;
            case 4:
                 LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/ChineseTrad.png")));
                 break;
            case 5:
                 LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/Russian.png")));
                 break;
            case 6:
                 LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/Portuguese.png")));
                 break;
            default:
                 LanguageSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_assignment/images/flags/small/EnglishSmall.png")));
                 break;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JButton AddGamesBtnHidden1;
    private javax.swing.JMenu Advanced;
    private javax.swing.JMenuItem CDROM;
    private javax.swing.JMenuItem CPU;
    private javax.swing.JMenuItem CheatCodes;
    private javax.swing.JButton ColorSettings;
    private javax.swing.JMenu Configuration;
    private javax.swing.JMenuItem Controllers;
    private javax.swing.JTable GamesList;
    private javax.swing.JMenuItem Graphics;
    private javax.swing.JButton LanguageSettings;
    private javax.swing.JMenuItem Languages;
    private javax.swing.JMenu Load;
    private javax.swing.JButton LoadMoreGamesBtn;
    private javax.swing.JMenuItem LoadOther;
    private javax.swing.JMenuItem LoadSlot1;
    private javax.swing.JMenuItem LoadSlot2;
    private javax.swing.JMenuItem LoadSlot3;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem MemoryCards;
    private javax.swing.JMenuItem PluginAndBIOS;
    private javax.swing.JMenu Save;
    private javax.swing.JMenuItem SaveOther;
    private javax.swing.JMenuItem SaveSlot1;
    private javax.swing.JMenuItem SaveSlot2;
    private javax.swing.JMenuItem SaveSlot3;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JMenuItem Sound;
    private javax.swing.JButton StartGameBtn;
    private javax.swing.JButton StartGameBtnHidden;
    private javax.swing.JMenu States;
    private javax.swing.JPanel SubPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
