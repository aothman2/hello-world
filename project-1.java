// This program for gamers
import java.util.Scanner;
 
  public class project-1
  {
    public static void main(String[] args)
    {
     
      int SpeedGPU,SpeedCPU;
      int Cores, Monitor;
      double performance;
      double Multiplier;
      
      final double a1280x720 = 1;
      final double b1920x1080 = 0.75;
      final double c2560x1440 = 0.55;
      final double d3840x2160 = 0.35;
      
      final int _1280x720 = 1;
      final int _1920x1080 = 2;
      final int _2560x1440 = 3;
      
      
Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the clock speed of your GPU? ");
      SpeedGPU = keyboard.nextInt();
      
      System.out.print("What is the clock speed of your CPU? ");
      SpeedCPU = keyboard.nextInt();
      
      System.out.print("How many cores are in your CPU? ");
      Cores = keyboard.nextInt();
     
      System.out.print("What is your resolution of your monitor?\n" 
      + "1.1280x720\n"
      + "2.1920X1080\n"
      + "3.2560x1440\n"
      + "4.3840x2160\n");
     Monitor = keyboard.nextInt();
     
    if(Monitor == _1280x720)
    {
    Multiplier = a1280x720;
    }
    else if(Monitor == _1920x1080)
    {
    Multiplier = b1920x1080;
    }
    else if(Monitor == _2560x1440)
    {
    Multiplier = c2560x1440;
    }
    else
    {
    Multiplier = d3840x2160;
    }
    
    performance =((5 * SpeedGPU) + (Cores * SpeedCPU)) * Multiplier;
    
    
    System.out.println("GPU Clock Speed:"+ SpeedGPU);
    System.out.println("CPU Clock Speed:"+ SpeedCPU);
    System.out.println("Number of cores:"+ Cores);
    
    if(Monitor == 1)
    {
    System.out.println("Monitor Resolution: 1280x720");
    }
    else if (Monitor == 2)
    {
    System.out.println("Monitor Resolution: 1920x1080");
    }
    else if (Monitor == 3)
    {
    System.out.println("Monitor Resolution: 2560x1440");
    }
    else 
    {
    System.out.println("Moniter Resolution: 3840x2160");
    }  
    System.out.printf("Performance Score:%,.2f\n",performance);
    
    if(performance < 11000)
    {
    System.out.println("Recommended Graphics Quality: Unable to play");
    }
    else if (performance < 13000)
    {
    System.out.println("Recommended Graphics Quality: Low");
    }
    else if (performance < 15000)
    {
    System.out.println("Recommended Graphics Quality: Medium");
    }
    else if (performance < 17000)
    {
    System.out.println("Recommanded Graphics Quality: High");
    }
    else
    {
    System.out.println("Recommanded Graphics Quality: Ultra");
    } 
     
     }
      }