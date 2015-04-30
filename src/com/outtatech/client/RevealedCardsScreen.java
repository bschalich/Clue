package com.outtatech.client;

import com.outtatech.common.ActionCard;
import com.outtatech.common.ActionCardType;
import com.outtatech.common.Card;
import com.outtatech.common.CardType;
import com.outtatech.common.DestinationCard;
import com.outtatech.common.DestinationID;
import com.outtatech.common.HintCard;
import com.outtatech.common.HintCardType;
import com.outtatech.common.PrivateTip;
import com.outtatech.common.PrivateTipType;
import com.outtatech.common.Suggestion;
import com.outtatech.common.SuggestionType;
import com.outtatech.common.SuperSleuth;
import com.outtatech.common.SuperSleuthType;
import com.outtatech.common.SuspectCard;
import com.outtatech.common.SuspectID;
import com.outtatech.common.VehicleCard;
import com.outtatech.common.VehicleID;
import java.awt.List;
import javax.swing.ImageIcon;

/**
 * Version-latenightpizzaparty
 *
 * @author Thomas
 */
public class RevealedCardsScreen extends javax.swing.JFrame
{
    GUIController controller;
    
    CardTranslator translate;

    /**
     * Version-latenightpizzaparty
     * Creates new form RevealedCardsScreen
     */
    public RevealedCardsScreen()
    {
        initComponents();
    }
    
    public RevealedCardsScreen(GUIController ctrl)
    {
        controller = ctrl;
        translate = new CardTranslator(ctrl);
        
        initComponents();
        
        hintImage1.setText("");
        hintImage2.setText("");
        hintImage3.setText("");
        hintImage4.setText("");
        hintImage5.setText("");
    }
    
    public void setCards(java.util.List<Card> cards)
    {
        String path;
        boolean[] filled =
        {
            false, false, false, false, false, false
        };
        hintImage1.setIcon(new ImageIcon());
        hintImage2.setIcon(new ImageIcon());
        hintImage3.setIcon(new ImageIcon());
        hintImage4.setIcon(new ImageIcon());
        hintImage5.setIcon(new ImageIcon());
        // Iterate over this set
        for (int indx = 0; indx < cards.size(); indx++)
        {
            path = translate.getPath(cards.get(indx));
            if(!filled[0])
            {
                filled[0] = true;
                hintImage1.setIcon(new ImageIcon(path));
            }
            else if(!filled[1])
            {
                filled[1] = true;
                hintImage2.setIcon(new ImageIcon(path));
            }
            else if(!filled[2])
            {
                filled[2] = true;
                hintImage3.setIcon(new ImageIcon(path));
            }
            else if(!filled[3])
            {
                filled[3] = true;
                hintImage4.setIcon(new ImageIcon(path));
            }
            else if(!filled[4])
            {
                filled[4] = true;
                hintImage5.setIcon(new ImageIcon(path));
            }
        }
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hintImage1 = new javax.swing.JLabel();
        hintImage2 = new javax.swing.JLabel();
        hintImage3 = new javax.swing.JLabel();
        hintImage4 = new javax.swing.JLabel();
        hintImage5 = new javax.swing.JLabel();

        jLabel1.setText("These cards have been shown to you");

        jButton1.setText("Close");

        hintImage1.setText("I1");

        hintImage2.setText("I2");

        hintImage3.setText("I3");

        hintImage4.setText("I4");

        hintImage5.setText("I5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hintImage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hintImage2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hintImage3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hintImage4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hintImage5)))
                        .addGap(0, 185, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hintImage1)
                    .addComponent(hintImage2)
                    .addComponent(hintImage3)
                    .addComponent(hintImage4)
                    .addComponent(hintImage5))
                .addGap(97, 97, 97)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RevealedCardsScreen.class.
                    getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RevealedCardsScreen.class.
                    getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RevealedCardsScreen.class.
                    getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RevealedCardsScreen.class.
                    getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RevealedCardsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hintImage1;
    private javax.swing.JLabel hintImage2;
    private javax.swing.JLabel hintImage3;
    private javax.swing.JLabel hintImage4;
    private javax.swing.JLabel hintImage5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
