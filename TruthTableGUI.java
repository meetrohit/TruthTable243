import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import javax.swing.JList;
import javax.swing.JTextPane;
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Truth Table");
		frame.setBounds(100, 100, 920, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 894, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmGroup = new JMenuItem("Group 12");
		mnAbout.add(mntmGroup);
		
		JPanel corePanel = new JPanel();
		corePanel.setBounds(10, 32, 100, 318);
		frame.getContentPane().add(corePanel);
		corePanel.setLayout(null);
		
		Label pLabel = new Label("p");
		pLabel.setAlignment(Label.CENTER);
		pLabel.setBounds(0, 25, 20, 22);
		corePanel.add(pLabel);
		
		Label qLabel = new Label("q");
		qLabel.setAlignment(Label.CENTER);
		qLabel.setBounds(25, 25, 20, 22);
		corePanel.add(qLabel);
		
		Label rLabel = new Label("r");
		rLabel.setAlignment(Label.CENTER);
		rLabel.setBounds(50, 25, 20, 22);
		corePanel.add(rLabel);
		
		Label tLabel = new Label("t");
		tLabel.setAlignment(Label.CENTER);
		tLabel.setBounds(75, 25, 20, 22);
		corePanel.add(tLabel);
		
		JTextPane pTextPane = new JTextPane();
		pTextPane.setEditable(false);
		pTextPane.setBounds(0, 45, 20, 273);
		corePanel.add(pTextPane);
		
		JTextPane qTextPane = new JTextPane();
		qTextPane.setEditable(false);
		qTextPane.setBounds(25, 45, 20, 273);
		corePanel.add(qTextPane);
		
		JTextPane rTextpane = new JTextPane();
		rTextpane.setEditable(false);
		rTextpane.setBounds(50, 45, 20, 273);
		corePanel.add(rTextpane);
		
		JTextPane tTextPane = new JTextPane();
		tTextPane.setEditable(false);
		tTextPane.setBounds(75, 45, 20, 273);
		corePanel.add(tTextPane);
		
		JComboBox MainDrop = new JComboBox(NUMLIST);
		MainDrop.setBounds(34, 0, 32, 20);
		corePanel.add(MainDrop);
		
		JPanel Apanel = new JPanel();
		Apanel.setBounds(124, 32, 120, 319);
		frame.getContentPane().add(Apanel);
		Apanel.setLayout(null);
		
		Label Alabel = new Label("A");
		Alabel.setAlignment(Label.CENTER);
		Alabel.setBounds(10, 0, 100, 22);
		Apanel.add(Alabel);
		
		JTextPane ATextPane = new JTextPane();
		ATextPane.setEditable(false);
		ATextPane.setBounds(10, 46, 100, 273);
		Apanel.add(ATextPane);
		
		JComboBox ADropLeft = new JComboBox(ALIST);
		ADropLeft.setBounds(0, 25, 35, 20);
		Apanel.add(ADropLeft);
		
		JComboBox ADropRight = new JComboBox(ALIST);
		ADropRight.setBounds(85, 25, 35, 20);
		Apanel.add(ADropRight);
		
		
		JComboBox ADropOp = new JComboBox(OPLIST);
		ADropOp.setBounds(36, 25, 48, 20);
		Apanel.add(ADropOp);
		
		JPanel Bpanel = new JPanel();
		Bpanel.setBounds(254, 32, 120, 319);
		frame.getContentPane().add(Bpanel);
		Bpanel.setLayout(null);
		
		Label Blabel = new Label("B");
		Blabel.setAlignment(Label.CENTER);
		Blabel.setBounds(10, 0, 100, 22);
		Bpanel.add(Blabel);
		
		JTextPane BTextPane = new JTextPane();
		BTextPane.setEditable(false);
		BTextPane.setBounds(10, 46, 100, 273);
		Bpanel.add(BTextPane);
		
		JComboBox BDropLeft = new JComboBox(BLIST);
		BDropLeft.setBounds(0, 25, 35, 20);
		Bpanel.add(BDropLeft);
		
		JComboBox BDropOp = new JComboBox(OPLIST);
		BDropOp.setBounds(36, 25, 48, 20);
		Bpanel.add(BDropOp);
		
		JComboBox BDropRight = new JComboBox(BLIST);
		BDropRight.setBounds(85, 25, 35, 20);
		Bpanel.add(BDropRight);
		
		JPanel Cpanel = new JPanel();
		Cpanel.setBounds(384, 32, 120, 319);
		frame.getContentPane().add(Cpanel);
		Cpanel.setLayout(null);
		
		Label Clabel = new Label("C");
		Clabel.setAlignment(Label.CENTER);
		Clabel.setBounds(10, 0, 100, 22);
		Cpanel.add(Clabel);
		
		JTextPane CTextPane = new JTextPane();
		CTextPane.setEditable(false);
		CTextPane.setBounds(10, 46, 100, 273);
		Cpanel.add(CTextPane);
		
		JComboBox CDropLeft = new JComboBox(CLIST);
		CDropLeft.setBounds(0, 25, 35, 20);
		Cpanel.add(CDropLeft);
		
		JComboBox CDropOp = new JComboBox(OPLIST);
		CDropOp.setBounds(36, 25, 48, 20);
		Cpanel.add(CDropOp);
		
		JComboBox CDropRight = new JComboBox(CLIST);
		CDropRight.setBounds(85, 25, 35, 20);
		Cpanel.add(CDropRight);
		
		JPanel Dpanel = new JPanel();
		Dpanel.setBounds(514, 32, 120, 319);
		frame.getContentPane().add(Dpanel);
		Dpanel.setLayout(null);
		
		Label Dlabel = new Label("D");
		Dlabel.setAlignment(Label.CENTER);
		Dlabel.setBounds(10, 0, 100, 22);
		Dpanel.add(Dlabel);
		
		JTextPane DTextPane = new JTextPane();
		DTextPane.setEditable(false);
		DTextPane.setBounds(10, 46, 100, 273);
		Dpanel.add(DTextPane);
		
		JComboBox DDropLeft = new JComboBox(DLIST);
		DDropLeft.setBounds(0, 25, 35, 20);
		Dpanel.add(DDropLeft);
		
		JComboBox DDropOp = new JComboBox(OPLIST);
		DDropOp.setBounds(36, 25, 48, 20);
		Dpanel.add(DDropOp);
		
		JComboBox DDropRight = new JComboBox(DLIST);
		DDropRight.setBounds(85, 25, 35, 20);
		Dpanel.add(DDropRight);
		
		JPanel Epanel = new JPanel();
		Epanel.setBounds(644, 32, 120, 319);
		frame.getContentPane().add(Epanel);
		Epanel.setLayout(null);
		
		Label Elabel = new Label("E");
		Elabel.setAlignment(Label.CENTER);
		Elabel.setBounds(10, 0, 100, 22);
		Epanel.add(Elabel);
		
		JTextPane ETestPane = new JTextPane();
		ETestPane.setEditable(false);
		ETestPane.setBounds(10, 46, 100, 273);
		Epanel.add(ETestPane);
		
		JComboBox EDropLeft = new JComboBox(ELIST);
		EDropLeft.setBounds(0, 25, 35, 20);
		Epanel.add(EDropLeft);
		
		JComboBox EDropOp = new JComboBox(OPLIST);
		EDropOp.setBounds(36, 25, 48, 20);
		Epanel.add(EDropOp);
		
		JComboBox EDropRight = new JComboBox(ELIST);
		EDropRight.setBounds(85, 25, 35, 20);
		Epanel.add(EDropRight);
		
		JPanel Fpanel = new JPanel();
		Fpanel.setLayout(null);
		Fpanel.setBounds(774, 32, 120, 319);
		frame.getContentPane().add(Fpanel);
		
		Label fLabel = new Label("F");
		fLabel.setAlignment(Label.CENTER);
		fLabel.setBounds(10, 0, 100, 22);
		Fpanel.add(fLabel);
		
		JTextPane FTextArea = new JTextPane();
		FTextArea.setEditable(false);
		FTextArea.setBounds(10, 46, 100, 273);
		Fpanel.add(FTextArea);
		
		JComboBox FDropLeft = new JComboBox(FLIST);
		FDropLeft.setBounds(0, 25, 35, 20);
		Fpanel.add(FDropLeft);
		
		JComboBox FDropOp = new JComboBox(OPLIST);
		FDropOp.setBounds(36, 25, 48, 20);
		Fpanel.add(FDropOp);
		
		JComboBox FDropRight = new JComboBox(FLIST);
		FDropRight.setBounds(85, 25, 35, 20);
		Fpanel.add(FDropRight);
	}
}
