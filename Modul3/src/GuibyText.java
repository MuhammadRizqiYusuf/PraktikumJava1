import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuibyText extends JFrame{

    JLabel label1 = new JLabel("Coba Input 1");
    JTextField textField1 = new JTextField();
    JButton button1 = new JButton("Great");

    GuibyText(){
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("GUI By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void meletakkanKomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(label1);
        getContentPane().add(textField1);
        getContentPane().add(button1);

        label1.setBounds(16,32,100,25);
        textField1.setBounds(124, 32, 100,25);
        button1.setBounds(232,32,80,25);
    }

    public static void main(String[] args) {
        GuibyText guibyText = new GuibyText();
        guibyText.meletakkanKomponen();
        guibyText.setVisible(true);
    }

    void menambahkanListener(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nama = textField1.getText();
                JOptionPane.showMessageDialog(null,"Hai "+ nama);
            }
        });
    }
}