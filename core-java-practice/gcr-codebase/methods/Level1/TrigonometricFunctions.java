package Methods;

public class TrigonometricFunctions {

    public double[] calculateTrigonometricFunctions(
            double angle) {

        double radians =
                Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }
}