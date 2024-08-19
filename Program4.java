//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

    import java.util.Scanner; 
    
    public class Program4 {
        public static void main(String[] args){
            Scanner myScanner=new Scanner (System.in); //user input
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            double average = 0;
            
            System.out.println ("Enter 1st number: "); // 1st variable
            
            num1 = myScanner.nextInt();
            
            System.out.println ("Enter 2nd number: "); // 2nd variable
            
            num2 = myScanner.nextInt();
            
            System.out.println ("Enter 3rd number: "); // 3rd variable
            
            num3 = myScanner.nextInt();
            
            System.out.println ("Enter 4th number: "); // 4th variable
            
            num4 = myScanner.nextInt();
            
            int total, n;

            double Average;

            average = (double) (num1+num2+num3+num4)/4; //total cast to double, take average of numbers           
            
            System.out.println ("The sum is " + (num1+num2+num3+num4)); // sum of all #s
            System.out.print ("The average is " + average);
            
            
            
            
            
        }
    }

//Paste console output below:
/*
Enter 1st number: 
475
Enter 2nd number: 
821
Enter 3rd number: 
369
Enter 4th number: 
562
The sum is 2227
The average is 556.75
/*


*/
