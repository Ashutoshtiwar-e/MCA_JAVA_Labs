import java.util.Scanner;

class Identity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your SAP ID: ");
        long sapId = sc.nextLong();

        System.out.println("My SAP ID is " + sapId + " and my name is " + name);

        sc.close();
    }
}

