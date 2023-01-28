package Class12;

import java.util.Scanner;

public class CredentialChecker {
    public static void main(String[] args) {
     /*   store username, password and confirm password from a user and check following requirements:
        Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”
*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your userName");
        String userName=scanner.next();
        System.out.println("please enter your password");
        String passWord=scanner.next();
        System.out.println("please enter your password again");
        String ConfirmPassWord=scanner.next();
        if (userName.isEmpty() || passWord.isEmpty()){
            System.out.println("userName or PassWord cannot be empty");
        } else if (passWord.length()<8) {
            System.out.println("passWord is too short");

        }else if (passWord.contains(userName)){
            System.out.println("password cannot contain username");
        } else if (!passWord.equals(ConfirmPassWord)) {
            System.out.println("password do not match");
        }else {
            System.out.println("your username and password has been created");

        }

        }

}




