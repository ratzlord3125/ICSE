import java.util.*;
class _strtemp
{
    
public static void main() {
        Scanner reader = new Scanner(System.in);
        String tempStr;

        System.out.print("Enter the strings > ");
        String s1 = new String(reader.nextLine());

        String[] t1 = s1.split("");

        for (int t = 0; t < t1.length - 1; t++) {
            for (int i= 0; i < t1.length - t -1; i++) {
                if(t1[i+1].compareTo(t1[i])<0) {
                    tempStr = t1[i];
                    t1[i] = t1[i + 1];
                    t1[i + 1] = tempStr;
                }
            }
        }
        for (int i = 0; i < t1.length; i++) {
            System.out.println(t1[i]);
        }
   }
}