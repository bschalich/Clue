package com.outtatech.client;

/**
 * Version-latenightpizzaparty
 *
 * @author Thomas
 */
public class LobbyScreen extends javax.swing.JFrame
{

    private int numPlayers = 0, selectedRow = -1;

    private int[] playerIds =
    {
        -1, -1, -1, -1, -1
    };

    private int id = -1;

    GUIController controller;

    /**
     * Version-latenightpizzaparty
     * Creates new form LobbyScreen
     */
    public LobbyScreen()
    {
        initComponents();
    }

    /**
     * Version-latenightpizzaparty
     * Alternate constructor to take a GUIController in
     *
     * @param ctrl method parameter
     */
    public LobbyScreen(GUIController ctrl)
    {
        //set controller to ctrl
        controller = ctrl;

        initComponents();

        gameStartButton.setEnabled(false);
    }

    /**
     * Version-latenightpizzaparty
     *
     * @param lobbyId method parameter
     */
    public void setId(int lobbyId)
    {
        id = lobbyId;
    }

    /**
     * Version-latenightpizzaparty
     * Adds a player to the lobby
     *
     * @param playerName method parameter
     * @param playerId method parameter
     * @param isPlayer method parameter
     */
    public void addPlayer(String playerName, Integer playerId, boolean isPlayer)
    {
        //set player list text to current text + playerName + "waiting..."
        String name = playerName;
        // Guard against this
        if (isPlayer)
        {
            name = name + " (You)";
        }
        playerList.setValueAt(name, numPlayers, 0);

        //set playerIds[numPlayers] to the player's id
        playerIds[numPlayers] = playerId;

        //increment numPlayers
        numPlayers++;
    }

    /**
     * Version-latenightpizzaparty
     *
     * @param isLeader method parameter
     */
    public void setLeader(boolean isLeader)
    {
        createAIButton.setEnabled(isLeader);
        kickPlayerButton.setEnabled(isLeader);
        // Guard against this
        if (numPlayers >= 3)
        {
            gameStartButton.setEnabled(isLeader);
        }
        if(numPlayers == 5)
        {
            createAIButton.setEnabled(false);
        }
    }

    /**
     * Version-latenightpizzaparty
     * Clears all players from the lobby
     */
    public void clearPlayers()
    {
        //set the player list text to ""
        playerList.setValueAt("", 0, 0);
        playerList.setValueAt("", 1, 0);
        playerList.setValueAt("", 2, 0);
        playerList.setValueAt("", 3, 0);
        playerList.setValueAt("", 4, 0);

        //set numPlayers to 0
        numPlayers = 0;

        //set playerIds to -1 at all indicies
        playerIds[0] = -1;
        playerIds[1] = -1;
        playerIds[2] = -1;
        playerIds[3] = -1;
        playerIds[4] = -1;

        gameStartButton.setEnabled(false);
    }

    /**
     * Version-latenightpizzaparty
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        gameStartButton = new javax.swing.JButton();
        createAIButton = new javax.swing.JButton();
        kickPlayerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        playerList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        gameStartButton.setText("START!");
        gameStartButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                gameStartButtonMouseClicked(evt);
            }
        });

        createAIButton.setText("Create AI");
        createAIButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                createAIButtonMouseClicked(evt);
            }
        });

        kickPlayerButton.setText("Kick Player");
        kickPlayerButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                kickPlayerButtonMouseClicked(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                exitButtonMouseClicked(evt);
            }
        });

        playerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Players:"
            }
        )
        {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        playerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        playerList.setShowHorizontalLines(false);
        playerList.setShowVerticalLines(false);
        jScrollPane2.setViewportView(playerList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kickPlayerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gameStartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(createAIButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameStartButton)
                    .addComponent(createAIButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kickPlayerButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameStartButtonMouseClicked(java.awt.event.MouseEvent evt)
    {//GEN-FIRST:event_gameStartButtonMouseClicked
        // Guard against this
        if (gameStartButton.isEnabled())
        {
            //call controller's startGame method
            controller.startGame();
        }
    }//GEN-LAST:event_gameStartButtonMouseClicked

    private void createAIButtonMouseClicked(java.awt.event.MouseEvent evt)
    {//GEN-FIRST:event_createAIButtonMouseClicked
        // Guard against this
        if (createAIButton.isEnabled())
        {
            //call controller's createAI method
            controller.createAI(id);
        }
    }//GEN-LAST:event_createAIButtonMouseClicked

    private void kickPlayerButtonMouseClicked(java.awt.event.MouseEvent evt)
    {//GEN-FIRST:event_kickPlayerButtonMouseClicked
        //call controller's kickPlayer method with the selected player's id
        int indx = playerList.getSelectedRow();

        // Guard against this
        if (indx >= 0 && kickPlayerButton.isEnabled())
        {
            controller.kickPlayer(playerIds[indx]);
        }
    }//GEN-LAST:event_kickPlayerButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt)
    {//GEN-FIRST:event_exitButtonMouseClicked
        //call controller's exitWindow method
        controller.exitWindow();
    }//GEN-LAST:event_exitButtonMouseClicked

    /**
     * Version-latenightpizzaparty
     * @param args the command line arguments method parameter
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        // Just in case...
        try
        {
            // Iterate over this set
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                // Guard against this
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LobbyScreen.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LobbyScreen.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LobbyScreen.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LobbyScreen.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LobbyScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAIButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gameStartButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kickPlayerButton;
    private javax.swing.JTable playerList;
    // End of variables declaration//GEN-END:variables
}
