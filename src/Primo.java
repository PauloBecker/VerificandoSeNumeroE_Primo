import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Primo implements ActionListener {
	
	JLabel label;
	JLabel resposta;
	JTextField textField;
	JButton button;
	
	public Primo() {
		
		JFrame frame = new JFrame("Numero e primo?");
		frame.setVisible(true);
		frame.setSize(150, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Digite um numero: ");
		frame.add(label);
		
		textField = new JTextField(10);
		textField.addActionListener(this);
		textField.setActionCommand("Enter");
		frame.add(textField);
		
		button = new JButton("Executar");
		button.addActionListener(this);
		frame.add(button);
		
		resposta = new JLabel("");
		frame.add(resposta);
		
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				new Primo();
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(textField.getText().equals("")) {
			resposta.setText("Erro");
		}else {
			
			int num = Integer.parseInt(textField.getText());
			int div = 0;
			for (int i = 1; i<=num; i++) {
				if (num % i == 0) {
					div ++;
				}
				if(div > 2) {
					resposta.setText("Não é primo");
					
				}else {
					resposta.setText("É primo");
				}
			}
			textField.setText("");
			
//			int num = Integer.parseInt(textField.getText());
//			int numero = num -1;
//			while(numero > 1) {
//				if(num % numero == 0) {
//					resposta.setText("Não é primo");
//				}else if(numero == 2) {
//					resposta.setText("É primo");
//					
//				}
//				textField.setText("");
//				numero--;
//			}
		}

		
	}
	
	

}
