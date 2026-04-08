import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        /*
        Question 1:
        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
         */
        //InputMismatchException 12.2 OR letters
        //ArithmeticException 0/0
//        double number1 = 0;
//        double number2 = 0;
//        try {
//            System.out.println("write your first number: ");
//            number1 = input.nextDouble();
//            System.out.println("write your second number: ");
//            number2 = input.nextDouble();
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
//        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
//        System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
//        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
//        System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));

        /*Question 2:

        2. Write a Java program that takes a number as input and prints its multiplication table up to
        10.
        Test Data:
        Input a number: 8 Expected
        Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80
         */
//        int number = 0;
//        try {
//            System.out.println("Input a number: ");
//            number = input.nextInt();
//
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(number + " x " + 1 + " = " + (number * 1));
//        System.out.println(number + " x " + 2 + " = " + (number * 2));
//        System.out.println(number + " x " + 3 + " = " + (number * 3));
//        System.out.println(number + " x " + 4 + " = " + (number * 4));
//        System.out.println(number + " x " + 5 + " = " + (number * 5));
//        System.out.println(number + " x " + 6 + " = " + (number * 6));
//        System.out.println(number + " x " + 7 + " = " + (number * 7));
//        System.out.println(number + " x " + 8 + " = " + (number * 8));
//        System.out.println(number + " x " + 9 + " = " + (number * 9));
//        System.out.println(number + " x " + 10 + " = " + (number * 10));

        /*Question 3:

        Write a Java program to print the area and perimeter of a circle.
        2
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586

         */
//        double radius = 0;
//
//        try {
//            System.out.print("Enter Radius = ");
//            radius = input.nextDouble();
//
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Perimeter is = " + (2 * 3.1415926535897932 * radius));
//        System.out.println("Area is = " + (3.1415926535897932 * radius * radius));



        /*Question 4:

        Java program to find out the average of a set of integers
        Enter the count of numbers:
        5
        Enter an integer:
        3
        Enter an integer:
        8
        Enter an integer:
        6
        Enter an integer:
        7
        Enter an integer:
        2
        The average is: 5.2
         */
//        double average = 0;
//        int count = 0;
//        try {
//            System.out.println("Enter the count of numbers: ");
//            count = input.nextInt();
//            for (int i = 1; i <= count; i++){
//                System.out.println("Enter an integer: ");
//                int number = input.nextInt();
//                average = number + average;
//            }
//            System.out.println("The average is: "+(average/count));
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }



        /*Question 5:

        Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.
        3
        Sample Output:
        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true
        --------
        Input the first number : 10
        Input the second number: 20
        Input the third number : 25
        The result is: false
         */
//        try {
//            System.out.print("Input the first number : ");
//            int number1 = input.nextInt();
//            System.out.println("Input the second number : ");
//            int number2 = input.nextInt();
//            System.out.println("Input the third number : ");
//            int number3 = input.nextInt();
//
//
//            if ((number1 + number2) == number3) {
//                System.out.println("The result is: true");
//            } else System.out.println("The result is: false");
//        }catch (InputMismatchException e ){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        /*
        Question 6:

        6. Write a Java program to reverse a word.
        Sample Output:
        Input a word: dsaf
        Reverse word: fasd
         */
//        System.out.print("Input a word: ");
//        String word = input.nextLine();
//        int wordLength = word.length();
//        System.out.println("Reverse word: ");
//        for (int i = word.length() - 1; i >= 0; i--){
//            System.out.print(word.charAt(i));
//        }

        /*Question 7:

        7 - Java program to check whether the given number is even or odd
        Enter a number:
        33
        The number is Odd
        Enter a number:
        24
        The number is Even
         */

//        try {
//            System.out.println("Enter a number: ");
//            int number = input.nextInt();
//            if (number % 2 == 0) {
//                System.out.println("The number is Even");
//            } else System.out.println("The number is Odd");
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        /*

        Question 8:

        8 - Java program to convert the temperature in Centigrade to Fahrenheit
        4
        Enter temperature in Centigrade:
        43
        Temperature in Fahrenheit is: 109.4

         */

//       try{
//           System.out.println("Enter temperature in Centigrade: ");
//           double centigrade = input.nextDouble();
//           double toFahrenheit = (centigrade*1.8)+32;
//           System.out.print("Temperature in Fahrenheit is: "+toFahrenheit);
//       }catch (InputMismatchException e){
//           System.out.println(e.getMessage());
//       }catch (ArithmeticException e){
//           System.out.println(e.getMessage());
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }


        /*
        Question 9:

        9.Write a Java program that takes a string and a number from the user,then prints the
        character in the given index.
        Test Data:
        Input a string: Java Bootcamp
        Input a number: 1
        Expected Output:
        a
         */
//        try {
//            System.out.print("Input a string: ");
//            String string = input.nextLine();
//            System.out.println("Input a number: ");
//            int number = input.nextInt();
//
//            System.out.println(string.charAt(number));
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        /*Question 10:

        10. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
         */

//        try {
//            System.out.print("Width = ");
//            float width = input.nextFloat();
//            System.out.println(" Height = ");
//            float height = input.nextFloat();
//            System.out.println("Area is " + width + " * " + height + " = " + (width * height));
//            System.out.println("Perimeter is 2 * (" + width + " + " + height + ")" + " = " + (2 * (width + height)));
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        /*Question 11:

        11. Write a Java program to compare two numbers.
        Input Data:
        Input first integer: 25
        Input second integer: 39
        Expected Output
        25 != 39
        25 < 39
        25 <= 39
         */
//       try {
//           System.out.print("Input first integer: ");
//
//           int number1 = input.nextInt();
//           System.out.print("Input second integer: ");
//           int number2 = input.nextInt();
//
//           if (number1 != number2) {
//               System.out.println(number1 + " != " + number2);
//           }
//           if (number1 == number2) {
//               System.out.println(number1 + " == " + number2);
//           }
//           if (number1 < number2) {
//               System.out.println(number1 + " < " + number2);
//           }
//           if (number1 <= number2) {
//               System.out.println(number1 + " <= " + number2);
//           }
//           if (number1 >= number2) {
//               System.out.println(number1 + " >= " + number2);
//           }
//           if (number1 > number2) {
//               System.out.println(number1 + " > " + number2);
//           }
//       }catch (InputMismatchException e){
//           System.out.println(e.getMessage());
//       }catch (ArithmeticException e){
//           System.out.println(e.getMessage());
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }

        /*Question 12:

        12. Write a Java program to convert seconds to hours, minutes and seconds.
        Sample Output:
        Input seconds: 86399
        23:59:59
         */
//        try {
//            System.out.print("Input seconds: ");
//            double secondNumber = input.nextDouble();
//            double hours = secondNumber / 3600;
//            int hourInt = (int) hours;
//            double minutes = hours - hourInt;
//            double wholeMinutes = minutes * 60;
//            int minutesInt = (int) wholeMinutes;
//            double seconds = wholeMinutes - minutesInt;
//            double wholeSeconds = seconds * 60;
//            int secondsInt = (int) wholeSeconds;
//
//            System.out.println(hourInt + ":" + minutesInt + ":" + secondsInt);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }


        /*
        Question 13:
        13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.
        Sample Output:
        Input first number: 25
        Input second number: 37
        Input third number: 45
        Input fourth number: 23
        Numbers are not equal!
         */
//
//        try {
//            System.out.print("Input the first number : ");
//            int number1 = input.nextInt();
//            System.out.println("Input the second number : ");
//            int number2 = input.nextInt();
//            System.out.println("Input the third number : ");
//            int number3 = input.nextInt();
//            System.out.println("Input the fourth number : ");
//            int number4 = input.nextInt();
//
//            if (number1 == number2 && number2 == number3 && number3 == number4) {
//
//                System.out.println("Numbers are equal");
//            } else
//                System.out.println("Numbers are not equal!");
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        /* Question 14:
            14. Write a Java program that reads an integer and check whether it is negative, zero, or
            positive.
            Test Data Input a number: 7 Expected Output :
            Number is positive
         */

//        System.out.println("Input a number: ");
//        try {
//            int number = input.nextInt();
//            checkPositiveNegative(number);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        /* Question 15:

        15.Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered (End loop use -1 ,
        Don’t count -1).
        Test data
        1
        3
        0
        -2
        -4
        -1
        2 positives
        1 zero
        2 negatives
         */

//       try{
//           int number = 0;
//           int positive = 0;
//           int zero = 0;
//           int negative = 0;
//           System.out.println("write your number: ");
//
//           while (number != -1) {
//
//               number = input.nextInt();
//               if (number > 0) {
//                   positive += 1;
//               } else if (number == 0) {
//                   zero += 1;
//               } else if (number < 0 && number != -1)
//                   negative += 1;
//           }
//           System.out.println(positive + " positive");
//           System.out.println(zero + " zero");
//           System.out.println(negative + " negative");
//       }catch (ArithmeticException e){
//           System.out.println(e.getMessage());
//       }catch (InputMismatchException e){
//           System.out.println(e.getMessage());
//       }catch (Exception e){
//           System.out.println(e.getMessage());
//       }

        /*
        Question 16:
        16 - Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.
        For example, if the input is 12345, the output should be 54321.
         */
//        System.out.print("Enter your integer number: ");
//        String number = input.nextLine();
//        int numberLength = number.length();
//
//        for (int i = number.length() - 1; i >= 0; i--) {
//            System.out.print(number.charAt(i));
//        }

        /*
        Question 17:

        17 - Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered.
        enter the number : 4
        enter the number : 5
        enter the number : -1
        enter the number : 9
        the large number : 9
        the small number : -1
         */


//        try{
//            int number;
//            int small;
//            int large;
//            int attempts;
//            int counter = 0;
//            System.out.print("enter the number : ");
//            attempts = input.nextInt();
//            System.out.print("enter the number : ");
//            number = input.nextInt();
//            small = number;
//            large = number;
//
//
//            while (counter != attempts -1){
//                System.out.print("enter the number : ");
//                number = input.nextInt();
//                counter += 1;
//
//                if (number>large ){
//                    large = number;
//                }
//                else if (number < small){
//                    small = number;
//
//                }
//            }
//            System.out.println("the large number : "+large);
//            System.out.println("the small number : "+small);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        /*Question 18:

        18 - Determine and print the number of times the character ‘a’ appears in the input
        entered by the user.
        Enter String:
        Java bootcamp
        Output: Number of a's: 3
         */
//        System.out.println("Enter String: ");
//
//        String text = input.nextLine();
//
//        countA(text);
    }


        public static void checkPositiveNegative ( double input) throws Exception {

            if (input > 0) {
                System.out.println("Number is positive");
            } else if (input < 0) {
                System.out.println("Number is negative");
            } else System.out.println("it's zero number");

        }

        public static void countA (String text) throws Exception {


            try {

                if (text.isEmpty()) {
                    throw new Exception("String cannot be empty");
                }

                int counterA = 0;

                for (int i = 0; i < text.length(); i++) {

                    if (text.charAt(i) == 'a') {
                        counterA++;
                    }
                }

                System.out.println("Number of a's: " + counterA);

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
}
