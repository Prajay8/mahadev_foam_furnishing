/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahadevfoam_dealers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mahadav
 */
public class product_management_menu extends javax.swing.JFrame {

    /**
     * Creates new form product_management_menu
     */
    public product_management_menu() {
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

        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcomp_table = new javax.swing.JTable();
        j_p_name_text = new javax.swing.JTextField();
        jCombocompany = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jprod_table1 = new javax.swing.JTable();
        j_pid_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfprice_purchased = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        showproduct = new javax.swing.JButton();
        showcompany = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        addproduct = new javax.swing.JButton();
        back = new javax.swing.JButton();
        managegodown = new javax.swing.JButton();
        addcompany = new javax.swing.JButton();
        c_name_input = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        c_id_input = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Management");
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jcomp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR. No", "Company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jcomp_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 112, 412, 153);
        getContentPane().add(j_p_name_text);
        j_p_name_text.setBounds(578, 259, 142, 30);

        jCombocompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCombocompanyFocusGained(evt);
            }
        });
        jCombocompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombocompanyActionPerformed(evt);
            }
        });
        getContentPane().add(jCombocompany);
        jCombocompany.setBounds(578, 185, 142, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Company");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(443, 188, 200, 17);

        jprod_table1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jprod_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR. No", "Products", "Comp_ID", "MRP", "Purchase Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jprod_table1);
        if (jprod_table1.getColumnModel().getColumnCount() > 0) {
            jprod_table1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jprod_table1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 271, 412, 147);
        getContentPane().add(j_pid_text);
        j_pid_text.setBounds(578, 216, 142, 32);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Sr. No:-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(443, 216, 170, 32);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter product Name:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(443, 259, 170, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price (72x36) MRP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(443, 295, 140, 30);
        getContentPane().add(jtfprice);
        jtfprice.setBounds(578, 295, 142, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price (72x36) Purchased");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(443, 331, 190, 30);
        getContentPane().add(jtfprice_purchased);
        jtfprice_purchased.setBounds(578, 331, 142, 30);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(428, 11, 9, 458);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADD COMPANY AND PRODUCT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(476, 27, 290, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DETAILS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(163, 30, 80, 22);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(null);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(480, 60, 270, 2);

        showproduct.setBackground(new java.awt.Color(97, 212, 195));
        showproduct.setText("Show Products");
        showproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showproductActionPerformed(evt);
            }
        });
        jPanel1.add(showproduct);
        showproduct.setBounds(290, 80, 120, 23);

        showcompany.setBackground(new java.awt.Color(97, 212, 195));
        showcompany.setText("Show Companies");
        showcompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcompanyActionPerformed(evt);
            }
        });
        jPanel1.add(showcompany);
        showcompany.setBounds(140, 80, 150, 23);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(70, 60, 270, 2);

        addproduct.setBackground(new java.awt.Color(97, 212, 195));
        addproduct.setText("Add Product");
        addproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproductActionPerformed(evt);
            }
        });
        jPanel1.add(addproduct);
        addproduct.setBounds(450, 370, 320, 23);

        back.setBackground(new java.awt.Color(97, 212, 195));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(450, 400, 320, 23);

        managegodown.setBackground(new java.awt.Color(97, 212, 195));
        managegodown.setText("Manage Godown");
        managegodown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managegodownActionPerformed(evt);
            }
        });
        jPanel1.add(managegodown);
        managegodown.setBounds(10, 80, 130, 23);

        addcompany.setBackground(new java.awt.Color(97, 212, 195));
        addcompany.setText("Add Company");
        addcompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcompanyActionPerformed(evt);
            }
        });
        jPanel1.add(addcompany);
        addcompany.setBounds(440, 160, 140, 23);
        jPanel1.add(c_name_input);
        c_name_input.setBounds(440, 120, 132, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Company Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(580, 120, 99, 23);

        c_id_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_id_inputActionPerformed(evt);
            }
        });
        jPanel1.add(c_id_input);
        c_id_input.setBounds(440, 80, 132, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C_ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 90, 99, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addcompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcompanyActionPerformed
        try
       { 
         Class.forName("java.sql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
         Statement stmt = conn.createStatement();
            int cid=Integer.parseInt(c_id_input.getText().trim());
            int cid2=cid+1;
            String company_name=c_name_input.getText().trim();
            String sql = "insert into company_list values('"+cid+"','"+company_name+"');";
		      //"insert into dealer_group values('2','region');"

		stmt.executeUpdate(sql);
                c_id_input.setText(cid2+"");
                c_name_input.setText(null);
                JOptionPane.showMessageDialog(this,"comapny added Sucessfully...");
}
        catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_addcompanyActionPerformed

    private void showcompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcompanyActionPerformed
        try{
            DefaultTableModel model=(DefaultTableModel)jcomp_table.getModel();

            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt=conn.createStatement();

            String sql="select * from company_list;";

            ResultSet rs=stmt.executeQuery(sql);

            int rows=model.getRowCount();
            if(rows>=0)
            {
                for (int i=0;i<rows;i++)
                {
                    model.removeRow(0);
                }
            }
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2)});
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Database Connection Error.....!");
        }
    }//GEN-LAST:event_showcompanyActionPerformed

    private void showproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showproductActionPerformed
         try{
            DefaultTableModel model=(DefaultTableModel)jprod_table1.getModel();

            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt=conn.createStatement();

            String sql="select * from product;";

            ResultSet rs=stmt.executeQuery(sql);

            int rows=model.getRowCount();
            if(rows>0)
            {
                for (int i=0;i<rows;i++)
                {
                    model.removeRow(0);
                }
            }
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Database Connection Error.....!");
        }
    }//GEN-LAST:event_showproductActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new mahadev_menu_page().setVisible(true);
dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproductActionPerformed
        try 
        {
        Class.forName("java.sql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
        Statement stmt = conn.createStatement();
        String pid=j_pid_text.getText();
        String prod_name=j_p_name_text.getText();
        String company=jCombocompany.getSelectedItem().toString();
        String price=jtfprice.getText();
        String price_purchased=jtfprice_purchased.getText();
        
        String sqlcompany="select cid from company_list where cname='"+company+"';";
        ResultSet rs=stmt.executeQuery(sqlcompany);
        String c_id;
        if(rs.next())
        
        {
        c_id=rs.getString("cid");
        String sqlinsert="insert into product values('"+pid+"','"+prod_name+"','"+c_id+"','"+price+"','"+price_purchased+"');";
        stmt.executeUpdate(sqlinsert);
        JOptionPane.showMessageDialog(this, "product added");
        j_pid_text.setText(null);
        j_p_name_text.setText(null);
        jtfprice.setText(null);
        jtfprice_purchased.setText(null);
        }
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_addproductActionPerformed

    private void jCombocompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombocompanyActionPerformed

    }//GEN-LAST:event_jCombocompanyActionPerformed

    private void jCombocompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCombocompanyFocusGained
        try {
        Class.forName("java.sql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
        Statement stmt = conn.createStatement();
        String combo_group = "Select DISTINCT cname from company_list";
        ResultSet rs = stmt.executeQuery(combo_group);

        jCombocompany.removeAllItems();
        while(rs.next())
        {
            jCombocompany.addItem(rs.getString("cname"));
        }
        
            } 
        catch (Exception e)
            {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_jCombocompanyFocusGained

    private void managegodownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managegodownActionPerformed
        new Godown_management().setVisible(true);
    }//GEN-LAST:event_managegodownActionPerformed

    private void c_id_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_id_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_id_inputActionPerformed

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
            java.util.logging.Logger.getLogger(product_management_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_management_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_management_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_management_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_management_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcompany;
    private javax.swing.JButton addproduct;
    private javax.swing.JButton back;
    private javax.swing.JTextField c_id_input;
    private javax.swing.JTextField c_name_input;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jCombocompany;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField j_p_name_text;
    private javax.swing.JTextField j_pid_text;
    private javax.swing.JTable jcomp_table;
    private javax.swing.JTable jprod_table1;
    private javax.swing.JTextField jtfprice;
    private javax.swing.JTextField jtfprice_purchased;
    private javax.swing.JButton managegodown;
    private javax.swing.JButton showcompany;
    private javax.swing.JButton showproduct;
    // End of variables declaration//GEN-END:variables
}