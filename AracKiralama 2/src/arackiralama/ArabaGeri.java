
package arackiralama;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author turan
 */
public class ArabaGeri extends Dosyaislemleri implements ActionListener{
    private final JFrame frame;
    private final JPanel panel1;
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JLabel label4;
    private final JLabel label5;
    private final JLabel label6;
    private final JTextField tlabel2;
    private final JTextField tlabel3;
    private final JTextField tlabel4;
    private final JTextField tlabel5;
    private final JTextField tlabel6;
    private final JButton btn1;
    private final JButton btn2;
    private ImageIcon caricon;
    private JLabel carlabel;

    
    
    public ArabaGeri(){
        
        frame=new JFrame();
        frame.setSize(1366, 768);
        
        label1=new JLabel("Arac İade");
        label1.setFont(new Font("Tahoma",1,24));
        label1.setSize(130,30);
        label1.setLocation(260, 5);
        frame.add(label1);
        
        caricon=new ImageIcon("c:\\Proje\\AracKiralama\\Resimler\\iade.jpeg");
        carlabel=new JLabel("",caricon,JLabel.CENTER);
        carlabel.setBounds(0, 0, 1366, 768);
        frame.add(carlabel);
        
        panel1=new JPanel();
        panel1.setSize(330, 430);
        panel1.setLocation(20, 50);
        panel1.setLayout(null);
        panel1.setBackground(Color.CYAN);
        carlabel.add(panel1);
        
        label2=new JLabel("Musteri Id");
        label2.setFont(new Font("BoldItalic",3,14));
        label2.setSize(80, 20);
        label2.setLocation(15,60);
        panel1.add(label2);
    
        tlabel2=new JTextField();
        tlabel2.setFont(new Font("BoldItalic",3,14));
        tlabel2.setSize(120, 16);
        tlabel2.setLocation(120, 60);
        panel1.add(tlabel2);
    
        label3=new JLabel("Araba Id");
        label3.setFont(new Font("BoldItalic",3,14));
        label3.setSize(80, 20);
        label3.setLocation(15,100);
        panel1.add(label3);
    
        tlabel3=new JTextField();
        tlabel3.setFont(new Font("BoldItalic",3,14));
        tlabel3.setSize(120, 16);
        tlabel3.setLocation(120, 100);
        panel1.add(tlabel3);
    
        label4=new JLabel("Tarih");
        label4.setFont(new Font("BoldItalic",3,14));
        label4.setSize(80, 20);
        label4.setLocation(15,140);
        panel1.add(label4);
    
        tlabel4=new JTextField();
        tlabel4.setFont(new Font("BoldItalic",3,14));
        tlabel4.setSize(120, 16);
        tlabel4.setLocation(120, 140);
        panel1.add(tlabel4);
    
        label5=new JLabel("Geciken gun");
        label5.setFont(new Font("BoldItalic",3,14));
        label5.setSize(100, 25);
        label5.setLocation(15,180);
        panel1.add(label5);
    
        tlabel5=new JTextField();
        tlabel5.setFont(new Font("BoldItalic",3,14));
        tlabel5.setSize(120, 16);
        tlabel5.setLocation(120, 180);
        
        panel1.add(tlabel5);
    
        label6=new JLabel("Para Cezasi");
        label6.setFont(new Font("BoldItalic",3,14));
        label6.setSize(100, 20);
        label6.setLocation(15,220);
        panel1.add(label6);
        
        
        tlabel6=new JTextField();
        tlabel6.setFont(new Font("BoldItalic",3,14));
        tlabel6.setSize(120, 16);
        tlabel6.setLocation(120, 220);
        tlabel6.setEditable(false);
        panel1.add(tlabel6);
        
        tlabel5.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e){
                if(tlabel5.getText().equals("")){
                }
                else{ 
                int ceza=Integer.parseInt(tlabel5.getText())*500;
                String s=Integer.toString(ceza);
                tlabel6.setText(s);
            }
            }  
        });
       

        btn1=new JButton("Tamam");
        btn1.setSize(82, 22);
        btn1.setLocation(160, 280);
        btn1.addActionListener(this);
        panel1.add(btn1);
        
        
        btn2=new JButton("Geri");
        btn2.setSize(72, 22);
        btn2.setLocation(250, 280);
        btn2.addActionListener(this);
        panel1.add(btn2);
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {  
        if(e.getSource()==btn1){
            iadedosyaOku();
            iadecountlines();
            iadeveriEkle(tlabel2.getText(),tlabel3.getText(), tlabel4.getText(), tlabel5.getText(), tlabel6.getText());
        }
     
     else if(e.getSource()==btn2){
            frame.dispose();
            AnaMenu anaMenu=new AnaMenu();
        }
    } 
}
