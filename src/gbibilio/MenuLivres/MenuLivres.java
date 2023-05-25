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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import login.Login;
//import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author mehdi
 */
public class MenuLivres extends javax.swing.JFrame {

	Connection con = null;
	PreparedStatement pst = null;
	DefaultTableModel tb1model;
	String auteur;
	String isbn;
	String titre;
	String nbpages;
	String edition;
	String id;

	/**
	 * Creates new form Menu
	 */
	public MenuLivres() {
		initComponents();
		showdate();
		showTime();
		this.setLocationRelativeTo(null);

	}

	void showdate() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyy");
		datelabel1.setText(s.format(d));
	}

	void showTime() {
		new Timer(0, new ActionListener() { // pendant 0 secande fait moi une action qui s'appele 'ActionListener'
			@Override
			public void actionPerformed(ActionEvent e) {
				Date d = new Date();
				SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
				timelabel1.setText(s.format(d));

			}

		}).start();
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
		Menu = new javax.swing.JLabel();
		MenuL = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		pret = new javax.swing.JLabel();
		STATIC = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		Adherant = new javax.swing.JLabel();
		MenuAdhe = new javax.swing.JLabel();
		jSeparator3 = new javax.swing.JSeparator();
		STAT = new javax.swing.JLabel();
		menupret = new javax.swing.JLabel();
		jSeparator4 = new javax.swing.JSeparator();
		LOG = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		Menu2 = new javax.swing.JPanel();
		Chercher = new javax.swing.JButton();
		filteTXT = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		BAjouter = new javax.swing.JButton();
		Supprimer = new javax.swing.JButton();
		Actualiser = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		ww = new javax.swing.JLabel();
		timelabel1 = new javax.swing.JLabel();
		datelabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		Menu1.setBackground(new java.awt.Color(102, 102, 255));
		Menu1.setLayout(null);

		Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/livres (1).png"))); // NOI18N
		Menu.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				MenuMouseClicked(evt);
			}
		});
		Menu1.add(Menu);
		Menu.setBounds(40, 20, 130, 110);

		MenuL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		MenuL.setForeground(new java.awt.Color(255, 255, 255));
		MenuL.setText("Gestion Livre");
		MenuL.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				MenuLMouseClicked(evt);
			}
		});
		Menu1.add(MenuL);
		MenuL.setBounds(40, 140, 128, 30);
		Menu1.add(jSeparator1);
		jSeparator1.setBounds(0, 170, 190, 10);

		pret.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/knowledge (1).png"))); // NOI18N
		pret.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pretMouseClicked(evt);
			}
		});
		Menu1.add(pret);
		pret.setBounds(30, 370, 150, 106);

		STATIC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		STATIC.setForeground(new java.awt.Color(255, 255, 255));
		STATIC.setText("Gestion Statictics");
		Menu1.add(STATIC);
		STATIC.setBounds(30, 650, 128, 30);
		Menu1.add(jSeparator2);
		jSeparator2.setBounds(0, 350, 190, 10);

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
		MenuAdhe.setBounds(30, 320, 128, 30);
		Menu1.add(jSeparator3);
		jSeparator3.setBounds(0, 520, 190, 10);

		STAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/graph-bar (1).png"))); // NOI18N
		STAT.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				STATMouseClicked(evt);
			}
		});
		Menu1.add(STAT);
		STAT.setBounds(30, 540, 120, 100);

		menupret.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		menupret.setForeground(new java.awt.Color(255, 255, 255));
		menupret.setText("Gestion des prêts");
		menupret.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				menupretMouseClicked(evt);
			}
		});
		Menu1.add(menupret);
		menupret.setBounds(30, 490, 128, 30);
		Menu1.add(jSeparator4);
		jSeparator4.setBounds(0, 680, 190, 10);

		LOG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-out (1).png"))); // NOI18N
		LOG.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				LOGMouseClicked(evt);
			}
		});
		Menu1.add(LOG);
		LOG.setBounds(30, 690, 120, 50);

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("Se deconnecter");
		Menu1.add(jLabel9);
		jLabel9.setBounds(33, 740, 128, 30);

		Menu2.setBackground(new java.awt.Color(255, 255, 255));

		Chercher.setBackground(new java.awt.Color(102, 102, 255));
		Chercher.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		Chercher.setForeground(new java.awt.Color(255, 255, 255));
		Chercher.setText("Chercher");
		Chercher.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				ChercherMouseClicked(evt);
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

		}, new String[] { "ISBN", "Titre", "Edition", "NbPages", "NbExemplaires", "Auteur" }));
		jScrollPane2.setViewportView(jTable2);

		BAjouter.setBackground(new java.awt.Color(102, 102, 255));
		BAjouter.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		BAjouter.setForeground(new java.awt.Color(255, 255, 255));
		BAjouter.setText("Ajouter");
		BAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				BAjouterMouseClicked(evt);
			}
		});
		BAjouter.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BAjouterActionPerformed(evt);
			}
		});

		Supprimer.setBackground(new java.awt.Color(102, 102, 255));
		Supprimer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		Supprimer.setForeground(new java.awt.Color(255, 255, 255));
		Supprimer.setText("Supprimer");
		Supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				SupprimerMouseClicked(evt);
			}
		});
		Supprimer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SupprimerActionPerformed(evt);
			}
		});

		Actualiser.setBackground(new java.awt.Color(102, 102, 255));
		Actualiser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		Actualiser.setForeground(new java.awt.Color(255, 255, 255));
		Actualiser.setText("Actualiser");
		Actualiser.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				ActualiserMouseClicked(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
		jLabel11.setText("Consultation des Livres ");

		jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel12.setText("Welcome : ");

		ww.setBackground(new java.awt.Color(102, 102, 255));
		ww.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		ww.setForeground(new java.awt.Color(102, 102, 255));

		timelabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		timelabel1.setText("Time");

		datelabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		datelabel1.setText("Date");

		javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
		Menu2.setLayout(Menu2Layout);
		Menu2Layout.setHorizontalGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(Menu2Layout.createSequentialGroup().addGap(203, 203, 203)
						.addComponent(BAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(174, 174, 174))
				.addGroup(Menu2Layout.createSequentialGroup().addGroup(Menu2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(Menu2Layout.createSequentialGroup().addGap(300, 300, 300).addComponent(jLabel11,
								javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(Menu2Layout.createSequentialGroup().addGap(34, 34, 34)
								.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(Menu2Layout.createSequentialGroup().addComponent(timelabel1)
												.addGap(128, 128, 128).addComponent(datelabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 120,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(Menu2Layout.createSequentialGroup().addGap(332, 332, 332)
												.addComponent(filteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 237,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(35, 35, 35).addComponent(Chercher).addGap(30, 30, 30)
												.addComponent(Actualiser, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
						.addGap(117, 125, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu2Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										Menu2Layout.createSequentialGroup()
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(99, 99, 99))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										Menu2Layout.createSequentialGroup().addComponent(jLabel12).addGap(18, 18, 18)
												.addComponent(ww, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(168, 168, 168)))));
		Menu2Layout.setVerticalGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(Menu2Layout.createSequentialGroup().addContainerGap()
						.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(ww, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel12).addComponent(timelabel1).addComponent(datelabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(15, 15, 15)
						.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37)
						.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(filteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Actualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(42, 42, 42)
						.addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(BAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(Menu2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 770,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 756,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
		ChercherMouseClicked(null);
	}// </editor-fold>//GEN-END:initComponents

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

	private void SupprimerMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SupprimerMouseClicked
		int i = jTable2.getSelectedRow();
		DefaultTableModel tb1model = (DefaultTableModel) jTable2.getModel();
		isbn = tb1model.getValueAt(i, 0).toString();
		titre = tb1model.getValueAt(i, 1).toString();
		edition = tb1model.getValueAt(i, 2).toString();
		nbpages = tb1model.getValueAt(i, 3).toString();
		auteur = tb1model.getValueAt(i, 4).toString();

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
			String query = "delete from exemplaire where isbn =?";
			pst = con.prepareStatement(query);
			pst.setString(1, this.isbn);
			pst.execute();

			JOptionPane.showMessageDialog(null, "exemplaire supprimé");

			con.close();
		} catch (Exception ex) {
			JOptionPane.showInputDialog(null, ex);
		}
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
			String query1 = "delete from livre where isbn =?";
			pst = con.prepareStatement(query1);
			pst.setString(1, this.isbn);
			pst.execute();

			JOptionPane.showMessageDialog(null, "livre supprimé");

			con.close();
		} catch (Exception ex) {
			JOptionPane.showInputDialog(null, ex);
		}

	}// GEN-LAST:event_SupprimerMouseClicked

	private void ActualiserMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ActualiserMouseClicked

		DefaultTableModel tb1model = (DefaultTableModel) jTable2.getModel();
		tb1model.setNumRows(0);

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
			String query1 = "select COUNT(*) as nbexemplaires ,livre.ISBN,livre.TITRE,livre.EDITION,livre.NBPAGES,auteur.NOM from exemplaire , livre , auteur where exemplaire.ISBN=livre.ISBN and livre.CODEAUTEUR=auteur.CODEAUTEUR GROUP BY livre.ISBN;;";
			pst = con.prepareStatement(query1); // soit ajouter des data ou lire des data
			ResultSet rs = pst.executeQuery(); // lire data !!!
			while (rs.next()) {
				String isbn = rs.getString("isbn");
				String titre = rs.getString("titre");
				String edition = rs.getString("edition");
				String nbpages = rs.getString("nbpages");
				String nbexemplaires = rs.getString("nbexemplaires");
				String nom = rs.getString("nom");

				String tbdata[] = { isbn, titre, edition, nbpages, nbexemplaires, nom };
				// DefaultTableModel tb1model = (DefaultTableModel) jTable2.getModel();
				tb1model.addRow(tbdata);
			}
			con.close();
		} catch (Exception ex) {
			JOptionPane.showInputDialog(null, ex);
		}

	}// GEN-LAST:event_ActualiserMouseClicked

	private void BAjouterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BAjouterActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_BAjouterActionPerformed

	private void BAjouterMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_BAjouterMouseClicked
		Livres m = new Livres();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_BAjouterMouseClicked

	private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SupprimerActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_SupprimerActionPerformed

	private void MenuMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MenuMouseClicked

	}// GEN-LAST:event_MenuMouseClicked

	private void MenuLMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MenuLMouseClicked
		MenuLivres m = new MenuLivres();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_MenuLMouseClicked

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

	private void pretMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pretMouseClicked
		MenuPret m = new MenuPret();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_pretMouseClicked

	private void menupretMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_menupretMouseClicked
		MenuPret m = new MenuPret();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_menupretMouseClicked

	private void ChercherMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ChercherMouseClicked
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gbiblio", "root", "");
			String query1 = "select COUNT(*) as nbexemplaires ,livre.ISBN,livre.TITRE,livre.EDITION,livre.NBPAGES,auteur.NOM from exemplaire , livre , auteur where exemplaire.ISBN=livre.ISBN and livre.CODEAUTEUR=auteur.CODEAUTEUR GROUP BY livre.ISBN;";
			pst = con.prepareStatement(query1); // soit ajouter des data ou lire des data
			ResultSet rs = pst.executeQuery(); // lire data !!!
			while (rs.next()) {
				String isbn = rs.getString("isbn");
				String titre = rs.getString("titre");
				String edition = rs.getString("edition");
				String nbpages = rs.getString("nbpages");
				String nbexemplaires = rs.getString("nbexemplaires");
				String nom = rs.getString("nom");

				String tbdata[] = { isbn, titre, edition, nbpages, nbexemplaires, nom };
				DefaultTableModel tb1model = (DefaultTableModel) jTable2.getModel();
				tb1model.addRow(tbdata);
			}
			con.close();
		} catch (Exception ex) {
			JOptionPane.showInputDialog(null, ex);
		}

	}// GEN-LAST:event_ChercherMouseClicked

	private void STATMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_STATMouseClicked
		Statistic m = new Statistic();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_STATMouseClicked

	private void LOGMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_LOGMouseClicked
		Login m = new Login();
		m.setVisible(true);
		m.pack();
		m.setLocationRelativeTo(null);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}// GEN-LAST:event_LOGMouseClicked

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
			java.util.logging.Logger.getLogger(MenuLivres.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MenuLivres.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MenuLivres.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MenuLivres.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MenuLivres().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Actualiser;
	private javax.swing.JLabel Adherant;
	private javax.swing.JButton BAjouter;
	private javax.swing.JButton Chercher;
	private javax.swing.JLabel LOG;
	private javax.swing.JLabel Menu;
	private javax.swing.JPanel Menu1;
	private javax.swing.JPanel Menu2;
	private javax.swing.JLabel MenuAdhe;
	private javax.swing.JLabel MenuL;
	private javax.swing.JLabel STAT;
	private javax.swing.JLabel STATIC;
	private javax.swing.JButton Supprimer;
	private javax.swing.JLabel datelabel1;
	private javax.swing.JTextField filteTXT;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JSeparator jSeparator4;
	private javax.swing.JTable jTable2;
	private javax.swing.JLabel menupret;
	private javax.swing.JLabel pret;
	private javax.swing.JLabel timelabel1;
	public static javax.swing.JLabel ww;
	// End of variables declaration//GEN-END:variables

}
