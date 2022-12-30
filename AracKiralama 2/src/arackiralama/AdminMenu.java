
package arackiralama;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author turan
 */
public class AdminMenu extends JFrame implements ActionListener{
    private final JFrame frame;
    private final JLabel title;
    private final JButton btn1;
    private final JButton btn2;
    private final JButton btn3;
    private final JButton btn4;

        
    public AdminMenu(){   
        frame=new JFrame();
        frame.setTitle("ARAC KIRALAMA UYGULAMASI");
        frame.setSize(450, 450);
        
        title = new JLabel("ADMIN MENU");
        title.setFont(new Font("Arial", Font.PLAIN, 40));
        title.setSize(400, 30);
        title.setLocation(80, 30);
        title.setForeground(Color.BLUE);
        frame.add(title);
        
        btn1=new JButton("Arac Kayit");
        btn1.setFont(new Font("Arial", Font.PLAIN, 30));
        btn1.setSize(200, 50);
        btn1.setForeground(Color.black);
        btn1.setBackground(Color.CYAN);
        btn1.setLocation(100, 160);
        btn1.addActionListener(this);
        frame.add(btn1);
        
        btn2=new JButton("Musteri");
        btn2.setFont(new Font("Arial", Font.PLAIN, 30));
        btn2.setSize(200, 50);
        btn2.setForeground(Color.black);
        btn2.setBackground(Color.CYAN);
        btn2.addActionListener(this);
        btn2.setLocation(100, 220);
        frame.add(btn2);
        
        btn3=new JButton("Arac İade");
        btn3.setFont(new Font("Arial", Font.PLAIN, 30));
        btn3.setSize(200, 50);
        btn3.setForeground(Color.black);
        btn3.setBackground(Color.CYAN);
        btn3.setLocation(100, 280);
        btn3.addActionListener(this);
        frame.add(btn3);
        
        btn4=new JButton("Cikis");
        btn4.setFont(new Font("Arial", Font.PLAIN, 30));
        btn4.setSize(200, 50);
        btn4.setForeground(Color.black);
        btn4.setBackground(Color.CYAN);
        btn4.setLocation(100, 340);
        btn4.addActionListener(this);
        frame.add(btn4);
        
       
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            frame.dispose();
            ArabaKayit a=new ArabaKayit();
        }
        else if(e.getSource()==btn2){
            frame.dispose();
            Musteri m=new Musteri();
        }      
        else if(e.getSource()==btn3){
            frame.dispose();
            adminarabageri Adminarabageri=new adminarabageri();
        }
        else if(e.getSource()==btn4){
            frame.dispose();
            KullaniciGiris k=new KullaniciGiris();
        }        
    }  
}