package arackiralama;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KullaniciKayit extends Dosyaislemleri implements ActionListener{

   
    static  JFrame frame;
    private final JLabel title;
    private final JLabel AdSoyad;
    private final JLabel KullaniciAdi;
    private final JTextField tKullaniciAdi;
    private final JTextField tname;
    private final JLabel Sifre;
    private final JPasswordField Psifre;
    private final JLabel gender;
    private final JRadioButton male;
    private final JRadioButton female;
    private final ButtonGroup gengp;
    private final JLabel dob;
    private final JComboBox date;
    private final JComboBox month;
    private final JComboBox year;
    private final JLabel add;
    private final JTextArea tadd;
    private final JCheckBox term;
    private final JButton sub;
    private final JButton reset;
    private final JButton geri;
    
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
        = { "1930", "1931", "1932", "1933","1934",
            "1935", "1936", "1937", "1938","1939",
            "1940", "1941", "1942", "1943","1944",
            "1945", "1946", "1947", "1948","1949",
            "1950", "1951", "1952", "1953","1954",
            "1955", "1956", "1957", "1958","1959",
            "1960", "1961", "1962", "1963","1964",
            "1965", "1966", "1967", "1968","1969",
            "1970", "1971", "1972", "1973","1974",
            "1975", "1976", "1977", "1978","1979",
            "1980", "1981", "1982", "1983","1984",
            "1985", "1986", "1987", "1988","1989",
            "1990", "1991", "1992", "1993","1994",
            "1995", "1996", "1997", "1998","1999",
            "2000", "2001", "2002","2003", "2004",};
 
  

    
    

    public KullaniciKayit(){
   
       
        
        frame=new JFrame();
        frame.setTitle("ARAC KIRALAMA UYGULAMASI");
 
        title = new JLabel("KULLANICI KAYIT");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(100, 30);
        frame.add(title);
 
        AdSoyad = new JLabel("Ad Soyad");
        AdSoyad.setFont(new Font("Arial", Font.PLAIN, 20));
        AdSoyad.setSize(100, 20);
        AdSoyad.setLocation(100, 150);
        frame.add(AdSoyad);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(150, 20);
        tname.setLocation(220, 150);
        frame.add(tname);
 
        Sifre = new JLabel("Sifre");
        Sifre.setFont(new Font("Arial", Font.PLAIN, 20));
        Sifre.setSize(100, 20);
        Sifre.setLocation(100, 200);
        frame.add(Sifre);
 
        Psifre = new JPasswordField();
        Psifre.setFont(new Font("Arial", Font.PLAIN, 15));
        Psifre.setSize(150, 20);
        Psifre.setLocation(220, 200);
        frame.add(Psifre);
 
        KullaniciAdi=new JLabel("Kullanici Adi");
        KullaniciAdi.setFont(new Font("Arial", Font.PLAIN, 20));
        KullaniciAdi.setSize(200,20);
        KullaniciAdi.setLocation(100, 175);
        frame.add(KullaniciAdi);
                        
        tKullaniciAdi=new JTextField();
        tKullaniciAdi.setFont(new Font("Arial", Font.PLAIN, 15));
        tKullaniciAdi.setSize(150,20);
        tKullaniciAdi.setLocation(220, 175);
        frame.add(tKullaniciAdi);
                
        gender = new JLabel("Cinsiyet");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 250);
        frame.add(gender);
 
        male = new JRadioButton("Erkek");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 250);
        male.setActionCommand("Erkek");
        frame.add(male);
 
        female = new JRadioButton("Kadın");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 250);
        female.setActionCommand("Kadin");
        frame.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("D.Tarihi");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 300);
        frame.add(dob);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 300);
        frame.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 300);
        frame.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 300);
        frame.add(year);
 
        add = new JLabel("Adres");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 350);
        frame.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 350);
        tadd.setLineWrap(false);
        frame.add(tadd);
 
        term = new JCheckBox("Kullanıcı şartları kabul ediyor...");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 450);
        frame.add(term);
 
        sub = new JButton("Kayıt");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 30);
        sub.setLocation(150, 500);
        sub.setForeground(Color.black);
        sub.setBackground(Color.CYAN);
        sub.addActionListener(this);
        frame.add(sub);
 
        reset = new JButton("Yenile");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 30);
        reset.setLocation(270, 500);
        reset.setForeground(Color.black);
        reset.setBackground(Color.CYAN);
        reset.addActionListener(this);
        frame.add(reset);
 
        geri = new JButton("Geri");
        geri.setFont(new Font("Arial", Font.PLAIN, 15));
        geri.setSize(100, 30);
        geri.setLocation(390, 500);
        geri.setForeground(Color.black);
        geri.setBackground(Color.CYAN);
        geri.addActionListener(this);
        frame.add(geri);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
 
  
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
           
                dosyaOlustur();
                kayitdosyaOku();
                kayitcountlines();
                if(tKullaniciAdi.getText().length()==0||Psifre.getText().length()<8){
                    if(tKullaniciAdi.getText().length()==0||Psifre.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "Kullanici adi veya sifre boş olamaz!");
                    }
                else{
                    JOptionPane.showMessageDialog(null, "Sifre en az 8 karakter olmalidir!");
                }}
                else{
                    
                    kayitveriEkle(tKullaniciAdi.getText(),Psifre.getText(),tname.getText(),gengp.getSelection().getActionCommand(), (String) date.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem(), tadd.getText(),0);
                     
                }
               
            }
            else {
              JOptionPane.showMessageDialog(null,"Lütfen kullanici sartlarini kabul edin","Hata!",JOptionPane.WARNING_MESSAGE); 
                
            }
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            Psifre.setText(def);
            tKullaniciAdi.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
        }
        else if(e.getSource()== geri){
             frame.dispose();
            KullaniciGiris k=new KullaniciGiris();
        }
      
    }    
}