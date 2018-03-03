import java.util.*;
import cs1.*;
public class Main
{
    public static void main(String[] args)
    {
        RamBook r = new RamBook();
        //Prints out the Welcome
        //𝓦𝓮𝓵𝓬𝓸𝓶𝓶𝓶𝓮 𝓣𝓸 𝓡𝓪𝓶𝓑𝓸𝓸𝓴
        try{Thread.sleep(1000);}
        catch(InterruptedException ie){}
        System.out.print("𝓦");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓮");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓵");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓬");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓸");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓶");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓮");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print(" 𝓣");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓸");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print(" 𝓡");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓪");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓶");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓑");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓸");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓸");
        try{Thread.sleep(150);}
        catch(InterruptedException ie){}
        System.out.print("𝓴");
        try{Thread.sleep(1000);}
        catch(InterruptedException ie){}

        //Starts the rambook
        int startVal=0;
        while(startVal==0)
        {
            //IF you have an account
            System.out.print("\f▂ ▄ ▅ ▆ ▇ █ ωεℓcσмε тσ яαмвσσк █ ▇ ▆ ▅ ▄ ▂\n");

            System.out.println("\n➽1 Login");
            System.out.println("\n➽2 Create an account");
            System.out.println("\n➽3 Exit");
            System.out.println("\n\n➼Choose a valid option: ");
            int anser=Keyboard.readInt();
            while(anser!=1&&anser!=2&&anser!=3)
            {
                //System.out.println("\f***********Welcome to RamBook***********");
                System.out.print("\f▂ ▄ ▅ ▆ ▇ █ ωεℓcσмε тσ яαмвσσк █ ▇ ▆ ▅ ▄ ▂\n");
                System.out.println("\n➽1 Login");
                System.out.println("\n➽2 Create an account");
                System.out.println("\n➽3 Exit");
                System.out.println("\n\n➼Choose a valid option: ");
                anser=Keyboard.readInt();
            }
            User user1=new User();
            int rambook=1;
            if(anser==2) //create ac
            {
                System.out.println("\f***********Create An Account***********");
                System.out.print("What is your name? ");
                String name = Keyboard.readString();
                System.out.println("Nice to meet you, "+name);
                System.out.print("\nHow old are you? ");
                int age= Keyboard.readInt();
                while(age<0||age>200)
                {
                    System.out.println("Invalid answer(range: 0-200)");
                    System.out.print("How old are you? ");
                    age= Keyboard.readInt();
                }
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
                System.out.print("\nType in a username: ");
                String un=Keyboard.readString();
                while(r.getUser2(un)!=null)
                {
                    System.out.println("Sorry, this username already exists.");
                    System.out.print("Type in a username: ");
                    un=Keyboard.readString();
                }
                System.out.print("Type in a password: ");
                String pass=Keyboard.readString();

                user1=new User(name,age,hometown,schools,un,pass);
                r.allUsers.add(user1);
            }
            else if(anser==1) //existing asccount
            {
                System.out.println("\f***********Login***********");
                System.out.print("Username: ");
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
                user1 =r.getUser2(usern);

            }

            else if(anser==3)
            {
                startVal=1;
                System.out.print("\f◎[▪‿▪]◎ THANK YOU ◎[▪‿▪]◎");
                rambook=0;
            }
            if(rambook==1)
            {
                int userVal=0;
                while(userVal==0)
                {

                    System.out.print("\f"+homePage(user1));
                    int val=Keyboard.readInt();

                    if(val==7)
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
                            System.out.println("\f***********Add A Friend***********");
                            if(user1.suggestAFriend()!=null)
                            {
                                System.out.print("Suggested Friend: ");
                                System.out.println(""+user1.suggestAFriend().getName());
                            }
                            System.out.print(r.printAll(user1));
                            System.out.print("\n\nWho would you like to add?\nUsername: ");
                            String userName=Keyboard.readString();
                            boolean validfriend=false;
                            for(int i=0;i<user1.countFriends();i++)
                            {
                                if(user1.getFriendsList().get(i).getUserName().equals(userName))
                                {
                                    validfriend=true;
                                }
                            }
                            int yourname=0;
                            if(userName.equals(user1.getUserName()))
                            {
                                yourname=1;
                            }
                            if(r.getUser2(userName)==null||validfriend==true||yourname==1)
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
                                user1.addFriend(r.getUser2(userName));
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
                        
                        if(!(user1.getFriendsList().size()>0))
                        {
                            System.out.println("\f***********Remove A Friend***********");
                            System.out.print("Must add friends to remove a friend");
                            System.out.print("\n\n\n1. Exit ");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.println("\f***********Remove A Friend***********");
                                System.out.print("Must add friends to remove a friend");
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else
                        {
                            
                            int remfri=0;
                            while(remfri==0)
                            {
                                System.out.println("\f***********Remove A Friend***********");
                                System.out.print(user1.printFriends());
                                System.out.println("\nWho would you like to remove? ");
                                System.out.print("Username: ");
                                String remfr = Keyboard.readString();
                                boolean validfriend=false;
                                for(int i=0;i<user1.countFriends();i++)
                                {
                                    if(user1.getFriendsList().get(i).getUserName().equals(remfr))
                                    {
                                        validfriend=true;
                                    }
                                }
                                if(r.getUser2(remfr)==null || validfriend==false)
                                {
                                    System.out.println("Sorry, this user does not exist or is not a friend");
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
                                    user1.unfriend(r.getUser2(remfr).getName());
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
                    }
                    else if(val==4) //new user mutual friends
                    {
                        if(!(user1.getFriendsList().size()>0))
                        {
                            System.out.println("\f***********Find A Mutual Friend***********");
                            System.out.print("Must add friends to find mutual friends");
                            System.out.print("\n\n\n1. Exit ");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.println("\f***********Find A Mutual Friend***********");
                                System.out.print("\fMust add friends to find mutual friends");
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }

                        else
                        {
                            int mutfr=0;
                            while(mutfr==0)
                            {
                                System.out.println("\f***********Find A Mutual Friend***********");
                                System.out.print(user1.printFriends());
                                System.out.println("\nInput a friend to find mutual friends with ");
                                System.out.print("Username: ");
                                String mutuser=Keyboard.readString();
                                boolean validfriend=false;
                                for(int i=0;i<user1.countFriends();i++)
                                {
                                    if(user1.getFriendsList().get(i).getUserName().equals(mutuser))
                                    {
                                        validfriend=true;
                                    }
                                }
                                if(validfriend==true)
                                {
                                    ArrayList<User> mutusers=user1.getMutualFriends(r.getUser2(mutuser));
                                    int x=1;
                                    System.out.println("\f***********Find A Mutual Friend***********");
                                    System.out.println("Mutual friends with "+r.getUser2(mutuser).getName()+": ");
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
                                        System.out.println("You and "+r.getUser2(mutuser).getName()+" have no mutual friends.");
                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry, this user does not exist or is not a friend");
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
                    }
                    else if(val==5) //new user hometown friends
                    {
                        if(!(user1.getFriendsList().size()>0))
                        {
                            System.out.println("\f***********Find Hometown Friends***********");
                            System.out.print("Must add friends to find hometown friends");
                            System.out.print("\n\n\n1. Exit ");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.println("***********Find Hometown Friends***********");
                                System.out.print("Must add friends to find hometown friends");
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else
                        {
                            System.out.println("\f***********Find Hometown Friends***********");
                            ArrayList<User> htf=user1.getHometownFriends();
                            int num=1;
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
                    }

                    else if(val==6) //new user schoolmates
                    {
                        if(!(user1.getFriendsList().size()>0))
                        {
                            System.out.println("\f***********Find Schoolmates***********");
                            System.out.print("Must add friends to find schoolmates");
                            System.out.print("\n\n\n1. Exit ");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.println("\f***********Find Schoolmates***********");
                                System.out.print("Must add friends to find schoolmates");
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else
                        {
                            System.out.println("\f***********Find Schoolmates***********");
                            ArrayList<User> gsm=user1.getSchoolmates();
                            int num=1;
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
                }//rambook home while

            }//rambook homescreen
        }//rambook while
    }

    public static String homePage(User r)
    {
        String ret ="";
        ret+="               ✯RamBook✯";
        //ret+="\n***********Welcome, "+r.getName()+"***********";
        ret+="\n♚♛♜♝♞♟♦Welcome, "+r.getName()+"♦♟♞♝♜♛♚";
        ret+="\n\n➽1 View My Page";
        ret+="\n➽2 Add a friend";
        ret+="\n➽3 Remove a freind";
        ret+="\n➽4 Find Mutual Friends";
        ret+="\n➽5 Find Hometown Friends";
        ret+="\n➽6 Find School Mates";
        ret+="\n➽7 Logout";
        ret+="\n\n➼Choose a valid option: ";

        return ret;

    }
}
