public class CircleCalculator {

    // This exercise is approached with the assumption that Radius is r, Diameter is d, pi is π, Circumference is C and Area is A in the necessary formulas
    public static void main(String[] args) {
        // Declare variables
        double circleRadius = 12.0;
        double pi = 3.141592654;
        double circleDiameter = circleRadius * 2;   // Uses the formula d = 2r
        double circleCircumference = 2 * pi * circleRadius; // Uses the formula C = 2πr
        double circleArea = pi * Math.pow(circleRadius, 2); // Uses the formula A = πr²

        // Outputs
        System.out.println("Circle Diameter: " + circleDiameter);
        System.out.println("Circle Circumference: " + circleCircumference);
        System.out.println("Circle Area: " + circleArea);
    }
}
