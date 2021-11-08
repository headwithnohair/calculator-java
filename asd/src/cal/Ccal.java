package cal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Ccal extends JFrame {
	private JTextField textField;
	private String text="";//����text��Ϊ�ı�����������ȡ�ô�ȡ�ռ�
	 String wellP;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ccal frame = new Ccal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ccal() {
//		���¶��Ƕ԰�ť�Ĳ����Լ������¼�
//		ÿ��һ�Σ��ı��򶼻�����Ӱ�ť����ʾ�ַ�char
//		���� JFeild.setText()������ʾ�ı���.getText()��ȡ�ı���
//		���� Sting��concat()��������ÿһ�ΰ�ť�������û��������ӣ������ַ���text���գ�
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 234);
//		����Layout����
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 40, 40, 40, 0};
		gridBagLayout.rowHeights = new int[]{0, 40, 40, 40, 40, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);//���ַ�������
//		�����ı���
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("clear");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				text="";//����text��ֵ
				textField.setText(text);//�ϴ�ֵ���ı���
			}
		});
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_9.gridx = 3;
		gbc_btnNewButton_9.gridy = 0;
		getContentPane().add(btnNewButton_9, gbc_btnNewButton_9);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("1");//text �ַ�����ӡ�1��
				textField.setText(text);//�ϴ�ֵ���ı�����ͬ��
			}
		});
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("2");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 1;
		gbc_btnNewButton_6.gridy = 1;
		getContentPane().add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("3");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 2;
		gbc_btnNewButton_10.gridy = 1;
		getContentPane().add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("+");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 1;
		getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("4");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("5");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 1;
		gbc_btnNewButton_7.gridy = 2;
		getContentPane().add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_11 = new JButton("6");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("6");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_11.gridx = 2;
		gbc_btnNewButton_11.gridy = 2;
		getContentPane().add(btnNewButton_11, gbc_btnNewButton_11);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("-");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 2;
		getContentPane().add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("7");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 3;
		getContentPane().add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("8");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_8.gridx = 1;
		gbc_btnNewButton_8.gridy = 3;
		getContentPane().add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("9");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_12.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_12.gridx = 2;
		gbc_btnNewButton_12.gridy = 3;
		getContentPane().add(btnNewButton_12, gbc_btnNewButton_12);
		
		JButton btnNewButton_5 = new JButton("*");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("*");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 3;
		gbc_btnNewButton_5.gridy = 3;
		getContentPane().add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton button_3 = new JButton(".");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat(".");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 4;
		getContentPane().add(button_3, gbc_button_3);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("0");
				textField.setText(text);
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 4;
		getContentPane().add(button, gbc_button);
		
		JButton button_2 = new JButton("=");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wellP =textField.getText();
//				���ı������ݴ���wellp�ַ���
				judge();
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 4;
		getContentPane().add(button_2, gbc_button_2);
		
		JButton button_1 = new JButton("/");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text=text.concat("/");
				textField.setText(text);
			}
			
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 4;
		getContentPane().add(button_1, gbc_button_1);
		
		
		
	}
	
	public void judge(){
		double[] cc=new double[99];
		char [] fuHao = new char[20];
		
		if(wellP.startsWith(".")||wellP.startsWith("+")||wellP.startsWith("*")||wellP.endsWith("/"))
		{// error0:�����жϿ�ͷ�Ƿ�����������
			System.out.println("error0");
			textField.setText("error0");
			return;//����������ã�return�����������˴εȺŰ�ť�¼�
		}
		if(wellP.endsWith(".")||wellP.endsWith("+")||wellP.endsWith("-")||wellP.endsWith("*")||wellP.endsWith("/"))
		{// error1:�����жϽ�β�Ƿ�Ƿ�
			System.out.println("error1");
			textField.setText("error1");
			return;
		}
		for(int op=0;op<text.length()-1;op++)
		{// error2��ȷ��û���������������һ�𣬵����޷�����
			if(text.charAt(op)=='+'||text.charAt(op)=='*'||text.charAt(op)=='/'||text.charAt(op)=='-')
			{	if(text.charAt(op+1)=='+'||text.charAt(op+1)=='*'||text.charAt(op+1)=='/')
				{System.out.println("error2");
				textField.setText("error2");
				return;
				}
		
			}
			
		}
		//����ؼ�ִ����
//		
		String[] ttem =new String[99];
		ttem =text.split("[+-]");
//		��text�ַ�����+-�Ų��Ϊ�ַ������飨��ʱ* /�����ڣ�
		int i=0;
		int ii3=-1;
		
//		����forѭ��Ƕ��for����һ��for ���ڼ�¼text��+-������˳�򣬴��ڲ�for������ֵ�󣬽�������
//		 �� �ַ�����13+5*6�� �����ڲ��Ϊ��13 ��5*6��
		for(String temp: ttem)//�� tempֵ���ֱ�Ϊ13 ��5*6
		{	char[] fuFu =new char[10];
			int ic=0;
			int ii4=-1;
			ii3+=temp.length();
//	��Ϊ��13����Ϊ2��charAt()��0��ʼ�����ii3ֱ�ӵ���2����ֱ�ӵõ���+���������򲻾��п�ѭ���ԣ�����ii3���Լ�1		
			if(ii3+1<text.length())
					{
						fuHao[i]=text.charAt(++ii3);
// ��¼����
					}
// ��temp ����* /ʱ��indexOf,����-1�������Ƕ�*/������
			if(temp.indexOf("*")!=-1||temp.indexOf("/")!=-1)//"13"�ᱻɸѡ��
					{	double[] fc =new double[2];
						for( String finnally :temp.split("[*/]"))//"5*6"�ᱻ�ָ�Ϊ5��6
						{if(ic==0)
							{
								fc[0]=Double.valueOf(finnally);//��һ��ֵ׼��
							}
						else 
							{		if('*'==fuFu[ic-1])//ic=0ʱ������ic��Ϊ0ʱ���з����жϣ���ʼ����
									{
									fc[1]=Double.valueOf(finnally);//��ʵ�����п���ww
									fc[0]=fc[0]*fc[1]; //fc[0]��ֵΪ����֮��������ʱֻ��*/�����赣��+-��
									}
									else
									{
									fc[1]=Double.valueOf(finnally);
									fc[0]=fc[0]/fc[1];
									}
							}
			
								ii4+=finnally.length();//��icΪ0ʱ���Ѿ���¼�˵�һ������֮��ķ���
									if(ii4+1<temp.length())
									{
										fuFu[ic]=temp.charAt(++ii4);
									}
				
								ic++;
							}
							cc[i]=fc[0];//Ҫô���1. ��*/���������ݵ�+-������
					}
		else
							cc[i]=Double.valueOf(temp);// Ҫô���2. ֱ�ӵõ�ֵ
		
		
		
		if( i!=0)//i=0ʱ������i��Ϊ0ʱ���з����жϣ���ʼ����+-
		{if(fuHao[i-1]=='+')
			{
				cc[0]+=cc[i];
			}
		else
			{
				cc[0]-=cc[i];
			}
//			������ֵ�ۼƵ�cc[0]
		
		}
			
			i++;//ѭ������������i++��ָ����һ�ռ�洢
			
				
			
		}
		
		textField.setText(String.valueOf(cc[0]));//�ϴ�ֵ���ı���
		text=String.valueOf(cc[0]);//�ı��ڲ�ֵ�������û���һ������
//		ע���������㲻����
			
	}
}
//2021��10��6�� 23:02:15 
//��2002 ���˰�
//
