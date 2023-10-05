package bot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class binario {

	private JFrame frame;
	private JToggleButton btnk;
	private JToggleButton btnj;
	private JToggleButton btni;
	private JToggleButton btnh;
	private JToggleButton btng;
	private JToggleButton btnf;
	private JToggleButton btne;
	private JToggleButton btnd;
	private JToggleButton btnc;
	private JToggleButton btnb;
	private JToggleButton btna;
	private JLabel lblbinario;
	int decimal = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					binario window = new binario();
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
	public binario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 754, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblbinario = new JLabel("0");
		lblbinario.setHorizontalAlignment(SwingConstants.CENTER);
		lblbinario.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblbinario.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblbinario.setBounds(110, 186, 511, 75);
		frame.getContentPane().add(lblbinario);

		btnj = new JToggleButton("0");
		btnj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnj.isSelected()) {
					btnj.setText("1");
					decimal += 512;
					lblbinario.setText(" " + decimal);
				} else {
					btnj.setText("0");
					decimal -= 512;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btnj.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnj.setBounds(83, 32, 66, 75);
		frame.getContentPane().add(btnj);

		btni = new JToggleButton("0");
		btni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btni.isSelected()) {
					btni.setText("1");
					decimal += 256;
					lblbinario.setText(" " + decimal);
				} else {
					btni.setText("0");
					decimal -= 256;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btni.setBorder(new LineBorder(new Color(0, 0, 0)));
		btni.setBounds(147, 32, 66, 75);
		frame.getContentPane().add(btni);

		btnh = new JToggleButton("0");
		btnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnh.isSelected()) {
					btnh.setText("1");
					decimal += 128;
					lblbinario.setText(" " + decimal);
				} else {
					btnh.setText("0");
					decimal -= 128;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btnh.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnh.setBounds(211, 32, 66, 75);
		frame.getContentPane().add(btnh);

		btng = new JToggleButton("0");
		btng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btng.isSelected()) {
					btng.setText("1");
					decimal += 64;
					lblbinario.setText(" " + decimal);
				} else {
					btng.setText("0");
					decimal -= 64;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btng.setBorder(new LineBorder(new Color(0, 0, 0)));
		btng.setBounds(278, 32, 66, 75);
		frame.getContentPane().add(btng);

		btnf = new JToggleButton("0");
		btnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnf.isSelected()) {
					btnf.setText("1");
					decimal += 32;
					lblbinario.setText(" " + decimal);
				} else {
					btnf.setText("0");
					decimal -= 32;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btnf.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnf.setBounds(343, 32, 66, 75);
		frame.getContentPane().add(btnf);

		btne = new JToggleButton("0");
		btne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btne.isSelected()) {
					btne.setText("1");
					decimal += 16;
					lblbinario.setText(" " + decimal);
				} else {
					btne.setText("0");
					decimal -= 16;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btne.setBorder(new LineBorder(new Color(0, 0, 0)));
		btne.setBounds(407, 32, 66, 75);
		frame.getContentPane().add(btne);

		btnd = new JToggleButton("0");
		btnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnd.isSelected()) {
					btnd.setText("1");
					decimal += 8;
					lblbinario.setText(" " + decimal);
				} else {
					btnd.setText("0");
					decimal -= 8;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btnd.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnd.setBounds(472, 32, 66, 75);
		frame.getContentPane().add(btnd);

		btnc = new JToggleButton("0");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnc.isSelected()) {
					btnc.setText("1");
					decimal += 4;
					lblbinario.setText(" " + decimal);
				} else {
					btnc.setText("0");
					decimal -= 4;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btnc.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnc.setBounds(538, 32, 66, 75);
		frame.getContentPane().add(btnc);

		btnb = new JToggleButton("0");
		btnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnb.isSelected()) {
					btnb.setText("1");
					decimal += 2;
					lblbinario.setText(" " + decimal);
				} else {
					btnb.setText("0");
					decimal -= 2;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btnb.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnb.setBounds(599, 32, 66, 75);
		frame.getContentPane().add(btnb);

		btna = new JToggleButton("0");
		btna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btna.isSelected()) {
					btna.setText("1");
					decimal += 1;
					lblbinario.setText(" " + decimal);
				} else {
					btna.setText("0");
					decimal -= 1;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btna.setBorder(new LineBorder(new Color(0, 0, 0)));
		btna.setBounds(665, 32, 66, 75);
		frame.getContentPane().add(btna);

		JLabel lblNewLabel_1 = new JLabel("BINARIO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(266, 144, 178, 31);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("512");
		lblNewLabel_2.setBounds(103, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("256");
		lblNewLabel_2_1.setBounds(175, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("128");
		lblNewLabel_2_2.setBounds(231, 7, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel(" 64");
		lblNewLabel_2_3.setBounds(298, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_4 = new JLabel("32");
		lblNewLabel_2_4.setBounds(363, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_5 = new JLabel("16");
		lblNewLabel_2_5.setBounds(428, 7, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_5);

		JLabel lblNewLabel_2_6 = new JLabel("8");
		lblNewLabel_2_6.setBounds(492, 7, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_6);

		JLabel lblNewLabel_2_7 = new JLabel("4");
		lblNewLabel_2_7.setBounds(558, 7, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_7);

		JLabel lblNewLabel_2_8 = new JLabel("2");
		lblNewLabel_2_8.setBounds(629, 7, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_8);

		JLabel lblNewLabel_2_9 = new JLabel("1");
		lblNewLabel_2_9.setBounds(685, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_9);

		btnk = new JToggleButton("0");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnk.isSelected()) {
					btnk.setText("1");
					decimal += 1024;
					lblbinario.setText(" " + decimal);
				} else {
					btnk.setText("0");
					decimal -= 1024;
					lblbinario.setText(" " + decimal);
				}
			}
		});
		btnk.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnk.setBounds(10, 31, 73, 76);
		frame.getContentPane().add(btnk);

		JLabel lblNewLabel_3 = new JLabel("1024");
		lblNewLabel_3.setBounds(26, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
