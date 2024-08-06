import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
public class Enchanted {
   static String start;         
  public static void main (String [] args)  {
    new Enchanted();
  }
   public Enchanted () {

    try (Scanner sc = new Scanner (System.in);){
    File file = new File ("C:\\Users\\MAF\\Music\\Enchanted\\Enchanted.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    SongLines call = new Line();
    
    
    System.out.print("Ketik 1 kalau Enchanted : ");
    start = sc.next();
    clip.start();
    Clear();
    call.FirstLine();
    Clear();
    call.SecondLine();
    Clear();
    call.ThirdLine();
    Clear();
    call.FourthLine();
    Clear();
    call.FifthLine();
    Clear();
    call.SixthLine();
    Clear();
    call.SeventhLine();
    Clear();
    call.Pleasedontbeinlovewithsomeonelse();
    Clear();
    call.WaitingonYou();
    Clear();
    System.out.println("Repeat the program? (Yes/No)");
    start = sc.next();

    if (start.equalsIgnoreCase("Yes")) {
      new Enchanted();
    }
    else if (start.equalsIgnoreCase("No")) {
      System.out.println("Thank You!!");
    }
    else {
      System.out.println("Invalid Response");
    }
 
      
    }
    catch (Exception e) {

    }
  }

    public static abstract class SongLines {               
      public abstract void FirstLine();
      public abstract void SecondLine();
      public abstract void ThirdLine();
      public abstract void FourthLine();
      public abstract void FifthLine();
      public abstract void SixthLine();
      public abstract void SeventhLine();
      public abstract void Pleasedontbeinlovewithsomeonelse();
      public abstract void WaitingonYou();
    }
    public static class Line extends SongLines {      

      @Override
      public void FirstLine (){
      try {
      Thread.sleep(2000);
      System.out.print("This");
      System.out.print(" ");
      Thread.sleep(450);
      System.out.print("is");
      System.out.print(" ");
      Thread.sleep(490);
      System.out.print("me");
      System.out.print(" ");
      Thread.sleep(490);
      System.out.print("praying");
      System.out.print(" ");
      Thread.sleep(550);
      System.out.print("that");
      System.out.print(" ");
      Thread.sleep(1000);
      System.out.println();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
      @Override 
      public void SecondLine(){
      try {
      Thread.sleep(400);
      System.out.print("This");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("was");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("the");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("very");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("first");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("page");
      System.out.print(" ");
      Thread.sleep(500);
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override 
      public void ThirdLine(){
      try {
      Thread.sleep(400);
      System.out.print("Not");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("where");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("the");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("story");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("line");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("ends");
      System.out.print(" ");
      Thread.sleep(500);
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
 @Override 
      public void FourthLine(){
      try {
      Thread.sleep(400);
      System.out.print("My");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("thoughts");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("will");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("echo");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("your");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("name");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override 
      public void FifthLine(){
      try {
      Thread.sleep(400);
      System.out.print("Until");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("I");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("see");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("you");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("again");
      Thread.sleep(700);
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

 @Override 
      public void SixthLine(){
      try {
      Thread.sleep(400);
      System.out.print("These");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("are");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("the");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("words");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("I");
      Thread.sleep(400); 
      System.out.print(" ");
      System.out.print("held");
      Thread.sleep(400); 
      System.out.print(" ");
      System.out.print("back");
      Thread.sleep(600);
      System.out.println();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

   @Override 
      public void SeventhLine(){
      try {
      Thread.sleep(400);
      System.out.print("as");
      System.out.print(" ");
      Thread.sleep(200);
      System.out.print("I");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("was");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("leaving");
      System.out.print(" ");
      Thread.sleep(400);
      System.out.print("too");
      Thread.sleep(400); 
      System.out.print(" ");
      System.out.print("soon");
      Thread.sleep(900); 
      System.out.print(" ");
      System.out.print("I");
      Thread.sleep(400);  
      System.out.print(" ");
      System.out.print("was");
      Thread.sleep(400);  
      System.out.print(" ");
      System.out.print("enchanted");
      Thread.sleep(800); 
      System.out.print(" ");
      System.out.print("to");
      Thread.sleep(400);  
      System.out.print(" ");
      System.out.print("meet");
      Thread.sleep(650); 
      System.out.print(" ");
      System.out.print("you");
      Thread.sleep(2300);
      System.out.println();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  @Override 
      public void Pleasedontbeinlovewithsomeonelse(){
      try {
      Thread.sleep(400);
      System.out.print("Please");
      System.out.print(" ");
      Thread.sleep(700);
      System.out.print("don't");
      System.out.print(" ");
      Thread.sleep(700);
      System.out.print("be");
      System.out.print(" ");
      Thread.sleep(500);
      System.out.print("inlove");
      System.out.print(" ");
      Thread.sleep(700);
      System.out.print("with");
      Thread.sleep(500); 
      System.out.print(" ");
      System.out.print("someone");
      Thread.sleep(1000); 
      System.out.print(" ");
      System.out.print("e");
      Thread.sleep(700); 
      System.out.print(" ");
      System.out.print("else");
      Thread.sleep(700);
      System.out.println();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

   @Override 
      public void WaitingonYou(){
      try {
      Thread.sleep(400);
      System.out.print("Please");
      System.out.print(" ");
      Thread.sleep(700);
      System.out.print("don't");
      System.out.print(" ");
      Thread.sleep(700);
      System.out.print("have");
      System.out.print(" ");
      Thread.sleep(500);
      System.out.print("somebody");
      System.out.print(" ");
      Thread.sleep(700);
      System.out.print("waiting");
      Thread.sleep(500); 
      System.out.print(" ");
      System.out.print("on");
      Thread.sleep(800); 
      System.out.print(" ");
      System.out.print("you");
      Thread.sleep(2000);
      System.out.println();

      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}

    public void Clear() {
      try {
        final String os = System.getProperty("os.name");
  
        if (os.contains("Windows")) {
          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
          System.out.print("\033[H\033[2J");
          System.out.flush();
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
  

}
}