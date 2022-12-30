/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arackiralama;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author turan
 */
public class ôdeme extends JFrame implements ActionListener,Iucrethesapla{
    
    private  JFrame frame;
    private  JPanel panel1;
    private  JLabel label1;
    private  JLabel label2;
    private  JLabel label3;
    private  JLabel label4;
    private  JLabel label5;
    private  JLabel label6;        
    private  JTextField tlabel1;
    private  JTextField tlabel2;
    private  JTextField tlabel3;
    private  JTextField tlabel4;
    private final JButton btn1;
    private final JButton btn2;


    private final JComboBox month;
    private final JComboBox year;
    
    
    private final String months[]
        = { "01", "02", "03", "04",
            "05", "06", "07", "08",
            "09", "10", "11", "12" };
    private final String years[]
        = { "23","24","25","26","27","28","29","30","31" };
    
    public ôdeme(){
    frame=new JFrame();
    frame.setSize(445, 465); 
    
    panel1=new JPanel();
    panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ÖDEME"));
    panel1.setSize(420, 392);
    panel1.setLocation(0, 17);
    panel1.setLayout(null);
    frame.add(panel1);
    
    label1=new JLabel("Kart Numarası");
    label1.setFont(new Font("Italic",3,14));
    label1.setSize(100, 20);
    label1.setLocation(15,20);
    panel1.add(label1);
    
    tlabel1=new JTextField();
    tlabel1.setFont(new Font("BoldItalic",3,14));
    tlabel1.setSize(120, 20);
    tlabel1.setLocation(120, 20);
    panel1.add(tlabel1);
    
    label2=new JLabel("Kart SKT");
    label2.setFont(new Font("Italic",3,14));
    label2.setSize(80, 20);
    label2.setLocation(15,60);
    panel1.add(label2);
    
    month = new JComboBox(months);
    month.setFont(new Font("Arial", Font.PLAIN, 15));
    month.setSize(50, 20);
    month.setLocation(115, 60);
    panel1.add(month);
 
    year = new JComboBox(years);
    year.setFont(new Font("Arial", Font.PLAIN, 15));
    year.setSize(50, 20);
    year.setLocation(180, 60);
    panel1.add(year);
    
    label3=new JLabel("CVC");
    label3.setFont(new Font("Italic",3,14));
    label3.setSize(60, 20);
    label3.setLocation(240,60);
    panel1.add(label3);
    
    tlabel2=new JTextField();
    tlabel2.setFont(new Font("BoldItalic",3,14));
    tlabel2.setSize(40, 20);
    tlabel2.setLocation(290, 60);
    panel1.add(tlabel2);
    
    label4=new JLabel("Kiralama Suresi");
    label4.setFont(new Font("Italic",3,14));
    label4.setSize(120, 20);
    label4.setLocation(15,100);
    panel1.add(label4);
    
    tlabel3=new JTextField();
    tlabel3.setFont(new Font("BoldItalic",3,14));
    tlabel3.setSize(40, 20);
    tlabel3.setLocation(135,100);
    panel1.add(tlabel3);
    
    label5=new JLabel("Gun");
    label5.setFont(new Font("Italic",3,14));
    label5.setSize(40, 20);
    label5.setLocation(180,100);
    panel1.add(label5);
    
    label6=new JLabel("Ödeme Tutari");
    label6.setFont(new Font("Italic",3,14));
    label6.setSize(120, 20);
    label6.setLocation(15,140);
    panel1.add(label6);
    
    tlabel4=new JTextField();
    tlabel4.setFont(new Font("BoldItalic",3,14));
    tlabel4.setEditable(false);
    tlabel4.setSize(100, 20);
    tlabel4.setLocation(145,140);
    panel1.add(tlabel4);
    
    btn1=new JButton("Ödeme Yap");
    btn1.setSize(122, 22);
    btn1.setLocation(180, 320);
    btn1.addActionListener(this);
    panel1.add(btn1);
    
    btn2=new JButton("Geri");
    btn2.setSize(72, 22);
    btn2.setLocation(320, 320);
    btn2.addActionListener(this);
    panel1.add(btn2);
    
    
    
    ucrethesapla();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            String def="";
            if(tlabel1.getText().equals(def)||tlabel2.getText().equals(def)||tlabel3.getText().equals(def)){
                
                JOptionPane.showMessageDialog(null, "Bilgilerinizi kontrol ediniz.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Ödeme Basarili");
            
            AnaMenu anaMenu=new AnaMenu();
            frame.dispose();
            }
        }
        else if(e.getSource()==btn2){
            AracKiralama ak=new AracKiralama();
            frame.dispose();
        }
    }

    @Override
    public void ucrethesapla() {
       tlabel3.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e){
                if(tlabel3.getText().equals("")){
                }
                else{ 
                int ceza=Integer.parseInt(tlabel3.getText())*500;
                String s=Integer.toString(ceza);
                tlabel4.setText(s);
            }
            }  
        });
    }
    
    
}