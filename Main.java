import java.util.*;
import cs1.*;
public class Main
{
    public static void main(String[] args)
    {
        RamBook r = new RamBook();
        //r.printAllUsers();
        int startVal=0;
        while(startVal==0)
        {
            System.out.print("Are you new to RamBook? ");
            String anser =Keyboard.readString();
            anser=anser.toLowerCase();
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
                int userVal=0;
                while(userVal==0)
                {
                    System.out.print("\f"+homePage(user1));
                    int val=Keyboard.readInt();
                    if(val==1)
                    {
                        System.out.print("\f"+user1.toString());
                        System.out.print("\n\n\n1. Exit \t2. Sign Out");
                        int ans2=Keyboard.readInt();
                        if(ans2==1)
                        {
                            System.out.print("\f"+homePage(user1));
                        }
                    }
                    else if(val==2)
                    {
                        int addUser =0;
                        while(addUser==0)
                        {
                            System.out.print("\fWho would you like to add? ");
                            String userName=Keyboard.readString();
                            if(r.getUser(userName)==null)
                            {
                                System.out.println("Sorry this user does not exist");
                                System.out.print("Would you like to try another name? ");
                                String ans=Keyboard.readString();
                                while(!ans.equals("yes")||!ans.equals("no"))
                                {
                                    System.out.print("I'm Sorry, please try again: ");
                                    ans=Keyboard.readString();
                                }
                                if(!ans.equals("yes"))
                                {
                                    addUser=1;
                                }
                            }
                            else
                            {
                                user1.addFriend(r.getUser(userName));
                                System.out.print("Would you like to try another name? ");
                                String ans=Keyboard.readString();
                                while(!(ans.equals("yes")||ans.equals("no")))
                                {
                                    System.out.print("I'm Sorry, please try again: ");
                                    ans=Keyboard.readString();
                                }
                                if(!ans.equals("yes"))
                                {
                                    addUser=1;
                                }
                            }
                        }
                    }
                }
            }
            else
            {

            }

        }
    }

    public static String homePage(User r)
    {
        String ret ="";
        if(r.getFriendsList().size()>0)
        {
            ret+="1. View My Page";
            ret+="\n2. Add a friend";
            ret+="\n3. Remove a freind";
            ret+="\n4. Find Mutual Friends";
            ret+="\n5. Find Hometown Friends";
            ret+="\n6. Find School Mates";
        }
        else
        {
            ret+="1. View My Page";
            ret+="\n2. Add a friend";
            ret+="\n3. Find Mutual Friends";
        }
        return ret;
    }
}