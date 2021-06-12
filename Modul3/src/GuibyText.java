import javax.swing.*;
public class GuibyText extends JFrame{

    JLabel label1 = new JLabel("Coba Input 1");
    JTextField textField1 = new JTextField();

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

        label1.setBounds(16,32,100,25);
        textField1.setBounds(124, 32, 100,25);
    }

    public static void main(String[] args) {
        GuibyText guibyText = new GuibyText();
        guibyText.meletakkanKomponen();
        guibyText.setVisible(true);
    }
}
