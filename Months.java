package months;

public class Months {
    public static void main(String[] args) {
        
        int months = (int) (1 + Math.random() * 12);
        
        switch(months){
            case 1: System.out.println("Random number is " + months + "," + " Month is" + " January" ); break;
            case 2: System.out.println("Random number is " + months + "," + " Month is" + " February" ); break;
            case 3: System.out.println("Random number is " + months + "," + " Month is" + " March" ); break;
            case 4: System.out.println("Random number is " + months + "," + " Month is" + " April" ); break;
            case 5: System.out.println("Random number is " + months + "," + " Month is" + " May" ); break;
            case 6: System.out.println("Random number is " + months + "," + " Month is" + " June" ); break;
            case 7: System.out.println("Random number is " + months + "," + " Month is" + " July" ); break;
            case 8: System.out.println("Random number is " + months + "," + " Month is" + " August" ); break;
            case 9: System.out.println("Random number is " + months + "," + " Month is" + " September" ); break;
            case 10: System.out.println("Random number is " + months + "," + " Month is" + " October" ); break;
            case 11: System.out.println("Random number is " + months + "," + " Month is" + " November" ); break;
            case 12: System.out.println("Random number is " + months + "," + " Month is" + " December" ); break;
                
        }
    }
    
}
