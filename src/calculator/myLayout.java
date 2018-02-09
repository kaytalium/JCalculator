/**
 * 
 */
package calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author kaytalium
 *
 */
public class myLayout extends JFrame{
	private static JTextField textField;
	
	public myLayout(String title) {
		super(title);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		setBackground(Color.gray);
		setSize(240, 390);

		
		Dimension btnSize = new Dimension(60,60); 
		Font displayFont = new Font("TimesNewRoman", Font.PLAIN, 60);
		Font btnFont = new Font("SansSerif", Font.PLAIN, 20);
		Border tfBorder =  BorderFactory.createMatteBorder(0, 0, 1, 0,Color.gray);
		Border btnBorder = BorderFactory.createMatteBorder(0, 0, 0, 1,Color.gray);
		
		textField = new JTextField();
		textField.setFont(displayFont);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setBackground(Color.gray);
		textField.setOpaque(true);
		textField.setForeground(Color.white);
		textField.setBorder(tfBorder);
		textField.setText("0");
		
		add(textField);
		
		textField.setPreferredSize(new Dimension(240, 70));
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
			}
		});
		
		JButton btnNewButton = new JButton("C");
		add(btnNewButton);
		btnNewButton.setPreferredSize(btnSize);
		btnNewButton.setForeground(getForeground());
		btnNewButton.setBackground(Color.lightGray);
		btnNewButton.setOpaque(true);
		btnNewButton.setFont(btnFont);
		btnNewButton.setBorder(btnBorder);
		btnNewButton.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		
		JButton btnNewButton_1 = new JButton("(-)");
		add(btnNewButton_1);
		btnNewButton_1.setPreferredSize(btnSize);
		btnNewButton_1.setForeground(getForeground());
		btnNewButton_1.setBackground(Color.lightGray);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorder(btnBorder);
		btnNewButton_1.setFont(btnFont);
		btnNewButton_1.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.setForeground(getForeground());
		btnNewButton_2.setBackground(Color.lightGray);
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setPreferredSize(btnSize);
		btnNewButton_2.setBorder(btnBorder);
		btnNewButton_2.setFont(btnFont);
		add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_3 = new JButton("/");
		
		btnNewButton_3.setPreferredSize(btnSize);
		//btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0,Color.white));
		btnNewButton_3.setOpaque(true);
		btnNewButton_3.setFont(btnFont);
		add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.setForeground(getForeground());
		btnNewButton_4.setBackground(Color.lightGray);
		btnNewButton_4.setOpaque(true);
		btnNewButton_4.setPreferredSize(btnSize);
		btnNewButton_4.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_4.setFont(btnFont);
		add(btnNewButton_4);
		btnNewButton_4.setPreferredSize(btnSize);
		btnNewButton_4.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.setForeground(getForeground());
		btnNewButton_5.setBackground(Color.lightGray);
		btnNewButton_5.setOpaque(true);
		btnNewButton_5.setPreferredSize(btnSize);
		btnNewButton_5.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_5.setFont(btnFont);
		add(btnNewButton_5);
		btnNewButton_5.setPreferredSize(btnSize);
		btnNewButton_5.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.setForeground(getForeground());
		btnNewButton_6.setBackground(Color.lightGray);
		btnNewButton_6.setOpaque(true);
		btnNewButton_6.setPreferredSize(btnSize);
		btnNewButton_6.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_6.setFont(btnFont);
		add(btnNewButton_6);
		btnNewButton_6.setPreferredSize(btnSize);
		btnNewButton_6.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_7 = new JButton("X");
		btnNewButton_7.setForeground(getForeground());
		btnNewButton_7.setBackground(Color.ORANGE);
		btnNewButton_7.setOpaque(true);
		btnNewButton_7.setPreferredSize(btnSize);
		btnNewButton_7.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0,Color.gray));
		btnNewButton_7.setFont(btnFont);
		add(btnNewButton_7);
		btnNewButton_7.setPreferredSize(btnSize);
		btnNewButton_7.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.setForeground(getForeground());
		btnNewButton_8.setBackground(Color.lightGray);
		btnNewButton_8.setOpaque(true);
		btnNewButton_8.setPreferredSize(btnSize);
		btnNewButton_8.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_8.setFont(btnFont);
		add(btnNewButton_8);
		btnNewButton_8.setPreferredSize(btnSize);
		btnNewButton_8.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_9 = new JButton("5");
		btnNewButton_9.setForeground(getForeground());
		btnNewButton_9.setBackground(Color.lightGray);
		btnNewButton_9.setOpaque(true);
		btnNewButton_9.setPreferredSize(btnSize);
		btnNewButton_9.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_9.setFont(btnFont);
		add(btnNewButton_9);
		btnNewButton_9.setPreferredSize(btnSize);
		btnNewButton_9.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_10 = new JButton("6");
		btnNewButton_10.setForeground(getForeground());
		btnNewButton_10.setBackground(Color.lightGray);
		btnNewButton_10.setOpaque(true);
		btnNewButton_10.setPreferredSize(btnSize);
		btnNewButton_10.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_10.setFont(btnFont);
		add(btnNewButton_10);
		btnNewButton_10.setPreferredSize(btnSize);
		btnNewButton_10.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setForeground(getForeground());
		btnNewButton_11.setBackground(Color.ORANGE);
		btnNewButton_11.setOpaque(true);
		btnNewButton_11.setPreferredSize(btnSize);
		btnNewButton_11.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0,Color.gray));
		btnNewButton_11.setFont(btnFont);
		add(btnNewButton_11);
		btnNewButton_11.setPreferredSize(btnSize);
		btnNewButton_11.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.setForeground(getForeground());
		btnNewButton_12.setBackground(Color.lightGray);
		btnNewButton_12.setOpaque(true);
		btnNewButton_12.setPreferredSize(btnSize);
		btnNewButton_12.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_12.setFont(btnFont);
		add(btnNewButton_12);
		btnNewButton_12.setPreferredSize(btnSize);
		btnNewButton_12.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_13 = new JButton("2");
		btnNewButton_13.setForeground(getForeground());
		btnNewButton_13.setBackground(Color.lightGray);
		btnNewButton_13.setOpaque(true);
		btnNewButton_13.setPreferredSize(btnSize);
		btnNewButton_13.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_13.setFont(btnFont);
		add(btnNewButton_13);
		btnNewButton_13.setPreferredSize(btnSize);
		btnNewButton_13.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_14 = new JButton("3");
		btnNewButton_14.setForeground(getForeground());
		btnNewButton_14.setBackground(Color.lightGray);
		btnNewButton_14.setOpaque(true);
		btnNewButton_14.setPreferredSize(btnSize);
		btnNewButton_14.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_14.setFont(btnFont);
		add(btnNewButton_14);
		btnNewButton_14.setPreferredSize(btnSize);
		btnNewButton_14.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.setForeground(getForeground());
		btnNewButton_15.setBackground(Color.ORANGE);
		btnNewButton_15.setOpaque(true);
		btnNewButton_15.setPreferredSize(btnSize);
		btnNewButton_15.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0,Color.gray));
		btnNewButton_15.setFont(btnFont);
		add(btnNewButton_15);
		btnNewButton_15.setPreferredSize(btnSize);
		btnNewButton_15.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_16 = new JButton("0");
		btnNewButton_16.setForeground(getForeground());
		btnNewButton_16.setBackground(Color.lightGray);
		btnNewButton_16.setOpaque(true);
		btnNewButton_16.setPreferredSize(btnSize);
		btnNewButton_16.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_16.setFont(btnFont);
		add(btnNewButton_16);
		btnNewButton_16.setPreferredSize(new Dimension(120,60));
		btnNewButton_16.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		JButton btnNewButton_17 = new JButton(".");
		btnNewButton_17.setForeground(getForeground());
		btnNewButton_17.setBackground(Color.lightGray);
		btnNewButton_17.setOpaque(true);
		btnNewButton_17.setPreferredSize(btnSize);
		btnNewButton_17.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 1,Color.gray));
		btnNewButton_17.setFont(btnFont);
		add(btnNewButton_17);
		btnNewButton_17.setPreferredSize(btnSize);
		btnNewButton_17.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
		
		
		
		JButton btnNewButton_19 = new JButton("=");
		btnNewButton_19.setForeground(getForeground());
		btnNewButton_19.setBackground(Color.ORANGE);
		btnNewButton_19.setOpaque(true);
		btnNewButton_19.setPreferredSize(btnSize);
		btnNewButton_19.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0,Color.gray));
		btnNewButton_19.setFont(btnFont);
		add(btnNewButton_19);
		btnNewButton_19.setPreferredSize(btnSize);
		btnNewButton_19.addActionListener(new ActionListener () {
		      public void actionPerformed(ActionEvent e)
		      {
		        display(e.getActionCommand());
		      }
		    });
	
	}
	
	private void display(String str) {
		String val;
		String displayValue = null;
		
		try {
			if(textField.getText() !="") {
				displayValue = textField.getText();
			}
			
			if(textField.getText().length() > 5) {
				textField.setFont(new Font("TimesNewRoman", Font.PLAIN, 30));
			}else {
				textField.setFont(new Font("TimesNewRoman", Font.PLAIN, 60));
			}
			
			
			System.out.println(textField.getText().trim());
			if(str=="C") {
				val = "0";
				textField.setFont(new Font("TimesNewRoman", Font.PLAIN, 60));
			}else if(displayValue.equals("0")) {
				val = str;
			}else {
				val = displayValue + str;
			}

			textField.setText(val);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
}
