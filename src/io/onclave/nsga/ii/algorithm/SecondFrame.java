/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.onclave.nsga.ii.algorithm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author n9572791
 */
public class SecondFrame extends javax.swing.JFrame {
    private static String dataLocation = "";
    private static String relationshipLocation = "";

    /**
     * Creates new form SecondFrame
     */
    public SecondFrame() {
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

        loadTablesTextFeild = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        loadTablesTextFeild1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadTablesTextFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTablesTextFeildActionPerformed(evt);
            }
        });

        jLabel7.setText("Select the file with data related to MSs");

        jButton12.setText("Load Data");
        jButton12.setActionCommand("");
        jButton12.setFocusPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12loadTableBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Execute");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        loadTablesTextFeild1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTablesTextFeild1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Select the file with data related to Node Calls");

        jButton13.setText("Load Relationships");
        jButton13.setActionCommand("");
        jButton13.setFocusPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13loadTableBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadTablesTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loadTablesTextFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadTablesTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadTablesTextFeild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadTablesTextFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTablesTextFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadTablesTextFeildActionPerformed

    private void jButton12loadTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12loadTableBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action");

            }
        });

        int status = fileChooser.showOpenDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            dataLocation = file.getAbsolutePath();
            loadTablesTextFeild.setText(dataLocation);
            //System.out.println(file.getAbsolutePath());
        } else if (status == JFileChooser.CANCEL_OPTION) {
            System.out.println("calceled");

        }
    }//GEN-LAST:event_jButton12loadTableBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //This is the text
       
       String st = ""; 
       File file = new File(dataLocation); 
            
            BufferedReader br;
        
           try { 
               br = new BufferedReader(new FileReader(file));
               String stt="";
                while ((stt=br.readLine()) != null){ 
                    st = st +  stt;
                }
               
           } catch (Exception ex) {
               Logger.getLogger(SecondFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           String st1 = ""; 
           File file1 = new File(relationshipLocation); 
            
            BufferedReader br1;
        
           try { 
               br1 = new BufferedReader(new FileReader(file1));
               String stt="";
                while ((stt=br1.readLine()) != null){ 
                    st1 = st1 +  stt;
                }
               
           } catch (Exception ex) {
               Logger.getLogger(SecondFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
  
            processingTextFiles(st,st1);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void loadTablesTextFeild1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTablesTextFeild1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadTablesTextFeild1ActionPerformed

    private void jButton13loadTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13loadTableBtnActionPerformed
        // TODO add your handling code here:
         JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action");

            }
        });

        int status = fileChooser.showOpenDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            relationshipLocation = file.getAbsolutePath();
            loadTablesTextFeild1.setText(relationshipLocation);
            //System.out.println(file.getAbsolutePath());
        } else if (status == JFileChooser.CANCEL_OPTION) {
            System.out.println("calceled");

        }
        
        
    }//GEN-LAST:event_jButton13loadTableBtnActionPerformed

    
    public static void processingTextFiles(String data, String relationships){
        
        
        //Here we try to process the data tha we use
        String splitOne[] = data.split("@@@");
        
        ArrayList internalCost = new ArrayList();
        ArrayList externalCost = new ArrayList();
        List<List<String>> nodes = new ArrayList<List<String>>();
        
        for(int i=0; i<splitOne.length; i++){
            if(i%3==0 || i == 0){
                String SplitTwo[] = splitOne[i].split("\\|");
                String SplitThree[] = SplitTwo[1].split(",");
                ArrayList temp = new ArrayList();
                for(int k = 0; k<SplitThree.length; k++){
                    temp.add(SplitThree[k]);
                }
                nodes.add(temp);
            }else if(i%3==1){
                String SplitTwo[] = splitOne[i].split("\\|");
                externalCost.add(SplitTwo[1]);
            }else if(i%3==2){
                String SplitTwo[] = splitOne[i].split("\\|");
                internalCost.add(SplitTwo[1]);
            }
        }
        
        
        String relSplitOne[] = relationships.split(",");
        ArrayList relationshipNodes = new ArrayList(); //This contains the relationship nodes such as "1-2"
        ArrayList numberOfCalls = new ArrayList(); //This contains the number of calls between differen nodes such as "5". Which means 5 calls between "1-2"
        
        for(int i = 0; i < relSplitOne.length; i++){
            String relSplitTwo[] = relSplitOne[i].split("-");
            relationshipNodes.add(relSplitTwo[0]+"-"+relSplitTwo[1]);
            numberOfCalls.add(relSplitTwo[2]);
        }
        
        
        
        
        System.out.print("Test");
        processingForGraphgeneration(nodes, internalCost, relationshipNodes, numberOfCalls);
    }
    
    
    
    //This is the method that we use to process the data to be presented in the graphs
    public static void processingForGraphgeneration(List<List<String>> nodes, ArrayList internalCost, ArrayList relationshipNodes, ArrayList numberOfCalls){
        
        
        
        ArrayList microservicesInteractions = new ArrayList(); //This contains the interactions between MSs. If MS1 is related to MS2 this will store it as "1-2".
        ArrayList numberOfCallsBetween = new ArrayList(); //This contains the number of call between those interactions
        
        
        for(int i = 0; i < relationshipNodes.size(); i++){
            String split[] = relationshipNodes.get(i).toString().split("-");
            
                int one = 100000;
                int two = 100000;
            for(int j = 0; j < nodes.size(); j++){
                
                ArrayList temp = (ArrayList)nodes.get(j);
                
                if(temp.contains(split[0]) && !temp.contains(split[1])){
                    one =  j;
                }else if(!temp.contains(split[0]) && temp.contains(split[1])){
                    two  = j;
                }
                
            }
            
            if(one != 100000 && two != 100000 && (!microservicesInteractions.contains(one+"-"+two) && !microservicesInteractions.contains(two+"-"+one))){
                microservicesInteractions.add(one+"-"+two); 
                numberOfCallsBetween.add(numberOfCalls.get(i));
            }else if(one != 100000 && two != 100000 && microservicesInteractions.contains(one+"-"+two)){
                int position = microservicesInteractions.indexOf(one+"-"+two);
                int noOfCalls = Integer.parseInt(numberOfCallsBetween.get(position).toString()) + Integer.parseInt(numberOfCalls.get(i).toString());
                numberOfCallsBetween.set(position, noOfCalls);
            }else if(one != 100000 && two != 100000 && microservicesInteractions.contains(two+"-"+one)){
                int position = microservicesInteractions.indexOf(two+"-"+one);
                int noOfCalls = Integer.parseInt(numberOfCallsBetween.get(position).toString()) + Integer.parseInt(numberOfCalls.get(i).toString());
                numberOfCallsBetween.set(position, noOfCalls);
            }
            
            
        }
        
    
        
        System.out.println("Test");
        
        
        GraphDraw applet = new GraphDraw();
        applet.init(nodes, internalCost, microservicesInteractions, numberOfCallsBetween);

        JFrame frame = new JFrame();
        frame.getContentPane().add(applet);
        frame.setTitle("Microservice With Interactions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField loadTablesTextFeild;
    private javax.swing.JTextField loadTablesTextFeild1;
    // End of variables declaration//GEN-END:variables
}
