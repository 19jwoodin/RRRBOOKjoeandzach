import java.util.*;
import cs1.*;
public class Main
{
    public static void main(String[] args)
    {
        RamBook r1 = new RamBook();
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
                while(age<8||age>150)
                {
                    System.out.println("Invalid answer(range: 8-150)");
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
                while(r1.getUser2(un)!=null)
                {
                    System.out.println("Sorry, this username already exists.");
                    System.out.print("Type in a username: ");
                    un=Keyboard.readString();
                }
                System.out.print("Type in a password: ");
                String pass=Keyboard.readString();

                user1=new User(name,age,hometown,schools,un,pass);
                r1.allUsers.add(user1);
            }
            else if(anser==1) //existing asccount
            {
                System.out.println("\f***********Login***********");
                System.out.print("Username: ");
                String usern=Keyboard.readString();
                User u;
                while(r1.getUser2(usern)==null)
                {
                    System.out.println("This username does not exist. ");
                    System.out.print("Username: ");
                    usern=Keyboard.readString();
                }
                if(!usern.equals(" "))
                {
                    System.out.print("\nPassword: ");
                    String passw=Keyboard.readString();
                    while(!r1.getUser2(usern).getPass().equals(passw))
                    {
                        System.out.println("Wrong Password ");
                        System.out.print("Password: ");
                        passw=Keyboard.readString();
                    }
                }
                user1 =r1.getUser2(usern);

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

                    if(val==10)
                    {
                        userVal=1;
                    }
                    else if(val==1)//view my page
                    {
                        System.out.println("\f***********My Page***********");
                        System.out.print(user1.toString());
                        System.out.print("\n\n\n1. Exit ");
                        int ans2=Keyboard.readInt();
                        while(ans2!=1)
                        {
                            System.out.println("\f***********My Page***********");
                            System.out.print(user1.toString());
                            System.out.print("\n\n\n1. Exit ");
                            ans2=Keyboard.readInt();
                        }
                    }
                    else if(val==2)//change pass
                    {
                        System.out.println("\f***********Change Password***********");
                        System.out.print("\nOld Password: ");
                        String pass1=Keyboard.readString();
                        while(!pass1.equals(user1.getPass()))
                        {
                            System.out.println("Incorrect Password");
                            System.out.print("Old Password: ");
                            pass1=Keyboard.readString();
                        }
                        System.out.print("\nNew Password: ");
                        String pass2 = Keyboard.readString();
                        user1.setPassword(pass2);
                        try{Thread.sleep(1000);}
                        catch(InterruptedException ie){}
                        System.out.print("Success!");
                        try{Thread.sleep(1000);}
                        catch(InterruptedException ie){}
                    }
                    else if(val==3) //addfriends
                    {
                        int addUser =0;
                        while(addUser==0)
                        {
                            System.out.println("\f***********Add A Friend***********");
                            if(user1.suggestAFriend()!=null)
                            {
                                System.out.print("Suggested Friend: ");
                                System.out.println(""+user1.suggestAFriend().getName()+"- "+user1.suggestAFriend().getUserName());
                            }
                            System.out.print(r1.printAll(user1));
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
                            if(r1.getUser2(userName)==null||validfriend==true||yourname==1)
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
                                System.out.print("\f"+r1.getUser2(userName).toString());
                                System.out.print("\n\n\n1. Exit \t2. Add");

                                boolean while2=true;
                                while(while2==true)
                                {
                                    System.out.print("\f"+r1.getUser2(userName).toString());
                                    System.out.print("\n\n\n1. Exit \t2. Add");
                                    int x=Keyboard.readInt();
                                    if(x==2)
                                    {
                                        user1.addFriend(r1.getUser2(userName));
                                        int while1=0;
                                        while(while1==0)
                                        {
                                            System.out.print("\fWould you like to try another name? ");

                                            String ans=Keyboard.readString();
                                            if(ans.equals("no"))
                                            {
                                                addUser=1;
                                                while1=1;
                                                while2=false;
                                            }
                                            else if(ans.equals("yes"))
                                            {
                                                addUser=0;
                                                while1=1;
                                                while2=false;
                                            }
                                            else
                                            {
                                                System.out.println("Sorry, please try again: ");

                                            }

                                        }
                                    }
                                    else if(x==1)
                                    {
                                        while2=false;
                                    }
                                }
                            }
                        }
                    }
                    else if(val==4) //remove friend
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
                                if(r1.getUser2(remfr)==null || validfriend==false)
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
                                    user1.unfriend(r1.getUser2(remfr).getName());
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
                    else if(val==5) //new user mutual friends
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
                                    ArrayList<User> mutusers=user1.getMutualFriends(r1.getUser2(mutuser));
                                    int x=1;
                                    System.out.println("\f***********Find A Mutual Friend***********");
                                    System.out.println("Mutual friends with "+r1.getUser2(mutuser).getName()+": ");
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
                                        System.out.println("You and "+r1.getUser2(mutuser).getName()+" have no mutual friends.");
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
                    else if(val==6) //new user hometown friends
                    {
                        if(!(user1.getFriendsList().size()>0))
                        {
                            System.out.println("\f***********Find Hometown Friends and Schoolmates***********");
                            System.out.print("Must add friends to find hometown friends and schoolmates");
                            System.out.print("\n\n\n1. Exit ");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.println("\f***********Find Hometown Friends and Schoolmates***********");
                                System.out.print("Must add friends to find hometown friends and schoolmates");
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else
                        {
                            System.out.println("\f***********Find Hometown Friends and Schoolmates***********");
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
                            }
                            else
                            {
                                System.out.println("You have no hometown friends");
                            }
                            ArrayList<User> gsm=user1.getSchoolmates();
                            num=1;
                            if(gsm.size()>0)
                            {
                                System.out.println("\nYour Schoolmates: \n");
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
                                num=1;
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

                    else if(val==7)//message a friend
                    {
                        if(!(user1.getFriendsList().size()>0))
                        {
                            System.out.println("\f***********Message A Friend***********");
                            System.out.print("Must add friends to message a friend");
                            System.out.print("\n\n\n1. Exit ");
                            int ans2=Keyboard.readInt();
                            while(ans2!=1)
                            {
                                System.out.println("\f***********Message A Friend***********");
                                System.out.print("Must add friends to message a friend");
                                System.out.print("\n\n\n1. Exit ");
                                ans2=Keyboard.readInt();
                            }
                        }
                        else
                        {
                            int mfri=0;
                            while(mfri==0)
                            {
                                System.out.println("\f***********Message A Friend***********");
                                System.out.print(user1.printFriends());
                                System.out.println("\nWho would you like to message? ");
                                System.out.print("Username: ");
                                String mfr = Keyboard.readString();
                                boolean validfriend=false;
                                for(int i=0;i<user1.countFriends();i++)
                                {
                                    if(user1.getFriendsList().get(i).getUserName().equals(mfr))
                                    {
                                        validfriend=true;
                                    }
                                }
                                if(r1.getUser2(mfr)==null || validfriend==false)
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
                                            mfri=1;
                                        }
                                        else
                                        {
                                            System.out.println("Sorry, please try again");
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("\f***********Message A Friend***********");
                                    System.out.print("\n1. Emoji\n2. Personal Message\n Choose a valid option: ");
                                    int option=1;
                                    int opt=0;
                                    while(option==1)
                                    {
                                        System.out.println("\f***********Message A Friend***********");
                                        System.out.print("\n1. Emoji\n2. Personal Message\n Choose a valid option: ");
                                        opt=Keyboard.readInt();
                                        if(opt==1||opt==2)
                                            option=2;
                                    }
                                    if(opt==2)
                                    {
                                        System.out.println("\f***********Message A Friend***********");
                                        System.out.print("\nMessage for "+r1.getUser2(mfr).getName()+":");
                                        String mess=""+user1.getName()+"- ";
                                        mess+=Keyboard.readString();
                                        try{Thread.sleep(1000);}
                                        catch(InterruptedException ie){}
                                        System.out.print("Message Sent!");
                                        try{Thread.sleep(1000);}
                                        catch(InterruptedException ie){}
                                        r1.getUser2(mfr).addMessage(mess);
                                        System.out.print("\nWould you like to message anyone else? ");
                                        String remfra =Keyboard.readString();
                                        while(!(remfra.equals("yes")||remfra.equals("no")))
                                        {
                                            System.out.println("Sorry, please try again ");
                                            System.out.print("Would you like to remove anyone else? ");
                                            remfra = Keyboard.readString();
                                        }
                                        if(remfra.equals("no"))
                                        {
                                            mfri=1;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("\f***********Message A Friend***********");
                                        System.out.print("\nMessage for "+r1.getUser2(mfr).getName()+":");
                                        System.out.print("\n\n1. ☆(❁‿❁)☆\n2. ( ͡° ͜ʖ ͡°)\n3.  (。♡‿♡。)\n4. ˁ˚ᴥ˚ˀ\n5. ⊙﹏⊙\n Your Choice: ");
                                        int em=0;
                                        int wh=0;
                                        while(wh==0)
                                        {
                                            System.out.println("\f***********Message A Friend***********");
                                            System.out.print("\nMessage for "+r1.getUser2(mfr).getName()+":");
                                            System.out.print("\n\n1. ☆(❁‿❁)☆\n2. ( ͡° ͜ʖ ͡°)\n3.  (。♡‿♡。)\n4. ˁ˚ᴥ˚ˀ\n5. ⊙﹏⊙\n Your Choice: ");
                                            em=Keyboard.readInt();
                                            if(em==1||em==2||em==3||em==4||em==5)
                                                wh=1;

                                        }
                                        System.out.println("\f***********Message A Friend***********");
                                        System.out.print("\nMessage for "+r1.getUser2(mfr).getName()+":");
                                        System.out.print("\n\n1. ☆(❁‿❁)☆\n2. ( ͡° ͜ʖ ͡°)\n3.  (。♡‿♡。)\n4. ˁ˚ᴥ˚ˀ\n5. ⊙﹏⊙\n  Your Choice:  ");
                                        
                                        
                                        String mess=""+user1.getName()+"- ";
                                        if(em==1)
                                        {
                                            r1.getUser2(mfr).addMessage(mess+"☆(❁‿❁)☆");
                                            System.out.print("☆(❁‿❁)☆");
                                        }
                                        if(em==2)
                                        {
                                            r1.getUser2(mfr).addMessage(mess+"( ͡° ͜ʖ ͡°)");
                                            System.out.print("( ͡° ͜ʖ ͡°)");
                                        }
                                        if(em==3)
                                        {
                                            r1.getUser2(mfr).addMessage(mess+"(。♡‿♡。)");
                                            System.out.print("(。♡‿♡。)");
                                        }
                                        if(em==4)
                                        {
                                            r1.getUser2(mfr).addMessage(mess+"ˁ˚ᴥ˚ˀ");
                                            System.out.print("ˁ˚ᴥ˚ˀ");
                                        }
                                        if(em==5)
                                        {
                                            r1.getUser2(mfr).addMessage(mess+"⊙﹏⊙");
                                            System.out.print("⊙﹏⊙");
                                        }
                                        try{Thread.sleep(1000);}
                                        catch(InterruptedException ie){}
                                        System.out.print("\nMessage Sent!");
                                        try{Thread.sleep(1000);}
                                        catch(InterruptedException ie){}
                                        System.out.print("\nWould you like to message anyone else? ");
                                        String remfra =Keyboard.readString();
                                        while(!(remfra.equals("yes")||remfra.equals("no")))
                                        {
                                            System.out.println("Sorry, please try again ");
                                            System.out.print("Would you like to remove anyone else? ");
                                            remfra = Keyboard.readString();
                                        }
                                        if(remfra.equals("no"))
                                        {
                                            mfri=1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if(val==8)//view messages
                    {
                        int ans3=1;
                        while(ans3==1)
                        {
                            System.out.println("\f***********My Page***********");
                            System.out.print("Your new Messages: \n"+user1.printMessages());
                            System.out.print("\n\n\n1. Exit");
                            if(user1.getMessages().size()>0)
                                System.out.print("\t2. Clear Messages");
                            int ans2=Keyboard.readInt();
                            if(ans2==2&&user1.getMessages().size()>0)
                            {
                                int ans4=1;
                                while(ans4==1)
                                {
                                    System.out.println("\f***********My Page***********");
                                    System.out.print("Your new Messages: \n"+user1.printMessages());
                                    System.out.print("\nAre you sure you want to clear all messages? ");
                                    String ans5=Keyboard.readString();

                                    if(ans5.equals("yes"))
                                    {
                                        user1.clearMessages();
                                        ans4=2;
                                    }
                                    else if(ans5.equals("no"))
                                    {
                                        ans4=2;
                                    }
                                }
                            }
                            else if(ans2==1)
                            {
                                ans3=0;
                            }
                        }
                    }
                    else if(val==9)//tc tac toe
                    {
                        int game=1;
                        while(game==1)
                        {
                            System.out.print("\fChoose your board size(3, 5, 7, or 9): ");
                            int size =Keyboard.readInt();
                            while(size<3||size>9||size==4||size==6||size==8)
                            {
                                System.out.print("3, 6, or 9 PLEASE!");
                                size =Keyboard.readInt();
                            }
                            int[][] board = new int[size][size];
                            System.out.print("\fPlayer Vs. Player or Player Vs. AI? \n (PvP-1 PvAI-2): ");
                            int choice=Keyboard.readInt();
                            while(!(choice==1||choice==2))
                            {
                                System.out.print("1 or 2 PLEASE!");
                                choice =Keyboard.readInt();
                            }
                            boolean Ai=false;
                            if(choice==1)
                                Ai=false;
                            else
                                Ai=true;

                            TicTacToe ttt = new TicTacToe(board);
                            boolean good;
                            boolean rowGuess;
                            boolean colGuess;
                            int row;
                            int col;
                            while(ttt.checkWinner()==0)
                            {
                                ttt.printBoard(board);
                                good=true;
                                if(Ai==false)
                                    System.out.println("Player one: ");
                                else
                                    System.out.println("Your move: ");
                                while(good)
                                {
                                    System.out.print("r: ");
                                    row = Keyboard.readInt();
                                    rowGuess = false;
                                    while(rowGuess==false)
                                    {
                                        if (row<0||row>board.length-1)
                                        {
                                            System.out.println("Invalid Guess: please try again");
                                            System.out.print("r: ");
                                            row=Keyboard.readInt();
                                        }
                                        else
                                        {
                                            rowGuess=true;
                                        }
                                    }
                                    System.out.print("c: ");
                                    col = Keyboard.readInt();
                                    colGuess = false;
                                    while(colGuess==false)
                                    {
                                        if (col<0||col>board.length-1)
                                        {
                                            System.out.println("Invalid Guess: please try again");
                                            System.out.print("c: ");
                                            col=Keyboard.readInt();
                                        }
                                        else
                                        {
                                            colGuess=true;
                                        }
                                    }
                                    if(ttt.makeMove(1,row,col))
                                    {
                                        ttt.printBoard(board);
                                        ttt.checkWinner();
                                        good=false;
                                    }
                                    else
                                        System.out.println("Try again:");
                                    ttt.checkWinner();
                                }
                                if(ttt.checkWinner()==0)
                                {
                                    if(Ai==true)
                                    {
                                        if(ttt.checkBeforeWinnerAI()>0)
                                        {
                                            //System.out.print(ttt.checkBeforeWinnerAI()+5);
                                            //int r2442=Keyboard.readInt();
                                            if(ttt.checkBeforeWinnerAI()==1)
                                            {
                                                for(int r=0; r < board.length; r++)
                                                {
                                                    if(ttt.checkRowsPL2(r)>=0)
                                                    {
                                                        for(int c=0; c < board.length; c++)
                                                        {
                                                            if(ttt.makeMove(2,r,c))
                                                            {
                                                                r=board.length;
                                                                c=board.length;
                                                                ttt.printBoard(board);
                                                                ttt.checkWinner();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if(ttt.checkBeforeWinnerAI()==2)
                                            {
                                                for(int c=0; c < board.length; c++)
                                                {
                                                    if(ttt.checkColsPL2(c)>=0)
                                                    {
                                                        for(int r=0; r < board.length; r++)
                                                        {
                                                            if(ttt.makeMove(2,r,c))
                                                            {
                                                                r=board.length;
                                                                c=board.length;
                                                                ttt.printBoard(board);
                                                                ttt.checkWinner();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if(ttt.checkBeforeWinnerAI()==3)
                                            {
                                                if(ttt.checkDiagPL2()==1)
                                                {
                                                    for(int r=0; r < board.length; r++)
                                                    {
                                                        if(ttt.makeMove(2,r,r))
                                                        {
                                                            r=board.length;
                                                            ttt.printBoard(board);
                                                            ttt.checkWinner();
                                                        }
                                                    }
                                                }
                                                else if(ttt.checkDiagPL2()==2)
                                                {
                                                    for(int i=0; i < board.length; i++)
                                                    {
                                                        if(ttt.makeMove(2, i, board.length-i-1))
                                                        {
                                                            i=board.length;
                                                            ttt.printBoard(board);
                                                            ttt.checkWinner();

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if(ttt.checkBeforeWinner()>0)
                                        {
                                            //System.out.print(ttt.checkBeforeWinner());
                                            //int r2442=Keyboard.readInt();
                                            if(ttt.checkBeforeWinner()==1)
                                            {
                                                for(int r=0; r < board.length; r++)
                                                {
                                                    if(ttt.checkRowsAI2(r)>=0)
                                                    {
                                                        for(int c=0; c < board.length; c++)
                                                        {
                                                            if(ttt.makeMove(2,r,c))
                                                            {
                                                                r=board.length;
                                                                c=board.length;
                                                                ttt.printBoard(board);
                                                                ttt.checkWinner();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if(ttt.checkBeforeWinner()==2)
                                            {
                                                for(int c=0; c < board.length; c++)
                                                {
                                                    if(ttt.checkColsAI2(c)>=0)
                                                    {
                                                        for(int r=0; r < board.length; r++)
                                                        {
                                                            if(ttt.makeMove(2,r,c))
                                                            {
                                                                r=board.length;
                                                                c=board.length;
                                                                ttt.printBoard(board);
                                                                ttt.checkWinner();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if(ttt.checkBeforeWinner()==3)
                                            {
                                                if(ttt.checkDiagAI2()==1)
                                                {
                                                    for(int r=0; r < board.length; r++)
                                                    {
                                                        if(ttt.makeMove(2,r,r))
                                                        {
                                                            r=board.length;
                                                            ttt.printBoard(board);
                                                            ttt.checkWinner();
                                                        }
                                                    }
                                                }
                                                else if(ttt.checkDiagAI2()==2)
                                                {
                                                    for(int i=0; i < board.length; i++)
                                                    {
                                                        if(ttt.makeMove(2, i, board.length-i-1))
                                                        {
                                                            i=board.length;
                                                            ttt.printBoard(board);
                                                            ttt.checkWinner();

                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        else
                                        {
                                            row = (int)(Math.random()*(size));
                                            col = (int)(Math.random()*(size));
                                            rowGuess = false;
                                            while(rowGuess==false)
                                            {
                                                if (ttt.makeMove(2,row,col))
                                                {
                                                    rowGuess=true;
                                                }
                                                else
                                                {
                                                    row = (int)(Math.random()*size);
                                                    col = (int)(Math.random()*size);
                                                }
                                            }
                                            ttt.printBoard(board);
                                            ttt.checkWinner();
                                        }
                                    }
                                    else
                                    {
                                        good=true;
                                        System.out.println("Player two:");
                                        while(good)
                                        {
                                            System.out.print("r: ");
                                            row = Keyboard.readInt();
                                            rowGuess = false;
                                            while(rowGuess==false)
                                            {
                                                if (row<0||row>board.length-1)
                                                {
                                                    System.out.println("Invalid Guess: please try again");
                                                    System.out.print("r: ");
                                                    row=Keyboard.readInt();
                                                }
                                                else
                                                {
                                                    rowGuess=true;
                                                }
                                            }
                                            System.out.print("c: ");
                                            col = Keyboard.readInt();
                                            colGuess = false;
                                            while(colGuess==false)
                                            {
                                                if (col<0||col>board.length-1)
                                                {
                                                    System.out.println("Invalid Guess: please try again");
                                                    System.out.print("c: ");
                                                    col=Keyboard.readInt();
                                                }
                                                else
                                                {
                                                    colGuess=true;
                                                }
                                            }
                                            if(ttt.makeMove(2,row,col))
                                            {
                                                ttt.printBoard(board);
                                                ttt.checkWinner();
                                                good=false;
                                            }
                                            else
                                                System.out.println("Try again:");
                                        }
                                    }
                                }
                            }
                            String ans="";
                            if(ttt.checkWinner()==1)
                            {
                                if(Ai==true)
                                    System.out.println("You Win! ");
                                else
                                    System.out.println("Player One Wins!");
                                System.out.print("Would you like to play again? ");

                                boolean while1=true;
                                while(while1==true)
                                {

                                    ttt.printBoard(board);
                                    if(Ai==true)
                                        System.out.println("You Win! ");
                                    else
                                        System.out.println("Player One Wins!");
                                    System.out.print("Would you like to play again? ");
                                    ans=Keyboard.readString();
                                    if(ans.equals("no"))
                                    {
                                        game=0;
                                        while1=false;
                                    }
                                    else if(ans.equals("yes"))
                                    {
                                        while1=false;
                                    }

                                }
                            }
                            else if(ttt.checkWinner()==2)
                            {
                                if(Ai==true)
                                    System.out.println("HAHAHA I Win!! I'm too smart for ya");
                                else
                                    System.out.println("Player Two Wins!!!");
                                System.out.print("Would you like to play again? ");

                                boolean while1=true;
                                while(while1==true)
                                {
                                    ttt.printBoard(board);
                                    if(Ai==true)
                                        System.out.println("HAHAHA I Win!! I'm too smart for ya");
                                    else
                                        System.out.println("Player Two Wins!!!");
                                    System.out.print("Would you like to play again? ");
                                    ans=Keyboard.readString();
                                    if(ans.equals("no"))
                                    {
                                        game=0;
                                        while1=false;
                                    }
                                    else if(ans.equals("yes"))
                                    {
                                        while1=false;
                                    }
                                }
                            }
                            else if(ttt.checkWinner()==3)
                            {
                                System.out.println("Tie Game!!!");
                                System.out.print("Would you like to play again? ");

                                boolean while1=true;
                                while(while1==true)
                                {
                                    ttt.printBoard(board);
                                    System.out.println("Tie Game!!!");
                                    System.out.print("Would you like to play again? ");
                                    ans=Keyboard.readString();
                                    if(ans.equals("no"))
                                    {
                                        game=0;
                                        while1=false;
                                    }
                                    else if(ans.equals("yes"))
                                    {
                                        while1=false;
                                    }
                                }
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
        //ret+="\n***********Welcome, "+r1getName()+"***********";
        ret+="\n♚♛♜♝♞♟♦Welcome, "+r.getName()+"♦♟♞♝♜♛♚";
        ret+="\n\n➽1\tView My Page";
        ret+="\n➽2\tChange Password";
        ret+="\n➽3\tAdd a friend";
        ret+="\n➽4\tRemove a freind";
        ret+="\n➽5\tFind Mutual Friends";
        ret+="\n➽6\tFind Hometown Friends/Schoolmates";
        ret+="\n➽7\tMessage A Friend";
        ret+="\n➽8\tView Messages";
        ret+="\n➽9\tTIC TAC TOE";
        ret+="\n➽10\tLogout";
        ret+="\n\n➼Choose a valid option: ";

        return ret;

    }
}
