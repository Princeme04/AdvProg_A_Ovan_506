package module1.task;

import java.util.Scanner;
/*
informal spec
- the program reads name and score input, based on the input program can determine the result pass or not, or maybe needs review
formal spec
>inputs
- name  : String
- score : int, with 0 <= score <= 100
>outputs
-A String containing name and student result
>preconditions
-the score must be valid, like 0-100
>postconditons
-if score >= 60, result "Pass"
-else if 55 <= score < 60, result = "borderline (needs review)"
-else, result = "fail"
.pesudocode
INPUT name
INPUT score
IF score not in [0,100] THEN stop program
ELSE IF score >= 60 THEN result ← "Pass!!"
ELSE IF score >= 55 THEN result ← "Borderline (Needs Review)"
ELSE result ← "Fail!!"
PRINT name, score, result
*/

public class Task3 {
    public static boolean isValidScore(int score) {
        return score > 0 && score < 100;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Student's Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Student's Score: ");
            int score = scanner.nextInt();

            if(isValidScore(score)) {
                System.out.println("Your Score isn't Valid");
                return;
            }

            String result;
            if(score >= 60){
                result = "Pass!!";
            }else if(score >= 55){
                result = "Fail!!";
            }else{
                result = "Borderline (Needs Review)";
            }
            System.out.println(name + " " + result);
        }
    }
}
