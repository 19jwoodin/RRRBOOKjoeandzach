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
                    if(!(user1.getFriendsList().size()>0))
                    {
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
                                boolean validfriend=false;
                                for(int i=0;i<user1.countFriends();i++)
                                {
                                    if(user1.getFriendsList().get(i).getName().equals(userName))
                                    {
                                        validfriend=true;
                                    }
                                }
                                if(r.getUser(userName)==null||validfriend==true)
                                {
                                    System.out.println("Sorry this user does not exist or is already a friend");
                                    int while1=0;
                                    while(while1==0)
                                    {
                                        System.out.print("Would you like to try another name? ");

                                        String ans=Keyboard.readString();
                                        if(ans.equals("no"))
                                        {
                                            addUser=1;
                                            while1=1;
                                        }
                                        else if(ans.equals("yes"))
                                        {
                                            addUser=0;
                                            while1=1;
                                        }
                                        else
                                        {
                                            System.out.println("I'm Sorry, please try again: ");

                                        }
                                    }
                                }
                                else
                                {
                                    user1.addFriend(r.getUser(userName));
                                    int while1=0;
                                    while(while1==0)
                                    {
                                        System.out.print("Would you like to try another name? ");

                                        String ans=Keyboard.readString();
                                        if(ans.equals("no"))
                                        {
                                            addUser=1;
                                            while1=1;
                                        }
                                        else if(ans.equals("yes"))
                                        {
                                            addUser=0;
                                            while1=1;
                                        }
                                        else
                                        {
                                            System.out.println("I'm Sorry, please try again: ");

                                        }
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
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
                                boolean validfriend=false;
                                for(int i=0;i<user1.countFriends();i++)
                                {
                                    if(user1.getFriendsList().get(i).getName().equals(userName))
                                    {
                                        validfriend=true;
                                    }
                                }
                                if(r.getUser(userName)==null||validfriend==true)
                                {
                                    System.out.println("Sorry this user does not exist or is already a friend");
                                    int while1=0;
                                    while(while1==0)
                                    {
                                        System.out.print("Would you like to try another name? ");

                                        String ans=Keyboard.readString();
                                        if(ans.equals("no"))
                                        {
                                            addUser=1;
                                            while1=1;
                                        }
                                        else if(ans.equals("yes"))
                                        {
                                            addUser=0;
                                            while1=1;
                                        }
                                        else
                                        {
                                            System.out.println("I'm Sorry, please try again: ");

                                        }
                                    }
                                }
                                else
                                {
                                    user1.addFriend(r.getUser(userName));
                                    int while1=0;
                                    while(while1==0)
                                    {
                                        System.out.print("Would you like to try another name? ");

                                        String ans=Keyboard.readString();
                                        if(ans.equals("no"))
                                        {
                                            addUser=1;
                                            while1=1;
                                        }
                                        else if(ans.equals("yes"))
                                        {
                                            addUser=0;
                                            while1=1;
                                        }
                                        else
                                        {
                                            System.out.println("I'm Sorry, please try again: ");

                                        }
                                    }
                                }
                            }
                        }
                        else if(val==3)
                        {
                            int remfri=0;
                            while(remfri==0)
                            {
                                System.out.print("Who would you like to remove? ");
                                String remfr = Keyboard.readString();
                                while(r.getUser(remfr)==null)
                                {
                                    System.out.println("Sorry, please try again ");
                                    System.out.print("Who would you like to remove? ");
                                    remfr = Keyboard.readString();
                                }
                                user1.unfriend(remfr);
                                System.out.print("Would you like to remove anyone else? ");
                                String remfra =Keyboard.readString();
                                while(!(remfra.equals("yes")||remfra.equals("no")))
                                {
                                    System.out.println("Sorry, please try again ");
                                    System.out.print("Would you like to remove anyone else? ");
                                    remfra = Keyboard.readString();
                                }
                                if(remfra.equals("no"))
                                {
                                    remfri=1;
                                }
                            }
                        }
                        else if(val==4)
                        {
                            System.out.print("Imput a friend to find mutual friends with: ");
                            String mutuser=Keyboard.readString();
                            boolean validfriend=false;
                            for(int i=0;i<user1.countFriends();i++)
                            {
                                if(user1.getFriendsList().get(i).getName().equals(mutuser))
                                {
                                    validfriend=true;
                                }
                            }
                            if(validfriend==true)
                            {
                                ArrayList<User> mutusers=user1.getMutualFriends(r.getUser(mutuser));
                                int x=1;
                                for(User s: mutusers)
                                {
                                    System.out.println(x+" "+s.getName());
                                    x++;
                                }
                            }
                            System.out.print("Would you like to find another mutual friend? ");
                            String ans=Keyboard.readString();

                        }
                        else if(val==5)
                        {

                        }
                        else if(val==6)
                        {

                        }
                    }

                }
            }
            else
            {
                System.out.print("\fWhat is your Rambook name? ");
                String name = Keyboard.readString();

                User u = r.getUser(name);
                int userVal=0;
                while(userVal==0)
                {
                    System.out.print("\f"+homePage(u));
                    int val=Keyboard.readInt();
                    if(val==1)
                    {
                        System.out.print("\f"+u.toString());
                        System.out.print("\n\n\n1. Exit \t2. Sign Out");
                        int ans2=Keyboard.readInt();
                        if(ans2==1)
                        {
                            System.out.print("\f"+homePage(u));
                        }
                    }
                    else if(val==2)
                    {
                        int addUser =0;
                        while(addUser==0)
                        {
                            System.out.print("\fWho would you like to add? ");
                            String userName=Keyboard.readString();
                            boolean validfriend=false;
                            for(int i=0;i<u.countFriends();i++)
                            {
                                if(u.getFriendsList().get(i).getName().equals(userName))
                                {
                                    validfriend=true;
                                }
                            }
                            if(r.getUser(userName)==null||validfriend==true)
                            {
                                System.out.println("Sorry this user does not exist or is already a friend");
                                int while1=0;
                                while(while1==0)
                                {
                                    System.out.print("Would you like to try another name? ");

                                    String ans=Keyboard.readString();
                                    if(ans.equals("no"))
                                    {
                                        addUser=1;
                                        while1=1;
                                    }
                                    else if(ans.equals("yes"))
                                    {
                                        addUser=0;
                                        while1=1;
                                    }
                                    else
                                    {
                                        System.out.println("I'm Sorry, please try again: ");

                                    }
                                }
                            }
                            else
                            {
                                u.addFriend(r.getUser(userName));
                                int while1=0;
                                while(while1==0)
                                {
                                    System.out.print("Would you like to try another name? ");

                                    String ans=Keyboard.readString();
                                    if(ans.equals("no"))
                                    {
                                        addUser=1;
                                        while1=1;
                                    }
                                    else if(ans.equals("yes"))
                                    {
                                        addUser=0;
                                        while1=1;
                                    }
                                    else
                                    {
                                        System.out.println("I'm Sorry, please try again: ");

                                    }
                                }
                            }
                        }
                    }
                    else if(val==3)
                    {
                        int remfri=0;
                        while(remfri==0)
                        {
                            System.out.print("\fWho would you like to remove? ");
                            String remfr = Keyboard.readString();
                            boolean validfriend=false;
                            for(int i=0;i<u.countFriends();i++)
                            {
                                if(u.getFriendsList().get(i).getName().equals(remfr))
                                {
                                    validfriend=true;
                                }
                            }
                            while(r.getUser(remfr)==null || validfriend==false)
                            {
                                System.out.println("Sorry, please try again ");
                                System.out.print("Who would you like to remove? ");
                                remfr = Keyboard.readString();
                                for(int i=0;i<u.countFriends();i++)
                                {
                                    if(u.getFriendsList().get(i).getName()==remfr)
                                    {
                                        validfriend=true;
                                    }
                                }
                            }
                            u.unfriend(remfr);
                            System.out.print("Would you like to remove anyone else? ");
                            String remfra =Keyboard.readString();
                            while(!(remfra.equals("yes")||remfra.equals("no")))
                            {
                                System.out.println("Sorry, please try again ");
                                System.out.print("Would you like to remove anyone else? ");
                                remfra = Keyboard.readString();
                            }
                            if(remfra.equals("no"))
                            {
                                remfri=1;
                            }
                        }
                    }
                    else if(val==4)
                    {
                        int mutfr=0;
                        while(mutfr==0)
                        {
                        System.out.print("\fImput a friend to find mutual friends with: ");
                            String mutuser=Keyboard.readString();
                            boolean validfriend=false;
                            for(int i=0;i<u.countFriends();i++)
                            {
                                if(u.getFriendsList().get(i).getName().equals(mutuser))
                                {
                                    validfriend=true;
                                }
                            }
                            if(validfriend==true)
                            {
                                ArrayList<User> mutusers=u.getMutualFriends(r.getUser(mutuser));
                                int x=1;
                                if(mutusers.size()>0)
                                {
                                for(User s: mutusers)
                                {
                                    System.out.println(x+" "+s.getName());
                                    x++;
                                }
                            }
                            else
                            {
                                System.out.println("You and "+r.getUser(mutuser).getName()+" have no mutual friends.");
                            }
                            }
                            else
                            {
                                System.out.println("Sorry this user does not exist or is already a friend");
                            }
                            int while2=0;
                            while(while2==0)
                            {
                            System.out.print("Would you like to try to find another mutual friend? ");
                            String ans=Keyboard.readString();
                            if(ans.equals("yes"))
                            {
                                mutfr=0;
                                while2=2;
                            }
                            else if(ans.equals("no"))
                            {
                                mutfr=1;
                                while2=2;
                                }
                                else
                                {
                                    System.out.println("I'm sorry, Please try again ");
                                }
                            }
                        }
                    }
                    else if(val==5)
                    {

                    }
                    else if(val==6)
                    {

                    }
                }
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
        }
        return ret;
    }
}


