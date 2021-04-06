import java.util.Scanner;

public class Chapter3 {
    // Declare the Chapter 3 Milestone 1 method here
    public void milestone1(int num1, int num2)
    {
        while(num1 <= num2)
        {
            if(num1 % 2 == 0)
            {
                System.out.print(num1 + " ");
            }

            num1++;

            if(num2 % num1 == 0)
            {
                if(num2 == num1)
                {
                    break;
                }
                else
                {
                    System.out.println(num1);
                    break;
                }
                
            }
        }
    }
    
    // Declare the Chapter 3 Milestone 2 method here
    public void milestone2(Scanner scanner)
    {
        int num1 = 0;
        int count = 0;
        double average = 0.0;
        while(true)
        {
            num1 = scanner.nextInt();
            if(num1 < 0)
            {
                break;
            }
            else
            {
                average += num1;
            }
            count++;
        }
        average = (average / count);
        System.out.format("%.2f", average);
    }

    public void milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    }

}