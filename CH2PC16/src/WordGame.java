
/**
 * Tyler McMahon
 *CH2PC16
 *Programming 3 APCS
 *9/13/19
 */
import java.util.Scanner;

public class WordGame {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in );
    String name;
    int age;
    String city;
    String college;
    String profession;
    String animal;
    String petName;

    System.out.println("please enter a  name "   );
    name = scanner.next();
    System.out.println("please enter a age " );
    age = scanner.nextInt();
    System.out.println("please enter a city" );
    city = scanner.next();
    System.out.println("please enter a college " );
    college = scanner.next();
    System.out.println("please enter a profession "  );
    profession = scanner.next();
    System.out.println("please enter a animal "  );
    animal = scanner.next();
    System.out.println("Please enter pet name");
    petName = scanner.next();

    System.out.println("There once was a person named " + name + " who lived in " + city + ".");
    System.out.println("At the age of " + age + " " + name + " went to college at " + college + ".");
    System.out.println(name + " graduated and went to work as a " + profession + ".");
    System.out.println("Then " + name + " adopted a(n) " + animal + " named " );
    System.out.println("They lived happily ever after.");



    }

}
