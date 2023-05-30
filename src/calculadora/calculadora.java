package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private String cadenaNumeros ="";
	private String operacion = "nula";
	private double resultado,primerNumero;
	private boolean activado = true;
	private boolean punto = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		this.setTitle("Calculadora");
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel etiqueta = new JLabel("0");
		etiqueta.setHorizontalAlignment(SwingConstants.RIGHT);
		etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 35));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
						.addComponent(etiqueta, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(etiqueta, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(new GridLayout(5, 4, 0, 0));
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("");
				operacion = "nula";
				cadenaNumeros ="";
				activado = true;
				punto = true;
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "9";
				}else {
					cadenaNumeros +="9";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_10 = new JButton("8");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "8";
				}else {
					cadenaNumeros +="8";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado == true) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					etiqueta.setText(cadenaNumeros);
					cadenaNumeros = "";
					operacion = "dividir";
					activado = false;
					
				}
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "7";
				}else {
					cadenaNumeros +="7";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_12 = new JButton("6");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "6";
				}else {
					cadenaNumeros +="6";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
			
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "5";
				}else {
					cadenaNumeros +="5";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("X");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado == true) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					etiqueta.setText(cadenaNumeros);
					cadenaNumeros = "";
					operacion = "multiplicar";
					activado = false;
					
				}
			}
		});
		panel.add(btnNewButton_8);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "4";
				}else {
					cadenaNumeros +="4";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "3";
				}else {
					cadenaNumeros +="3";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_16 = new JButton("2");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "2";
				}else {
					cadenaNumeros +="2";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado == true) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					etiqueta.setText(cadenaNumeros);
					cadenaNumeros = "";
					operacion = "resta";
					activado = false;
					
				}
			}
		});
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_17 = new JButton("0");
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "0";
				}else {
					cadenaNumeros +="0";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				
			}
		});
		
		JButton btnNewButton_11 = new JButton("1");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(etiqueta.getText().equals("0")) {
					cadenaNumeros = "1";
				}else {
					cadenaNumeros +="1";
				}
				etiqueta.setText(cadenaNumeros);
				activado = true;
				punto = true;
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_11);
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton(".");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(punto == true) {
					if(cadenaNumeros.equals(" ")) {
						cadenaNumeros = "0.";
					}else {
						cadenaNumeros +=".";
					}
					etiqueta.setText(cadenaNumeros);
					punto = false;
				}
				
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_14 = new JButton("+");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado == true) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					etiqueta.setText(cadenaNumeros);
					cadenaNumeros = "";
					operacion = "sumar";
					activado = false;
					punto = true;
				}
			}
		});
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_19 = new JButton("=");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double segundoNumero;
				if(operacion.equals("nula")) {
					etiqueta.setText(cadenaNumeros);
				}
				else if(operacion.equals("sumar")) {
					segundoNumero = Double.parseDouble(cadenaNumeros);
					resultado = primerNumero+ segundoNumero;
					etiqueta.setText(String.format("% .2f", resultado));
					cadenaNumeros = String.valueOf(resultado);
					operacion = "nula";
				}
				else if(operacion.equals("resta")) {
					segundoNumero = Double.parseDouble(cadenaNumeros);
					resultado = primerNumero - segundoNumero;
					etiqueta.setText(String.format("% .2f", resultado));
					cadenaNumeros = String.valueOf(resultado);
					operacion = "nula";
				}
				else if(operacion.equals("multiplicar")) {
					segundoNumero = Double.parseDouble(cadenaNumeros);
					resultado = primerNumero * segundoNumero;
					etiqueta.setText(String.format("% .2f", resultado));
					cadenaNumeros = String.valueOf(resultado);
					operacion = "nula";
				}
				else if(operacion.equals("dividir")) {
					segundoNumero = Double.parseDouble(cadenaNumeros);
					resultado = primerNumero / segundoNumero;
					etiqueta.setText(String.format("% .2f", resultado));
					cadenaNumeros = String.valueOf(resultado);
					operacion = "nula";
				}
				
				activado = true;
				punto = false;
			}
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_19);
		contentPane.setLayout(gl_contentPane);
	}
}
