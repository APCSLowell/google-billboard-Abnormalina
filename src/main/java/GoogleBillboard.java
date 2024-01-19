public class GoogleBillboard {
public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";
public static void main(final String[] args) {
  int ten = 10;
  int index = 1;
  boolean primeFound = false;

while ((!primeFound) && index + ten <= e.length()) {
        String substring = e.substring(index, index + ten);
        double parsedDouble = Double.parseDouble(substring);

    if (isPrime(parsedDouble)) {
                  System.out.println(parsedDouble);
                  primeFound = true;
              } 

              index++;
       }

    }
public static boolean isPrime(double num){
  if (num < 2){
    return false;
  }
  for(int i=2; i<=Math.sqrt(num); i++){
    if(num%i==0){
  return false;
  }
  }
  return true;
}
}
