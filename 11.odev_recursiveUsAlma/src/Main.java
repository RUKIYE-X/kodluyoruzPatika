import java.util.Scanner;

public class Main {
        static int uslu(int taban,int us){
            if(us == 0){
                return 1;
            }
            return taban*uslu(taban,--us);
    }
    public static void main(String[] args) {
        System.out.println(uslu(2,5));
    }
}