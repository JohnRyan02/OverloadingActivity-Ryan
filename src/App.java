public class App {
    /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    /**
     * 
     * Create method that returns the greater integer value
     */
    private static int greaterValue(int n1, int n2){
        if(n1 > n2){
            return n1;
        }else if(n2 > n1){
            return n2;
        }
        return greaterValue(n1, n2);
        
    }
    /**
     * 
     * Create method that returns the greater double value
     */
    private static double greaterValue(double a, double b){
        if(a > b){
            return a;
        }else if(b > a){
            return b;
        }
        return greaterValue(a, b);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("The sum of 50 and 60 is " + App.computeSum(50, 60));
        System.out.println("The sum of 80, 70, and 90 is " + App.computeSum(80, 70, 90));
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 50 and 150 is " + greaterValue(150,50));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 7.4 and 5.9 is " + greaterValue(5.9,7.4));

    }
}
