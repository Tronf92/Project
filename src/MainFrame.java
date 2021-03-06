import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class MainFrame extends javax.swing.JFrame {
    public Connection conn;
    public ResultSet rs;
 
    JFrame frame = new AddFrame();
    public MainFrame(){
        try {
            connect_to_db();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }
    public final void connect_to_db() throws SQLException{
        try{
            String host = "jdbc:derby://localhost:1527/Employees";
            String userName = "ady";
            String password = "adrian";
            conn = DriverManager.getConnection(host,userName,password);
        }
        catch (SQLException err){
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        List = new javax.swing.JScrollPane();
        person_list = new javax.swing.JList();
        Add = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        String pname = "element";
        String surname = "surname";
        DefaultListModel model = new DefaultListModel();
        try{
            Statement stmt = conn.createStatement();
            String SQL = "Select * from ADY.Person";
            rs = stmt.executeQuery(SQL);
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(null,"UNKNOWN ERROR","ERROR",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        catch(NullPointerException err){
            JOptionPane.showMessageDialog(null,"UNKNOWN ERROR","ERROR",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        try{
            while(rs.next()){
                try{
                    pname = rs.getString("NAME");
                    surname = rs.getString("SURNAME");

                    String cname = pname + ' ' + surname;
                    model.addElement(cname);
                }
                catch(SQLException err){
                    System.out.println(err.getMessage());
                }

            }
        }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
        person_list.setModel(model);
        person_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        List.setViewportView(person_list);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        BtnEdit.setText("Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnView.setText("View");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        File.setText("File");

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        MenuBar.add(File);

        Edit.setText("Edit");
        MenuBar.add(Edit);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addGap(0, 109, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(BtnEdit)
                    .addComponent(BtnView)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        frame.show();
    }//GEN-LAST:event_AddActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        String pname = "element";
        String surname = "surname";
        DefaultListModel model = new DefaultListModel();
        try{
            Statement stmt = conn.createStatement();
            String SQL = "Select * from ADY.Person";
            rs = stmt.executeQuery(SQL);
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        try{
            while(rs.next()){
                try{
                    pname = rs.getString("NAME");
                    surname = rs.getString("SURNAME");
                    String cname = pname + ' ' + surname;
                    model.addElement(cname);
                }
                catch(SQLException err){
                    System.out.println(err.getMessage());
                }

            }
        }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
        person_list.setModel(model);
        
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        String pname = "element";
        String surname = "surname";
        DefaultListModel model = new DefaultListModel();
        try{
            Statement stmt = conn.createStatement();
            String SQL = "Select * from ADY.Person";
            rs = stmt.executeQuery(SQL);
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        try{
            while(rs.next()){
                try{
                    pname = rs.getString("NAME");
                    surname = rs.getString("SURNAME");
                    String cname = pname + ' ' + surname;
                    model.addElement(cname);
                }
                catch(SQLException err){
                    System.out.println(err.getMessage());
                }

            }
        }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
        person_list.setModel(model);
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        // TODO add your handling code here:
        String id = null;
        try{
            id = person_list.getSelectedValue().toString();
            JFrame frame = new EditFrame(id);
            frame.show();
        }
        catch(NullPointerException err){
            JOptionPane.showMessageDialog(null, "NO ELEMENT SELECTED", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        String id = null;
        try{
            id = person_list.getSelectedValue().toString();
            JFrame frame = new ViewFrame(id);
            frame.show();
        }
        catch(NullPointerException err){
           JOptionPane.showMessageDialog(null, "NO ELEMENT SELECTED", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException err){
            JOptionPane.showMessageDialog(null, err.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_BtnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = person_list.getSelectedValue().toString(); 
        String [] list = id.split(" ");
        String sql = "DELETE FROM ADY.PERSON where NAME='" + list[0] + "' and SURNAME='" + list[1] + "'";
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Can not delete from  database!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        catch (NullPointerException er){
            JOptionPane.showMessageDialog(null,"Unknown error","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        String pname = "element";
        String surname = "surname";
        DefaultListModel model = new DefaultListModel();
        try{
            stmt = conn.createStatement();
            String SQL = "Select * from ADY.Person";
            rs = stmt.executeQuery(SQL);
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        try{
            while(rs.next()){
                try{
                    pname = rs.getString("NAME");
                    surname = rs.getString("SURNAME");
                    String cname = pname + ' ' + surname;
                    model.addElement(cname);
                }
                catch(SQLException err){
                    System.out.println(err.getMessage());
                }

            }
        }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
        person_list.setModel(model);
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnView;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JScrollPane List;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JList person_list;
    // End of variables declaration//GEN-END:variables
}
