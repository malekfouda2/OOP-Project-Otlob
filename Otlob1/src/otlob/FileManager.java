package otlob;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class FileManager {

    public static HashMap<String, Admin> myAdminsData = new HashMap< String, Admin>();
    public static HashMap<String, User> myUsersData = new HashMap< String, User>();
    public static ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    public static ArrayList<Items>items=new ArrayList<Items>();
    public static ArrayList<Menu>menu=new ArrayList<Menu>();
    public static boolean loadAdminsData() {

        ObjectInputStream Bin;
        try {
            Bin = new ObjectInputStream(new FileInputStream("D:\\test\\AdminsHashMap.bin"));
            myAdminsData = (HashMap<String, Admin>) Bin.readObject();

            Bin.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public static boolean saveAdminsData() {
        ObjectOutputStream Bout;
        try {
            Bout = new ObjectOutputStream(new FileOutputStream("D:\\test\\AdminsHashMap.bin"));
            Bout.writeObject(myAdminsData);
            Bout.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

    public static boolean loadUsersData() {

        ObjectInputStream Bin;
        try {
            Bin = new ObjectInputStream(new FileInputStream("D:\\test\\UsersHashMap.bin"));
            myUsersData = (HashMap<String, User>) Bin.readObject();

            Bin.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public static boolean saveUsersData() {
        ObjectOutputStream Bout;
        try {
            Bout = new ObjectOutputStream(new FileOutputStream("D:\\test\\UsersHashMap.bin"));
            Bout.writeObject(myUsersData);
            Bout.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

    public static boolean saveRestaurantsData() {
        ObjectOutputStream Bout;
        try {
                    Bout = new ObjectOutputStream(new FileOutputStream("D:\\test\\RestaurantsArrayList.bin",true));
            
            Bout.writeObject(restaurants);
            Bout.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

    public static boolean loadRestaurantsData() {

        ObjectInputStream Bin;
        try {
            Bin = new ObjectInputStream(new FileInputStream("D:\\test\\RestaurantsArrayList.bin"));
            restaurants = (ArrayList<Restaurant>) Bin.readObject();
            System.out.println(restaurants.size());

            Bin.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }
    //function gdeda!
    public static boolean saveItemsData()
    {
        ObjectOutputStream bout;
        try{
        bout = new ObjectOutputStream(new FileOutputStream("D:\\test\\ItemsArrayList.bin"));
        bout.writeObject(items);
        bout.close();
        return true;
        }
       catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }
    //function gdeda!
    public static boolean loadItemsData()
    {
        ObjectInputStream bin;
        try
        {
            bin=new ObjectInputStream(new FileInputStream("D:\\test\\ItemsArrayList.bin"));
            System.out.println(items.size());
            bin.close();
            return true;
            
        }
        catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }
    public static boolean saveMenuData()
    {
        ObjectInputStream bin;
        try
        {
            bin=new ObjectInputStream(new FileInputStream("D:\\test\\menuArrayList.bin"));
            System.out.println(menu.size());
            bin.close();
            return true;
        }
        catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }
    public static boolean loadMenuData()
    {
        ObjectInputStream bin;
        try
        {
            bin=new ObjectInputStream(new FileInputStream("D:\\test\\MenuArrayList.bin"));
            System.out.println(items.size());
            bin.close();
            return true;
            
        }
        catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

}
