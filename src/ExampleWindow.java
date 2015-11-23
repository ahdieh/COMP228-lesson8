import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ExampleWindow extends JFrame {

	// PRIVATE INSTANCES VARIABLES ++++++++++++++++++++++++++++
	private JPanel _contentPane;
	private JLabel _label;
	private JLabel _nameLabel;
	private JTextField _textField;
	
	//PROPERTIES +++++++++++++++++++++++++++++++++++++++++++++++
    public JLabel getLabel() {
		return this._label;
	}
	public void setLabel(JLabel label) {
		this._label = label;
	}
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++
	public ExampleWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this._initialize();
		this._addUIComponent();
	}
	
	// PRIVATE METHODS +++++++++++++++++++++++++++++++++++++++++++
	private void _initialize() {
		setBounds(100, 100, 450, 300);
		this._contentPane = new JPanel();
		this._contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this._contentPane);
		
	
	}
	private void _addUIComponent() {
		
	    // USE ABSOLUTE LAYOUT 
		this._contentPane.setLayout(null);
		
		// label 
		this._label = new JLabel("New label");
		this._label.setBounds(5, 5, 96, 20);
		this._contentPane.add(this._label);
		
		// Name label
		this._nameLabel = new JLabel("Enter Name:");
		this._nameLabel.setBounds(5, 25, 96, 20);
		this._contentPane.add(this._nameLabel);
		
		// Name text field
		this._textField = new JTextField();
		this._textField.setBounds(122, 22, 173, 20);
		this._contentPane.add(this._textField);
	}
}
