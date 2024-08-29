import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        person p = new person();
        System.out.println("Enter your first name");
        p.firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        p.lastName = scanner.nextLine();
        System.out.println("Enter your age");
        p.age = scanner.nextInt();
        System.out.println("Enter your id");
        p.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your address");
        p.address = scanner.nextLine();
        System.out.println("Enter your gender");
        p.gender = scanner.nextLine();
        System.out.println("Enter your height");
        p.height = scanner.nextDouble();

        System.out.println("Hi "+p.firstName+" "+p.lastName+", what you are doing now?\nif you are eating enter 1\ndrinking enter 2\n" +
                           "walking enter 3\ntalking enter 4" );
        int ans = scanner.nextInt();
        switch (ans){
            case 1 :
                p.eat();
                break;
            case 2 :
                p.drink();
                break;
            case 3:
                p.walk();
                break;
            case 4:
                p.talk();
                break;
        }

    }
}