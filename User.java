
import java.util.*;
public class User
{
    //INSTANCE FIELDS
    private String name;
    private int age;
    private String hometown;
    private String[] schools;
    private ArrayList<User> friendsList;
    private String username;
    private String password;
    private ArrayList<String> messages;
    //CONSTRUCTOR - DONE FOR YOU
    //NOTE - it leaves the friendsList empty
    public User()
    {
        name = "";
        age = 0;
        hometown = "";
        schools = new String[3];
        friendsList = new ArrayList<User>(); 
        username="";
        password="";
        messages=new ArrayList<String>();
    }
    public User(String n, int a, String h, String[] s, String u,String p)
    {
        name = n;
        age = a;
        hometown = h;
        schools = s;
        friendsList = new ArrayList<User>(); 
        username=u;
        password=p;
        messages=new ArrayList<String>();
    }//END Constructor
    public void setUserName(String u)
    {
        username=u;
    }
    public void setPassword(String p)
    {
        password=p;
        }
    public String getUserName()
    {
        return username;
    }
    public String getPass()
    {
        return password;
    }
    // DONE FOR YOU
    // Accepts a List of Users that will replace the current friendsList
    public void bulkAddFriends(ArrayList<User> u)
    {
        friendsList = u;
    }//END bulkAddFriends
    public void addMessage(String m)
    {
        messages.add(m);
    }
    public ArrayList<String> getMessages()
    {
        return messages;
    }
    public String printMessages()
    {
        String ret="";
        if(messages.size()>0)
        {
            for(String m: messages)
            {
                ret+=m+"\n";
            }
            return ret;
            }
            else
            {
                return "You have no new messages";
            }
    }
    public void clearMessages()
    {
        for(int i=0;i<messages.size();i++)
        {
            messages.remove(i);
            i--;
        }
    }
    // STARTED FOR YOU
    // Should print out all information for the user, nicely formatted
    public String toString()
    {
        String retStr = "";
        retStr+="UserName: "+username+"\n";
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
            retStr+=" "+friendsList.get(i).getName()+"("+friendsList.get(i).getUserName()+") \n";
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
    public String getHometown()
    {
        return hometown;
    }
    public ArrayList<User> getFriendsList()
    {
        return friendsList;
    }

    public String getSchool(int i)
    {
        return this.schools[i];
    }
    
    public String printFriends()
    {
        String ret=name +"'s Friends:\n";
        int x=1;
        for(int i=0;i<friendsList.size();i++)
        {
            ret+=x+". "+friendsList.get(i).getName()+"- "+friendsList.get(i).getUserName();
            ret+="\n";
            x++;
        }
        return ret;
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
                        x=schools.length;
                    }
                }
            }
        }
        return list;
    }

    public User suggestAFriend()
    {
        ArrayList<User> list = new ArrayList<User>();
        for(int i =0; i<this.friendsList.size();i++)
        {
            for(int x=0;x<this.friendsList.get(i).friendsList.size();x++)
            {
                if(this.friendsList.get(i).friendsList.get(x).getHometown().equals(this.hometown))
                {
                    list.add(this.friendsList.get(i).friendsList.get(x));
                }
            }
        }
        for(int i =0; i<this.friendsList.size();i++)
        {
            for(int x=0;x<list.size();x++)
            {
                if(this.friendsList.get(i).equals(list.get(x)))
                {
                    list.remove(x);
                    x--;
                }
            }
        }
        for(int i =0; i<list.size();i++)
        {
            if(this.equals(list.get(i)))
            {
                list.remove(i);
                i--;
            }
        }
        ArrayList<User> list2=new ArrayList<User>();;
        for(int i =0; i<this.friendsList.size();i++)
        {
            for(int x=0;x<this.friendsList.get(i).friendsList.size();x++)
            {
                
                    list2.add(this.friendsList.get(i).friendsList.get(x));
                
            }
        }
        for(int i =0; i<this.friendsList.size();i++)
        {
            for(int x=0;x<list2.size();x++)
            {
                if(this.friendsList.get(i).equals(list2.get(x)))
                {
                    list2.remove(x);
                    x--;
                }
            }
        }
        for(int i =0; i<list2.size();i++)
        {
            if(this.equals(list2.get(i)))
            {
                list2.remove(i);
                i--;
            }
        }
        int num=0;
        if(list.size()==0)
        {
            if(list2.size()==0)
            {
                return null;
            }
            else
            {
                num = (int)Math.random()*list2.size();
                return list2.get(num);
                }
        }
        else
        {
            num = (int)Math.random()*list.size();
            return list.get(num);
        }
    }
    
}//END CLASS

