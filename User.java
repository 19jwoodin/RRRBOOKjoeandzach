
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

    public String getSchool(int i)
    {
        return this.schools[i];
    }
    //equals(User other) - this User and other are equal if name, age, and hometown match.

    public boolean equals(User other)
    {
        if(this.name.equals(other.name))

            if(this.age==other.age)
                if(this.hometown.equals(other.hometown))
                    return true;

        return false;
    }

    public void addFriend(User friend)
    {
        friendsList.add(friend);
    }

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
    }

    public ArrayList<User> getMutualFriends(User other)
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

    public ArrayList<User> getHometownFriends()
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

    public ArrayList<User> getSchoolmates()
    {
        ArrayList<User> list = new ArrayList<User>();
        for(int i =0; i<friendsList.size();i++)
        {
            for(int x=0;x<schools.length;x++)
            {
                if(!(friendsList.get(i).getSchool(x)==null))
                {
                    if(this.getSchool(x)==(friendsList.get(i).getSchool(x)))
                    {
                        list.add(friendsList.get(i));
                    }
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
                if(friendsList.get(i).friendsList.get(x).hometown.equals(hometown))
                {
                    list.add(friendsList.get(i).friendsList.get(x));
                }
            }
        }
        for(int i =0; i<friendsList.size();i++)
        {
            for(int x=0;x<list.size();x++)
            {
                if(this.friendsList.get(i).equals(list.get(x)))
                {
                    list.remove(x);
                }
            }
        }
        for(int i =0; i<list.size();i++)
        {
            if(list.get(i).equals(this))
            {
                list.remove(i);
            }
        }
        if(list.size()==0)
            return null;
        else
            return list.get(0);
    }
}//END CLASS

