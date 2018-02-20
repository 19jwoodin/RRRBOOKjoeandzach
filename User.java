import java.util.*;

public class User
{
    //INSTANCE FIELDS
    private String name;
    private int age;
    private String hometown;
    private String[] schools;
    private ArrayList<User> friendsList;

    //CONSTRUCTOR - DONE FOR YOU
    //NOTE - it leaves the friendsList empty
    public User(String n, int a, String h, String[] s)
    {
        name = n;
        age = a;
        hometown = h;
        schools = s;
        friendsList = new ArrayList<User>(); 

    }//END Constructor

    // DONE FOR YOU
    // Accepts a List of Users that will replace the current friendsList
    public void bulkAddFriends(ArrayList<User> u)
    {
        friendsList = u;
    }//END bulkAddFriends

    // STARTED FOR YOU
    // Should print out all information for the user, nicely formatted
    public String toString()
    {
        String retStr = "";
        retStr += "Name: " + name + "\n";
        retStr += "Age: " + age + "\n";
        retStr += "Hometown: " + hometown + "\n";
        retStr += "Schools: ";
        for(int i=0;i<schools.length;i++)
        {
            if(schools[i]!=null)
            {
                retStr+= "\n "+schools[i];
            }

        }

        retStr += "\nFriends List: " +"\n";
        //Need to include schools and friendslist
        for(int i =0; i<friendsList.size();i++)
        {
            retStr+=" "+friendsList.get(i).getName()+" \n";
        }
        retStr+="\n";

        return retStr;
    }//END toString

    // DONE FOR YOU
    // Returns the User's name
    public String getName()
    {
        return name;
    }//END getName

    //equals(User other) - this User and other are equal if name, age, and hometown match.

    public boolean equals(User other)
    {
        <<<<<<< HEAD
        if(this.name.equals(other.name)&&this.age.equals(other.age)&&this.hometown==other.hometown)
        {
            return true;
        }
        else
            =======
        if(this.name.equals(other.name))

            if(this.age==other.age)
                if(this.hometown.equals(other.hometown))
                    return true;

        >>>>>>> 8b835bc63565514a383fc3d66d2cfbc2711f3ccc
        return false;
    }

    <<<<<<< HEAD
    public void addFriend(User f)
    {
        friendsList.add(f);
        =======
        public void addFriend(User friend)
        {
        friendsList.add(friend);
        >>>>>>> 8b835bc63565514a383fc3d66d2cfbc2711f3ccc
    }

    <<<<<<< HEAD
    public void unfriend(User f)
    {
        for(int i=0;i<friendsList.size();i++)
        {
            if(friendsList.get(i)==f)
            {
                friendsList.remove(i);
            }
        }
        =======
        public void unfriend(String namefriend)
        {
        for(int i=0;i<friendsList.size();i++)
        {
            if(friendsList.get(i).name.equals(namefriend))
            {
                friendsList.remove(i);
            }
        }
    }

    public int countFriends()
    {
        return friendsList.size();
        >>>>>>> 8b835bc63565514a383fc3d66d2cfbc2711f3ccc
    }

    public int countFriends()
    {
        return friendsList.size();
    }

    public ArrayList getMutualFriends(User other)
    {
        ArrayList<User> list = new ArrayList<User>();
        for(int i =0; i<this.friendsList.size();i++)
        {
            for(int x=0;x<other.friendsList.size();x++)
            {
                if(this.friendsList.get(i).equals(other.friendsList.get(x)))
                {
                    list.add(this.friendsList.get(i));
                }
            }
        }
        return list;
    }

    public ArrayList getHometownFriends()
    {
        ArrayList<User> list = new ArrayList<User>();
        for(int i =0; i<friendsList.size();i++)
        {
            if(hometown.equals(friendsList.get(i).hometown))
            {
                list.add(friendsList.get(i));
            }
        }
        return list;
    }

    public ArrayList getSchoolmates()
    {
        ArrayList<User> list = new ArrayList<User>();
        for(int i =0; i<friendsList.size();i++)
        {
            for(int x=0;x<schools.length;x++)
            {
                if(schools[x].equals(friendsList.get(i).schools[x]))
                {
                    list.add(friendsList.get(i));
                }
            }
        }
        return list;
    }

    public User suggestAFriend()
    {
        ArrayList<User> list = new ArrayList<User>();
        for(int i =0; i<friendsList.size();i++)
        {
            for(int x=0;x<friendsList.get(i).friendsList.size();x++)
            {
                for(int y=0;y<friendsList.size();i++)
                    if(!(friendsList.get(i).friendsList.get(x).equals(friendsList.get(y))))
                    {
                        if(friendsList.get(i).friendsList.get(x).hometown.equals(hometown))
                        {
                            list.add(friendsList.get(i).friendsList.get(x));
                        }
                    }
            }
        }
        return list.get(0);
    }
}//END CLASS