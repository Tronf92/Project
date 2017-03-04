
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adi
 */
public class EditFrame extends javax.swing.JFrame  {
    public String name,surname,country,county,town,street,number,building,series,flat,idNr,drivingLicense;
    public String qualificationCard,picture;
    public Connection conn;
    public ResultSet rs;
    private Object jFileChooser1;
    public String person;
    public EditFrame(String id) {
        connect_to_db();
        person = id;
        initComponents();
    }
    
    public void connect_to_db(){
        try{
            String host = "jdbc:derby://localhost:1527/Employees";
            String userName = "ady";
            String password = "adrian";
            conn = DriverManager.getConnection(host,userName,password);
        }
        catch (SQLException err){
            System.out.println(err.getMessage());
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

        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblCounty = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblBuilding = new javax.swing.JLabel();
        lblSeries = new javax.swing.JLabel();
        lblFlat = new javax.swing.JLabel();
        lblIdCard = new javax.swing.JLabel();
        lblDrivingLicense = new javax.swing.JLabel();
        lblQualificationCard = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtQualificationCard = new javax.swing.JTextField();
        txtDrivingLicense = new javax.swing.JTextField();
        txtIdCard = new javax.swing.JTextField();
        txtFlat = new javax.swing.JTextField();
        txtSeries = new javax.swing.JTextField();
        txtBuilding = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtTown = new javax.swing.JTextField();
        txtCounty = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        lblName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblName.setText("Name:");

        lblSurname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblSurname.setText("Surname:");

        lblCountry.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCountry.setText("Country:");

        lblCounty.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCounty.setText("County:");

        lblTown.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblTown.setText("Town:");

        lblStreet.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblStreet.setText("Street:");

        lblNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNumber.setText("Number:");

        lblBuilding.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblBuilding.setText("Building:");

        lblSeries.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblSeries.setText("Series:");

        lblFlat.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFlat.setText("Flat:");

        lblIdCard.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblIdCard.setText("ID card:");

        lblDrivingLicense.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblDrivingLicense.setText("Driving license:");

        lblQualificationCard.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblQualificationCard.setText("Qualification card:");

        lblPicture.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPicture.setText("Picture:");

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPicture)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQualificationCard)
                            .addComponent(lblDrivingLicense)
                            .addComponent(lblIdCard)
                            .addComponent(lblFlat)
                            .addComponent(lblSeries)
                            .addComponent(lblBuilding)
                            .addComponent(lblNumber)
                            .addComponent(lblStreet)
                            .addComponent(lblTown)
                            .addComponent(lblCounty)
                            .addComponent(lblCountry)
                            .addComponent(lblSurname)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtCountry)
                            .addComponent(txtCounty)
                            .addComponent(txtTown)
                            .addComponent(txtStreet)
                            .addComponent(txtNumber)
                            .addComponent(txtBuilding)
                            .addComponent(txtSeries)
                            .addComponent(txtFlat)
                            .addComponent(txtIdCard)
                            .addComponent(txtQualificationCard, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDrivingLicense, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCounty)
                    .addComponent(txtCounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTown)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuilding)
                    .addComponent(txtBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeries)
                    .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFlat)
                    .addComponent(txtFlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCard)
                    .addComponent(txtIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrivingLicense)
                    .addComponent(txtDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQualificationCard)
                    .addComponent(txtQualificationCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPicture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancel))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        String Name = txtName.getText();
        String surname = txtSurname.getText();
        String country = txtCountry.getText();
        String county = txtCounty.getText();
        String town = txtTown.getText();
        String street = txtStreet.getText();
        String number = txtNumber.getText();
        String building = txtBuilding.getText();
        String series = txtSeries.getText();
        String flat = txtFlat.getText();
        String idNr = txtIdCard.getText();
        String drivingLicense = txtDrivingLicense.getText();
        String qualificationCard = txtQualificationCard.getText();
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        String[] split = person.split(" ");
        System.out.println(split[1]);
        System.out.println(split[0]);
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM ADY.PERSON where NAME ='"+ split[0] + "' AND SURNAME='" + split[1] + "'" ;
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                name = rs.getString("NAME");
                surname = rs.getString("SURNAME");
                country = rs.getString("COUNTRY");
                county = rs.getString("COUNTY");
                town = rs.getString("TOWN");
                street = rs.getString("STREET");
                building = rs.getString("BUILDING");
                series = rs.getString("SERIES");
                flat = rs.getString("FLAT");
                idNr = rs.getString("ID_NUMBER");
                drivingLicense = rs.getString("DRIVING_LICENSE");
                qualificationCard = rs.getString("QUALIFICATION_CARD");
                number = rs.getString("NUMBER");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(name);
        txtName.setText(name);
        txtSurname.setText(surname);
        txtCountry.setText(country);
        txtCounty.setText(county);
        txtTown.setText(town);
        txtStreet.setText(street);
        txtBuilding.setText(building);
        txtSeries.setText(series);
        txtFlat.setText(flat);
        txtIdCard.setText(idNr);
        txtDrivingLicense.setText(drivingLicense);
        txtQualificationCard.setText(qualificationCard);
        txtNumber.setText(number);
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFrame("0").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblBuilding;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblCounty;
    private javax.swing.JLabel lblDrivingLicense;
    private javax.swing.JLabel lblFlat;
    private javax.swing.JLabel lblIdCard;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblQualificationCard;
    private javax.swing.JLabel lblSeries;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTown;
    private javax.swing.JTextField txtBuilding;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtCounty;
    private javax.swing.JTextField txtDrivingLicense;
    private javax.swing.JTextField txtFlat;
    private javax.swing.JTextField txtIdCard;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtQualificationCard;
    private javax.swing.JTextField txtSeries;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}
