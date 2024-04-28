/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudnetMiniPAT;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Cliftonb
 */
public class StudentView extends javax.swing.JFrame {

	StudentController sc;

	/**
	 * Creates new form StudentView
	 */
	public StudentView() {
		initComponents();
		try {
			sc = new StudentController();
			sc.sortByName();
			outputTextArea.setText(sc.toString());
		} catch (FileNotFoundException ex) {
			errorLabel.setText("Could not find file");
		} catch (IOException ex) {
			errorLabel.setText("Could not find file");
		}
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                nameTextField = new javax.swing.JTextField();
                surnameTextField = new javax.swing.JTextField();
                ageTextField = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                outputTextArea = new javax.swing.JTextArea();
                addButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                sortAgeButton = new javax.swing.JButton();
                sortNameButton = new javax.swing.JButton();
                errorLabel = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
                jLabel1.setText("Student Manager");

                jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jLabel2.setText("Name");

                jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jLabel3.setText("Surname");

                jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                jLabel4.setText("Age");

                nameTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                nameTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameTextFieldActionPerformed(evt);
                        }
                });

                surnameTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                surnameTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                surnameTextFieldActionPerformed(evt);
                        }
                });

                ageTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                ageTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ageTextFieldActionPerformed(evt);
                        }
                });

                outputTextArea.setEditable(false);
                outputTextArea.setColumns(20);
                outputTextArea.setRows(5);
                outputTextArea.setFocusable(false);
                jScrollPane1.setViewportView(outputTextArea);

                addButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                addButton.setText("Add");
                addButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addButtonActionPerformed(evt);
                        }
                });

                deleteButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                deleteButton.setText("Delete");
                deleteButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteButtonActionPerformed(evt);
                        }
                });

                sortAgeButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                sortAgeButton.setText("Age Sort");
                sortAgeButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                sortAgeButtonActionPerformed(evt);
                        }
                });

                sortNameButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                sortNameButton.setText("Name Sort");
                sortNameButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                sortNameButtonActionPerformed(evt);
                        }
                });

                errorLabel.setForeground(new java.awt.Color(255, 0, 51));
                errorLabel.setText(" ");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addGap(64, 64, 64)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nameTextField)
                                                        .addComponent(surnameTextField)
                                                        .addComponent(ageTextField)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(sortAgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(sortNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(errorLabel)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(errorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(surnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(deleteButton)
                                                        .addComponent(addButton))
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(sortAgeButton)
                                                        .addComponent(sortNameButton)))
                                        .addComponent(jScrollPane1))
                                .addContainerGap(30, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
		surnameTextField.requestFocus();
        }//GEN-LAST:event_nameTextFieldActionPerformed

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
		try {
			sc.add(nameTextField.getText(), surnameTextField.getText(), Integer.parseInt(ageTextField.getText()));
			outputTextArea.setText(sc.toString());
		} catch (IOException ex) {
			errorLabel.setText("Could not find file");
			System.out.println("Could not find file");
		}
        }//GEN-LAST:event_addButtonActionPerformed

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
		try {
			sc.delete(nameTextField.getText(), surnameTextField.getText(), Integer.parseInt(ageTextField.getText()));
			outputTextArea.setText(sc.toString());
		} catch (IOException ex) {
			errorLabel.setText("Could not find file");
		}
        }//GEN-LAST:event_deleteButtonActionPerformed

        private void sortAgeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAgeButtonActionPerformed
		try {
			sc.sortByAge();
			outputTextArea.setText(sc.toString());
		} catch (IOException ex) {
			errorLabel.setText("Could not find file");
		}
        }//GEN-LAST:event_sortAgeButtonActionPerformed

        private void sortNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortNameButtonActionPerformed
		try {
			sc.sortByName();
			outputTextArea.setText(sc.toString());
		} catch (IOException ex) {
			errorLabel.setText("Could not find file");
		}
        }//GEN-LAST:event_sortNameButtonActionPerformed

        private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_ageTextFieldActionPerformed

        private void surnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTextFieldActionPerformed
		ageTextField.requestFocus();
        }//GEN-LAST:event_surnameTextFieldActionPerformed

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
			java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new StudentView().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addButton;
        private javax.swing.JTextField ageTextField;
        private javax.swing.JButton deleteButton;
        private javax.swing.JLabel errorLabel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField nameTextField;
        private javax.swing.JTextArea outputTextArea;
        private javax.swing.JButton sortAgeButton;
        private javax.swing.JButton sortNameButton;
        private javax.swing.JTextField surnameTextField;
        // End of variables declaration//GEN-END:variables
}