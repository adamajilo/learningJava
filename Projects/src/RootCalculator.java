public class RootCalculator {
    public static void main(String[] args) {
        
        int a = 1, b = 4, c = 6;

        double x1 = (-b + Math.sqrt(b * b -4 * a * c)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(b * b -4 * a * c)) / (2.0 * a);

        if (x1 == x2)
            System.out.println("x1 = x2 = " + x1);
        else if (x1 != x2)
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
        
    }
}
