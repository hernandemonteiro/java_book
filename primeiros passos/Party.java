import java.awt.*;
import java.awt.event.*;

class Party {
    public void buildInvite() {
        Frame f = new Frame("Party Invitation");
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        Label l = new Label("Welcome to the Party!", Label.CENTER);
        l.setFont(new Font("Arial", Font.BOLD, 24));
        Button b = new Button("Join the Party");
        b.setBackground(Color.GREEN);

        Button c = new Button("Fechar");
        c.setBackground(Color.RED);
        c.setBounds(300, 400, 100, 50);
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 10, 20, 10);
        f.add(l, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 10, 10, 10);
        f.add(b, gbc);

        gbc.gridx = 1;
        f.add(c, gbc);

        f.setSize(700, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new Party().buildInvite();
    }
}