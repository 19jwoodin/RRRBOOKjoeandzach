import java.util.*;
import cs1.*;
public class Main
{
    public static void main(String[] args)
    {
        RamBook r = new RamBook();
        //r.printAllUsers();
        try{Thread.sleep(1000);}
        catch(InterruptedException ie){}
        System.out.print("W");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("E");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("L");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("C");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("O");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("M");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("E");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print(" T");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("O");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print(" R");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("A");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("M");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("B");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("O");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("O");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("K");
        try{Thread.sleep(1000);}
        catch(InterruptedException ie){}

        int startVal=0;
        while(startVal==0)
        {
            System.out.print("\fDo you have a RamBook account? ");
            String anser =Keyboard.readString();
            anser=anser.toLowerCase();
            while(!(anser.equals("yes")||anser.equals("no")))
            {
                System.out.print("Sorry, Do you have a Rambook account? ");
                anser =Keyboard.readString();
            }
            if(anser.equals("no")) //create ac
            {
                System.out.print("\fType in a username: ");
                String un=Keyboard.readString();
                while(r.getUser2(un)!=null)
                {
                    System.out.println("Sorry, this username already exists.");
                    System.out.print("Type in a username: ");
                    un=Keyboard.readString();
                }
                System.out.print("Type in a password: ");
                String pass=Keyboard.readString();
                /*while(r.getUserPass(pass)!=null)
                {
                System.out.println("Sorry, this pasword already exists.");
                System.out.print("Type in a password: ");
                pass=Keyboard.readString();
                }*/
                System.out.print("What is your name? ");
                String name = Keyboard.readString();
                System.out.println("Nice to meet you, "+name);
                System.out.print("\nHow old are you? ");
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
                User user1=new User(name,age,hometown,schools,un,pass);
                r.allUsers.add(user1);
                int userVal=0;
                while(userVal==0)
                {
                    System.out.print("\f"+homePage(user1));
                    int val=Keyboard.readInt();
                    if(!(user1.getFriendsList().size()>0)) //if no friends:/
                    {
                        if(val==0)
                        {
                            userVal=1;
                        }
                        else if(val==1)
                        {
                            System.out.print("\f"+user1.toString());
                            System.out.print("\n\n\n1. Exit ");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.print("\f"+user1.toString());
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else if(val==2) //addfriends
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
                                int yourname=0;
                                if(userName.equals(user1.getName()))
                                {
                                    yourname=1;
                                }
                                if(r.getUser(userName)==null||validfriend==true||yourname==1)
                                {
                                    if(yourname==0)
                                        System.out.println("Sorry, this user does not exist or is already a friend");
                                    else
                                        System.out.println("You can't friend yourself!");
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
                                            System.out.println("Sorry, please try again: ");

                                        }
                                    }
                                }
                                else
                                {
                                    user1.addFriend(r.getUser(userName));
                                    int while1=0;
                                    
                                }
                            }
                        }
                    }
                    else //if has freiends
                    {
                        if(val==0)
                        {
                            userVal=1;
                        }
                        else if(val==1)
                        {
                            System.out.print("\f"+user1.toString());
                            System.out.print("\n\n\n1. Exit");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.print("\f"+user1.toString());
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else if(val==2) //add frined
                        {
                            int addUser =0;
                            while(addUser==0)
                            {
                                System.out.print("\fSuggested Friend: ");
                                System.out.println(""+user1.suggestAFriend().getName());
                                System.out.print("Who would you like to add? ");
                                String userName=Keyboard.readString();
                                boolean validfriend=false;
                                for(int i=0;i<user1.countFriends();i++)
                                {
                                    if(user1.getFriendsList().get(i).getName().equals(userName))
                                    {
                                        validfriend=true;
                                    }
                                }
                                int yourname=0;
                                if(userName.equals(user1.getName()))
                                {
                                    yourname=1;
                                }
                                if(r.getUser(userName)==null||validfriend==true||yourname==1)
                                {
                                    if(yourname==0)
                                        System.out.println("Sorry, this user does not exist or is already a friend");
                                    else
                                        System.out.println("You can't friend yourself!");
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
                                            System.out.println("Sorry, please try again: ");

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
                                            System.out.println("Sorry, please try again: ");

                                        }
                                    }
                                }
                            }
                        }
                        else if(val==3) //remove friend
                        {
                            int remfri=0;
                            while(remfri==0)
                            {
                                System.out.print("\fWho would you like to remove? ");
                                String remfr = Keyboard.readString();
                                boolean validfriend=false;
                                for(int i=0;i<user1.countFriends();i++)
                                {
                                    if(user1.getFriendsList().get(i).getName().equals(remfr))
                                    {
                                        validfriend=true;
                                    }
                                }
                                if(r.getUser(remfr)==null || validfriend==false)
                                {
                                    System.out.println("Sorry, this user does not exist or is already a friend");
                                    int while3 =0;
                                    while(while3==0)
                                    {
                                        System.out.print("Would you like to try another name? ");
                                        String ans3 = Keyboard.readString();
                                        if(ans3.equals("yes"))
                                        {
                                            while3=3;
                                        }
                                        else if(ans3.equals("no"))
                                        {
                                            while3=3;
                                            remfri=1;
                                        }
                                        else
                                        {
                                            System.out.println("Sorry, please try again");
                                        }
                                    }
                                }
                                else
                                {
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
                        }
                        else if(val==4)
                        {
                            int mutfr=0;
                            while(mutfr==0)
                            {
                                System.out.print("\fInput a friend to find mutual friends with: ");
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
                                    System.out.println("Sorry, this user does not exist or is already a friend");
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
                                        System.out.println("Sorry, Please try again ");
                                    }
                                }
                            }
                        }
                        else if(val==5)
                        {
                            ArrayList<User> htf=user1.getHometownFriends();
                            int num=1;
                            System.out.print("\f");
                            if(htf.size()>0)
                            {
                                System.out.println("Your Hometown Friends: \n");
                                for(User f:htf)
                                {
                                    System.out.println(num+". "+f.getName());
                                    num++;
                                }

                                System.out.print("\n\n1. Exit ");
                            }
                            else
                            {
                                System.out.println("You have no schoolmates");
                                System.out.print("\n\n1. Exit ");
                            }
                            int ext = Keyboard.readInt();
                            while(ext!=1)
                            {
                                num=1;
                                System.out.print("\f");
                                if(htf.size()>0)
                                {
                                    System.out.println("Your Hometown Friends: \n");
                                    for(User f:htf)
                                    {
                                        System.out.println(num+". "+f.getName());
                                        num++;
                                    }

                                    System.out.print("\n\n1. Exit ");
                                }
                                else
                                {
                                    System.out.println("You have no schoolmates");
                                    System.out.print("\n\n1. Exit ");
                                }
                                ext=Keyboard.readInt();
                            }
                        }
                        else if(val==6)
                        {
                            ArrayList<User> gsm=user1.getSchoolmates();
                            int num=1;
                            System.out.print("\f");
                            if(gsm.size()>0)
                            {
                                System.out.println("Your Schoolmates: \n");
                                for(User f:gsm)
                                {
                                    System.out.println(num+". "+f.getName());
                                    num++;
                                }

                                System.out.print("\n\n1. Exit ");
                            }
                            else
                            {
                                System.out.println("You have no schoolmates");
                                System.out.print("\n\n1. Exit ");
                            }
                            int ext = Keyboard.readInt();
                            while(ext!=1)
                            {
                                num=1;
                                System.out.print("\f");
                                if(gsm.size()>0)
                                {
                                    System.out.println("Your Schoolmates: \n");
                                    for(User f:gsm)
                                    {
                                        System.out.println(num+". "+f.getName());
                                        num++;
                                    }

                                    System.out.print("\n\n1. Exit ");
                                }
                                else
                                {
                                    System.out.println("You have no schoolmates");
                                    System.out.print("\n\n1. Exit ");
                                }
                                ext=Keyboard.readInt();
                            }
                        }
                    }
                }
            }
            else //existing asccount
            {
                System.out.print("\fUsername: ");
                String usern=Keyboard.readString();
                User u;
                while(r.getUser2(usern)==null)
                {
                    System.out.println("This username does not exist. ");
                    System.out.print("Username: ");
                    usern=Keyboard.readString();
                }
                if(!usern.equals(" "))
                {
                    System.out.print("\nPassword: ");
                    String passw=Keyboard.readString();
                    while(!r.getUser2(usern).getPass().equals(passw))
                    {
                        System.out.println("Wrong Password ");
                        System.out.print("Password: ");
                        passw=Keyboard.readString();
                    }
                }
                if(usern.equals(" "))
                {
                    System.out.print("\fWhat is your Rambook name? ");
                    String name = Keyboard.readString();
                    boolean isAUser=false;
                    for(int i=0; i<r.allUsers.size();i++)
                    {
                        if(r.allUsers.get(i).getName().equals(name))
                        {
                            isAUser=true;
                        }
                    }
                    while(isAUser==false)
                    {
                        System.out.println("Sorry, this user does not exist");
                        System.out.print("What is your Rambook name? ");
                        name = Keyboard.readString();
                        isAUser=false;
                        for(int i=0; i<r.allUsers.size();i++)
                        {
                            if(r.allUsers.get(i).getName().equals(name))
                            {
                                isAUser=true;
                            }
                        }
                    }
                    u = r.getUser(name);
                }
                else
                {
                    u =r.getUser2(usern);
                }
                int userVal=0;
                while(userVal==0)
                {
                    System.out.print("\f"+homePage(u));
                    int val=Keyboard.readInt();
                    if(u.countFriends()>0)//if has friends
                    {
                        if(val==0)
                        {
                            userVal=1;
                        }
                        else if(val==1)
                        {
                            System.out.print("\f"+u.toString());
                            System.out.print("\n\n\n1. Exit");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.print("\f"+u.toString());
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else if(val==2) //add for existing 
                        {
                            int addUser =0;
                            while(addUser==0)
                            {
                                System.out.print("\fSuggested Friend: ");
                                System.out.println(""+u.suggestAFriend().getName());
                                System.out.print("Who would you like to add? ");
                                String userName=Keyboard.readString();
                                boolean validfriend=false;
                                for(int i=0;i<u.countFriends();i++)
                                {
                                    if(u.getFriendsList().get(i).getName().equals(userName))
                                    {
                                        validfriend=true;
                                    }
                                }
                                int yourname=0;
                                if(userName.equals(u.getName()))
                                {
                                    yourname=1;
                                }
                                if(r.getUser(userName)==null||validfriend==true||yourname==1)
                                {
                                    if(yourname==0)
                                        System.out.println("Sorry, this user does not exist or is already a friend");
                                    else
                                        System.out.println("You can't friend yourself!");
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
                                            System.out.println("Sorry, please try again: ");

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
                                            System.out.println("Sorry, please try again: ");

                                        }
                                    }
                                }
                            }
                        }
                        else if(val==3) //remove for existing 
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
                                if(r.getUser(remfr)==null || validfriend==false)
                                {
                                    System.out.println("Sorry, this user does not exist or is already a friend");
                                    int while3 =0;
                                    while(while3==0)
                                    {
                                        System.out.print("Would you like to try another name? ");
                                        String ans3 = Keyboard.readString();
                                        if(ans3.equals("yes"))
                                        {
                                            while3=3;
                                        }
                                        else if(ans3.equals("no"))
                                        {
                                            while3=3;
                                            remfri=1;
                                        }
                                        else
                                        {
                                            System.out.println("Sorry, please try again");
                                        }
                                    }
                                }
                                else
                                {
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
                        }
                        else if(val==4) //MutualFriends for existing acc
                        {
                            int mutfr=0;
                            while(mutfr==0)
                            {
                                System.out.print("\fInput a friend to find mutual friends with: ");
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
                                    System.out.println("Sorry, this user does not exist or is already a friend");
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
                                        System.out.println("Sorry, Please try again ");
                                    }
                                }
                            }
                        }
                        else if(val==5) //Hometown existing
                        {
                            ArrayList<User> htf=u.getHometownFriends();
                            int num=1;
                            System.out.print("\f");
                            if(htf.size()>0)
                            {
                                System.out.println("Your Hometown Friends: \n");
                                for(User f:htf)
                                {
                                    System.out.println(num+". "+f.getName());
                                    num++;
                                }

                                System.out.print("\n\n1. Exit ");
                            }
                            else
                            {
                                System.out.println("You have no schoolmates");
                                System.out.print("\n\n1. Exit ");
                            }
                            int ext = Keyboard.readInt();
                            while(ext!=1)
                            {
                                num=1;
                                System.out.print("\f");
                                if(htf.size()>0)
                                {
                                    System.out.println("Your Hometown Friends: \n");
                                    for(User f:htf)
                                    {
                                        System.out.println(num+". "+f.getName());
                                        num++;
                                    }

                                    System.out.print("\n\n1. Exit ");
                                }
                                else
                                {
                                    System.out.println("You have no schoolmates");
                                    System.out.print("\n\n1. Exit ");
                                }
                                ext=Keyboard.readInt();
                            }
                        }
                        else if(val==6)//School mates existing
                        {
                            ArrayList<User> gsm=u.getSchoolmates();
                            int num=1;
                            System.out.print("\f");

                            if(gsm.size()>0)
                            {
                                System.out.println("Your Schoolmates: \n");
                                for(User f:gsm)
                                {
                                    System.out.println(num+". "+f.getName());
                                    num++;
                                }

                                System.out.print("\n\n1. Exit ");
                            }
                            else
                            {
                                System.out.println("You have no schoolmates");
                                System.out.print("\n\n1. Exit ");
                            }
                            int ext = Keyboard.readInt();
                            while(ext!=1)
                            {
                                num=1;
                                System.out.print("\f");
                                if(gsm.size()>0)
                                {
                                    System.out.println("Your Schoolmates: \n");
                                    for(User f:gsm)
                                    {
                                        System.out.println(num+". "+f.getName());
                                        num++;
                                    }

                                    System.out.print("\n\n1. Exit ");
                                }
                                else
                                {
                                    System.out.println("You have no schoolmates");
                                    System.out.print("\n\n1. Exit ");
                                }
                                ext=Keyboard.readInt();
                            }
                        }
                    }
                    else
                    {
                        if(val==0)
                        {
                            userVal=1;
                        }
                        else if(val==1)
                        {
                            System.out.print("\f"+u.toString());
                            System.out.print("\n\n\n1. Exit ");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.print("\f"+u.toString());
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else if(val==2) //addfriends
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
                                int yourname=0;
                                if(userName.equals(u.getName()))
                                {
                                    yourname=1;
                                }
                                if(r.getUser(userName)==null||validfriend==true||yourname==1)
                                {
                                    if(yourname==0)
                                        System.out.println("Sorry, this user does not exist or is already a friend");
                                    else
                                        System.out.println("You can't friend yourself!");
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
                                            System.out.println("Sorry, please try again: ");

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
                                            System.out.println("Sorry, please try again: ");

                                        }
                                    }
                                }
                            }
                        }
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
            ret+="\n\n0-Sign Out";
        }
        else
        {
            ret+="1. View My Page";
            ret+="\n2. Add a friend";
            ret+="\n\n0-Sign Out";
        }
        return ret;
    }
}

