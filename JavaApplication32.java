
package javaapplication32;

import java.util.Scanner;

public class JavaApplication32 {
    static int usalma(int a, int b){
        if(b==0){
            return 1;
        }
        return a* usalma(a, (b-1));
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("taban ve ussu sirayla gir: ");
        int s1=input.nextInt();
        int s2=input.nextInt();
        System.out.println(usalma(s1, s2));
        
    }
    
}
