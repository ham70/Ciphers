package matmy;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AppFrame extends JFrame
{
    private BtnBar bar;

    private JTextField textBox;
    private JButton encryptBtn;
    private JButton decryptBtn;


    //constructor-----------------------------------------------------
    public AppFrame()
    {
        this.setTitle("Cipher App");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        textBox = new JTextField(35);

        bar = new BtnBar();
        encryptBtn = bar.getencryptBtn();
        decryptBtn = bar.getdecryptBtn();


        this.add(textBox, BorderLayout.NORTH);
        this.add(bar, BorderLayout.SOUTH);

        addListeners();
        
        this.setVisible(true);
    }

    //listerners-----------------------------------------------------
    public void addListeners()
    {
        encryptBtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                String message = textBox.getText();
                String newMessage = CipherLogic.encrpyt(message);
                textBox.setText("" + newMessage);

                revalidate();
                repaint();
            }
        });

        decryptBtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                String message = textBox.getText();
                String newMessage = CipherLogic.decrpyt(message);
                textBox.setText("" + newMessage);

                revalidate();
                repaint();
            }
        });
    }

}