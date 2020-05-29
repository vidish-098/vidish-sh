import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Enter the name of days");
        str=sc.nextLine();
        if(str.equalsIgnoreCase("Monday"))
            System.out.println("Day is" +1);
        else if(str.equalsIgnoreCase("Tuesday"))
            System.out.println("Day is " +2);
        else if(str.equalsIgnoreCase("Wednesday"))
            System.out.println("Day is " +3);
        else if(str.equalsIgnoreCase("Thursday"))
            System.out.println("Day is " +4);
        else if(str.equalsIgnoreCase("Friday"))
            System.out.println("Day is "+5);
        else if (str.equalsIgnoreCase("Saturday"))
            System.out.println("Day is "+6);
        else if(str.equalsIgnoreCase("sunday"))
            System.out.println("Day is "+7);
        else
            System.out.println("nothing here");
    }
    
}
