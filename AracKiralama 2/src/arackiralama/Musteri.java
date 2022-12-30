package arackiralama;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import static javax.swing.BorderFactory.createTitledBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class Musteri extends Dosyaislemleri implements ActionListener{
 
    
   private final JFrame frame;
   private final JPanel panel1;
   private final JPanel panel2;   
   private final JTable table1;
   private final JLabel MusteriId;
   private final JLabel AdSoyad;
   private final JLabel Adres;
   private final JLabel Telefon;
   static  JTextArea tMusteriId; 
   static  JTextArea tAdSoyad;   
   static  JTextArea tAdres;   
   static  JTextArea tTelefon;      
   private final JButton button1;
   private final JButton button2;
   static DefaultTableModel model=new DefaultTableModel();

   
   public Musteri(){
       frame=new JFrame();
       frame.setTitle("ARAC KIRALAMA UYGULAMASI");
       frame.setSize(880,500);
       
       panel1=new JPanel();
       panel1.setBorder(createTitledBorder("Musteri"));
       panel1.setSize(350, 430);
       panel1.setLocation(25, 14);
       panel1.setLayout(null);
       frame.add(panel1);
       
       MusteriId=new JLabel("Musteri Id");
       MusteriId.setFont(new Font("Arial", Font.PLAIN, 16));
       MusteriId.setSize(70,15);
       MusteriId.setLocation(50, 50);
       panel1.add(MusteriId);
       
       tMusteriId=new JTextArea();
       tMusteriId.setSize(150,18);
       tMusteriId.setLocation(145, 50);
       tMusteriId.setBackground(Color.CYAN);
       panel1.add(tMusteriId);
       
       AdSoyad=new JLabel("Ad Soyad");
       AdSoyad.setFont(new Font("Arial", Font.PLAIN, 16));
       AdSoyad.setSize(70,15);
       AdSoyad.setLocation(50, 90);
       panel1.add(AdSoyad);
       
       tAdSoyad=new JTextArea();
       tAdSoyad.setSize(150,18);
       tAdSoyad.setLocation(145, 90);
       tAdSoyad.setBackground(Color.red);
       panel1.add(tAdSoyad);
       
       Adres=new JLabel("Adres");
       Adres.setFont(new Font("Arial", Font.PLAIN, 16));
       Adres.setSize(70,15);
       Adres.setLocation(50, 140);
       panel1.add(Adres);
       
       tAdres=new JTextArea();
       tAdres.setSize(150,60);
       tAdres.setLocation(145,140);
       tAdres.setBackground(Color.red);
       panel1.add(tAdres);
       
       Telefon=new JLabel("Telefon");
       Telefon.setFont(new Font("Arial", Font.PLAIN, 16));
       Telefon.setSize(70,15);
       Telefon.setLocation(50, 220);
       panel1.add(Telefon);
       
       tTelefon=new JTextArea();
       tTelefon.setSize(150,18);
       tTelefon.setBackground(Color.red);
       tTelefon.setLocation(145, 220);
       panel1.add(tTelefon);
       
       button2=new JButton("Geri");
       button2.setFont(new Font("Arial", Font.PLAIN, 16));
       button2.setSize(100,25);
       button2.setLocation(150, 280);
       button2.addActionListener(this);
       panel1.add(button2);
           
       panel2=new JPanel();
       panel2.setSize(500, 430);
       panel2.setLocation(360, 16);
       frame.add(panel2);
        
       
       String[] columnNames = { "MusteriId", "AdSoyad", "Adres","Telefon" };
        
       table1 = new JTable();
       table1.setSize(200, 300);
       table1.setLocation(30, 40);
       model.setColumnIdentifiers(columnNames);
       table1.setModel(model);
       JScrollPane sp = new JScrollPane(table1);
       panel2.add(sp);
      
       button1=new JButton("Tamam");
       button1.setFont(new Font("Arial", Font.PLAIN, 16));
       button1.setSize(100,25);
       button1.setLocation(50, 280);
       button1.addActionListener((ActionEvent e) -> {
            if(tMusteriId.getText().length()==0||tAdSoyad.getText().length()==0||tAdres.getText().length()==0||tMusteriId.getText().length()==0||tTelefon.getText().length()==0){
                   JOptionPane.showMessageDialog(null,"Musteri bilgileri eksiksiz girilmelidir.");
                }
            else{
                musteridosyaOku();
                mustericountlines();
                musteriveriEkle(tMusteriId.getText(),tAdSoyad.getText(),tAdres.getText(),tTelefon.getText(),0);
                
            }
        });
       panel1.add(button1);
       dosyaOlustur();
       musteridosyaOku();
       mustericountlines();
       musteriveriKaydet(0);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       frame.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button2){
            frame.dispose();
            AdminMenu adminMenu=new AdminMenu();
        }
    }
}
