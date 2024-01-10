import java.util.*;
public class areaofCircleIntersection {
    public static int CircleIntersection(int alpha, int beta, int radiusA, int radiusB) {
        int angle = Math.abs(alpha - beta);
        return (Math.pow(radiusA, 2))*(Math.pow(radiusB, 2))*(Math.sin(angle))/2;
    }
    public static void main(String[] args) {
        
    }
}
