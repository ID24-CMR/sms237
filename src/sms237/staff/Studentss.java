/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms237.staff;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.DatatypeConverter;
import static sms237.ConnectionDb.getConnections;
import sms237.entities.Classes;
import sms237.entities.SetSchool;
import sms237.entities.Students;

/**
 *
 * @author idrice24
 */
public class Studentss extends javax.swing.JFrame {

    /**
     * Creates new form Studentss
     */
    public Studentss() {
        initComponents();
        listClass();
        listSchool();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_sname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_school = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        tx = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        txt_class = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_section = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_upload = new javax.swing.JButton();
        btn_submit = new javax.swing.JButton();
        txt_cancel = new javax.swing.JButton();
        txt_reset = new javax.swing.JButton();
        txt_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student Adminssion form");

        jLabel2.setText("First Name");

        jLabel3.setText("Sure name");

        jLabel4.setText("Date of Birth");

        jLabel5.setText("Gender");

        txt_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));

        jLabel6.setText("School Name");

        jLabel7.setText("Email");

        tx.setText("Class");

        txt.setText("Phone");

        jLabel8.setText("Section");

        jLabel9.setText("Image");

        txt_upload.setText("UPLOAD");
        txt_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_uploadActionPerformed(evt);
            }
        });

        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        txt_cancel.setText("CANCEL");

        txt_reset.setText("RESET");
        txt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resetActionPerformed(evt);
            }
        });

        txt_image.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_image.setMaximumSize(new java.awt.Dimension(8, 8));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_section, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_school, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(txt_fname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(214, 214, 214)))
                                    .addComponent(jLabel4))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tx, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_class, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_sname)
                                .addComponent(txt_gender, 0, 357, Short.MAX_VALUE)
                                .addComponent(txt_email)
                                .addComponent(txt_phone)
                                .addComponent(txt)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(132, 132, 132)
                                    .addComponent(txt_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_image, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(294, 294, 294)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_school, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx)
                    .addComponent(txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(txt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_image, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      //call class
   ClassList clist = new ClassList();
   public void listClass(){
       ArrayList<Classes> list  = clist.getClassesList();
       for(int i = 0; i<list.size(); i++){
       txt_class.addItem(list.get(i).getClassName());
       System.out.println("this is class list: "+list.get(i).getClassName());
   }
   }
   
   //call school
   SetSchools school = new SetSchools();
   public void listSchool(){
       ArrayList<SetSchool> list = school.getListOfSchool();
       for(int i = 0; i<list.size(); i++){
           txt_school.addItem(list.get(i).getSchoolTitle());
       }
   }
   
   //call student
   public ArrayList<Students> getStudents(){
       ArrayList<Students> studentList = new ArrayList<Students>();
       String sql = "SELECT * FROM students";
       Statement stmt;
       ResultSet result;
       
       try{
           Connection con = getConnections();
           stmt = con.createStatement();
           result = stmt.executeQuery(sql);
           Students student;
           while(result.next()){
               student = new Students();
            //   student = new Students(result.getInt("tudent_id"),
            //   result.getString("student_code"),
            //   result.getString("given_name"),
            //   result.getString("srname"),
            //   result.getString("gender"),
            //   result.getDate("dob"),
            //   result.getString("email"),
            //   result.getString("phone"),
            //   result.getInt("school_id"),
            //   result.getString("section"),
            //   result.getDate("join_date"),
            //   result.getDate("created_at"),
            //   result.getDate("updated_at"),
            //   result.getByte("image"));
            studentList.add(student);
           }
           
       }catch(SQLException ex){
           Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return studentList;
   }
     
    
    private void txt_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_uploadActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            txt_image.setIcon(ResizeImage(path, null));
        }
    }//GEN-LAST:event_txt_uploadActionPerformed
     //resize image
    public ImageIcon ResizeImage(String imagePath, byte[] pic){
        ImageIcon myImage = null;
        if(imagePath != null){
            myImage = new ImageIcon(imagePath);
            
        }else{
            myImage = new ImageIcon(pic);
        }
        
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(txt_image.getWidth(), txt_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
     // clear the form
    public void clearForm(){
        
        txt_dob.setText("");
        txt_email.setText("");
        txt_fname.setText("");
        txt_sname.setText("");
        txt_section.setText("");
        txt_phone.setText("");
    }
    
    //checking if there is an empty fill
    public int checkFill(){
        if("".equals(txt_dob.getText()) ){
            System.out.println("please fill Date of Birth!!");
            JOptionPane.showConfirmDialog(null, "please input date of birth");
        }
        return 1;
    }
    
    // generating student matricule
    public int setMatricules(){
        ArrayList<Students> list = getStudents();
        int num = list.size() +1 ;
        return num;
    }
    
    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        try {
            Students std = new Students();
            Date d = new Date(00,00,00);
            std.setCreatedAt(d);
            
            DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
            java.util.Date date = formatter.parse(txt_dob.getText());
            std.setDob(date);
            std.setEmail(txt_email.getText());
            std.setGender((String) txt_gender.getSelectedItem());
            std.setGivenName(txt_fname.getText());
            byte[] bytes = DatatypeConverter.parseBase64Binary(txt_image.getText());
            std.setImage(bytes);
            
            std.setIsActive(1);
            std.setIsStudent(1);
            std.setJoinDate(d);
            std.setPhone(txt_phone.getText());
            std.setSchoolId(txt_school.getSelectedIndex()+1);
            std.setSection(txt_section.getText());
            std.setSrname(txt_sname.getText());
            std.setStudentCode("STD00"+setMatricules());
            
            String sql = "INSERT INTO students(student_code,given_name,srname,gender,email,phone,school_id,section,is_active,is_student,join_date,created_at,image) VALUES('"+
                    std.getStudentCode()+"','"+std.getGivenName()+"','"+std.getSrname()+"','"+std.getGender()+"','"+std.getEmail()+"','"+std.getPhone()+"','"+std.getSchoolId()+"','"
                    +std.getSection()+"','"+std.getIsActive()+"','"+std.getIsStudent()+"','"+std.getJoinDate()+"','"
                    +std.getCreatedAt()+"','"+std.getImage()+"')";
            
            
            Connection con = getConnections();
            Statement stmt ;
            try {
                stmt = con.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("OK");
            } catch (SQLException ex) {
                Logger.getLogger(Studentss.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
            
            System.out.println("the local dob is: "+std.getDob());
            System.out.println("the local dob is: "+std.getSchoolId());
            System.out.println("welcome to students!!"+std.getStudentCode());
        } catch (ParseException ex) {
            Logger.getLogger(Studentss.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_submitActionPerformed

    private void txt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resetActionPerformed
        clearForm();
    }//GEN-LAST:event_txt_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Studentss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
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
    private javax.swing.JLabel tx;
    private javax.swing.JLabel txt;
    private javax.swing.JButton txt_cancel;
    private javax.swing.JComboBox<String> txt_class;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JComboBox<String> txt_gender;
    private javax.swing.JLabel txt_image;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JButton txt_reset;
    private javax.swing.JComboBox<String> txt_school;
    private javax.swing.JTextField txt_section;
    private javax.swing.JTextField txt_sname;
    private javax.swing.JButton txt_upload;
    // End of variables declaration//GEN-END:variables
}
