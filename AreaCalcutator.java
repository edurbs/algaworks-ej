
public class AreaCalcutator{

    public static void main (String[] args){
        System.out.println(GeometricCalc.circle(10));
        System.out.println(GeometricCalc.square(10));
    }

    public class GeometricCalc{
        private static double pi = 3.14159265358979323846;

        public static double square (double side){
            return side * side;        
        }

        public static double circle(double radius){
            return radius * radius * pi;
        }
    }
}