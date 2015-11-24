import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ExampleWindow extends JFrame implements ActionListener{

	// PRIVATE INSTANCES VARIABLES ++++++++++++++++++++++++++++
	private JPanel _contentPane;
	private JLabel _label;
	private JLabel _nameLabel;
	private JTextField _nameTextField;
	private JButton _enterBtn;
	private NameTextFieldHandler _nameTextFieldHandler;
	private JLabel _ageLabel;
	private JTextField _ageTextField;
	private Border _redBorder;
	
	//PROPERTIES +++++++++++++++++++++++++++++++++++++++++++++++
    public JLabel getLabel() {
		return this._label;
	}
	public void setLabel(JLabel label) {
		this._contentPane.remove(this._label);
		this._label = label;
		this._addLabel();
	}
	
	public JTextField getTextField() {
		return this._nameTextField;
	}
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++
	public ExampleWindow() {
		this._initialize();
		this._addUIComponent();

		// Register Event handler
		this._enterBtn.addActionListener(this);
		this._nameTextField.addActionListener(this);
		this._ageTextField.addActionListener(this);
	}
	
	// PRIVATE METHODS +++++++++++++++++++++++++++++++++++++++++++
	private void _initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		this._addLabel();

		
		// Name label
		this._nameLabel = new JLabel("Enter Name:");
		this._nameLabel.setBounds(5, 70, 96, 20);
		this._contentPane.add(this._nameLabel);
		
		// Name text field
		this._nameTextField = new JTextField();
		this._nameTextField.setBounds(121, 60, 173, 30);
		this._contentPane.add(this._nameTextField);
		
		// Enter button
		this._enterBtn = new JButton("Enter");
		this._enterBtn.setBounds(179, 184, 115, 29);
		this._contentPane.add(this._enterBtn);
		
		// Age label
		this._ageLabel = new JLabel("Enter age:");
		this._ageLabel.setBounds(5, 106, 96, 20);
		this._contentPane.add(this._ageLabel);
		
		// Age text field
		this._ageTextField = new JTextField();
		this._ageTextField.setBounds(122, 96, 173, 30);
		this._contentPane.add(this._ageTextField);
		

	}
	
	
	private void _addLabel() {
		this._label.setBounds(5, 5, 408, 30);
		this._contentPane.add(this._label);
	}

	
	// Register Event handler
	@Override
	public void actionPerformed(ActionEvent event) {
	if(event.getSource()==this._nameTextField){
		this._label.setText(this._nameTextField.getText());
		  this._nameTextField.setBorder(null);
	}
	if(event.getSource()==this._enterBtn){
		try {
			int age = Integer.parseInt(this._ageTextField.getText());
		    this._label.setText(this._nameTextField.getText()+ ": " + age+ " years old");
		    this._ageTextField.setBorder(null);
		    this._nameTextField.setBorder(null);
		
		}catch (Exception e) {
			this._label.setText("Hey, it was wrong");
			this._ageTextField.selectAll();
			this._ageTextField.setBorder(BorderFactory.createLineBorder(Color.red));
		}
	}
		if(event.getSource()==this._ageTextField){
		try {
			int age = Integer.parseInt(this._ageTextField.getText());
			this._label.setText(Integer.toString(age));
			this._ageTextField.setBorder(null);
			
		} catch (Exception e) {
			this._label.setText("Hey, it was wrong");
			this._ageTextField.selectAll();
			

			this._ageTextField.setBorder(BorderFactory.createLineBorder(Color.red));
		}
	}
	}
}
