package firstyearportfolio;

public class ForLoops {
   public static void main(String[] args) {
      double j, i, N, testDivisor, divisorCount = 0;
      for (i = 1, j = 10; i <= 10; i++, j--) {
         System.out.printf("%20f", i); // Output i in a 5-character wide column.
         System.out.printf("%20f", j); // Output j in a 5-character column.
         System.out.println(); // and end the line.
      }

      for (N = 1; N <= 10; N++) {
         System.out.println(2 * N);
      }

      // There are 10 numbers to print.
      // Use a for loop to count 1, 2,
      // ..., 10. The numbers we want
      // to print are 2*1, 2*2, ... 2*10.
      for (N = 1; N <= 10; N++) {
         System.out.println(2 * N);
      }

      // Use a for loop that counts
      // 2, 4, ..., 20 directly by
      // adding 2 to N each time through
      // the loop.
      for (N = 2; N <= 20; N = N + 2) {
         System.out.println(N);
      }

      // Count off all the numbers
      // 2, 3, 4, ..., 19, 20, but
      // only print out the numbers
      // that are even.
      for (N = 2; N <= 20; N++) {
         if (N % 2 == 0) // is N even?
            System.out.println(N);
      }

      // Irritate the professor with
      // a solution that follows the
      // letter of this silly assignment
      // while making fun of it.
      for (N = 1; N <= 1; N++) {
         System.out.println("2 4 6 8 10 12 14 16 18 20");
      }

      // Print out the alphabet on one line of output.
      char ch; // The loop control variable;
               // one of the letters to be printed.
      for (ch = 'A'; ch <= 'Z'; ch++) {
         System.out.print(ch);
         System.out.println();
      }

      for (testDivisor = 1; testDivisor <= 200; testDivisor++) {
         if (N % testDivisor == 0)
            testDivisor++;
         divisorCount++;
         System.out.println(divisorCount);

      }
   }
}
