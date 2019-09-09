/* You might already aware about what is a Factorial number
A factorial number is a number which multiplies itself with a number below to itself
for example factorial 5! means 5x4x3x2x1 and if u sum it up it equals 120 */

/* Here i am creating a method and pass an integer as factorial number see the result
i am only gonna pass integer and method will the factorial calculation by its own*/

public class Program{
  public static void main(String[] args) {
    // pass a vlue to the method fact
    
    System.out.println(fact(5));
    
  }
  
  public static int fact(int n){
     if (n <= 1 ){
       return 1;
       else
       return n * fact(n-1); // here its calling itself
     }
  }
  
}

// the output will be 120
// the calculations stored in memory
