
public class Trailing0inFactorial {

    //count the no of 5's
    //algo1  iteratte from 2 to n and find count no of 5's in every multiple of 5
    private static void Algo1find0(int n) {
        
        if(n<5)
            System.out.println("0");
        int temp,rem,count = 0;
        
        for(int i=5; i<=n;i=i+5)
        {
            temp = i;
            rem = temp%5;
            while(rem == 0)
            {
                count++;
                temp = temp/5;
                rem = temp%5;
            }
        }

        System.out.println(count);
    }
    
    //algo2 count how many numebrs are multiples of 5/25/125/625.....
    private static void Algo2find0(int n) {
        
        int count = 0;
        
        for(int i = 5; n/i>0 ; i =i*5)
        {
            count = count + n/i;
        }

        System.out.println(count);
    }
    
    public static void main(String[] args) {
        
        Algo1find0(30);
        Algo2find0(30);
    }
}
