package arackiralama;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author turan
 */
public class ArabaKayit extends Dosyaislemleri implements ActionListener{
    
    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JTable table1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    static DefaultTableModel model=new DefaultTableModel();
    static JTextField tlabel1;
    static JTextField tlabel2;
    static JTextField tlabel3;
    static JComboBox tlabel4;
    
   
 
    public ArabaKayit(){
       frame=new JFrame();
       frame.setSize(850, 480);
        
       panel1=new JPanel();
       panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ArabaKayit"));
       panel1.setSize(300, 430);
       panel1.setLocation(5, 5);
       panel1.setLayout(null);
       frame.add(panel1);
        
       label1=new JLabel("Araba Id");
       label1.setSize(140, 22);
       label1.setLocation(20, 30);
       label1.setFont(new Font("TAHOMA BOLD",1,14));
       panel1.add(label1);
       
       tlabel1=new JTextField();
       tlabel1.setSize(130, 22);
       tlabel1.setLocation(160, 30);
       tlabel1.setFont(new Font("TAHOMA BOLD",1,12));
       panel1.add(tlabel1);
       
       label2=new JLabel("Marka");
       label2.setSize(120, 22);
       label2.setLocation(20, 80);
       label2.setFont(new Font("TAHOMA BOLD",1,14));
       panel1.add(label2);
       
       tlabel2=new JTextField();
       tlabel2.setSize(130, 22);
       tlabel2.setLocation(160, 80);
       tlabel2.setFont(new Font("TAHOMA BOLD",1,12));
       panel1.add(tlabel2);
       
       label3=new JLabel("Model");
       label3.setSize(120, 22);
       label3.setLocation(20, 130);
       label3.setFont(new Font("TAHOMA BOLD",1,14));
       panel1.add(label3);
       
       tlabel3=new JTextField();
       tlabel3.setSize(130, 22);
       tlabel3.setLocation(160, 130);
       tlabel3.setFont(new Font("TAHOMA BOLD",1,12));
       panel1.add(tlabel3);
       
       label4=new JLabel("Mevcut Mu");
       label4.setSize(120, 22);
       label4.setLocation(20, 170);
       label4.setFont(new Font("TAHOMA BOLD",1,14));
       panel1.add(label4);
          
       tlabel4=new JComboBox();
       tlabel4.setModel(new DefaultComboBoxModel(new String[] { "Evet", "Hayir" }));
       tlabel4.setSize(130, 22);
       tlabel4.setLocation(160, 170);
       tlabel4.setFont(new Font("TAHOMA BOLD",Font.PLAIN,12));
       panel1.add(tlabel4);
          
       panel2=new JPanel();
       panel2.setSize(500, 430);
       panel2.setLocation(300, 5);
       frame.add(panel2);
       
      
		String[] columnNames = { "Araba Id", "Marka", "Model","Mevcut mu" };
		table1 = new JTable();
                table1.setSize(200, 300);
                table1.setLocation(30, 40);
                model.setColumnIdentifiers(columnNames);
                table1.setModel(model);
		JScrollPane sp = new JScrollPane(table1);
		panel2.add(sp);
                
       btn1=new JButton("Ekle");
       btn1.setSize(80, 33);
       btn1.setLocation(10, 320);
       btn1.setFont(new Font ("TAHOMA BOLD",1,14));
       btn1.addActionListener((ActionEvent e) -> {
            if(e.getSource()==btn1){
                if(tlabel1.getText().length()==0||tlabel2.getText().length()==0||tlabel3.getText().length()==0){
                   JOptionPane.showMessageDialog(null,"Arac bilgileri eksiksiz girilmelidir.");
                }
               else{
                ArabakayitdosyaOku();
                arabacountlines();
                ArabaveriEkle(tlabel1.getText(), tlabel2.getText(), tlabel3.getText(), (String) tlabel4.getSelectedItem(), 0);
                
            }
            }
        });
       panel1.add(btn1);
       
       btn2=new JButton("Geri");
       btn2.setSize(80, 33);
       btn2.setLocation(190, 320);
       btn2.setFont(new Font ("TAHOMA BOLD",1,14));
       btn2.addActionListener(this);
       panel1.add(btn2);
       
       btn3=new JButton("Sil");
       btn3.setSize(80, 33);
       btn3.setLocation(100, 320);
       btn3.setFont(new Font ("TAHOMA BOLD",1,14));
       btn3.addActionListener(this);
       panel1.add(btn3);
    
       table1.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e){
           int i=table1.getSelectedRow();
           tlabel1.setText(model.getValueAt(i, 0).toString());
           tlabel2.setText(model.getValueAt(i, 1).toString());
           tlabel3.setText(model.getValueAt(i, 2).toString());
           tlabel4.setSelectedItem(model.getValueAt(i, 3).toString());           
       }
       
       });
       arabacountlines();
       ArabaveriKaydet(0);
       ArabakayitsildosyaOku();
        
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);
       frame.setVisible(true);
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btn2){
            frame.dispose();
            AdminMenu adminMenu=new AdminMenu();
        }
       else if(e.getSource()==btn3){
           ArabakayitsildosyaOku();
           arabakayitsilcountlines();
           arabakayitsilveriEkle(tlabel1.getText(), tlabel2.getText(), tlabel3.getText(), (String) tlabel4.getSelectedItem(), 0);
           if(table1.getSelectedRowCount()==1){
               model.removeRow(table1.getSelectedRow());
               
           }
           else{
              if(table1.getSelectedRowCount()==0){
                  JOptionPane.showMessageDialog(null,"Herhangi bir araç kaydi yok");
              } 
              else{
                  JOptionPane.showMessageDialog(null,"Birden fazla arac sectiniz lutfen tek bir arac seciniz.");
              }
           }
       }
    }
  
}
