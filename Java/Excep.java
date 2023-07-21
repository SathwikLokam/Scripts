import java.io.*;
import java.util.Scanner;

class userDefinedException extends Exception {
    public String message;

    userDefinedException() {
        this.message = "Raised userDefinedException";
    }
}

class Excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number below 10 : ");
        int i = sc.nextInt();
        try {
            if (i > 10)
                throw new userDefinedException();
        } catch (userDefinedException e) {
            System.out.println(e.message);
        }
    }
}