public class MOverload {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10)); // Calls add(int, int)
        System.out.println(calc.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println(calc.add(5.5f, 10.5f)); // Calls add(float, float)
        
    }

}

 class Calculator {

        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        float add(float a, float b) {
            return a + b;
        }
    }
