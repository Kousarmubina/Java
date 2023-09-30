//used for nested loop(while,for)
//PrimeV3.java
public class Prime {

    public static void main(String[] args) {

        int low = 23, high = 97;

        while (low <= high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}