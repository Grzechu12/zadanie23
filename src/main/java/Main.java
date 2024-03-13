// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Random randomNumbers = new Random();
   

    

    
  
    

    int number1 = randomNumbers.nextInt(100);
    int number2 = randomNumbers.nextInt(100);
    int suma=number1+number2;
    int sumakwa1=number1*number1;
    int sumakwa2=number2*number2;
    int sumakwadrat=sumakwa1+sumakwa2;
      
    
    System.out.println("liczba 1"+ number1);
    System.out.println("liczba 2"+ number2);
    System.out.println("suma kwadratów "+sumakwadrat);
 
    System.out.println("suma " + suma);

    
 

   
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}