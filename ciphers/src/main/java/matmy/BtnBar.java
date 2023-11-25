package matmy;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.Box;
import javax.swing.JButton;


public class BtnBar extends JPanel
{
    private JButton decryptBtn;
    private JButton encryptBtn;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    BtnBar()
    {
        this.setPreferredSize(new Dimension(300, 70));

        encryptBtn = new JButton("Encrypt");
        decryptBtn = new JButton("Decrypt");

        encryptBtn.setBorder(emptyBorder);
        decryptBtn.setBorder(emptyBorder);

        encryptBtn.setFont(new Font("Sans-serif", Font.PLAIN, 15));
        decryptBtn.setFont(new Font("Sans-serif", Font.PLAIN, 15));

        this.add(encryptBtn);
        this.add(Box.createHorizontalStrut(10));
        this.add(decryptBtn);

    }

    //accessors
    public JButton getencryptBtn()
    {
        return encryptBtn;
    }
    public JButton getdecryptBtn()
    {
        return decryptBtn;
    }
}