package com.outtatech.client;

import com.outtatech.common.Suggestion;
import javax.swing.ImageIcon;

/**
 * Version-latenightpizzaparty
 *
 * @author Thomas
 */
public class AccusationScreen extends javax.swing.JFrame
{

    GUIController controller;
    
    CardTranslator translate;
    
    boolean performAction = true;
    
    boolean isSuggestion = false;
    
    Suggestion card;

    /**
     * Version-latenightpizzaparty
     * Creates new form AccusationScreen
     */
    public AccusationScreen()
    {
        initComponents();
        
    }

    /**
     * Version-latenightpizzaparty
     * Alternate constructor to take a GUIController in
     *
     * @param ctrl method parameter
     */
    public AccusationScreen(GUIController ctrl, boolean isSug,
            Suggestion sCard)
    {
        //set controller = ctrl
        controller = ctrl;
        translate = new CardTranslator(ctrl);
        
        isSuggestion = isSug;
        
        card = sCard;

        initComponents();
        
        if(isSug)
        {
            accuseButton.setText("Suggest");
            jLabel1.setText("Make a suggestion:");
        }        
        
        updateImages();
        
        updateDropDowns();
    }
    
    public void updateDropDowns()
    {      
        performAction = false;
        
        cardDropDown1.removeAllItems();
        cardDropDown2.removeAllItems();
        cardDropDown3.removeAllItems();
        
        cardDropDown1.addItem(translate.getName("suspect", 0));
        cardDropDown1.addItem(translate.getName("suspect", 1));
        cardDropDown1.addItem(translate.getName("suspect", 2));
        cardDropDown1.addItem(translate.getName("suspect", 3));
        cardDropDown1.addItem(translate.getName("suspect", 4));
        cardDropDown1.addItem(translate.getName("suspect", 5));
        
        cardDropDown2.addItem(translate.getName("vehicle", 0));
        cardDropDown2.addItem(translate.getName("vehicle", 1));
        cardDropDown2.addItem(translate.getName("vehicle", 2));
        cardDropDown2.addItem(translate.getName("vehicle", 3));
        cardDropDown2.addItem(translate.getName("vehicle", 4));
        cardDropDown2.addItem(translate.getName("vehicle", 5));
        
        cardDropDown3.addItem(translate.getName("location", 0));
        cardDropDown3.addItem(translate.getName("location", 1));
        cardDropDown3.addItem(translate.getName("location", 2));
        cardDropDown3.addItem(translate.getName("location", 3));
        cardDropDown3.addItem(translate.getName("location", 4));
        cardDropDown3.addItem(translate.getName("location", 5));
        cardDropDown3.addItem(translate.getName("location", 6));
        cardDropDown3.addItem(translate.getName("location", 7));
        cardDropDown3.addItem(translate.getName("location", 8));
        
        performAction = true;
    }

    public void updateImages()
    {
        int suspectNumber = cardDropDown1.getSelectedIndex();
        int vehicleNumber = cardDropDown2.getSelectedIndex();
        int locationNumber = cardDropDown3.getSelectedIndex();
        
        image1.setText("");
        image2.setText("");
        image3.setText("");

        image1.setIcon(new ImageIcon(translate.getPath(
                translate.getCard("suspect", suspectNumber))));

        image2.setIcon(new ImageIcon(translate.getPath(
                translate.getCard("vehicle", vehicleNumber))));

        image3.setIcon(new ImageIcon(translate.getPath(
                translate.getCard("location", locationNumber))));
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

        cardDropDown1 = new javax.swing.JComboBox();
        cardDropDown2 = new javax.swing.JComboBox();
        cardDropDown3 = new javax.swing.JComboBox();
        accuseButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();

        cardDropDown1.setMaximumRowCount(9);
        cardDropDown1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suspect1", "Suspect2", "Suspect3", "Suspect4", "Suspect5", "Suspect6" }));
        cardDropDown1.setPreferredSize(new java.awt.Dimension(70, 20));
        cardDropDown1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cardDropDown1ActionPerformed(evt);
            }
        });

        cardDropDown2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vehicle1", "Vehicle2", "Vehicle3", "Vehicle4", "Vehicle5", "Vehicle6" }));
        cardDropDown2.setPreferredSize(new java.awt.Dimension(70, 20));
        cardDropDown2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cardDropDown2ActionPerformed(evt);
            }
        });

        cardDropDown3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Location1", "Location2", "Location3", "Location4", "Location5", "Location6", "Location7", "Location8", "Location9" }));
        cardDropDown3.setPreferredSize(new java.awt.Dimension(70, 20));
        cardDropDown3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cardDropDown3ActionPerformed(evt);
            }
        });

        accuseButton.setText("ACCUSE!");
        accuseButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                accuseButtonMouseClicked(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                closeButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Make an accusation:");

        image1.setText("I1");

        image2.setText("I2");

        image3.setText("I3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardDropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(accuseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardDropDown2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(image2))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(image3)
                            .addComponent(cardDropDown3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(image1)
                    .addComponent(image3)
                    .addComponent(image2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardDropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cardDropDown3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cardDropDown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accuseButton)
                    .addComponent(closeButton))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt)
    {//GEN-FIRST:event_closeButtonMouseClicked
        //close the window
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void accuseButtonMouseClicked(java.awt.event.MouseEvent evt)
    {//GEN-FIRST:event_accuseButtonMouseClicked
        //call controller's makeAccusation method with the card types of
        //the three selected cards
        int suspectNumber = cardDropDown1.getSelectedIndex();
        int vehicleNumber = cardDropDown2.getSelectedIndex();
        int locationNumber = cardDropDown3.getSelectedIndex();
        
        if(!isSuggestion)
        {
            controller.makeAccusation(translate.getCard("suspect", suspectNumber),
                    translate.getCard("vehicle", vehicleNumber),
                    translate.getCard("location", locationNumber));
        }
        else
        {
            controller.makeSuggestion(translate.getCard("suspect", suspectNumber),
                    translate.getCard("vehicle", vehicleNumber),
                    translate.getCard("location", locationNumber), card);
        }
    }//GEN-LAST:event_accuseButtonMouseClicked

    private void cardDropDown1ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_cardDropDown1ActionPerformed
        //set cardImage1 to image of selected card
        if(performAction)
        {
            updateImages();
        }
    }//GEN-LAST:event_cardDropDown1ActionPerformed

    private void cardDropDown2ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_cardDropDown2ActionPerformed
        //set cardImage2 to image of selected card
        if(performAction)
        {
            updateImages();
        }
    }//GEN-LAST:event_cardDropDown2ActionPerformed

    private void cardDropDown3ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_cardDropDown3ActionPerformed
        //set cardImage3 to image of selected card
        if(performAction)
        {
            updateImages();
        }
    }//GEN-LAST:event_cardDropDown3ActionPerformed

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
            java.util.logging.Logger.getLogger(AccusationScreen.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AccusationScreen.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AccusationScreen.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AccusationScreen.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AccusationScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accuseButton;
    private javax.swing.JComboBox cardDropDown1;
    private javax.swing.JComboBox cardDropDown2;
    private javax.swing.JComboBox cardDropDown3;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
