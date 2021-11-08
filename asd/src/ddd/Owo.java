package ddd;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class Owo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Owo frame = new Owo();
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
	public Owo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btn_north = new JButton("NORTH");
		contentPane.add(btn_north, BorderLayout.NORTH);
		
		JButton btn_west2 = new JButton("west");
		contentPane.add(btn_west2, BorderLayout.WEST);
		
		JButton btnNsb_1 = new JButton("sb");
		contentPane.add(btnNsb_1, BorderLayout.SOUTH);
		
		JButton btn_east = new JButton("wow");
		contentPane.add(btn_east, BorderLayout.EAST);
		
		JTabbedPane owew = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(owew, BorderLayout.CENTER);
		
		JTabbedPane tabBBBBB = new JTabbedPane(JTabbedPane.TOP);
		owew.addTab("A_1", null, tabBBBBB, null);
		GridLayout[][] aa =new  GridLayout[12][12];
		
		JTabbedPane tab_1 = new JTabbedPane(JTabbedPane.TOP);
		owew.addTab("B_1", null, tab_1, null);
	}

}
