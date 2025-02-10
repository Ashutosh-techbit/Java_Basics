import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class  TakeInput {
    
   public static void main(String[] args) throws NumberFormatException, IOException {
    
System.out.println("Enter input :");

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println(num);




// ----OLD WAYS for taking input---
//  InputStreamReader in = new InputStreamReader(System.in);
//  BufferedReader br = new BufferedReader(in);

//  int num =  Integer.parseInt(br.readLine());
//  System.out.println(num);
   }

}
