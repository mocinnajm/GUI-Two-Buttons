import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Parte11 {
    public static void main(String[] args) {
        // Crear la finestra
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear un panell amb layout per centrar
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Crear el botó
        JButton button = new JButton("Click");
        button.setPreferredSize(new Dimension(80, 30)); // mida semblant a la imatge

        // Afegir el botó centrat al panell
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(button, gbc);

        // Afegir el panell a la finestra
        frame.add(panel);
        frame.setLocationRelativeTo(null); // Centrar la finestra a la pantalla
        frame.setVisible(true);
    }
}
