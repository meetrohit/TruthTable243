import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class TruthTableGUI {

	private final String[] OPLIST = {" ", "AND", "OR", "NOT", "NAND", "NOR", "XOR"};
	private final Integer[] NUMLIST = {2,3,4};
	private final String[] ALIST = {" ","p","q","r","t"};
	private final String[] BLIST = {" ","p","q","r","t","A"};
	private final String[] CLIST = {" ","p","q","r","t","A","B"};
	private final String[] DLIST = {" ","p","q","r","t","A","B","C"};
	private final String[] ELIST = {" ","p","q","r","t","A","B","C","D"};
	private final String[] FLIST = {" ","p","q","r","t","A","B","C","D","E"};
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TruthTableGUI window = new TruthTableGUI();
					window.frame.setVisible(true);

					String populate[] = GUIManipulator.initialize(2);
					pvarArea.setText(populate[0]);
					qvarArea.setText(populate[1]);
					rvarArea.setText(populate[2]);
					tvarArea.setText(populate[3]);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TruthTableGUI() {
		initialize();
	}

	JMenuBar menuBar;
	JMenu mnFile;
	JMenuItem mntmClose;
	JMenu mnAbout;
	JMenuItem mntmGroup;
	JPanel corePanel;
	Label pLabel;
	Label qLabel;
	Label rLabel;
	Label tLabel;
	private static JTextArea pvarArea;
	private static JTextArea qvarArea;
	private static JTextArea rvarArea;
	private static JTextArea tvarArea;
	private static JComboBox numVarDrop;
	JPanel Apanel;
	Label Alabel;
	private static JTextArea ATextArea;
	private static JComboBox ADropLeft;
	private static JComboBox ADropRight;
	private static JComboBox ADropOp;
	JPanel Bpanel;
	Label Blabel;
	private static JTextArea BTextArea;
	private static JComboBox BDropLeft;
	private static JComboBox BDropOp;
	private static JComboBox BDropRight;
	JPanel Cpanel;
	Label Clabel;
	private static JTextArea CTextArea;
	private static JComboBox CDropLeft;
	private static JComboBox CDropOp;
	private static JComboBox CDropRight;
	JPanel Dpanel;
	Label Dlabel;
	private static JTextArea DTextArea;
	private static JComboBox DDropLeft;
	private static JComboBox DDropOp;
	private static JComboBox DDropRight;
	JPanel Epanel;
	Label Elabel;
	private static JTextArea ETextArea;
	private static JComboBox EDropLeft;
	private static JComboBox EDropOp;
	private static JComboBox EDropRight;
	JPanel Fpanel;
	Label fLabel;
	private static JTextArea FTextArea;
	private static JComboBox FDropLeft;
	private static JComboBox FDropOp;
	private static JComboBox FDropRight;
	JMenuItem inst;

	private void initialize() {
		frame = new JFrame("Truth Table");
		frame.setBounds(100, 100, 990, 400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 990, 21);
		frame.getContentPane().add(menuBar);

		mnFile = new JMenu("File");
		menuBar.add(mnFile);

		inst = new JMenuItem("Instrutions");
		inst.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				instructions();
			}	
		});
		mnFile.add(inst);
		
		mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}	
		});
		
		mnFile.add(mntmClose);
		
		mnAbout = new JMenu("About");
		menuBar.add(mnAbout);

		mntmGroup = new JMenuItem("Group 12");
		mntmGroup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String stuff = "Final Project for MAT 243 (Fall 2015)\n\nMembers:\n-John Alden (Data Manipulation)\n-Bryan Parrish (GUI) \n-Mitkumar Rohit (Team Lead)";
				JOptionPane.showMessageDialog(null, stuff, "About Group 12", JOptionPane.INFORMATION_MESSAGE);
			}	
		});
		mnAbout.add(mntmGroup);
		
		corePanel = new JPanel();
		corePanel.setBounds(10, 32, 100, 318);
		frame.getContentPane().add(corePanel);
		corePanel.setLayout(null);
		
		pLabel = new Label("p");
		pLabel.setAlignment(Label.CENTER);
		pLabel.setBounds(0, 25, 20, 22);
		corePanel.add(pLabel);
		
		qLabel = new Label("q");
		qLabel.setAlignment(Label.CENTER);
		qLabel.setBounds(25, 25, 20, 22);
		corePanel.add(qLabel);
		
		rLabel = new Label("r");
		rLabel.setAlignment(Label.CENTER);
		rLabel.setBounds(50, 25, 20, 22);
		corePanel.add(rLabel);
		
		tLabel = new Label("t");
		tLabel.setAlignment(Label.CENTER);
		tLabel.setBounds(75, 25, 20, 22);
		corePanel.add(tLabel);
		
		pvarArea = new JTextArea();
		pvarArea.setEditable(false);
		pvarArea.setBounds(5, 45, 10, 273);
		corePanel.add(pvarArea);
		
		qvarArea = new JTextArea();
		qvarArea.setEditable(false);
		qvarArea.setBounds(30, 45, 10, 273);
		corePanel.add(qvarArea);
		
		rvarArea = new JTextArea();
		rvarArea.setEditable(false);
		rvarArea.setBounds(55, 45, 10, 273);
		corePanel.add(rvarArea);
		
		tvarArea = new JTextArea();
		tvarArea.setEditable(false);
		tvarArea.setBounds(80, 45, 10, 273);
		corePanel.add(tvarArea);
		
		numVarDrop = new JComboBox(NUMLIST);
		numVarDrop.setBounds(32, 0, 32, 20);
		numVarDrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String populate[] = GUIManipulator.initialize((int)numVarDrop.getSelectedItem());
				pvarArea.setText(populate[0]);
				qvarArea.setText(populate[1]);
				rvarArea.setText(populate[2]);
				tvarArea.setText(populate[3]);

				updateA();
				clearB();
				clearC();
				clearD();
				clearE();
				clearF();
			}
		});
		corePanel.add(numVarDrop);
		
		Apanel = new JPanel();
		Apanel.setBounds(130, 32, 140, 319);
		frame.getContentPane().add(Apanel);
		Apanel.setLayout(null);
		
		Alabel = new Label("A");
		Alabel.setAlignment(Label.CENTER);
		Alabel.setBounds(10, 0, 120, 22);
		Apanel.add(Alabel);
		
		ATextArea = new JTextArea();
		ATextArea.setEditable(false);
		ATextArea.setBounds(65, 46, 10, 273);
		Apanel.add(ATextArea);
		
		ADropLeft = new JComboBox(ALIST);
		ADropLeft.setBounds(0, 25, 35, 20);
		ADropLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ATextArea.setText("");
				updateA();
			}	
		});
		Apanel.add(ADropLeft);
		
		ADropRight = new JComboBox(ALIST);
		ADropRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ATextArea.setText("");
				updateA();
			}	
		});
		ADropRight.setBounds(95, 25, 35, 20);
		Apanel.add(ADropRight);
		
		ADropOp = new JComboBox(OPLIST);
		ADropOp.setBounds(36, 25, 58, 20);
		ADropOp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ATextArea.setText("");
				switch(ADropOp.getSelectedIndex()) {
					case 0: //blank
						ADropRight.setEnabled(true);
						return;
					case 3: //NOT
						ADropRight.setSelectedItem(" ");
						ADropRight.setEnabled(false);
						break;
					default: //everything else
						ADropRight.setEnabled(true);
						break;
				}
				updateA();
			}	
		});
		Apanel.add(ADropOp);
		
		Bpanel = new JPanel();
		Bpanel.setBounds(270, 32, 140, 319);
		frame.getContentPane().add(Bpanel);
		Bpanel.setLayout(null);
		
		Blabel = new Label("B");
		Blabel.setAlignment(Label.CENTER);
		Blabel.setBounds(10, 0, 120, 22);
		Bpanel.add(Blabel);
		
		BTextArea = new JTextArea();
		BTextArea.setEditable(false);
		BTextArea.setBounds(65, 46, 10, 273);
		Bpanel.add(BTextArea);
		
		BDropLeft = new JComboBox(BLIST);
		BDropLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				BTextArea.setText("");
				updateB();
			}	
		});
		BDropLeft.setBounds(0, 25, 35, 20);
		Bpanel.add(BDropLeft);
		
		BDropOp = new JComboBox(OPLIST);
		BDropOp.setBounds(36, 25, 58, 20);
		BDropOp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				BTextArea.setText("");
				if(BDropOp.isEnabled()) {
					switch (BDropOp.getSelectedIndex()) {
						case 0: //blank
							if(BDropLeft.isEnabled())
								BDropRight.setEnabled(true);
							return;
						case 3: //NOT
							BDropRight.setSelectedItem(" ");
							BDropRight.setEnabled(false);
							break;
						default: //everything else
							BDropRight.setEnabled(true);
							break;
					}
				}
				updateB();
			}	
		});
		Bpanel.add(BDropOp);
		
		BDropRight = new JComboBox(BLIST);
		BDropRight.setBounds(95, 25, 35, 20);
		BDropRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				BTextArea.setText("");
				updateB();
			}	
		});
		Bpanel.add(BDropRight);
		
		Cpanel = new JPanel();
		Cpanel.setBounds(410, 32, 140, 319);
		frame.getContentPane().add(Cpanel);
		Cpanel.setLayout(null);
		
		Clabel = new Label("C");
		Clabel.setAlignment(Label.CENTER);
		Clabel.setBounds(10, 0, 120, 22);
		Cpanel.add(Clabel);
		
		CTextArea = new JTextArea();
		CTextArea.setEditable(false);
		CTextArea.setBounds(65, 46, 10, 273);
		Cpanel.add(CTextArea);
		
		CDropLeft = new JComboBox(CLIST);
		CDropLeft.setBounds(0, 25, 35, 20);
		CDropLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				CTextArea.setText("");
				updateC();
			}	
		});
		Cpanel.add(CDropLeft);
		
		CDropOp = new JComboBox(OPLIST);
		CDropOp.setBounds(36, 25, 58, 20);
		CDropOp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				CTextArea.setText("");
				if(CDropOp.isEnabled()) {
					switch (CDropOp.getSelectedIndex()) {
						case 0: //blank
							if(CDropLeft.isEnabled())
								CDropRight.setEnabled(true);
							return;
						case 3: //NOT
							CDropRight.setSelectedItem(" ");
							CDropRight.setEnabled(false);
							break;
						default: //everything else
							CDropRight.setEnabled(true);
							break;
					}
				}
				updateC();
			}	
		});
		Cpanel.add(CDropOp);
		
		CDropRight = new JComboBox(CLIST);
		CDropRight.setBounds(95, 25, 35, 20);
		CDropRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				CTextArea.setText("");
				updateC();
			}	
		});
		Cpanel.add(CDropRight);
		
		Dpanel = new JPanel();
		Dpanel.setBounds(550, 32, 140, 319);
		frame.getContentPane().add(Dpanel);
		Dpanel.setLayout(null);
		
		Dlabel = new Label("D");
		Dlabel.setAlignment(Label.CENTER);
		Dlabel.setBounds(10, 0, 120, 22);
		Dpanel.add(Dlabel);
		
		DTextArea = new JTextArea();
		DTextArea.setEditable(false);
		DTextArea.setBounds(65, 46, 10, 273);
		Dpanel.add(DTextArea);
		
		DDropLeft = new JComboBox(DLIST);
		DDropLeft.setBounds(0, 25, 35, 20);
		DDropLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				DTextArea.setText("");
				updateD();
			}	
		});
		Dpanel.add(DDropLeft);
		
		DDropOp = new JComboBox(OPLIST);
		DDropOp.setBounds(36, 25, 58, 20);
		DDropOp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				DTextArea.setText("");
				if(DDropOp.isEnabled()) {
					switch (DDropOp.getSelectedIndex()) {
						case 0: //blank
							if(DDropLeft.isEnabled())
								DDropRight.setEnabled(true);
							return;
						case 3: //NOT
							DDropRight.setSelectedItem(" ");
							DDropRight.setEnabled(false);
							break;
						default: //everything else
							DDropRight.setEnabled(true);
							break;
					}
				}
				updateD();
			}	
		});
		Dpanel.add(DDropOp);
		
		DDropRight = new JComboBox(DLIST);
		DDropRight.setBounds(95, 25, 35, 20);
		DDropRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				DTextArea.setText("");
				updateD();
			}	
		});
		Dpanel.add(DDropRight);
		
		Epanel = new JPanel();
		Epanel.setBounds(690, 32, 140, 319);
		frame.getContentPane().add(Epanel);
		Epanel.setLayout(null);
		
		Elabel = new Label("E");
		Elabel.setAlignment(Label.CENTER);
		Elabel.setBounds(10, 0, 120, 22);
		Epanel.add(Elabel);
		
		ETextArea = new JTextArea();
		ETextArea.setEditable(false);
		ETextArea.setBounds(65, 46, 10, 273);
		Epanel.add(ETextArea);
		
		EDropLeft = new JComboBox(ELIST);
		EDropLeft.setBounds(0, 25, 35, 20);
		EDropLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ETextArea.setText("");
				updateE();
			}	
		});
		Epanel.add(EDropLeft);
		
		EDropOp = new JComboBox(OPLIST);
		EDropOp.setBounds(36, 25, 58, 20);
		EDropOp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ETextArea.setText("");
				if(EDropOp.isEnabled()) {
					switch (EDropOp.getSelectedIndex()) {
						case 0: //blank
							if(EDropLeft.isEnabled())
								EDropRight.setEnabled(true);
							return;
						case 3: //NOT
							EDropRight.setSelectedItem(" ");
							EDropRight.setEnabled(false);
							break;
						default: //everything else
							EDropRight.setEnabled(true);
							break;
					}
				}
				updateE();
			}	
		});
		Epanel.add(EDropOp);
		
		EDropRight = new JComboBox(ELIST);
		EDropRight.setBounds(95, 25, 35, 20);
		EDropRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ETextArea.setText("");
				updateE();
			}	
		});
		Epanel.add(EDropRight);
		
		Fpanel = new JPanel();
		Fpanel.setLayout(null);
		Fpanel.setBounds(830, 32, 140, 319);
		frame.getContentPane().add(Fpanel);
		
		fLabel = new Label("F");
		fLabel.setAlignment(Label.CENTER);
		fLabel.setBounds(10, 0, 120, 22);
		Fpanel.add(fLabel);
		
		FTextArea = new JTextArea();
		FTextArea.setEditable(false);
		FTextArea.setBounds(65, 46, 10, 273);
		Fpanel.add(FTextArea);
		
		FDropLeft = new JComboBox(FLIST);
		FDropLeft.setBounds(0, 25, 35, 20);
		FDropLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				FTextArea.setText("");
				updateF();
			}	
		});
		Fpanel.add(FDropLeft);
		
		FDropOp = new JComboBox(OPLIST);
		FDropOp.setBounds(36, 25, 58, 20);
		FDropOp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				FTextArea.setText("");
				if(FDropOp.isEnabled()) {
					switch (FDropOp.getSelectedIndex()) {
						case 0: //blank
							if(BDropLeft.isEnabled())
								FDropRight.setEnabled(true);
							return;
						case 3: //NOT
							FDropRight.setSelectedItem(" ");
							FDropRight.setEnabled(false);
							break;
						default: //everything else
							FDropRight.setEnabled(true);
							break;
					}
				}
				updateF();
			}	
		});
		Fpanel.add(FDropOp);
		
		FDropRight = new JComboBox(FLIST);
		FDropRight.setBounds(95, 25, 35, 20);
		FDropRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				FTextArea.setText("");
				updateF();
			}	
		});
		Fpanel.add(FDropRight);
		
		//clearing all but the A panel
		clearB();
		instructions();
	}

	public void updateA()
	{
		if( ADropLeft.getSelectedIndex() != 0)
		{
			if( ADropOp.getSelectedIndex() != 0) {
				if(ADropRight.isEnabled()) {
					if (ADropRight.getSelectedIndex() != 0) {
						ATextArea.setText(GUIManipulator.Compute("A",(String) ADropOp.getSelectedItem(),
								GUIManipulator.getArray((String) ADropLeft.getSelectedItem()),
								GUIManipulator.getArray((String) ADropRight.getSelectedItem()),
								(int) numVarDrop.getSelectedItem()));
						enableB();
					}
					else
					{
						clearB();
					}
				}
				else {
					ATextArea.setText(GUIManipulator.Compute("A","NOT",
							GUIManipulator.getArray((String) ADropLeft.getSelectedItem()),
							null,
							(int) numVarDrop.getSelectedItem()));
					enableB();
				}
			}
			else
			{
				clearB();
			}
		}
		else
		{
			clearB();
		}
	}

	public void updateB()
	{
		if( BDropLeft.getSelectedIndex() != 0)
		{
			if( BDropOp.getSelectedIndex() != 0) {
				if(BDropRight.isEnabled()) {
					if (BDropRight.getSelectedIndex() != 0) {
						BTextArea.setText(GUIManipulator.Compute("B",(String) BDropOp.getSelectedItem(),
								GUIManipulator.getArray((String) BDropLeft.getSelectedItem()),
								GUIManipulator.getArray((String) BDropRight.getSelectedItem()),
								(int) numVarDrop.getSelectedItem()));
						enableC();
					}
					else
					{
						clearC();
					}
				}
				else {
					BTextArea.setText(GUIManipulator.Compute("B","NOT",
							GUIManipulator.getArray((String) BDropLeft.getSelectedItem()),
							null,
							(int) numVarDrop.getSelectedItem()));
					enableC();
				}
			}
			else
			{
				clearC();
			}
		}
		else
		{
			clearC();
		}
	}

	public void updateC()
	{
		if( CDropLeft.getSelectedIndex() != 0)
		{
			if( CDropOp.getSelectedIndex() != 0) {
				if(CDropRight.isEnabled()) {
					if (CDropRight.getSelectedIndex() != 0) {
						CTextArea.setText(GUIManipulator.Compute("C",(String) CDropOp.getSelectedItem(),
								GUIManipulator.getArray((String) CDropLeft.getSelectedItem()),
								GUIManipulator.getArray((String) CDropRight.getSelectedItem()),
								(int) numVarDrop.getSelectedItem()));
						enableD();
					}
					else
					{
						clearD();
					}
				}
				else {
					CTextArea.setText(GUIManipulator.Compute("C","NOT",
							GUIManipulator.getArray((String) CDropLeft.getSelectedItem()),
							null,
							(int) numVarDrop.getSelectedItem()));
					enableD();
				}
			}
			else
			{
				clearD();
			}
		}
		else
		{
			clearD();
		}
	}

	public void updateD()
	{
		if( DDropLeft.getSelectedIndex() != 0)
		{
			if( DDropOp.getSelectedIndex() != 0) {
				if(DDropRight.isEnabled()) {
					if (DDropRight.getSelectedIndex() != 0) {
						DTextArea.setText(GUIManipulator.Compute("D",(String) DDropOp.getSelectedItem(),
								GUIManipulator.getArray((String) DDropLeft.getSelectedItem()),
								GUIManipulator.getArray((String) DDropRight.getSelectedItem()),
								(int) numVarDrop.getSelectedItem()));
						enableE();
					}
					else
					{
						clearE();
					}
				}
				else {
					DTextArea.setText(GUIManipulator.Compute("D","NOT",
							GUIManipulator.getArray((String) DDropLeft.getSelectedItem()),
							null,
							(int) numVarDrop.getSelectedItem()));
					enableE();
				}
			}
			else
			{
				clearE();
			}
		}
		else
		{
			clearE();
		}
	}

	public void updateE()
	{
		if( EDropLeft.getSelectedIndex() != 0)
		{
			if( EDropOp.getSelectedIndex() != 0) {
				if(EDropRight.isEnabled()) {
					if (EDropRight.getSelectedIndex() != 0) {
						ETextArea.setText(GUIManipulator.Compute("E",(String) EDropOp.getSelectedItem(),
								GUIManipulator.getArray((String) EDropLeft.getSelectedItem()),
								GUIManipulator.getArray((String) EDropRight.getSelectedItem()),
								(int) numVarDrop.getSelectedItem()));
						enableF();
					}
					else
					{
						clearF();
					}
				}
				else {
					ETextArea.setText(GUIManipulator.Compute("E","NOT",
							GUIManipulator.getArray((String) EDropLeft.getSelectedItem()),
							null,
							(int) numVarDrop.getSelectedItem()));
					enableF();
				}
			}
			else
			{
				clearF();
			}
		}
		else
		{
			clearF();
		}
	}

	public void updateF()
	{
		if( FDropLeft.getSelectedIndex() != 0)
		{
			if( FDropOp.getSelectedIndex() != 0) {
				if(FDropRight.isEnabled()) {
					if (FDropRight.getSelectedIndex() != 0) {
						FTextArea.setText(GUIManipulator.Compute("F",(String) FDropOp.getSelectedItem(),
								GUIManipulator.getArray((String) FDropLeft.getSelectedItem()),
								GUIManipulator.getArray((String) FDropRight.getSelectedItem()),
								(int) numVarDrop.getSelectedItem()));
					}
				}
				else {
					FTextArea.setText(GUIManipulator.Compute("F","NOT",
							GUIManipulator.getArray((String) FDropLeft.getSelectedItem()),
							null,
							(int) numVarDrop.getSelectedItem()));
				}
			}
		}
	}
	
	public void enableF(){
		FTextArea.setEnabled(true);
		FDropLeft.setEnabled(true);
		FDropRight.setEnabled(true);
		FDropOp.setEnabled(true);
	}

	public void disableF(){
		FTextArea.setEnabled(false);
		FDropLeft.setEnabled(false);
		FDropRight.setEnabled(false);
		FDropOp.setEnabled(false);
	}
	
	public void clearF(){
		FTextArea.setText("");
		FTextArea.setEnabled(false);
		FDropLeft.setSelectedIndex(0);
		FDropLeft.setEnabled(false);
		FDropRight.setSelectedIndex(0);
		FDropRight.setEnabled(false);
		FDropOp.setSelectedIndex(0);
		FDropOp.setEnabled(false);
	}
	
	public void enableE(){
		ETextArea.setEnabled(true);
		EDropLeft.setEnabled(true);
		EDropRight.setEnabled(true);
		EDropOp.setEnabled(true);
	}

	public void disableE(){
		ETextArea.setEnabled(false);
		EDropLeft.setEnabled(false);
		EDropRight.setEnabled(false);
		EDropOp.setEnabled(false);
	}
	
	public void clearE(){
		ETextArea.setText("");
		ETextArea.setEnabled(false);
		EDropLeft.setSelectedIndex(0);
		EDropLeft.setEnabled(false);
		EDropRight.setSelectedIndex(0);
		EDropRight.setEnabled(false);
		EDropOp.setSelectedIndex(0);
		EDropOp.setEnabled(false);
		clearF();
		disableF();
	}
	
	public void enableD(){
		DTextArea.setEnabled(true);
		DDropLeft.setEnabled(true);
		DDropRight.setEnabled(true);
		DDropOp.setEnabled(true);
	}

	public void disableD(){
		DTextArea.setEnabled(false);
		DDropLeft.setEnabled(false);
		DDropRight.setEnabled(false);
		DDropOp.setEnabled(false);
	}

	public void clearD(){
		DTextArea.setText("");
		DTextArea.setEnabled(false);
		DDropLeft.setSelectedIndex(0);
		DDropLeft.setEnabled(false);
		DDropRight.setSelectedIndex(0);
		DDropRight.setEnabled(false);
		DDropOp.setSelectedIndex(0);
		DDropOp.setEnabled(false);
		clearE();
		disableE();
	}
	
	public void enableC(){
		CTextArea.setEnabled(true);
		CDropLeft.setEnabled(true);
		CDropRight.setEnabled(true);
		CDropOp.setEnabled(true);
	}

	public void disableC(){
		CTextArea.setEnabled(false);
		CDropLeft.setEnabled(false);
		CDropRight.setEnabled(false);
		CDropOp.setEnabled(false);
	}
	
	public void clearC(){
		CTextArea.setText("");
		CTextArea.setEnabled(false);
		CDropLeft.setSelectedIndex(0);
		CDropLeft.setEnabled(false);
		CDropRight.setSelectedIndex(0);
		CDropRight.setEnabled(false);
		CDropOp.setSelectedIndex(0);
		CDropOp.setEnabled(false);
		clearD();
		disableD();
	}
	
	public void enableB(){
		BTextArea.setEnabled(true);
		BDropLeft.setEnabled(true);
		BDropRight.setEnabled(true);
		BDropOp.setEnabled(true);
	}

	public void disableB(){
		BTextArea.setEnabled(false);
		BDropLeft.setEnabled(false);
		BDropRight.setEnabled(false);
		BDropOp.setEnabled(false);
	}
	
	public void clearB(){
		BTextArea.setText("");
		BTextArea.setEnabled(false);
		BDropLeft.setSelectedIndex(0);
		BDropLeft.setEnabled(false);
		BDropRight.setSelectedIndex(0);
		BDropRight.setEnabled(false);
		BDropOp.setSelectedIndex(0);
		BDropOp.setEnabled(false);
		//setting all other components to Enabled false until B Left, Op, Right contain something not a blank
		clearC();
		disableC();
	}
	
	public void instructions(){
		String stuff = "Welcome to the Group 12 Truth Table\n\nFirst: Select the number of variables you want to use in the first column\n"
				+ "Next: Select the variables, and the desired operation in the next column\n"
				+ "Move to the next column and repeat\n"
				+ "If you change any variables, all columns to the right will be reset\n"
				+ "If a variable is not being used and is slected, it will be ignored\n"
				+ "All fields will update dynamicly";
		JOptionPane.showMessageDialog(null, stuff, "Group 12 - Truth Table", JOptionPane.INFORMATION_MESSAGE);
	}
}