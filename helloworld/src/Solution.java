import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        while(!(s.equals("exit"))){
            if(catchException(s)){
                print(s);
            }
            if(s.contains(".")){
                Double a = Double.parseDouble(s);
                print(a);
            }
            else if((Integer.parseInt(s)>0)&&(Integer.parseInt(s)<128))
                print((short) Integer.parseInt(s));
            else if(Integer.parseInt(s)>=128)
                print(Integer.parseInt(s));
            s = reader.readLine();
        }
    }

    private static boolean catchException(String s) {
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
