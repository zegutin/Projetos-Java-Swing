
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculadoraDoisDigitos extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;

	public CalculadoraDoisDigitos() {

		super("Soma de dois valores");

		l1 = new JLabel("Primeiro valor");
		l2 = new JLabel("Segundo valor");
		l3 = new JLabel("Resultado");

		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);

		b1 = new JButton("Adicionar");

		setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);

		add(b1);
		b1.addActionListener(this);

		setSize(400, 300);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		int soma = x + y;
		t3.setText(String.valueOf(soma));

	}

	public static void main(String[] args) {

		new CalculadoraDoisDigitos();
	}
}