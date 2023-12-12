package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusAdapter;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class OrderUI extends JFrame {

	private JPanel contentPane;
	private JTextField lcdCount;
	private JTextField ramCount;
	private JTextField mouseCount;
	private JTextField name;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUI frame = new OrderUI();
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
	public OrderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(10, 10, 364, 38);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton backgroundControl = new JButton("\u5F8C\u81FA\u63A7\u5236");
		boolean isOrderUI2Visible = false;
		backgroundControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!isOrderUI2Visible) {
		            // If not visible, create and show OrderUI2
		            new OrderUI2().setVisible(true);
		        } else {
		            // If visible, close OrderUI2
		            // Assuming OrderUI2 extends JFrame, you may need to call setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		            // to ensure proper resource cleanup
		            new OrderUI2().dispose();
		        }

		        // Toggle the visibility flag
		        
		    }
				
			}
		);

		backgroundControl.setBounds(277, 9, 87, 23);
		panel.add(backgroundControl);

		JLabel lblNewLabel = new JLabel("\u8A02\u55AE\u7CFB\u7D71");
		lblNewLabel.setBounds(0, 0, 364, 38);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 58, 364, 204);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Lcd");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 62, 107, 28);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Ram");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 91, 107, 28);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Mouse");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(10, 121, 107, 28);
		panel_1.add(lblNewLabel_1_2);

		lcdCount = new JTextField();
		lcdCount.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (lcdCount.getText().equals("0")) {
					lcdCount.setText("");
					lcdCount.setForeground(SystemColor.black);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (lcdCount.getText().isEmpty()) {
					lcdCount.setText("0");
					lcdCount.setForeground(SystemColor.activeCaptionBorder);
				}
			}

		});
		lcdCount.setForeground(SystemColor.activeCaptionBorder);
		lcdCount.setText("0");
		lcdCount.setToolTipText("");
		lcdCount.setBounds(192, 66, 96, 21);
		panel_1.add(lcdCount);
		lcdCount.setColumns(10);

		ramCount = new JTextField();
		ramCount.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (ramCount.getText().equals("0")) {
					ramCount.setText("");
					ramCount.setForeground(SystemColor.black);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (ramCount.getText().isEmpty()) {
					ramCount.setText("0");
					ramCount.setForeground(SystemColor.activeCaptionBorder);
				}
			}

		});
		ramCount.setForeground(SystemColor.activeCaptionBorder);
		ramCount.setText("0");
		ramCount.setColumns(10);
		ramCount.setBounds(192, 95, 96, 21);
		panel_1.add(ramCount);

		mouseCount = new JTextField();
		mouseCount.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (mouseCount.getText().equals("0")) {
					mouseCount.setText("");
					mouseCount.setForeground(SystemColor.black);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (mouseCount.getText().isEmpty()) {
					mouseCount.setText("0");
					mouseCount.setForeground(SystemColor.activeCaptionBorder);
				}
			}

		});
		mouseCount.setForeground(SystemColor.activeCaptionBorder);
		mouseCount.setText("0");
		mouseCount.setColumns(10);
		mouseCount.setBounds(192, 125, 96, 21);
		panel_1.add(mouseCount);

		JLabel lblNewLabel_2 = new JLabel("\u625395\u6298!");
		lblNewLabel_2.setBounds(206, 166, 82, 15);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("\u6703\u54E1\u625395\u6298!");
		lblNewLabel_2_1.setBounds(133, 179, 155, 25);
		panel_1.add(lblNewLabel_2_1);

		JLabel lblNewLabel_1_3 = new JLabel("\u59D3\u540D");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_3.setBackground(Color.WHITE);
		lblNewLabel_1_3.setBounds(10, 28, 107, 28);
		panel_1.add(lblNewLabel_1_3);

		name = new JTextField();
		name.setBounds(192, 32, 96, 21);
		panel_1.add(name);
		name.setColumns(10);

		JLabel lblNewLabel_2_2 = new JLabel("\u6EFF");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setBounds(50, 166, 82, 15);
		panel_1.add(lblNewLabel_2_2);

		JTextArea discountshow = new JTextArea();
		discountshow.setFont(new Font("Monospaced", Font.BOLD, 15));
		discountshow.setEditable(false);
		discountshow.setText(Integer.toString(Order.discountprice));
		discountshow.setBackground(SystemColor.menu);
		discountshow.setBounds(150, 160, 46, 25);
		panel_1.add(discountshow);

		JButton discountRenew = new JButton("\u66F4\u65B0\u6298\u6263");
		discountRenew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				discountshow.setText(Integer.toString(Order.getDiscountPrice()));
			}
		});
		discountRenew.setBounds(254, 164, 100, 15);
		panel_1.add(discountRenew);

		JButton resetData = new JButton("\u91CD\u65B0\u8F38\u5165");
		resetData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText(null);
				lcdCount.setText("0");
				ramCount.setText("0");
				mouseCount.setText("0");
			}
		});
		resetData.setBounds(277, 0, 87, 23);
		panel_1.add(resetData);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 256, 364, 195);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JTextArea output = new JTextArea();
		output.setBounds(34, 51, 293, 134);
		panel_2.add(output);

		JRadioButton member = new JRadioButton("\u6703\u54E1");
		member.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

			}
		});
		member.setHorizontalAlignment(SwingConstants.CENTER);
		member.setBounds(193, 16, 107, 23);
		panel_2.add(member);

		JButton btnNewButton = new JButton("\u9001\u51FA\u8A02\u55AE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name = name.getText();
				Integer Lcd = Integer.parseInt(lcdCount.getText());
				Integer Ram = Integer.parseInt(ramCount.getText());
				Integer Mouse = Integer.parseInt(mouseCount.getText());
				Boolean Ismember = member.isSelected();
				Order o = new Order(Name, Lcd, Ram, Mouse, Ismember);
				output.setText(o.checkData(Lcd, Ram, Mouse));
			}
		});
		btnNewButton.setBounds(81, 16, 87, 23);
		panel_2.add(btnNewButton);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
