package login;

import gbibilio.MenuAdherant.MenuAdherant;
import gbibilio.MenuLivres.Livres;
import gbibilio.MenuLivres.MenuLivres;
import gbibilio.MenuPret.CLivres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author El Mehdi Haddadi
 */
public class Login extends javax.swing.JFrame {

	/**
	 * Creates new form Login
	 */
	public Login() {
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

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		User = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		datelabel = new javax.swing.JLabel();
		timelabel = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		Pass = new javax.swing.JPasswordField();
		datelabel1 = new javax.swing.JLabel();
		timelabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(245,245,220));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bibliotheque (1).png"))); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(63, Short.MAX_VALUE).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(53, 53, 53)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout
						.createSequentialGroup().addGap(106, 106, 106).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(126, Short.MAX_VALUE)));

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setLayout(null);
		jPanel2.add(User);
		User.setBounds(160, 210, 210, 30);

		jButton1.setBackground(new java.awt.Color(102, 102, 255));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Se Conecter");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton1MouseClicked(evt);
			}
		});
		jPanel2.add(jButton1);
		jButton1.setBounds(200, 320, 140, 30);

		jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 1, 30)); // NOI18N
		jLabel2.setText("  Bienvenue à Bibliothéque ISI");
		jPanel2.add(jLabel2);
		jLabel2.setBounds(20, 20, 487, 69);

		jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
		jLabel3.setText("Accéder à votre compte");
		jPanel2.add(jLabel3);
		jLabel3.setBounds(180, 80, 190, 30);

		datelabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		datelabel.setText("Date");
		jPanel2.add(datelabel);
		datelabel.setBounds(10, 120, 120, 50);

		timelabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		timelabel.setText("Time");
		jPanel2.add(timelabel);
		timelabel.setBounds(10, 140, 120, 50);

		jLabel4.setText("Oublier mot de passe ? ");
		jPanel2.add(jLabel4);
		jLabel4.setBounds(20, 410, 171, 16);

		Pass.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PassActionPerformed(evt);
			}
		});
		jPanel2.add(Pass);
		Pass.setBounds(160, 260, 210, 30);
		jPanel2.add(datelabel1);
		datelabel1.setBounds(50, 136, 90, 20);

		timelabel1.setText("  ");
		jPanel2.add(timelabel1);
		timelabel1.setBounds(50, 156, 80, 20);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked
		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
			String query1 = "select * from login where username=? AND password=?";
			PreparedStatement pst = con.prepareStatement(query1); // soit ajouter des data ou lire des data
			pst.setString(1, this.User.getText());
			pst.setString(2, this.Pass.getText());

			ResultSet rs = pst.executeQuery(); // lire data !!!!
			if (rs.next()) { // jusqu la fin
				JOptionPane.showMessageDialog(null, "Username and Password Matched");

				MenuLivres m = new MenuLivres();
				m.setVisible(true);
				m.pack();
				m.setLocationRelativeTo(null);
				m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.dispose();
				MenuLivres.ww.setText(this.User.getText());
				CLivres.welcome.setText(this.User.getText());
				MenuAdherant.welcome.setText(this.User.getText());

			} else {
				JOptionPane.showMessageDialog(null, "Username and Password DO NOT Matched");
				User.setText("");
				Pass.setText("");
			}
			con.close();

			// Menu.welcome.setText(this.username);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}// GEN-LAST:event_jButton1MouseClicked

	private void PassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PassActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_PassActionPerformed

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
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPasswordField Pass;
	public javax.swing.JTextField User;
	private javax.swing.JLabel datelabel;
	private javax.swing.JLabel datelabel1;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JLabel timelabel;
	private javax.swing.JLabel timelabel1;
	// End of variables declaration//GEN-END:variables
}
