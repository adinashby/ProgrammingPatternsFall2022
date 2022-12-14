/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myproject;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hashemim
 */
public class MainForm extends javax.swing.JFrame {
    
    private ResourceBundle bundle;
    private ResourceBundle bundleFR;
    private CourseController courseController;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        
        bundle = ResourceBundle.getBundle("FormLanguage");
        bundleFR = ResourceBundle.getBundle("FormLanguage", Locale.FRANCE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradeGroup = new javax.swing.ButtonGroup();
        langGroup = new javax.swing.ButtonGroup();
        courseLabel = new javax.swing.JLabel();
        studentLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        letterGradeBtn = new javax.swing.JRadioButton();
        numericGradeBtn = new javax.swing.JRadioButton();
        englishBtn = new javax.swing.JRadioButton();
        frenchBtn = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        inputTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        courseLabel.setText("Course");

        studentLabel.setText("Student");

        gradeLabel.setText("Grade");

        gradeGroup.add(letterGradeBtn);
        letterGradeBtn.setText("Letter Grade");
        letterGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letterGradeBtnActionPerformed(evt);
            }
        });

        gradeGroup.add(numericGradeBtn);
        numericGradeBtn.setSelected(true);
        numericGradeBtn.setText("Numberic Grade");

        langGroup.add(englishBtn);
        englishBtn.setSelected(true);
        englishBtn.setText("English");
        englishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishBtnActionPerformed(evt);
            }
        });

        langGroup.add(frenchBtn);
        frenchBtn.setText("French");
        frenchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchBtnActionPerformed(evt);
            }
        });

        resultTextArea.setColumns(20);
        resultTextArea.setRows(5);
        jScrollPane1.setViewportView(resultTextArea);

        inputTextField.setText("Enter a course name");
        inputTextField.setOpaque(true);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(letterGradeBtn)
                            .addComponent(numericGradeBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(englishBtn)
                            .addComponent(frenchBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(updateButton)))
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(courseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studentLabel)
                .addGap(106, 106, 106)
                .addComponent(gradeLabel)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLabel)
                    .addComponent(studentLabel)
                    .addComponent(gradeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(updateButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(letterGradeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numericGradeBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(englishBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frenchBtn)))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letterGradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letterGradeBtnActionPerformed
       
    }//GEN-LAST:event_letterGradeBtnActionPerformed

    private void frenchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchBtnActionPerformed
            courseLabel.setText(bundleFR.getString("Course"));
            studentLabel.setText(bundleFR.getString("Student"));
            gradeLabel.setText(bundleFR.getString("Grade"));
            letterGradeBtn.setText(bundleFR.getString("LetterGrade"));
            numericGradeBtn.setText(bundleFR.getString("NumericGrade"));
            //announcementLabel.setText(bundleFR.getString("Announcement"));
    }//GEN-LAST:event_frenchBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //setUp();
    }//GEN-LAST:event_formWindowOpened

    private void englishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishBtnActionPerformed
            courseLabel.setText(bundle.getString("Course"));
            studentLabel.setText(bundle.getString("Student"));
            gradeLabel.setText(bundle.getString("Grade"));
            letterGradeBtn.setText(bundle.getString("LetterGrade"));
            numericGradeBtn.setText(bundle.getString("NumericGrade"));
            //announcementLabel.setText(bundle.getString("Announcement"));
    }//GEN-LAST:event_englishBtnActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Controller.getInstance().processInputTextField();
        Controller.getInstance().updateStudentTextArea(courseController);
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    public void setUp() {
        // courseController = Controller.getInstance().updateCourseCombo();
    }
    
    public void setCourseController(CourseController courseController) {
        this.courseController = courseController;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel courseLabel;
    private javax.swing.JRadioButton englishBtn;
    private javax.swing.JRadioButton frenchBtn;
    private javax.swing.ButtonGroup gradeGroup;
    private javax.swing.JLabel gradeLabel;
    public javax.swing.JTextField inputTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup langGroup;
    public javax.swing.JRadioButton letterGradeBtn;
    public javax.swing.JRadioButton numericGradeBtn;
    public javax.swing.JTextArea resultTextArea;
    private javax.swing.JLabel studentLabel;
    public javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
