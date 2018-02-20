import java.util.*;
import cs1.*;
public class Main
{
    public static void main(String[] args)
    {
        RamBook r = new RamBook();
        //r.printAllUsers();
        User zach = r.getUser("Kushnir");
        User joe =r.getUser("Woodin");
        User ian = r.getUser("Ian");
        System.out.print(zach.toString());
        System.out.print(ian.toString());
        ArrayList<User> m= zach.getMutualFriends(ian);
        for(User x: m)
        {
            System.out.println(x.getName());
        }
        joe.addFriend(r.getUser("Sahil"));
        System.out.print(joe.toString());
        ArrayList<User> z= joe.getHometownFriends();
        for(User x: z)
        {
            System.out.println(x.getName());
        }
        
        ArrayList<User> v= joe.getSchoolmates();
        for(User x: v)
        {
            System.out.println(x.getName());
        }
    }
}