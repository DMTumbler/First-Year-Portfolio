package firstyearportfolio;

public class arrayTest {
    public static void main(String[] args) {
        Numbers num1 = new Numbers();
        double suma, average, variance, deviation;
        double[] array;
        array = formArray();
        suma = formSum(array);
        average = findAverage(suma);
        variance = findVariance(array, average);
        deviation = findDeviation(variance);
        resultsDisplay(suma, average, variance, deviation);
        num1.setRandomNumbers(array);
        num1.setSum(suma);
        num1.setAverage(average);
        num1.setVariance(variance);
        num1.setDeviation(deviation);
    }

    public static double[] formArray() {
        Numbers num1 = new Numbers();
        double[] generatedNumbers = new double[200];
        double randomNumber;
        for (int i = 0; i < 200; i++) {
            randomNumber = (int) (Math.random() * 200 + 1);
            generatedNumbers[i] = randomNumber;
        }
        for (int i = 0; i < 200; i++) {
            System.out.printf("%-5.0f", generatedNumbers[i]); // Use printf for formatting
            if ((i + 1) % 10 == 0) {
                System.out.println(); // Start a new line after every 10 numbers
            }
        }
        System.out.println();
        num1.setRandomNumbers(generatedNumbers);
        return generatedNumbers;
    }

    public static double formSum(double[] array) {
        double sum = 0;
        for (double number : array) {
            sum += number;
        }
        return sum;
    }

    public static double findAverage(double suma) {
        double average;
        average = suma / 200;
        return average;
    }

    public static double findVariance(double[] array, double average) {
        double variance = 0;
        for (int i = 0; i < 200; i++) {
            variance += Math.pow(array[i] - average, 2);
        }
        return variance /= 200;
    }

    public static double findDeviation(double variance) {
        double deviation = (double) Math.sqrt(variance);
        return deviation;
    }

    public static void resultsDisplay(double sum, double average, double variance, double deviation) {
        System.out.println("The sum is: " + sum); // Turn expression into its own method
        System.out.println("The average is: " + average);
        System.out.println("The variance is: " + variance);
        System.out.println("The Standard Deviation is: " + deviation);
    }

    static class Numbers {
        double sum, average, variance, deviation;
        double[] randomNumbers;

        public double getSum() {
            return sum;
        }

        public void setSum(double sum) {
            this.sum = sum;
        }

        public double[] getRandomNumbers() {
            return randomNumbers;
        }

        public void setRandomNumbers(double[] RandomNumbers) {
            this.randomNumbers = randomNumbers;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public double getVariance() {
            return variance;
        }

        public void setVariance(double variance) {
            this.variance = variance;
        }

        public double getDeviation() {
            return deviation;
        }

        public void setDeviation(double deviation) {
            this.deviation = deviation;
        }
    }
}
