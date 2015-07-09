import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,c1,c2,c3,c4,c5,c6,c7;
	JMenuBar bar;
	JMenu file,edit,help;
	JMenuItem open,save,cut,copy,paste;
	int num1=0,num2=0,res=0;
	char operator='+';
	
	public Calculator()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		t1=new JTextField(12);
		add(t1); 
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		c1=new JButton("%");
		c2=new JButton("+");
		c3=new JButton("-");
		c4=new JButton("*");
		c5=new JButton("/");
		c6=new JButton("C");
		c7=new JButton("=");
		add(b1); add(b2); add(b3); add(b4);
		add(b5); add(b6); add(b7); add(b8);
		add(b9); add(b0); add(c1); add(c2);
		add(c3); add(c4); add(c5); add(c6);
		add(c7);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		c5.addActionListener(this);
		c6.addActionListener(this);
		c7.addActionListener(this);
		
		bar= new JMenuBar();
		file=new JMenu("File");
		open=new JMenuItem("Open...");
		save=new JMenuItem("Save");
		file.add(open);
		file.add(save);
		edit=new JMenu("Edit");
		cut=new JMenuItem("Cut");
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		edit.add(cut); 
		edit.add(copy);
		edit.add(paste);
		help=new JMenu("Help");

		bar.add(file); bar.add(edit); bar.add(help);
		setJMenuBar(bar);

		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}

	public void actionPerformed(ActionEvent a)
	{ 
		String cmd=a.getActionCommand();
		String n1=t1.getText();
		if (a.getSource() == c6)
		{
			t1.setText("");		
		}
		else if (a.getSource() == b1) 
		{
			t1.setText(t1.getText()+ 1);
		}
		else if (a.getSource() == b2)
		{
			t1.setText(t1.getText()+ 2);
		}
		else if (a.getSource() == b3) 
		{
			t1.setText(t1.getText()+ 3);
		}
		else if (a.getSource() == b4) 
		{
			t1.setText(t1.getText()+ 4);
		}
		else if (a.getSource() == b5) 
		{
			t1.setText(t1.getText()+ 5);
		}
		else if (a.getSource() == b6) 
		{
			t1.setText(t1.getText()+ 6);
		}
		else if (a.getSource() == b7) 
		{
			t1.setText(t1.getText()+ 7);
		}
		else if (a.getSource() == b8) 
		{
			t1.setText(t1.getText()+ 8);
		}
		else if (a.getSource() == b9) 
		{
			t1.setText(t1.getText()+ 9);
		}
		else if (a.getSource() == b0) 
		{
			t1.setText(t1.getText()+ 0);
		}
		else if(a.getSource()== c1)
		{
			num1=Integer.parseInt(n1);
			operator='%';
			t1.setText("");
			
		}
		else if(a.getSource()== c2)
		{
			num1=Integer.parseInt(n1);
			operator='+';
			t1.setText("");
		}
		else if(a.getSource()== c3)
		{
			num1=Integer.parseInt(n1);
			operator='-';
			t1.setText("");
		}
		else if(a.getSource()== c4)
		{
			num1=Integer.parseInt(n1);
			operator='*';
			t1.setText("");
		}
		else if(a.getSource() == c5)
		{
			num1=Integer.parseInt(n1);
			operator='/';
			t1.setText("");
		}
		else if(a.getSource() == c7)
		{
			num2=Integer.parseInt(n1);
			switch(operator)
			{
				case '%' : res=num1%num2 ;
					   break;

				case '+' : res=num1+num2 ;
					   break;

				case '-' : res=num1-num2 ;
					   break;

				case '*' : res=num1*num2 ;
					   break;

				case '/' : res=num1/num2 ;
					   break;

				default :  res=0;
			}
			t1.setText(""+res);
			
		}		
	
	}

	public static void main(String args[])
	{
		Calculator calc = new Calculator();
	}
}
