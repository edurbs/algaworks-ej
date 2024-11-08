package modulo01_08;

public class AreaCalcutator{

    public static void main (String[] args){
        System.out.println(GeometricCalc.circle(10));
        System.out.println(GeometricCalc.square(10));

        int[] notas1 = new int[5]; // 0,0,0,0
        notas1 = new int[]{1,2,3,4,5};

        int[] notas2 = {1,2,3,4,5};

        int[] notas3;        
        notas3 = new int[]{1,2,3,4,5};

        int[] notas4 = new int[]{1,2,3,4,5};

        System.out.println(notas1);

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