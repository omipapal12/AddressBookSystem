import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    public class AddressBook  {
        public static <Contact> void main(String[] args) {
            ArrayList<Contact> con=new ArrayList<Contact>();
            System.out.println("Welcome to AddressBook Program");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter first Name:");
            String firstName=sc.next();
            System.out.println("Enter Last Name:");
            String lastName=sc.next();

            System.out.println("Enter Address:");
            String address=sc.next();

            System.out.println("Enter City:");
            String city=sc.next();

            System.out.println("Enter State:");
            String state=sc.next();

            System.out.println("Enter Email:");
            String email=sc.next();


            System.out.println("Enter Mobile Number:");
            String phoneNumber=sc.next();


            Contact obj=new Contact(firstName,lastName,address,city,state,email,phoneNumber);
            con.add(obj);
            Iterator<Contact> itr=con.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next().toString());
            }
        }

    }
