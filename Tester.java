import java.util.*;
import cs1.*;
public class Tester
{
    public static void main(String[] args)
    {
        RamBook r = new RamBook();
        //r.printAllUsers();
        User zach = r.getUser("Kushnir");
        User joe =r.getUser("Woodin");
        User ian = r.getUser("Ian");
        System.out.println(zach.toString());
        System.out.println(ian.toString());
        ArrayList<User> m= zach.getMutualFriends(ian);
        for(User x: m)
        {
            System.out.println(x.getName());
        }
        joe.addFriend(r.getUser("Sahil"));
        System.out.println(joe.toString());
        ArrayList<User> z= joe.getHometownFriends();
        for(User x: z)
        {
            System.out.println(x.getName());
        }
        System.out.println();
        ArrayList<User> v= joe.getSchoolmates();
        for(User x: v)
        {
            System.out.println("schoolsMates: "+x.getName());
        }
        
        User s= joe.suggestAFriend();
        System.out.println("suggested friend for jo: "+s.getName());
        
        User b =r.getUser("Woodin");
        System.out.println(b.equals(joe));
    }
}