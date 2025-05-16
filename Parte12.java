import javax.swing.*;
import java.awt.*;

public class Parte12 {
    public static void main(String[] args) {
        // Crear la finestra
        JFrame frame = new JFrame("El mejor título");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Panell principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);

        // Mida estàndard per als dos botons
        Dimension midaBotons = new Dimension(90, 30);

        // ===== BOTÓ 1: CLICK estilitzat =====
        JButton btn1 = new JButton("<html><b><i><font color='blue'>Click</font></i></b></html>");
        btn1.setPreferredSize(midaBotons);
        btn1.setMaximumSize(midaBotons);
        btn1.setMinimumSize(midaBotons);
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ===== BOTÓ 2: CLICKAQUI amb icona =====
        Icon icon = UIManager.getIcon("OptionPane.informationIcon");
        JButton btn2 = new JButton("Clickquí", icon);
        btn2.setBackground(Color.RED);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusPainted(false);
        btn2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        btn2.setPreferredSize(midaBotons);
        btn2.setMaximumSize(midaBotons);
        btn2.setMinimumSize(midaBotons);
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Espais
        panel.add(Box.createVerticalStrut(40));
        panel.add(btn1);
        panel.add(Box.createVerticalStrut(30));
        panel.add(btn2);

        // Mostrar
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
