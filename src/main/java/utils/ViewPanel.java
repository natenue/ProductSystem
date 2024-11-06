/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import utils.Products;

/**
 *
 * @author NATE
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    public ViewPanel() {
        initComponents();
    }
    
          

//     ObservableList<Products> productsObservableList = FXCollections.observableArrayList();


 public ArrayList<Products> productslist(){
               
        DbConnection dbConnecction = DbConnection.getInstance();
        ArrayList<Products> pr = new ArrayList<Products>();
         try {


                        PreparedStatement ps = dbConnecction.getConnection().prepareStatement("Select * from Price");
                        ResultSet rs = ps.executeQuery();
                       while(rs.next()){
                           
//                                    productsObservableList.add(new Products(rs.getInt("id"), rs.getString("name"), rs.getInt("price")));
                                  int me =  rs.getInt("id");
                                    String u = rs.getString("name");
                                   int  q = rs.getInt("price");
                                    Products pro = new Products(me,u,q);
//                                    String name1= pro.getName();
//                                    int id = pro.getId();
//                                    int price = pro.getPrice();
                                       pr.add(pro);
//                                    String data[] = {u,u,u};
                                   
//                                    dt.addRow(data);
                        }
         }catch(SQLException e){
             
         }
       
               

        return pr;}
 
 public void show(){
     ArrayList<Products> list = productslist();
      DefaultTableModel dt = (DefaultTableModel)table.getModel();
      Object[] row = new Object[3];
      int i;
        for( i = 0;i <list.size();i++){
          row[0] = list.get(i).getId();
          row[1] = list.get(i).getName();
          row[2] = list.get(i).getPrice();
          dt.addRow(row);
     
 }
 }
 public void refresh(){
       JFrame frame = new JFrame("");
        CreatePanel create = new CreatePanel();
        ViewPanel vp = new ViewPanel();
//        MainFrame mf  = new MainFrame();
        frame.add(vp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(700, 700);
    
        
       
 }
               
               

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("VIEW PANEL");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Price");

        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(priceid, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addComponent(nameid))))
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(36, 36, 36)
                        .addComponent(jButton4)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(priceid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jButton3)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
         DbConnection dbConnecction = new DbConnection();
          int i = table.getSelectedRow();
        TableModel md = table.getModel();
          String mee = md.getValueAt(i,0).toString();
          //DELETE FROM `newproject`.`try` WHERE (`id` = '12');
           String me = "DELETE fROM Price  WHERE (id = ?);";
                   try{
                PreparedStatement ps = dbConnecction.getConnection().prepareStatement(me);
//                ps.setString(1,nameid.getText());
//                ps.setString(2,priceid.getText());
                ps.setInt(1, Integer.parseInt(mee));
               int respond =  ps.executeUpdate();
               if(respond > 0){
                     JOptionPane.showMessageDialog(this, "Delected");
                     refresh();
               }}catch(SQLException e){
                   JOptionPane.showMessageDialog(this, e.getMessage());
               }
 
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        TableModel md = table.getModel();
      
        nameid.setText(md.getValueAt(i,1).toString());
        priceid.setText(md.getValueAt(i,2).toString());  
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
 
         DbConnection dbConnecction = new DbConnection();
          int i = table.getSelectedRow();
        TableModel md = table.getModel();
          String mee = md.getValueAt(i,0).toString();
          //UPDATE `newproject`.`try` SET `price` = '7890' WHERE (`id` = '12');
           String me = "UPDATE Price SET name = ?, price = ? WHERE (id = ?);";
                   try{
                PreparedStatement ps = dbConnecction.getConnection().prepareStatement(me);
                ps.setString(1,nameid.getText());
                ps.setString(2,priceid.getText());
                ps.setInt(3, Integer.parseInt(mee));
               int respond =  ps.executeUpdate();
               if(respond > 0){
                     JOptionPane.showMessageDialog(this, "Saved");
                     refresh();
               }}catch(SQLException e){
                   JOptionPane.showMessageDialog(this, e.getMessage());
               }
 
//        
//        DbConnection dbConnecction = DbConnection.getInstance();
//         try {
//
//
//                        PreparedStatement ps = dbConnecction.getConnection().prepareStatement("Select * from try");
//                        ResultSet rs = ps.executeQuery();
//                        if(rs.next()){
//                            Products pro = new Products();
////                                    productsObservableList.add(new Products(rs.getInt("id"), rs.getString("name"), rs.getInt("price")));
//                                  int me =  rs.getInt("id");
//                                    String u = rs.getString("name");
//                                   int  q = rs.getInt("price");
////                                    String name1= pro.getName();
////                                    int id = pro.getId();
////                                    int price = pro.getPrice();
//                                            
//                                    String data[] = {u,u,u};
//                                    DefaultTableModel dt = (DefaultTableModel)table.getModel();
//                                    dt.addRow(data);
//                        }
//         }catch(SQLException e){
//             
//         }
//       
//        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
               show();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameid;
    private javax.swing.JTextField priceid;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

   
}