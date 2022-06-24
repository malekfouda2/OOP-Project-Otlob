package otlob;
import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import static otlob.FileManager.restaurants;
public class editRestaurants extends JFrame implements Serializable {
private JList list;
private JTable table;
private JLabel label;
private Container c;
private JButton addItem;
public editRestaurants()
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
        Restaurant r=new Restaurant();
        setTitle("OTLOB");
        setBounds(300, 90, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);
        //list=new JList(restaurants.toArray());
       // list.setLocation(310,310);
        //list.setSize(400,20);
        label=new JLabel("Edit a Restaurant");
        label.setSize(200,20);
        label.setLocation(300,10);
        label.setForeground(Color.white);
        addItem=new JButton("Add Item");
        addItem.setSize(100,20);
        addItem.setLocation(30,30);
        addItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                new addItemsGUI();
            }
        });
        //c.add(list);
        c.add(label);
        c.add(addItem);
        setVisible(true);
}


}
