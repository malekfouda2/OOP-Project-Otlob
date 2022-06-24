package otlob;
import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableCellRenderer;
import static otlob.FileManager.restaurants;
public class menuGUI extends JFrame implements Serializable{
private JLabel label;
private JList list;
private JTable table;
private JScrollPane scroll;
private Container c;
public menuGUI()
{
    super("window");
        this.setLocationRelativeTo(null);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("d:\\test\\otlobImage2.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.pack();
        setTitle("OTLOB");
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        label= new JLabel("Main Menu");
        label.setSize(200,20);
        label.setFont(new Font("Arial",Font.BOLD,28));
        label.setLocation(320,10);
        label.setForeground(Color.white);
        table=new JTable();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.setFont(table.getFont().deriveFont(20.0f));
        table.setRowHeight(30);
        table.setAutoCreateRowSorter(true);
        scroll=new JScrollPane(table);
        
        c.add(table);
        c.add(scroll);
        c.add(label);
        setVisible(true);
       /* FileManager f= new FileManager();
        
        list=new JList((ListModel) restaurants);
        list.setLocation(310,310);
        list.setSize(200,20);
        c.add(list);*/
        
}
}
