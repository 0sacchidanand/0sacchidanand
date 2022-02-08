import java.awt.*;
import java.awt.event.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CheckboxItemlistener implements ItemListener 
{
    JFrame frame;
    JCheckBox[] checkBoxArray = new JCheckBox[3];
    JTextField textfield;
    JLabel label;
    JPanel panel;
    CheckboxItemlistener()
    {
        frame = new JFrame("JCheckbox event handling.");
        frame.setLayout(new GridLayout(3,1));
        panel = new JPanel();
        checkBoxArray[0] = new JCheckBox("java");
        checkBoxArray[1] = new JCheckBox("c++");
        checkBoxArray[2] = new JCheckBox("python");
        for(int i=0;i<3;i++)
        {
            panel.add(checkBoxArray[i]);
            checkBoxArray[i].addItemListener(this);
        }
        textfield = new JTextField(20);
        label = new JLabel("select the programming " + "language you have used :" + JLabel.CENTER);
        frame.add(label);
        frame.add(panel);
        frame.add(textfield);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String message="you have used :- ";
        for(int i=0;i<3;i++)
        {
            if(checkBoxArray[i].isSelected()) message+=checkBoxArray[i].getText()+ " ";
        }
        textfield.setText(message);
        
        
    }
    public static void main(String[] args) {
        new CheckboxItemlistener();
    }

    
}
