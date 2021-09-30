package dad.holamundo.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundo {

	public static void main(String[] args) {

		// creamos la etiqueta para mostrar el saludo
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setBounds(20, 20, 120, 50);

		// creamos el botón para saludar
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.addActionListener(e -> saludoLabel.setText("¡¡¡Hola Mundo!!!"));

		// panel (contenedor) que contiene la etiqueta y el botón
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);

		// ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo en AWT");
		frame.setSize(320, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.add(rootPanel);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		frame.setVisible(true);

	}

}
