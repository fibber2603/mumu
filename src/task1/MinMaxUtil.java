package task1;

public class MinMaxUtil {
    public static int min(int a, int b){
     return Math.min(a, b);
    }
    public static int min(int a, int b, int c){
        return Math.min(min(a, b), c);
    }
    public static int min(int a, int b, int c, int d){
        return Math.min(min(a, b, c), d);
    }
    public static int min(int a, int b, int c, int d, int e){
        return Math.min(min(a, b, c, d), e);
    }
    // максимальное значение
    public static int max(int a, int b){
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c){
        return Math.max(max(a, b), c);
    }
    public static int max(int a, int b, int c, int d){
        return Math.max(max(a, b, c), d);
    }
    public static int max(int a, int b, int c, int d, int e){
        return Math.max(max(a, b, c, d), e);
    }
}
