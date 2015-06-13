package org.lissi.extension.owl.smc.editor;

import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.UIManager;

/**
 * 
 * @author Peter
 */
@SuppressWarnings("serial")
public class TextEditorSmc extends javax.swing.JFrame {

	private static TextEditorSmc instance;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";


	public static TextEditorSmc getInstance()
	{

		if (instance == null)
		{
			instance = new TextEditorSmc();
		}
		return instance;

	}


	/**
	 * Creates new form TextEditor
	 */
	public TextEditorSmc()
	{

		initComponents();
	}


	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents()
	{

		jMenu1 = new javax.swing.JMenu();
		optionsPanel = new javax.swing.JPanel();
		saveButton = new javax.swing.JButton();

		textPanel = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		textArea = new javax.swing.JTextArea();
		textEditorMenu = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		saveMenuOption = new javax.swing.JMenuItem();

		jMenu1.setText("jMenu1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		optionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

		saveButton.setText("Save");
		saveButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{

				saveButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
		optionsPanel.setLayout(optionsPanelLayout);
		optionsPanelLayout.setHorizontalGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(optionsPanelLayout
				.createSequentialGroup()
				.addContainerGap()
				.addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup().addComponent(saveButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(optionsPanelLayout.createSequentialGroup()

						.addGap(0, 0, Short.MAX_VALUE)))));
		optionsPanelLayout.setVerticalGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(optionsPanelLayout.createSequentialGroup().addContainerGap().addComponent(saveButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGap(3, 3, 3)

				.addGap(0, 18, Short.MAX_VALUE)));

		textPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Save as Smc File"));

		textArea.setColumns(20);
		textArea.setRows(5);
		jScrollPane1.setViewportView(textArea);

		javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
		textPanel.setLayout(textPanelLayout);
		textPanelLayout.setHorizontalGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textPanelLayout.createSequentialGroup().addContainerGap()
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE).addContainerGap()));
		textPanelLayout.setVerticalGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(textPanelLayout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE).addContainerGap()));

		fileMenu.setText("File");

		saveMenuOption.setText("Save");
		fileMenu.add(saveMenuOption);

		textEditorMenu.add(fileMenu);

		setJMenuBar(textEditorMenu);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
				.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(textPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap()
				.addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(textPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(18, 18, 18)));

		pack();
	}// </editor-fold>


	private void saveButtonActionPerformed(java.awt.event.ActionEvent evt)
	{

		// Save button
		JFileChooser saveFile = new JFileChooser();
		// saveFile.showSaveDialog(null);

		String sb = textArea.getText();

		saveFile.setCurrentDirectory(saveFile.getCurrentDirectory());
		int retrival = saveFile.showSaveDialog(null);
		if (retrival == JFileChooser.APPROVE_OPTION)
		{
			try
			{
				FileWriter fw = new FileWriter(saveFile.getSelectedFile() + ".smc");
				fw.write(sb.toString());
				fw.close();
			} catch (Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}


	@SuppressWarnings({ "unused", "static-access" })
	private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)
	{

		setDefaultCloseOperation(this.EXIT_ON_CLOSE);

	}


	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[])
	{

		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(TextEditorSmc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(TextEditorSmc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(TextEditorSmc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(TextEditorSmc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run()
			{

				new TextEditorSmc().setVisible(true);
			}
		});
	}


	@SuppressWarnings("unused")
	private static void installLnF()
	{

		try
		{
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e)
		{
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	// Variables declaration - do not modify

	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JPanel optionsPanel;
	private javax.swing.JButton saveButton;
	private javax.swing.JMenuItem saveMenuOption;
	public javax.swing.JTextArea textArea;
	private javax.swing.JMenuBar textEditorMenu;
	private javax.swing.JPanel textPanel;
	// End of variables declaration
}