/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gbibilio.MenuLivres;

import Statistics.Statistic;
import gbibilio.MenuAdherant.MenuAdherant;
import gbibilio.MenuPret.MenuPret;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import login.Login;

/**
 *
 * @author mehdi
 */
public class Livres extends javax.swing.JFrame {

	Connection con = null;
	Connection con1 = null;
	PreparedStatement pst = null;
	PreparedStatement pst1 = null;
	PreparedStatement pst2 = null;
	PreparedStatement pst3 = null;
	DefaultTableModel tb1model;
	String auteur;
	String isbn;
	String titre;
	String nbpages;
	String edition;
	String id;
	String etat = "0";

	/**
	 * Creates new form Menu
	 */
	public Livres() {
		initComponents();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		Menu1 = new javax.swing.JPanel();
		MenuL = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		Livre = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		Adherant = new javax.swing.JLabel();
		MenuAdhe = new javax.swing.JLabel();
		jSeparator3 = new javax.swing.JSeparator();
		pret = new javax.swing.JLabel();
		menupret = new javax.swing.JLabel();
		jSeparator4 = new javax.swing.JSeparator();
		jLabel10 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		Menu2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		filteTXT = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLabel11 = new javax.swing.JLabel();
		CMaisonEdition = new javax.swing.JComboBox<>();
		Ajouter = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		spinner = new javax.swing.JSpinner();
		jLabel14 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		Menu1.setBackground(new java.awt.Color(102, 102, 255));
		Menu1.setLayout(null);

		MenuL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		MenuL.setForeground(new java.awt.Color(255, 255, 255));
		MenuL.setText("Gestion Livre");
		Menu1.add(MenuL);
		MenuL.setBounds(40, 160, 128, 30);
		Menu1.add(jSeparator1);
		jSeparator1.setBounds(0, 190, 190, 10);

		Livre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/livres (1).png"))); // NOI18N
		Livre.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				LivreMouseClicked(evt);
			}
		});
		Menu1.add(Livre);
		Livre.setBounds(50, 40, 90, 106);

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Gestion Statictics");
		Menu1.add(jLabel4);
		jLabel4.setBounds(28, 639, 128, 30);
		Menu1.add(jSeparator2);
		jSeparator2.setBounds(-2, 343, 190, 10);

		Adherant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student (1).png"))); // NOI18N
		Adherant.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AdherantMouseClicked(evt);
			}
		});
		Menu1.add(Adherant);
		Adherant.setBounds(40, 200, 120, 110);

		MenuAdhe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		MenuAdhe.setForeground(new java.awt.Color(255, 255, 255));
		MenuAdhe.setText("Gestion Adherant");
		MenuAdhe.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				MenuAdheMouseClicked(evt);
			}
		});
		Menu1.add(MenuAdhe);
		MenuAdhe.setBounds(30, 310, 128, 30);
		Menu1.add(jSeparator3);
		jSeparator3.setBounds(0, 508, 190, 10);

		pret.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/knowledge (1).png"))); // NOI18N
		pret.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pretMouseClicked(evt);
			}
		});
		Menu1.add(pret);
		pret.setBounds(31, 366, 120, 90);

		menupret.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		menupret.setForeground(new java.awt.Color(255, 255, 255));
		menupret.setText("Gestion des prêts");
		menupret.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				menupretMouseClicked(evt);
			}
		});
		Menu1.add(menupret);
		menupret.setBounds(32, 471, 128, 30);
		Menu1.add(jSeparator4);
		jSeparator4.setBounds(0, 676, 190, 10);

		jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-out (1).png"))); // NOI18N
		jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel10MouseClicked(evt);
			}
		});
		Menu1.add(jLabel10);
		jLabel10.setBounds(30, 690, 130, 50);

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("Se deconnecter");
		Menu1.add(jLabel9);
		jLabel9.setBounds(33, 740, 128, 30);

		jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/graph-bar (1).png"))); // NOI18N
		jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel13MouseClicked(evt);
			}
		});
		Menu1.add(jLabel13);
		jLabel13.setBounds(40, 530, 130, 110);

		Menu2.setBackground(new java.awt.Color(255, 255, 255));

		jButton1.setBackground(new java.awt.Color(102, 102, 255));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Chercher");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});

		filteTXT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				filteTXTActionPerformed(evt);
			}
		});
		filteTXT.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				filteTXTKeyReleased(evt);
			}
		});

		jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "ISBN", "Titre", "Edition", "NbPages", "Auteur" }));
		jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable2MouseClicked(evt);
			}
		});
		jScrollPane2.setViewportView(jTable2);

		jLabel11.setText("Veuillez choisir la maison d'edition disponible :  ");

		CMaisonEdition.setBackground(new java.awt.Color(102, 102, 255));
		CMaisonEdition.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		CMaisonEdition.setForeground(new java.awt.Color(255, 255, 255));
		CMaisonEdition.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Edition Crales", "Edition Paralise" }));
		CMaisonEdition.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CMaisonEditionActionPerformed(evt);
			}
		});

		Ajouter.setBackground(new java.awt.Color(102, 102, 255));
		Ajouter.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		Ajouter.setForeground(new java.awt.Color(255, 255, 255));
		Ajouter.setText("Ajouter");
		Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AjouterMouseClicked(evt);
			}
		});

		jLabel12.setText("le nombre d'ex : ");

		spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

		jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
		jLabel14.setText("Acheter  des Livres ");

		javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
		Menu2.setLayout(Menu2Layout);
		Menu2Layout.setHorizontalGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(Menu2Layout.createSequentialGroup().addGap(381, 381, 381)
						.addComponent(filteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 237,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18,
								18)
						.addComponent(jButton1).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu2Layout.createSequentialGroup()
						.addContainerGap(104, Short.MAX_VALUE)
						.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										Menu2Layout.createSequentialGroup().addGroup(Menu2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(Menu2Layout.createSequentialGroup().addComponent(jLabel11)
														.addGap(42, 42, 42).addComponent(CMaisonEdition,
																javax.swing.GroupLayout.PREFERRED_SIZE, 198,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860,
														javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(96, 96, 96))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										Menu2Layout.createSequentialGroup().addComponent(jLabel12)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(461, 461, 461).addComponent(Ajouter).addGap(175, 175, 175))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										Menu2Layout.createSequentialGroup()
												.addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 643,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(129, 129, 129)))));
		Menu2Layout.setVerticalGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(Menu2Layout.createSequentialGroup().addContainerGap(34, Short.MAX_VALUE)
						.addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(CMaisonEdition, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(48, 48, 48)
						.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(filteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Ajouter).addComponent(jLabel12).addComponent(spinner,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(33, 33, 33)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 770,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
		CMaisonEditionActionPerformed(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked

	}// GEN-LAST:event_jButton1MouseClicked

	private void filteTXTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_filteTXTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_filteTXTActionPerformed

	private void filteTXTKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_filteTXTKeyReleased
		tb1model = (DefaultTableModel) jTable2.getModel();
		String search = filteTXT.getText();
		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tb1model);
		jTable2.setRowSorter(tr);
		tr.setRowFilter(RowFilter.regexFilter(search));

	}// GEN-LAST:event_filteTXTKeyReleased

	private void CMaisonEditionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CMaisonEditionActionPerformed
		DefaultTableModel tb1model = (DefaultTableModel) jTable2.getModel();
		tb1model.setNumRows(0);

		if (this.CMaisonEdition.getSelectedItem().toString() == "Edition Crales") {

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maisonedition", "root", "");
				String query1 = "select * from maisonedition;";
				pst = con.prepareStatement(query1); // soit ajouter des data ou lire des data
				ResultSet rs = pst.executeQuery(); // lire data !!!
				while (rs.next()) {
					String isbn = rs.getString("isbn");
					String titre = rs.getString("titre");
					String edition = rs.getString("edition");
					String nbpages = rs.getString("nbpages");
					String Auteur = rs.getString("Auteur");

					String tbdata[] = { isbn, titre, edition, nbpages, Auteur };
					tb1model = (DefaultTableModel) jTable2.getModel();
					tb1model.addRow(tbdata);
				}
				con.close();

			} catch (Exception ex) {
				JOptionPane.showInputDialog(null, ex);
			}
		} else {

			if (this.CMaisonEdition.getSelectedItem().toString() == "Edition Paralise") {
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maisonedition", "root", "");
					String query1 = "select * from maisonedition2;";
					pst = con.prepareStatement(query1); // soit ajouter des data ou lire des data
					ResultSet rs = pst.executeQuery(); // lire data !!!
					while (rs.next()) {
						String isbn = rs.getString("isbn");
						String titre = rs.getString("titre");
						String edition = rs.getString("edition");
						String nbpages = rs.getString("nbpages");
						String Auteur = rs.getString("Auteur");

						String tbdata[] = { isbn, titre, edition, nbpages, Auteur };
						tb1model = (DefaultTableModel) jTable2.getModel();
						tb1model.addRow(tbdata);

					}

					con.close();

				} catch (Exception ex) {
					JOptionPane.showInputDialog(null, ex);
				}

			}

		}

	}// GEN-LAST:event_CMaisonEditionActionPerformed

	private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_AjouterMouseClicked
		int i = jTable2.getSelectedRow();
		DefaultTableModel tb1model = (DefaultTableModel) jTable2.getModel();
		isbn = tb1model.getValueAt(i, 0).toString();
		titre = tb1model.getValueAt(i, 1).toString();
		edition = tb1model.getValueAt(i, 2).toString();
		nbpages = tb1model.getValueAt(i, 3).toString();
		auteur = tb1model.getValueAt(i, 4).toString();
		boolean check = true;

		// tester si le livre déja existe
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
			String query = "select isbn from livre where isbn=?";
			pst = con.prepareStatement(query);
			pst.setString(1, isbn);
			System.out.println(pst);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "livre déja existe");
				check = true;
			} else {
				JOptionPane.showMessageDialog(null, "livre n'existe pas ");
				check = false;
			}

		} catch (Exception ex) {
			JOptionPane.showInputDialog(ex);
		}

		// ajouter l'auteur
		if (check == false) {

			try {

				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
				String query = "INSERT INTO `auteur`(`NOM`) VALUES (?)";
				pst = con.prepareStatement(query);
				pst.setString(1, auteur);
				pst.executeUpdate();
				con.close();
				JOptionPane.showMessageDialog(null, "auteur ajouter");

				// recuperer code auteur
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
				String query1 = "select codeauteur from auteur where nom=?";
				pst1 = con.prepareStatement(query1);
				pst1.setString(1, auteur);
				ResultSet rs1 = pst1.executeQuery();
				if (rs1.next()) {
					id = rs1.getString("codeauteur");
				}
				con.close();
				// JOptionPane.showMessageDialog(null, id);

				// ajouter livre
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
				String query2 = "INSERT INTO `livre`(`ISBN`, `CODEAUTEUR`, `TITRE`, `EDITION`, `NBPAGES`) VALUES (?,?,?,?,?)";

				pst = con.prepareStatement(query2);
				pst.setString(1, isbn);
				pst.setString(2, id);
				pst.setString(3, titre);
				pst.setString(4, edition);
				pst.setString(5, nbpages);
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Livre ajouter avec SUCESS");
				con.close();

				// ajout exemplaire
				Integer spinner = (Integer) this.spinner.getValue();
				// JOptionPane.showMessageDialog(null, spinner);

				for (int cnt = 0; cnt < spinner; cnt++) {

					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
					String query4 = "INSERT INTO `exemplaire`( `ISBN`, `ETAT`) VALUES (?,?)";
					pst = con.prepareStatement(query4);
					pst.setString(1, isbn);
					pst.setString(2, etat);
					pst.executeUpdate();

				}
				JOptionPane.showMessageDialog(null, "exemplaire ajouter avec SUCESS");
				con.close();
			} catch (Exception ex) {
				JOptionPane.showInputDialog(null, ex);
			}

		} else {
			try {

				Integer myint = (Integer) this.spinner.getValue();
				JOptionPane.showMessageDialog(null, spinner);

				for (int cnt = 0; cnt < myint; cnt++) {

					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
					String query4 = "INSERT INTO `exemplaire`( `ISBN`, `ETAT`) VALUES (?,?)";
					pst = con.prepareStatement(query4);
					pst.setString(1, isbn);
					pst.setString(2, etat);
					pst.executeUpdate();
					//

				}
				JOptionPane.showMessageDialog(null, "exemplaire avec SUCESS");
				con.close();
			} catch (Exception ex) {
				JOptionPane.showInputDialog(null, ex);
			}
		}

	}// GEN-LAST:event_AjouterMouseClicked

	private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable2MouseClicked

	}// GEN-LAST:event_jTable2MouseClicked

	private void MenuAdheMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MenuAdheMouseClicked
		MenuAdherant m = new MenuAdherant();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_MenuAdheMouseClicked

	private void AdherantMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_AdherantMouseClicked
		MenuAdherant m = new MenuAdherant();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_AdherantMouseClicked

	private void LivreMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_LivreMouseClicked
		MenuLivres m = new MenuLivres();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_LivreMouseClicked

	private void menupretMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_menupretMouseClicked
		MenuPret m = new MenuPret();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_menupretMouseClicked

	private void pretMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pretMouseClicked
		MenuPret m = new MenuPret();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_pretMouseClicked

	private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel13MouseClicked
		Statistic m = new Statistic();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_jLabel13MouseClicked

	private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel10MouseClicked
		Login m = new Login();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_jLabel10MouseClicked

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
			java.util.logging.Logger.getLogger(Livres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Livres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Livres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Livres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Livres().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel Adherant;
	private javax.swing.JButton Ajouter;
	private javax.swing.JComboBox<String> CMaisonEdition;
	private javax.swing.JLabel Livre;
	private javax.swing.JPanel Menu1;
	private javax.swing.JPanel Menu2;
	private javax.swing.JLabel MenuAdhe;
	private javax.swing.JLabel MenuL;
	private javax.swing.JTextField filteTXT;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JSeparator jSeparator4;
	private javax.swing.JTable jTable2;
	private javax.swing.JLabel menupret;
	private javax.swing.JLabel pret;
	private javax.swing.JSpinner spinner;
	// End of variables declaration//GEN-END:variables
}
