import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Label;
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

					GUIManipulator GUIman = new GUIManipulator(window);
					//GUIman.initialize(this);
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

	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmClose;
	private JMenu mnAbout;
	private JMenuItem mntmGroup;
	private JPanel corePanel;
	private Label pLabel;
	private Label qLabel;
	private Label rLabel;
	private Label tLabel;
	private JTextArea pvarArea;
	private JTextArea qvarArea;
	private JTextArea rvarArea;
	private JTextArea tvarArea;
	private JComboBox numVarDrop;
	private JPanel Apanel;
	private Label Alabel;
	private JTextArea ATextArea;
	private JComboBox ADropLeft;
	private JComboBox ADropRight;
	private JComboBox ADropOp;
	private JPanel Bpanel;
	private Label Blabel;
	private JTextArea BTextArea;
	private JComboBox BDropLeft;
	private JComboBox BDropOp;
	private JComboBox BDropRight;
	private JPanel Cpanel;
	private Label Clabel;
	private JTextArea CTextArea;
	private JComboBox CDropLeft;
	private JComboBox CDropOp;
	private JComboBox CDropRight;
	private JPanel Dpanel;
	private Label Dlabel;
	private JTextArea DTextArea;
	private JComboBox DDropLeft;
	private JComboBox DDropOp;
	private JComboBox DDropRight;
	private JPanel Epanel;
	private Label Elabel;
	private JTextArea ETextArea;
	private JComboBox EDropLeft;
	private JComboBox EDropOp;
	private JComboBox EDropRight;
	private JPanel Fpanel;
	private Label fLabel;
	private JTextArea FTextArea;
	private JComboBox FDropLeft;
	private JComboBox FDropOp;
	private JComboBox FDropRight;

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMnFile() {
		return mnFile;
	}

	public void setMnFile(JMenu mnFile) {
		this.mnFile = mnFile;
	}

	public JMenuItem getMntmClose() {
		return mntmClose;
	}

	public void setMntmClose(JMenuItem mntmClose) {
		this.mntmClose = mntmClose;
	}

	public JMenu getMnAbout() {
		return mnAbout;
	}

	public void setMnAbout(JMenu mnAbout) {
		this.mnAbout = mnAbout;
	}

	public JMenuItem getMntmGroup() {
		return mntmGroup;
	}

	public void setMntmGroup(JMenuItem mntmGroup) {
		this.mntmGroup = mntmGroup;
	}

	public JPanel getCorePanel() {
		return corePanel;
	}

	public void setCorePanel(JPanel corePanel) {
		this.corePanel = corePanel;
	}

	public JTextArea getPvarArea() {
		return pvarArea;
	}

	public void setPvarArea(JTextArea pvarArea) {
		this.pvarArea = pvarArea;
	}

	public JTextArea getQvarArea() {
		return qvarArea;
	}

	public void setQvarArea(JTextArea qvarArea) {
		this.qvarArea = qvarArea;
	}

	public JTextArea getRvarArea() {
		return rvarArea;
	}

	public void setRvarArea(JTextArea rvarArea) {
		this.rvarArea = rvarArea;
	}

	public JTextArea getTvarArea() {
		return tvarArea;
	}

	public void setTvarArea(JTextArea tvarArea) {
		this.tvarArea = tvarArea;
	}

	public JComboBox getNumVarDrop() {
		return numVarDrop;
	}

	public JPanel getApanel() {
		return Apanel;
	}

	public void setApanel(JPanel apanel) {
		Apanel = apanel;
	}

	public JTextArea getATextArea() {
		return ATextArea;
	}

	public void setATextArea(JTextArea ATextArea) {
		this.ATextArea = ATextArea;
	}

	public JComboBox getADropLeft() {
		return ADropLeft;
	}

	public JComboBox getADropRight() {
		return ADropRight;
	}

	public JComboBox getADropOp() {
		return ADropOp;
	}

	public JPanel getBpanel() {
		return Bpanel;
	}

	public void setBpanel(JPanel bpanel) {
		Bpanel = bpanel;
	}

	public JTextArea getBTextArea() {
		return BTextArea;
	}

	public void setBTextArea(JTextArea BTextArea) {
		this.BTextArea = BTextArea;
	}

	public JComboBox getBDropLeft() {
		return BDropLeft;
	}

	public JComboBox getBDropOp() {
		return BDropOp;
	}

	public JComboBox getBDropRight() {
		return BDropRight;
	}

	public JPanel getCpanel() {
		return Cpanel;
	}

	public void setCpanel(JPanel cpanel) {
		Cpanel = cpanel;
	}

	public JTextArea getCTextArea() {
		return CTextArea;
	}

	public void setCTextArea(JTextArea CTextArea) {
		this.CTextArea = CTextArea;
	}

	public JComboBox getCDropLeft() {
		return CDropLeft;
	}

	public JComboBox getCDropOp() {
		return CDropOp;
	}

	public JComboBox getCDropRight() {
		return CDropRight;
	}

	public JPanel getDpanel() {
		return Dpanel;
	}

	public void setDpanel(JPanel dpanel) {
		Dpanel = dpanel;
	}

	public JTextArea getDTextArea() {
		return DTextArea;
	}

	public void setDTextArea(JTextArea DTextArea) {
		this.DTextArea = DTextArea;
	}

	public JComboBox getDDropLeft() {
		return DDropLeft;
	}

	public JComboBox getDDropOp() {
		return DDropOp;
	}

	public JComboBox getDDropRight() {
		return DDropRight;
	}

	public JPanel getEpanel() {
		return Epanel;
	}

	public void setEpanel(JPanel epanel) {
		Epanel = epanel;
	}

	public JTextArea getETextArea() {
		return ETextArea;
	}

	public void setETextArea(JTextArea ETextArea) {
		this.ETextArea = ETextArea;
	}

	public JComboBox getEDropLeft() {
		return EDropLeft;
	}

	public JComboBox getEDropOp() {
		return EDropOp;
	}

	public JComboBox getEDropRight() {
		return EDropRight;
	}

	public JPanel getFpanel() {
		return Fpanel;
	}

	public void setFpanel(JPanel fpanel) {
		Fpanel = fpanel;
	}

	public JTextArea getFTextArea() {
		return FTextArea;
	}

	public void setFTextArea(JTextArea FTextArea) {
		this.FTextArea = FTextArea;
	}

	public JComboBox getFDropLeft() {
		return FDropLeft;
	}

	public JComboBox getFDropOp() {
		return FDropOp;
	}

	public JComboBox getFDropRight() {
		return FDropRight;
	}

	private void initialize() {
		frame = new JFrame("Truth Table");
		frame.setBounds(100, 100, 920, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 894, 21);
		frame.getContentPane().add(menuBar);

		mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);

		mnAbout = new JMenu("About");
		menuBar.add(mnAbout);

		mntmGroup = new JMenuItem("Group 12");
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
		pvarArea.setBounds(0, 45, 20, 273);
		corePanel.add(pvarArea);
		
		qvarArea = new JTextArea();
		qvarArea.setEditable(false);
		qvarArea.setBounds(25, 45, 20, 273);
		corePanel.add(qvarArea);
		
		rvarArea = new JTextArea();
		rvarArea.setEditable(false);
		rvarArea.setBounds(50, 45, 20, 273);
		corePanel.add(rvarArea);
		
		tvarArea = new JTextArea();
		tvarArea.setEditable(false);
		tvarArea.setBounds(75, 45, 20, 273);
		corePanel.add(tvarArea);
		
		numVarDrop = new JComboBox(NUMLIST);
		numVarDrop.setBounds(34, 0, 32, 20);
		corePanel.add(numVarDrop);
		
		Apanel = new JPanel();
		Apanel.setBounds(124, 32, 120, 319);
		frame.getContentPane().add(Apanel);
		Apanel.setLayout(null);
		
		Alabel = new Label("A");
		Alabel.setAlignment(Label.CENTER);
		Alabel.setBounds(10, 0, 100, 22);
		Apanel.add(Alabel);
		
		ATextArea = new JTextArea();
		ATextArea.setEditable(false);
		ATextArea.setBounds(10, 46, 100, 273);
		Apanel.add(ATextArea);
		
		ADropLeft = new JComboBox(ALIST);
		ADropLeft.setBounds(0, 25, 35, 20);
		Apanel.add(ADropLeft);
		
		ADropRight = new JComboBox(ALIST);
		ADropRight.setBounds(85, 25, 35, 20);
		Apanel.add(ADropRight);
		
		
		ADropOp = new JComboBox(OPLIST);
		ADropOp.setBounds(36, 25, 48, 20);
		Apanel.add(ADropOp);
		
		Bpanel = new JPanel();
		Bpanel.setBounds(254, 32, 120, 319);
		frame.getContentPane().add(Bpanel);
		Bpanel.setLayout(null);
		
		Blabel = new Label("B");
		Blabel.setAlignment(Label.CENTER);
		Blabel.setBounds(10, 0, 100, 22);
		Bpanel.add(Blabel);
		
		BTextArea = new JTextArea();
		BTextArea.setEditable(false);
		BTextArea.setBounds(10, 46, 100, 273);
		Bpanel.add(BTextArea);
		
		BDropLeft = new JComboBox(BLIST);
		BDropLeft.setBounds(0, 25, 35, 20);
		Bpanel.add(BDropLeft);
		
		BDropOp = new JComboBox(OPLIST);
		BDropOp.setBounds(36, 25, 48, 20);
		Bpanel.add(BDropOp);
		
		BDropRight = new JComboBox(BLIST);
		BDropRight.setBounds(85, 25, 35, 20);
		Bpanel.add(BDropRight);
		
		Cpanel = new JPanel();
		Cpanel.setBounds(384, 32, 120, 319);
		frame.getContentPane().add(Cpanel);
		Cpanel.setLayout(null);
		
		Clabel = new Label("C");
		Clabel.setAlignment(Label.CENTER);
		Clabel.setBounds(10, 0, 100, 22);
		Cpanel.add(Clabel);
		
		CTextArea = new JTextArea();
		CTextArea.setEditable(false);
		CTextArea.setBounds(10, 46, 100, 273);
		Cpanel.add(CTextArea);
		
		CDropLeft = new JComboBox(CLIST);
		CDropLeft.setBounds(0, 25, 35, 20);
		Cpanel.add(CDropLeft);
		
		CDropOp = new JComboBox(OPLIST);
		CDropOp.setBounds(36, 25, 48, 20);
		Cpanel.add(CDropOp);
		
		CDropRight = new JComboBox(CLIST);
		CDropRight.setBounds(85, 25, 35, 20);
		Cpanel.add(CDropRight);
		
		Dpanel = new JPanel();
		Dpanel.setBounds(514, 32, 120, 319);
		frame.getContentPane().add(Dpanel);
		Dpanel.setLayout(null);
		
		Dlabel = new Label("D");
		Dlabel.setAlignment(Label.CENTER);
		Dlabel.setBounds(10, 0, 100, 22);
		Dpanel.add(Dlabel);
		
		DTextArea = new JTextArea();
		DTextArea.setEditable(false);
		DTextArea.setBounds(10, 46, 100, 273);
		Dpanel.add(DTextArea);
		
		DDropLeft = new JComboBox(DLIST);
		DDropLeft.setBounds(0, 25, 35, 20);
		Dpanel.add(DDropLeft);
		
		DDropOp = new JComboBox(OPLIST);
		DDropOp.setBounds(36, 25, 48, 20);
		Dpanel.add(DDropOp);
		
		DDropRight = new JComboBox(DLIST);
		DDropRight.setBounds(85, 25, 35, 20);
		Dpanel.add(DDropRight);
		
		Epanel = new JPanel();
		Epanel.setBounds(644, 32, 120, 319);
		frame.getContentPane().add(Epanel);
		Epanel.setLayout(null);
		
		Elabel = new Label("E");
		Elabel.setAlignment(Label.CENTER);
		Elabel.setBounds(10, 0, 100, 22);
		Epanel.add(Elabel);
		
		ETextArea = new JTextArea();
		ETextArea.setEditable(false);
		ETextArea.setBounds(10, 46, 100, 273);
		Epanel.add(ETextArea);
		
		EDropLeft = new JComboBox(ELIST);
		EDropLeft.setBounds(0, 25, 35, 20);
		Epanel.add(EDropLeft);
		
		EDropOp = new JComboBox(OPLIST);
		EDropOp.setBounds(36, 25, 48, 20);
		Epanel.add(EDropOp);
		
		EDropRight = new JComboBox(ELIST);
		EDropRight.setBounds(85, 25, 35, 20);
		Epanel.add(EDropRight);
		
		Fpanel = new JPanel();
		Fpanel.setLayout(null);
		Fpanel.setBounds(774, 32, 120, 319);
		frame.getContentPane().add(Fpanel);
		
		fLabel = new Label("F");
		fLabel.setAlignment(Label.CENTER);
		fLabel.setBounds(10, 0, 100, 22);
		Fpanel.add(fLabel);
		
		FTextArea = new JTextArea();
		FTextArea.setEditable(false);
		FTextArea.setBounds(10, 46, 100, 273);
		Fpanel.add(FTextArea);
		
		FDropLeft = new JComboBox(FLIST);
		FDropLeft.setBounds(0, 25, 35, 20);
		Fpanel.add(FDropLeft);
		
		FDropOp = new JComboBox(OPLIST);
		FDropOp.setBounds(36, 25, 48, 20);
		Fpanel.add(FDropOp);
		
		FDropRight = new JComboBox(FLIST);
		FDropRight.setBounds(85, 25, 35, 20);
		Fpanel.add(FDropRight);
	}
}
