import java.util.*;
import cs1.*;
public class tester
{
    public static void main(String[] args)
    {
        RamBook r = new RamBook();
        //r.printAllUsers();
        User zach = new User("Kushnir", 22, "Cincinnati", new String[]{"Bengal HS", "Ohio St.", null});
        r.addUser(zach);
        zach.addFriend(r.getUser("Andrew"));
        System.out.print(zach.toString());
    }
}