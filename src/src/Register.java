import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.Timer;

/**
 *
 * @author Allen Caingcoy
 */
public class Register extends javax.swing.JFrame {
public static String uname, pword, monthtxt, daytxt, yeartxt, agetxt, gendertxt;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        
        dropmonth.setOpaque(false);
        dropmonth.setBackground(null);
        dropday.setOpaque(false);
        dropday.setBackground(null);
        dropyear.setOpaque(false);
        dropyear.setBackground(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        usernamereg = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordreg = new javax.swing.JPasswordField();
        cpassword = new javax.swing.JLabel();
        cpasswordreg = new javax.swing.JPasswordField();
        dateofbirth = new javax.swing.JLabel();
        dropmonth = new javax.swing.JComboBox();
        dropday = new javax.swing.JComboBox();
        dropyear = new javax.swing.JComboBox();
        genderlabel = new javax.swing.JLabel();
        malebutton = new javax.swing.JRadioButton();
        femalebutton = new javax.swing.JRadioButton();
        activation = new javax.swing.JCheckBox();
        registerbutton = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame2"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/exit.png"))); // NOI18N
        close.setBorder(null);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close.setPreferredSize(new java.awt.Dimension(50, 30));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Register");

        username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username.setText("Username");

        usernamereg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        usernamereg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        usernamereg.setOpaque(false);
        usernamereg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameregFocusGained(evt);
            }
        });

        password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password.setText("Password");

        passwordreg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passwordreg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        passwordreg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordregFocusGained(evt);
            }
        });

        cpassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cpassword.setText("Re-type Password");

        cpasswordreg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cpasswordreg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        cpasswordreg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpasswordregFocusGained(evt);
            }
        });

        dateofbirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dateofbirth.setText("Date of Birth");

        dropmonth.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dropmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        dropmonth.setBorder(null);
        dropmonth.setFocusable(false);
        dropmonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dropmonthFocusGained(evt);
            }
        });

        dropday.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dropday.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dropday.setFocusable(false);
        dropday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dropdayFocusGained(evt);
            }
        });

        dropyear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dropyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));
        dropyear.setFocusable(false);
        dropyear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dropyearFocusGained(evt);
            }
        });

        genderlabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        genderlabel.setText("Gender");

        malebutton.setBackground(new java.awt.Color(255, 255, 255));
        group.add(malebutton);
        malebutton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        malebutton.setText("Male");
        malebutton.setContentAreaFilled(false);
        malebutton.setFocusable(false);
        malebutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                malebuttonFocusGained(evt);
            }
        });
        malebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malebuttonActionPerformed(evt);
            }
        });

        femalebutton.setBackground(new java.awt.Color(255, 255, 255));
        group.add(femalebutton);
        femalebutton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        femalebutton.setText("Female");
        femalebutton.setContentAreaFilled(false);
        femalebutton.setFocusable(false);
        femalebutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                femalebuttonFocusGained(evt);
            }
        });
        femalebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalebuttonActionPerformed(evt);
            }
        });

        activation.setBackground(new java.awt.Color(255, 255, 255));
        activation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        activation.setText("Activate Account?");
        activation.setContentAreaFilled(false);
        activation.setFocusable(false);
        activation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                activationFocusGained(evt);
            }
        });

        registerbutton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        registerbutton.setText("REGISTER");
        registerbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        registerbutton.setContentAreaFilled(false);
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(0, 204, 204));
        back.setText("Back to Login");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernamereg)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(genderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(malebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femalebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(passwordreg)
                    .addComponent(cpasswordreg)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dropmonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dropday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dropyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(title)
                .addGap(3, 3, 3)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(usernamereg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordreg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropyear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(malebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(femalebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(registerbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cpasswordreg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        // TODO add your handling code here:
        if (usernamereg.getText().isEmpty() && passwordreg.getText().isEmpty() && cpasswordreg.getText().isEmpty()) {
            usernamereg.setBorder(BorderFactory.createLineBorder(Color.red));
            passwordreg.setBorder(BorderFactory.createLineBorder(Color.red));
            cpasswordreg.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (usernamereg.getText().isEmpty() && passwordreg.getText().isEmpty()) {
            usernamereg.setBorder(BorderFactory.createLineBorder(Color.red));
            passwordreg.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (usernamereg.getText().isEmpty() && cpasswordreg.getText().isEmpty()) {
            usernamereg.setBorder(BorderFactory.createLineBorder(Color.red));
            cpasswordreg.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (passwordreg.getText().isEmpty() && cpasswordreg.getText().isEmpty()) {
            passwordreg.setBorder(BorderFactory.createLineBorder(Color.red));
            cpasswordreg.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (usernamereg.getText().isEmpty()) {
            usernamereg.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (passwordreg.getText().isEmpty()) {
            passwordreg.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (cpasswordreg.getText().isEmpty()) {
            cpasswordreg.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (cpasswordreg.getText().equals(passwordreg.getText())) {
            if (activation.isSelected()) {
                uname = usernamereg.getText();
                pword = cpasswordreg.getText();
        
                monthtxt = dropmonth.getSelectedItem().toString();
                daytxt = dropday.getSelectedItem().toString();
                yeartxt = dropyear.getSelectedItem().toString();
        
                int year1 = Integer.parseInt(yeartxt);
                int age = 2023 - year1;
                agetxt = Integer.toString(age);
        
                registerbutton.setText("Registered, Redirecting...");
                
                String data = uname + "," + pword + "," + monthtxt + "," + daytxt + "," + yeartxt + "," + agetxt + "," + gendertxt;
                AccStorage.Accounts(data);
            

                Timer timer = new Timer(2000, e -> {
                    Login a = new Login();
                    a.setVisible(true);
                    setVisible(false);
                }); timer.setRepeats(false); timer.start();
            } else if (dropmonth.getSelectedIndex() == 0){
                registerbutton.setText("Select a Month");
            } else if (dropday.getSelectedIndex() == 0){
                registerbutton.setText("Select a Day");
            } else if (dropyear.getSelectedIndex() == 0){
                registerbutton.setText("Select a Year");
            } else if (!malebutton.isSelected() && !femalebutton.isSelected()){
                registerbutton.setText("Select Gender");
            } else if (!activation.isSelected()){
                registerbutton.setText("Please Activate Account");
            }
        } else {
            
        }
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void SaveAccount(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(AccStorage.getfilepath(), true))) {
            writer.write(username + "," + password);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login a = new Login();
        a.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void usernameregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameregFocusGained
        // TODO add your handling code here:
        usernamereg.setBorder(BorderFactory.createLineBorder(new Color(0,204,204)));
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_usernameregFocusGained

    private void passwordregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordregFocusGained
        // TODO add your handling code here:
        passwordreg.setBorder(BorderFactory.createLineBorder(new Color(0,204,204)));
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_passwordregFocusGained

    private void cpasswordregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpasswordregFocusGained
        // TODO add your handling code here:
        cpasswordreg.setBorder(BorderFactory.createLineBorder(new Color(0,204,204)));
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_cpasswordregFocusGained

    private void malebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malebuttonActionPerformed
        // TODO add your handling code here:
        if (malebutton.isSelected()){
            gendertxt = "Male";
        }
    }//GEN-LAST:event_malebuttonActionPerformed

    private void femalebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalebuttonActionPerformed
        // TODO add your handling code here:
        if (femalebutton.isSelected()){
            gendertxt = "Female";
        }
    }//GEN-LAST:event_femalebuttonActionPerformed

    private void dropmonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dropmonthFocusGained
        // TODO add your handling code here:
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_dropmonthFocusGained

    private void dropdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dropdayFocusGained
        // TODO add your handling code here:
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_dropdayFocusGained

    private void dropyearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dropyearFocusGained
        // TODO add your handling code here:
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_dropyearFocusGained

    private void malebuttonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_malebuttonFocusGained
        // TODO add your handling code here:
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_malebuttonFocusGained

    private void femalebuttonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_femalebuttonFocusGained
        // TODO add your handling code here:
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_femalebuttonFocusGained

    private void activationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_activationFocusGained
        // TODO add your handling code here:
        registerbutton.setText("REGISTER");
    }//GEN-LAST:event_activationFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox activation;
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JLabel cpassword;
    private javax.swing.JPasswordField cpasswordreg;
    private javax.swing.JLabel dateofbirth;
    public static javax.swing.JComboBox dropday;
    public static javax.swing.JComboBox dropmonth;
    public static javax.swing.JComboBox dropyear;
    public static javax.swing.JRadioButton femalebutton;
    private javax.swing.JLabel genderlabel;
    private javax.swing.ButtonGroup group;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton malebutton;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordreg;
    private javax.swing.JButton registerbutton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel username;
    public static javax.swing.JTextField usernamereg;
    // End of variables declaration//GEN-END:variables
}
