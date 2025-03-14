import java.util.Scanner; 

public class PrintIterasi { 
    public static void main(String[] args) { 
        int N; 
        int i; 
        Scanner masukan = new Scanner(System.in); 
        
        System.out.print("Nilai N > 0 = ");  
        N = masukan.nextInt(); 
        
        i = 1; // First element 
        System.out.print("Print i dengan ITERATE : \n");  
        
        while (true) { 
            System.out.println(i);  
            if (i == N)  
                break; 
            else {  
                i++;  
            }  
        }  

    } 
}
