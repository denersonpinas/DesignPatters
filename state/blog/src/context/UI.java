package context;

import javax.swing.*;
import java.awt.*;

public class UI {
    private DocumentContext document;
    private static JTextField textField = new JTextField();

    public UI(DocumentContext document) {
        this.document = document;
    }

    public void init() {
        JFrame frame = new JFrame("Publique um novo Post");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        JButton criar = new JButton("Criar");
        criar.addActionListener(e -> textField.setText(document.getState().draft()));
        JButton moderation = new JButton("Moderation");
        moderation.addActionListener(e -> textField.setText(document.getState().moderation()));
        JButton published = new JButton("Publicar");
        published.addActionListener(e -> textField.setText(document.getState().published()));

        frame.setVisible(true);
        frame.setSize(300, 100);
        buttons.add(criar);
        buttons.add(moderation);
        buttons.add(published);
    }

    
}