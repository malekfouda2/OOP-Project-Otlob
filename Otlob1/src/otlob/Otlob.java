package otlob;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.exit;
import java.util.Scanner;
import java.util.Set;

public class Otlob implements Serializable {

    public static void main(String[] args) {
      /*  Scanner s = new Scanner(System.in);
        Admin myAdmin = new Admin();
        User myUser = new User();
        Restaurant myRest = new Restaurant();

        System.out.println("1 To Login as Admin ");
        System.out.println("2 To Login as User ");
        System.out.println("3 To Register ");
        System.out.println("0 To Exit Application");
        int choice = s.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter username : ");
                String username = s.next();
                myAdmin.setUsername(username);
                System.out.println("Enter password : ");
                String password = s.next();
                myAdmin.setPassword(password);
                myAdmin.LoginAsAdminHash(myAdmin.getUsername(), myAdmin.getPassword());
                if (myAdmin.LoginAsAdminHash(myAdmin.getUsername(), myAdmin.getPassword())) {
                    System.out.println("1 To Add Restaurant");
                    //System.out.println("2 To Remove Restaurant");
                    System.out.println("3 To Add another Admin");
                    System.out.println("4 To Add Menu");
                    System.out.println("0 To Exit Application");
                    int choice1 = s.nextInt();
                    switch (choice1) {
                        case 1: {
                            System.out.println("Enter the Restaurant name : ");
                            String restName = s.next();
                            myRest.setName(restName);
                            System.out.println("Enter the Price Range : ");
                            String priceRange = s.next();
                            myRest.setPriceRange(priceRange);
                            System.out.println("Enter the category : ");
                            String category = s.next();
                            myRest.setCategory(category);
                            System.out.println("Enter the id : " + "Hint:" + "(" + (FileManager.restaurants.size() + 1) + ")");
                            int id = s.nextInt();
                            myRest.setId(id);
                            myAdmin.addRest(myRest);
                            break;
                        }
                        case 2:
                            //System.out.println("Enter the id of the Restaurant to be removed : ");
                            //int idR = s.nextInt();
                            //myAdmin.removeRest(idR);
                            break;
                        case 3: {
                            Admin adminToAdd = new Admin();
                            System.out.println("Enter The Admin's name : ");
                            String name = s.next();
                            adminToAdd.setFullname(name);
                            System.out.println("Enter The Id : ");
                            int id = s.nextInt();
                            adminToAdd.setId(id);
                            System.out.println("Enter The Age : ");
                            int age = s.nextInt();
                            adminToAdd.setAge(age);
                            System.out.println("Enter The Gender(M/F) : ");
                            char gender = s.next().charAt(0);
                            adminToAdd.setGender(gender);
                            System.out.println("Enter The Phone : ");
                            String phone = s.next();
                            adminToAdd.setPhone(phone);
                            System.out.println("Enter The Username : ");
                            String username1 = s.next();
                            adminToAdd.setUsername(username1);
                            System.out.println("Enter The Password : ");
                            String password1 = s.next();
                            adminToAdd.setPassword(password1);
                            myAdmin.RegisterAsAdminHash(adminToAdd);
                            break;
                        }
                        case 0:
                            exit(0);
                        default:
                            break;
                    }

                }
                break;
            }
            case 2: {
                System.out.println("Enter username : ");
                String username = s.next();
                myUser.setUsername(username);
                System.out.println("Enter password : ");
                String password = s.next();
                myUser.setPassword(password);
                myUser.LoginAsUserHash(myUser.getUsername(), myUser.getPassword());
                break;
            }
            case 3: {
                System.out.println("Enter your name : ");
                String fullName = s.next();
                myUser.setFullname(fullName);
                System.out.println("Enter your Email : ");
                String email = s.next();
                myUser.setEmail(email);
                System.out.println("Enter your Address : ");
                String address = s.next();
                myUser.setAddress(address);
                System.out.println("Enter your PhoneNumber : ");
                String phone = s.next();
                myUser.setPhone(phone);
                System.out.println("Enter your Username : ");
                String username = s.next();
                myUser.setUsername(username);
                System.out.println("Enter your Password : ");
                String password = s.next();
                myUser.setPassword(password);
                System.out.println("Enter your Gender(M/F) : ");
                char gender = s.next().charAt(0);
                myUser.setGender(gender);
                System.out.println("Enter your Age : ");
                int age = s.nextInt();
                myUser.setAge(age);
                myUser.RegisterAsUserHash(myUser);
                break;
            }
            case 0:
                exit(0);
            default:
                break;
        }*/
       
        otlobGUI m=new otlobGUI();
    }

}
