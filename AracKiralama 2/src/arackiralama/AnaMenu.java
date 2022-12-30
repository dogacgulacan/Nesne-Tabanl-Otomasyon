package arackiralama;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnaMenu extends JFrame implements ActionListener{
    private final JFrame frame;
    private final JLabel title;
    private final JButton btn1;
    private final JButton btn3;
    private final JButton btn4;
    private final JButton btn5;
    private ImageIcon caricon;
    private JLabel carlabel;
        
    public AnaMenu(){   
        frame=new JFrame();
        frame.setTitle("ARAC KIRALAMA UYGULAMASI");
        frame.setSize(1140, 597);
        
        title = new JLabel("ARAC KIRALAMA");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(400, 30);
        title.setLocation(70, 30);
        title.setForeground(Color.BLUE);
        frame.add(title);
        
        caricon=new ImageIcon("c:\\Proje\\AracKiralama\\Resimler\\supra.jpg");
        carlabel=new JLabel("",caricon,JLabel.CENTER);
        carlabel.setBounds(0, 0, 1140, 597);
        frame.add(carlabel);
        
        btn1=new JButton("Arabalar");
        btn1.setFont(new Font("Arial", Font.PLAIN, 30));
        btn1.setSize(200, 50);
        btn1.setForeground(Color.black);
        btn1.setBackground(Color.CYAN);
        btn1.setLocation(100, 160);
        btn1.addActionListener(this);
        carlabel.add(btn1);
        
        
        btn3=new JButton("Kiralama");
        btn3.setFont(new Font("Arial", Font.PLAIN, 30));
        btn3.setSize(200, 50);
        btn3.setForeground(Color.black);
        btn3.setBackground(Color.CYAN);
        btn3.setLocation(100, 220);
        btn3.addActionListener(this);
        carlabel.add(btn3);
        
        btn4=new JButton("Arac İade");
        btn4.setFont(new Font("Arial", Font.PLAIN, 30));
        btn4.setSize(200, 50);
        btn4.setForeground(Color.black);
        btn4.setBackground(Color.CYAN);
        btn4.setLocation(100, 280);
        btn4.addActionListener(this);
        carlabel.add(btn4);
        
        btn5=new JButton("Cikis");
        btn5.setFont(new Font("Arial", Font.PLAIN, 30));
        btn5.setSize(200, 50);
        btn5.setForeground(Color.black);
        btn5.setBackground(Color.CYAN);
        btn5.setLocation(100, 340);
        btn5.addActionListener(this);
        carlabel.add(btn5);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            frame.dispose();
            Arabalar a=new Arabalar();
        }
        else if(e.getSource()==btn3){
            frame.dispose();
            AracKiralama ak=new AracKiralama();
        }        
        else if(e.getSource()==btn4){
            frame.dispose();
            ArabaGeri ag=new ArabaGeri();
        }
        else if(e.getSource()==btn5){
            frame.dispose();
            KullaniciGiris k=new KullaniciGiris();
        }        
    }
}