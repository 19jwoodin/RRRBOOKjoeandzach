import java.util.*;

public class RamBook
{
    //https://github.com/19jwoodin/RRRBOOKjoeandzach
    //INSTANCE FIELD
    //goodVersion
    public ArrayList<User> allUsers;


    //CONSTRUCTOR
    public RamBook()
    {
        allUsers = new ArrayList<User>();
        
         //Add Users (Info only, no friends in friendsList yet)
        allUsers.add(new User("Pranathi", 20, "Syracuse", new String[]{"JDHS", "SU", null},"user1","pass") );
        allUsers.add(new User("Cooper", 21, "Los Angeles", new String[]{"Beverly Hills High", "UCLA", "USC"},"user2","pass"));
        allUsers.add(new User("Andrew", 30, "DeWitt", new String[]{"JDHS", "Rutgers", null},"user3","pass"));
        allUsers.add(new User("Ian", 43, "Cleveland", new String[]{null, null, null},"user4","pass"));
        allUsers.add(new User("Hodge", 68, "NYC", new String[]{"PS999", "NYU", null},"user5","pass"));
        allUsers.add(new User("Ethan", 16, "Syracuse", new String[]{"FM", "LeMoyne", "University of Phoenix"},"user6","pass"));
        allUsers.add(new User("Brian", 50, "NYC", new String[]{"PS101", "NYU", null},"user7","pass"));
        allUsers.add(new User("Kaplan", 66, "Los Angeles", new String[]{"MBHS", null, null},"user8","pass"));
        allUsers.add(new User("Kushnir", 22, "Cincinnati", new String[]{"Bengal HS", "Ohio St.", null},"user9","pass"));
        allUsers.add(new User("Billy", 28, "Los Angeles", new String[]{"LA HS", "UCSB", "Stanford"},"user10","pass"));
        allUsers.add(new User("Tristan", 39, "Syracuse", new String[]{"Corcoran", "Oneonta", "Stanford"},"user11","pass"));
        allUsers.add(new User("McFadden", 19, "Syracuse", new String[]{"Corcoran", null, null},"user12","pass"));
        allUsers.add(new User("Haley", 20, "Syracuse", new String[]{"Corcoran", "SU", null},"user13","pass"));
        allUsers.add(new User("Neel", 21, "Los Angeles", new String[]{"Beverly Hills High", "UCLA", "USC"},"user14","pass"));
        allUsers.add(new User("Cam", 30, "DeWitt", new String[]{"F-P", null, null},"user1","pass15"));
        allUsers.add(new User("Sahil", 32, "Syracuse", new String[]{"Marcellus HS", "Bucknell U", "Binghamton U"},"user16","pass"));
        allUsers.add(new User("Michael", 24, "Mottville", new String[]{null, null, null},"user17","pass"));
        allUsers.add(new User("Isabel", 31, "DeWitt", new String[]{"JDHS", "Oneonta", "Stanford"},"user18","pass"));
        allUsers.add(new User("Nico", 60, "Los Angeles", new String[]{"LA HS", null, null},"user19","pass1"));
        allUsers.add(new User("Woodin", 99, "Syracuse", new String[]{"Marcellus HS", "OCC", null},"user20","pass"));
        
        
        //Randomly Generate Friends
        for (int x=0; x < allUsers.size(); x++)
        {
            int friends = (int)(Math.random()*allUsers.size());
            ArrayList<User> addList = new ArrayList<User>();
            
            
            for (int i = 0; i < friends; i++)
            {
                User u = allUsers.get((int)(Math.random()*allUsers.size()));
                if (!addList.contains(u) && !u.equals(allUsers.get(x)))
                {    
                    addList.add(u);
                }
            }
            
            allUsers.get(x).bulkAddFriends(addList);
            
        }
        
        
    }//END CONSTRUCTOR
    
    
    // Prints out all the users
    public void printAllUsers()
    {
        for (User u : allUsers)
        {   
            System.out.println(u);
           
        }
    }//END printUsers
        
    public void addUser(User u)
    {
        allUsers.add(u);
    }
    
    public User getUser(String name)
    {
        for(int i=0; i<allUsers.size();i++)
        {
            if(allUsers.get(i).getName().equals(name))
            {
                return allUsers.get(i);
            }
        }
        return null;
    }
    
    public User getUser2(String uname)
    {
        for(int i=0; i<allUsers.size();i++)
        {
            if(allUsers.get(i).getUserName().equals(uname))
            {
                return allUsers.get(i);
            }
        }
        return null;
    }
    public User getUserPass(String p)
    {
        for(int i=0; i<allUsers.size();i++)
        {
            if(allUsers.get(i).getPass().equals(p))
            {
                return allUsers.get(i);
            }
        }
        return null;
    }
}//END CLASS
