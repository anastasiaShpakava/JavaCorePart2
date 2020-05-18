public class HelloWorld {   
 public static void main(String[] args) { 
    System.out.println("Hello, world!"); 
 }   
}

/////////////////


public class CommandLineParams { 
public static void main(String[] args)   
  {       
  for(int i = args.length - 1; i >= 0; --i)        
 {            
 System.out.println("Argument " + i + " = " + args[i]);     
    }  
  }
}

/////////////

public class CommandLinealculator { 
public static void main(String[] args)   
  {       
    for(int i = 0; i < args.length; i++) {
           

System.out.println("Name" + " " + args[i]);
    }

}


//////////////

import java.util.Scanner;
public class CommandLinealculator { 
public static void main(String[] args)  { 
  int x, y, sum, razn, proizv;
 
      System.out.println("Vvedi dva chisla dlya vichislebia ih summa, raznosti, proizvedenia");
      Scanner scanner = new Scanner(System.in);
     
      x = scanner.nextInt();
      y = scanner.nextInt();
      sum = x + y;
razn = x-y;
proizv = x * y;
     
      System.out.println("Summa chisel = " + sum);
System.out.println("Raznost chisel = " + razn);
System.out.println("Proizvedenie chisel = " + proizv);

}
}
