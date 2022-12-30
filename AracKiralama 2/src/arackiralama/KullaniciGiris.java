package arackiralama;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public  class KullaniciGiris extends Dosyaislemleri implements ActionListener{
    static JFrame frame;
    private final JLabel title;
    private final JPanel panel1;
    private final JLabel Label2;
    private final JLabel Label3;   
    private final JTextField KullaniciId;
    private final JPasswordField Sifre;
    private final JButton Giris;
    private final JButton KayitOl;
    private ImageIcon caricon;
    private JLabel carlabel;
  
     public KullaniciGiris() {
        frame=new JFrame();
        frame.setTitle("ARAC KIRALAMA UYGULAMASI");
        
       
        
        caricon=new ImageIcon("c:\\Proje\\AracKiralama\\Resimler\\honda.jpg");
        carlabel=new JLabel("",caricon,JLabel.CENTER);
        carlabel.setBounds(0, 0, 1140, 597);
        frame.add(carlabel);
        
        
        
        panel1=new JPanel();
        panel1.setSize(300,400);
        panel1.setLocation(10, 60);
        panel1.setBackground(Color.ORANGE);
        panel1.setLayout(null);
        carlabel.add(panel1);
        
        title = new JLabel("LOGIN");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(100, 30);
        title.setLocation(50, 30);
        panel1.add(title);
        
        Label2=new JLabel("Kullanici Adi:");
        Label2.setFont(new Font("Arial", Font.PLAIN, 20));
        Label2.setSize(150,20);
        Label2.setLocation(5,100);
        panel1.add(Label2);
        
        KullaniciId = new JTextField();
        KullaniciId.setFont(new Font("Arial", Font.PLAIN, 20));
        KullaniciId.setSize(150, 20);
        KullaniciId.setLocation(140, 100);
        panel1.add(KullaniciId);
        
        Label3=new JLabel("Sifre:");
        Label3.setFont(new Font("Arial", Font.PLAIN, 20));
        Label3.setSize(150,20);
        Label3.setLocation(5,150);
        Label3.setForeground(Color.BLACK);
        Label3.setBackground(Color.CYAN);
        panel1.add(Label3);
        
        Sifre = new JPasswordField();
        Sifre.setFont(new Font("Arial", Font.PLAIN, 20));
        Sifre.setSize(150, 20);
        Sifre.setLocation(140, 150);
        Sifre.setForeground(Color.BLACK);
        Sifre.setBackground(Color.WHITE);
        panel1.add(Sifre);
        
        Giris=new JButton("Giris");
        Giris.setFont(new Font("Arial", Font.PLAIN, 20));
        Giris.setSize(120, 30);
        Giris.setLocation(150, 200);
        Giris.addActionListener(this);
        Giris.setForeground(Color.black);
        Giris.setBackground(Color.CYAN);
        panel1.add(Giris);
        
        KayitOl=new JButton("Kayit Ol");
        KayitOl.setFont(new Font("Arial", Font.PLAIN, 20));
        KayitOl.setSize(150, 30);
        KayitOl.setLocation(140, 300);
        KayitOl.setForeground(Color.black);
        KayitOl.setBackground(Color.CYAN);
        KayitOl.addActionListener(this);
        panel1.add(KayitOl);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1140,597);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==KayitOl) {
          frame.dispose();
   KullaniciKayit myWindow = new KullaniciKayit();
  }
         else if(e.getSource()==Giris) {
             kayitcountlines();
             String admin=KullaniciId.getText();
             String sifreString=Sifre.getText();
             if(admin.equals("admin")&&sifreString.equals("12345678")){
                 AdminMenu adminMenu=new AdminMenu();
                 frame.dispose();
             }
             else{
             veriKontrol(admin,sifreString);
             }  
         }    
    }
}