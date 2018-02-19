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
}//END CLASS