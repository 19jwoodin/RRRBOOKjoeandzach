import java.util.*;
import cs1.*;
public class Main
{
    public static void main(String[] args)
    {
        RamBook r = new RamBook();
        //r.printAllUsers();
        System.out.print("Are you new to RamBook? ");
        String anser =Keyboard.readString();
        while(!(anser.equals("yes")||anser.equals("no")))
        {
            System.out.print("I'm sorry, Are you new to Rambook? ");
            anser =Keyboard.readString();
        }
        if(anser.equals("yes"))
        {
            System.out.print("\fWhat is your name? ");
            String name = Keyboard.readString();
            System.out.println("Nice to meet you, "+name);
            System.out.print("How old are you? ");
            int age= Keyboard.readInt();
            System.out.print("Where are you from? ");
            String hometown= Keyboard.readString();
            System.out.print("What high school did you go to?(say none for no high school) ");
            String hs = Keyboard.readString();
            String[] schools = new String[]{null,null,null};
            if(!(hs.equals("none")))
            {
                System.out.print("What undergrad school did you go to?(say none for no school) ");
                String underg =Keyboard.readString();
                if(underg.equals("none"))
                {
                    schools[0]=hs;
                }
                else
                {
                    System.out.print("What grad school did you go to?(say none for no school) ");
                    String grad =Keyboard.readString();
                    if(grad.equals("none"))
                    {
                        schools[0]=hs;
                        schools[1]=underg;
                    }
                    else
                    {
                        schools[0]=hs;
                        schools[1]=underg;
                        schools[2] =grad;
                    }
                }
            }
            User user1=new User(name,age,hometown,schools);
            System.out.print("\f"+user1.toString());
        }
        else
        {
            
        }
        
    }
}