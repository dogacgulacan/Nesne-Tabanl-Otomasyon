package arackiralama;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class adminarabageri extends Dosyaislemleri implements ActionListener{
    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private final JTable table1;
    private JButton btn2;
    static DefaultTableModel model;
    
    public adminarabageri(){
        frame=new JFrame();
        frame.setTitle("Arac Kiralama Uygulamasi");
        frame.setSize(500, 600);
        
        panel1=new JPanel();
        panel1.setSize(500, 450);
        panel1.setLocation(0, 0);
        frame.add(panel1);
        
        panel2=new JPanel();
        panel2.setSize(500, 70);
        panel2.setLocation(0, 450);
        panel2.setLayout(null);
        frame.add(panel2);
        
       btn2=new JButton("Geri");
       btn2.setSize(80, 33);
       btn2.setLocation(200, 30);
       btn2.setFont(new Font ("TAHOMA BOLD",1,14));
       btn2.addActionListener(this);
       panel2.add(btn2);
        
        
       String[] columnNames = { "MusteriId", "ArabaId", "DonusTarihi","GecikenGun","ParaCezasi" };
        table1 = new JTable();
        table1.setSize(200, 300);
        table1.setLocation(30, 40);
        model = new DefaultTableModel() {

    @Override
    public boolean isCellEditable(int row, int column) {
       return false;
    }
};
                model.setColumnIdentifiers(columnNames);
                table1.setModel(model);
		JScrollPane sp = new JScrollPane(table1);
		panel1.add(sp);
                
                dosyaOlustur();
                iadedosyaOku();
                iadecountlines();
                iadeveriKaydet();
                
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
    }
}
