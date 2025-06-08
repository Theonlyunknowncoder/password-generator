import java.util.Random;
import java.util.Scanner;
public class passgenerator {
    public static void main(String[] args) {
        Random random = new Random();
                Scanner scanner = new Scanner(System.in);
 System.out.println("enter the no of letter");
        int n=scanner.nextInt();
                for (int i=0;i<n;i++){
        int randomLetter = 1 + random.nextInt(4); 
        switch(randomLetter){
        
        case 1:int num =random.nextInt(10);
        System.out.print( num);
            break;
            
            case 2:char upper = (char) ('A' + random.nextInt(26));
        System.out.print(upper);
            break;
            case 3: char lower = (char) ('a' + random.nextInt(26));
        System.out.print(lower);
            break;
            case 4:char symbol = (char) ('!' + random.nextInt(9));
        System.out.print( symbol);
            break;
        }
        
       
    }
}
}
 
