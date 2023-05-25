/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gbibilio.MenuPret;

import static gbibilio.MenuPret.CLivres.jTable2;
import static gbibilio.MenuPret.MenuPret.jTable3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mehdi
 */
public class CExem extends javax.swing.JFrame {

	DefaultTableModel tb1model2;
	Connection con = null;
	PreparedStatement pst = null;

	/**
	 * Creates new form CExem
	 */
	public CExem() {
		initComponents();
	}
	
	public CExem(String isbn) {
		this.isbn = isbn;
		initComponents();
	}

	String code3;
	String code;
	String isbn;
	String etat;
	String isbn2;
	String code2;
	String nom;
	String code5;

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		Chercher = new javax.swing.JButton();
		Emprinter = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jTable4.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "CodeExemplaires", "ISBN", "Etat" }));
		jScrollPane1.setViewportView(jTable4);

		Chercher.setBackground(new java.awt.Color(102, 102, 255));
		Chercher.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		Chercher.setForeground(new java.awt.Color(255, 255, 255));
		Chercher.setText("Chercher");
		Chercher.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				ChercherMouseClicked(evt);
			}
		});

		Emprinter.setBackground(new java.awt.Color(102, 102, 255));
		Emprinter.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		Emprinter.setForeground(new java.awt.Color(255, 255, 255));
		Emprinter.setText("Préter");
		Emprinter.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				EmprinterMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addGap(115, 115, 115).addComponent(Chercher)
										.addGap(134, 134, 134).addComponent(Emprinter)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(2, 2, 2)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Chercher).addComponent(Emprinter))
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void ChercherMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ChercherMouseClicked
		int i = jTable2.getSelectedRow();
		DefaultTableModel tb1model = (DefaultTableModel) jTable2.getModel();
		if (isbn == null) {
			isbn = tb1model.getValueAt(i, 0).toString();
		}
		
		code = tb1model.getValueAt(i, 0).toString();
		// OptionPane.showMessageDialog(null, isbn);

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
			String query2 = "select exemplaire.CODEEXEMPLAIRE,exemplaire.ETAT,livre.ISBN from exemplaire INNER join livre on exemplaire.ISBN=livre.ISBN where livre.ISBN=?;";
			pst = con.prepareStatement(query2);
			pst.setString(1, this.isbn);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String code = rs.getString("CODEEXEMPLAIRE");
				String isbn = rs.getString("isbn");
				String etat = rs.getInt("etat") == 1 ? "emprunté" : "disponible";

				String tbdata[] = { code, isbn, etat };
				tb1model = (DefaultTableModel) jTable4.getModel();
				tb1model.addRow(tbdata);

			}
			con.close();
		} catch (Exception ex) {
			JOptionPane.showInputDialog(ex);
		}

	}// GEN-LAST:event_ChercherMouseClicked

	private void EmprinterMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_EmprinterMouseClicked
		int i = jTable4.getSelectedRow();
		DefaultTableModel tb1model = (DefaultTableModel) jTable4.getModel();
		code3 = tb1model.getValueAt(i, 0).toString();
		isbn2 = tb1model.getValueAt(i, 1).toString();
		etat = tb1model.getValueAt(i, 2).toString();

		int m = jTable3.getSelectedRow();
		tb1model = (DefaultTableModel) jTable3.getModel();
		code2 = tb1model.getValueAt(m, 0).toString();
		// nom = tb1model.getValueAt(m, 1).toString();

		int j = jTable4.getSelectedRow();
		tb1model = (DefaultTableModel) jTable4.getModel();
		code5 = tb1model.getValueAt(j, 0).toString();

		// JOptionPane.showMessageDialog(null, code3);
		// JOptionPane.showMessageDialog(null, code2);
		// JOptionPane.showMessageDialog(null, code2);
		if (this.etat.contains("dispo")) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
				String query = "INSERT INTO `emprunter`(`CODEEXEMPLAIRE`, `CODEADHERANT`, `DATEEMPRUNTE`, `DATERETOUR`) VALUES (?,?,?,?)";
				pst = con.prepareStatement(query);
				pst.setString(1, this.code3);
				pst.setString(2, code2);
				pst.setString(3, CLivres.date1.getDate().toString());
				pst.setString(4, CLivres.date2.getDate().toString());
				pst.execute();
				JOptionPane.showMessageDialog(null, "pret done");
			} catch (Exception ex) {
				JOptionPane.showInputDialog(ex);
			}

			// update du nb exemplaire
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
				String query = "UPDATE adherant set adherant.nbexemplaires = (select count(*) from emprunter  where emprunter.CODEADHERANT='"
						+ this.code2 + "') WHERE adherant.CODEADHERANT='" + this.code2 + "';";
				pst = con.prepareStatement(query);
				// pst.setString(1, this.code3);
				// pst.setString(2, this.nom);

				pst.execute();

				JOptionPane.showMessageDialog(null, "synco done");

			} catch (Exception ex) {
				JOptionPane.showInputDialog(ex);
			}

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
				String query = "update exemplaire set exemplaire.Etat = 1 where exemplaire.CodeExemplaire = '"
						+ this.code5 + "'";
				pst = con.prepareStatement(query);
				pst.execute();

				JOptionPane.showMessageDialog(null, "etat sycno");

			} catch (Exception ex) {
				JOptionPane.showInputDialog(ex);
			}

		} else {
			JOptionPane.showMessageDialog(null, "exemplaire n'est pas disponible");
		}

	}// GEN-LAST:event_EmprinterMouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
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
			java.util.logging.Logger.getLogger(CExem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CExem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CExem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CExem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CExem().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Chercher;
	private javax.swing.JButton Emprinter;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable4;
	// End of variables declaration//GEN-END:variables
}