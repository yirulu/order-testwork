package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrderUI2 extends JFrame {

	private JPanel contentPane;
	private JTextField lcdprice;
	private JTextField ramprice;
	private JTextField mouseprice;
	private JTextField discountprice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUI2 frame = new OrderUI2();
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
	public OrderUI2() {
		setBounds(600, 200, 260, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u6298\u6263\u50F9\u683C");
		lblNewLabel.setBounds(10, 180, 59, 23);
		contentPane.add(lblNewLabel);

		JLabel lblLcd = new JLabel("Lcd");
		lblLcd.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblLcd.setBounds(10, 52, 59, 23);
		contentPane.add(lblLcd);

		JLabel lblRam = new JLabel("Ram");
		lblRam.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblRam.setBounds(10, 91, 48, 23);
		contentPane.add(lblRam);

		JLabel lblMouse = new JLabel("Mouse");
		lblMouse.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblMouse.setBounds(10, 136, 48, 23);
		contentPane.add(lblMouse);

		lcdprice = new JTextField();
		lcdprice.setForeground(SystemColor.activeCaptionBorder);
		lcdprice.setText("4999");
		lcdprice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (lcdprice.getText().equals(Integer.toString(Order.lcdprice))) {
					lcdprice.setText("");
					lcdprice.setForeground(SystemColor.black);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (lcdprice.getText().isEmpty()) {
					lcdprice.setText(Integer.toString(Order.lcdprice));
					lcdprice.setForeground(SystemColor.activeCaptionBorder);
				}
			}

		});
		lcdprice.setBounds(75, 53, 72, 21);
		contentPane.add(lcdprice);
		lcdprice.setColumns(10);

		ramprice = new JTextField();
		ramprice.setForeground(SystemColor.activeCaptionBorder);
		ramprice.setText("1280");
		ramprice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (ramprice.getText().equals(Integer.toString(Order.ramprice))) {
					ramprice.setText("");
					ramprice.setForeground(SystemColor.black);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (ramprice.getText().isEmpty()) {
					ramprice.setText(Integer.toString(Order.ramprice));
					ramprice.setForeground(SystemColor.activeCaptionBorder);
				}
			}

		});
		ramprice.setColumns(10);
		ramprice.setBounds(75, 92, 72, 21);
		contentPane.add(ramprice);

		mouseprice = new JTextField();
		mouseprice.setForeground(SystemColor.activeCaptionBorder);
		mouseprice.setText("799");
		mouseprice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (mouseprice.getText().equals(Integer.toString(Order.mouseprice))) {
					mouseprice.setText("");
					mouseprice.setForeground(SystemColor.black);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (mouseprice.getText().isEmpty()) {
					mouseprice.setText(Integer.toString(Order.mouseprice));
					mouseprice.setForeground(SystemColor.activeCaptionBorder);
				}
			}

		});
		mouseprice.setColumns(10);
		mouseprice.setBounds(75, 137, 72, 21);
		contentPane.add(mouseprice);

		discountprice = new JTextField();
		discountprice.setForeground(SystemColor.activeCaptionBorder);
		discountprice.setText("20000");
		discountprice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (discountprice.getText().equals(Integer.toString(Order.discountprice))) {
					discountprice.setText("");
					discountprice.setForeground(SystemColor.black);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (discountprice.getText().isEmpty()) {
					discountprice.setText(Integer.toString(Order.discountprice));
					discountprice.setForeground(SystemColor.activeCaptionBorder);
				}
			}

		});
		discountprice.setColumns(10);
		discountprice.setBounds(75, 181, 72, 21);
		contentPane.add(discountprice);

		JLabel lblNewLabel_1 = new JLabel("\u5546\u54C1\u8207\u6298\u6263\u50F9\u683C\u4FEE\u6539");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(50, 10, 149, 23);
		contentPane.add(lblNewLabel_1);

		JTextArea output2 = new JTextArea();
		output2.setEditable(false);
		output2.setBackground(SystemColor.menu);
		output2.setBounds(64, 263, 109, 25);
		contentPane.add(output2);

		JLabel lblNewLabel_2 = new JLabel("\u76EE\u524D\u50F9\u683C(\u5143)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(152, 29, 92, 21);
		contentPane.add(lblNewLabel_2);

		JTextArea LCDoutput = new JTextArea();
		LCDoutput.setEditable(false);
		LCDoutput.setText(Integer.toString(Order.getLcdprice()));
		LCDoutput.setBackground(SystemColor.menu);
		LCDoutput.setBounds(175, 50, 59, 25);
		contentPane.add(LCDoutput);

		JTextArea RAMoutput = new JTextArea();
		RAMoutput.setEditable(false);
		RAMoutput.setText(Integer.toString(Order.getRamprice()));
		RAMoutput.setBackground(SystemColor.menu);
		RAMoutput.setBounds(175, 89, 59, 25);
		contentPane.add(RAMoutput);

		JTextArea MOUSEoutput = new JTextArea();
		MOUSEoutput.setEditable(false);
		MOUSEoutput.setText(Integer.toString(Order.getMouseprice()));
		MOUSEoutput.setBackground(SystemColor.menu);
		MOUSEoutput.setBounds(175, 134, 59, 25);
		contentPane.add(MOUSEoutput);

		JTextArea DISCOUNToutput = new JTextArea();
		DISCOUNToutput.setEditable(false);
		DISCOUNToutput.setText(Integer.toString(Order.getDiscountPrice()));
		DISCOUNToutput.setBackground(SystemColor.menu);
		DISCOUNToutput.setBounds(175, 178, 59, 25);
		contentPane.add(DISCOUNToutput);

		JButton adjustData = new JButton("\u4FEE\u6539");
		adjustData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer LcdPrice = Integer.parseInt(lcdprice.getText());
				Integer RamPrice = Integer.parseInt(ramprice.getText());
				Integer MousePrice = Integer.parseInt(mouseprice.getText());
				Integer DiscountPrice = Integer.parseInt(discountprice.getText());
				Order.setLcdprice(LcdPrice);
				Order.setRamprice(RamPrice);
				Order.setMouseprice(MousePrice);
				Order.setDiscountPrice(DiscountPrice);

				output2.setText("價格已變更!");
				LCDoutput.setText(lcdprice.getText());
				RAMoutput.setText(ramprice.getText());
				MOUSEoutput.setText(mouseprice.getText());
				DISCOUNToutput.setText(discountprice.getText());
				
			}
		});
		adjustData.setBounds(75, 230, 87, 23);
		contentPane.add(adjustData);
	}

}
