
package arackiralama;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AracKiralama extends Dosyaislemleri implements ActionListener{

    private final JFrame frame;
    private final JPanel panel1;
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JLabel label4;
    private final JLabel label5;
    private final JLabel label6;
    private final JLabel label7;
    static JComboBox combobox;
    private final JComboBox date;
    private final JComboBox month;
    private final JComboBox year;
    private final JComboBox date1;
    private final JComboBox month1;
    private final JComboBox year1;
    private final JTextField tlabel2;
    private final JTextField tlabel3;
    private final JTextField tlabel4;
    private final JTextField tlabel7;
    private final JButton btn1;
    private final JButton btn2;
    private final String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private final String months[]
        = { "Ocak", "Şubat", "Mart", "Nisan",
            "Mayıs", "Haziran", "Temmuz", "Ağustos",
            "Eylül", "Ekim", "Kasım", "Aralık" };
    private final String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021","2022" };
   


    
public  AracKiralama() {
    frame=new JFrame();
    frame.setSize(445, 465);
    
    panel1=new JPanel();
    panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("AracKiralama"));
    panel1.setSize(420, 392);
    panel1.setLocation(0, 17);
    panel1.setLayout(null);
    frame.add(panel1);
    
    label1=new JLabel("Araba Id");
    label1.setFont(new Font("Italic",3,14));
    label1.setSize(80, 20);
    label1.setLocation(15,20);
    panel1.add(label1);
    
    combobox=new JComboBox();
    combobox.setSize(122, 20);
    combobox.setLocation(120, 20);
    combobox.addActionListener(this);
    panel1.add(combobox);
    
    
    
    label2=new JLabel("Musteri Id");
    label2.setFont(new Font("Italic",3,14));
    label2.setSize(80, 20);
    label2.setLocation(15,60);
    panel1.add(label2);
    
    tlabel2=new JTextField();
    tlabel2.setFont(new Font("BoldItalic",3,14));
    tlabel2.setSize(120, 16);
    tlabel2.setLocation(120, 60);
    panel1.add(tlabel2);
    
    label3=new JLabel("Ad Soyad");
    label3.setFont(new Font("Italic",3,14));
    label3.setSize(80, 20);
    label3.setLocation(15,100);
    panel1.add(label3);
    
    tlabel3=new JTextField();
    tlabel3.setFont(new Font("BoldItalic",3,14));
    tlabel3.setSize(120, 16);
    tlabel3.setLocation(120, 100);
    panel1.add(tlabel3);
    
    label4=new JLabel("Ucret");
    label4.setFont(new Font("Italic",3,14));
    label4.setSize(80, 20);
    label4.setLocation(15,140);
    panel1.add(label4);
    
    tlabel4=new JTextField();
    tlabel4.setFont(new Font("BoldItalic",3,14));
    tlabel4.setSize(120, 16);
    tlabel4.setEditable(false);
    tlabel4.setLocation(120, 140);
    panel1.add(tlabel4);
    
    label5=new JLabel("Tarih");
    label5.setFont(new Font("Italic",3,14));
    label5.setSize(80, 20);
    label5.setLocation(15,180);
    panel1.add(label5);
    
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(60, 20);
        date.setLocation(120, 180);
        panel1.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(185, 180);
        panel1.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(250, 180);
        panel1.add(year);
    
    label6=new JLabel("Donus Tarihi");
    label6.setFont(new Font("Italic",3,14));
    label6.setSize(100, 20);
    label6.setLocation(15,220);
    panel1.add(label6);
    
     date1 = new JComboBox(dates);
        date1.setFont(new Font("Arial", Font.PLAIN, 15));
        date1.setSize(60, 20);
        date1.setLocation(120, 220);
        panel1.add(date1);
 
        month1 = new JComboBox(months);
        month1.setFont(new Font("Arial", Font.PLAIN, 15));
        month1.setSize(60, 20);
        month1.setLocation(185, 220);
        panel1.add(month1);
 
        year1 = new JComboBox(years);
        year1.setFont(new Font("Arial", Font.PLAIN, 15));
        year1.setSize(60, 20);
        year1.setLocation(250, 220);
        panel1.add(year1);
        
    label7=new JLabel("Mevcut Mu");
    label7.setFont(new Font("Italic",1,18));
    label7.setSize(100, 22);
    label7.setLocation(300,40);
    panel1.add(label7);
    
    tlabel7=new JTextField();
    tlabel7.setFont(new Font("BoldItalic",3,14));
    tlabel7.setSize(90, 22);
    tlabel7.setLocation(300,80);
    panel1.add(tlabel7);
    
    btn1=new JButton("Tamam");
    btn1.setSize(82, 22);
    btn1.setLocation(230, 320);
    btn1.addActionListener(this);
    panel1.add(btn1);
    
    btn2=new JButton("Geri");
    btn2.setSize(72, 22);
    btn2.setLocation(320, 320);
    btn2.addActionListener(this);
    panel1.add(btn2);
    
    ArabakayitdosyaOku();
    arabacountlines();
    kiralamaveriKaydet();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            frame.dispose();
            ôdeme ödeme=new ôdeme();
            
        }
        else if(e.getSource()==btn2){
            frame.dispose();
            AnaMenu anaMenu=new AnaMenu();
        }
        else if(e.getSource()==combobox){
        try {
            RandomAccessFile raf=new RandomAccessFile(fAraba+"\\Arabakayit.txt","rw");
             for(int i=0;i<lnaraba;i+=5){
                String Arabaid=combobox.getSelectedItem().toString();
                String ArabaidString = raf.readLine().substring(9);
                String MarkaString=raf.readLine().substring(6);
                String ModelString=raf.readLine().substring(6);
                String MevcutmuString=raf.readLine().substring(9);
                raf.readLine();
                if(Arabaid.equals(ArabaidString)){
                    tlabel7.setText(MevcutmuString);
                }
               if(tlabel7.getText().equals("Evet")){
                   tlabel2.setEditable(true);
                   tlabel3.setEditable(true);
                   tlabel4.setText("Gunluk 500TL");
                   date.setEditable(true);
                   month.setEditable(true);
                   year.setEditable(true);
                   date1.setEditable(true);
                   month1.setEditable(true);
                   year1.setEditable(true);
                   tlabel7.setEditable(true);
               }
               if(tlabel7.getText().equals("Hayir")){
                   tlabel2.setEditable(false);
                   tlabel3.setEditable(false);
                   tlabel4.setText("");
                   date.setEditable(false);
                   month.setEditable(false);
                   year.setEditable(false);
                   date1.setEditable(false);
                   month1.setEditable(false);
                   year1.setEditable(false);
                   tlabel7.setEditable(false);

               }
            }
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AracKiralama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AracKiralama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    }
 
}
