
package project2;
import java.util.Scanner;

/**
 *
 * @author Nisagül
 */
/*public class Project2 {
    public static void Entrance() {
     System.out.println("You have 90 seconds to answer as many questions as possible.");
     System.out.println("You will get 5 seconds bonus if you answer 5 questions in a row.");
     System.out.println("Use java arithmetic presedence rules to find answers!");
     System.out.println("Press 'q' to quit or any key to start...");
     System.out.println(""); 
    }//End of Entrance
    
    public static boolean Flevel(int Qcount) {
      Scanner scn = new Scanner(System.in);   
      
      int a = (int)(Math.random()*9+1);
      int b = (int)(Math.random()*9+1);
    
      int limitsOfOperands = (int)(Math.random()*4);
   
    switch(limitsOfOperands) {
        case 0: 
            System.out.println(" ");
            System.out.print("Q" + Qcount + "       ");
            System.out.print(a + "+" + b + " = ");
            int answer = scn.nextInt();
            
            if (answer == a + b) {
                System.out.print("        Correct");
                return true;
            } else {
                System.out.print("        Wrong");
                return false;
            }
        case 1:
            System.out.println(" ");
            System.out.print("Q" + Qcount + "       ");
            System.out.print(a + "-" + b + " = ");
            int answer1 = scn.nextInt();
            
            if (answer1 == a - b) {
                System.out.print("        Correct");
                return true;
            } else {
                System.out.print("        Wrong");
                return false;
            }
        case 2:  
            System.out.println(" ");
            System.out.print("Q" + Qcount + "       ");
            System.out.print(a + "*" + b + " = ");
            int answer2 = scn.nextInt();
            
            if (answer2 == a * b) {
                System.out.print("        Correct");
                return true;
            } else {
                System.out.print("        Wrong");
                return false;
            }
        case 3: 
            System.out.println(" ");
            System.out.print("Q" + Qcount + "       ");
            System.out.print(a + "/" + b + " = ");
            int answer3 = scn.nextInt();
            
            if (answer3 == a / b) {
                System.out.print("        Correct");
                return true;
            } else {
                System.out.print("        Wrong");
                return false;
            }

    }//End of switch
      return false;
      
   }//End of Flevel
   //-------------------------------------------------------- 
    public static boolean Slevel(int Qcount) {
      Scanner scn = new Scanner(System.in); 
      
      int a = (int)(Math.random()*9+1);
      int b = (int)(Math.random()*9+1);   
      int c = (int)(Math.random()*9+1);
      
      int limitsOfOperands = (int)(Math.random()*4);
      
      switch(limitsOfOperands) {
          case 0:
              int limitsOfOperands0 = (int)(Math.random()*4);
              switch(limitsOfOperands0) {
                  case 0:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "+" + b + "+" + c + " = ");
                      int answer = scn.nextInt();
            
                      if (answer == a + b + c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 1:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "+" + b + "-" + c + " = ");
                      int answer1 = scn.nextInt();
            
                      if (answer1 == a + b - c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 2:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "+" + b + "*" + c + " = ");
                      int answer2 = scn.nextInt();
            
                      if (answer2 == a + b * c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 3:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "+" + b + "/" + c + " = ");
                      int answer3 = scn.nextInt();
            
                      if (answer3 == a + b / c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
               }//End of inside switch       
          case 1:
              int limitsOfOperands1 = (int)(Math.random()*4);
              switch(limitsOfOperands1) {
                  case 0:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "-" + b + "+" + c + " = ");
                      int answer = scn.nextInt();
            
                      if (answer == a - b + c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 1:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "-" + b + "-" + c + " = ");
                      int answer1 = scn.nextInt();
            
                      if (answer1 == a - b - c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 2:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "-" + b + "*" + c + " = ");
                      int answer2 = scn.nextInt();
            
                      if (answer2 == a - b * c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 3:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "-" + b + "/" + c + " = ");
                      int answer3 = scn.nextInt();
            
                      if (answer3 == a - b / c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
               }//End of inside switch  
          case 2:
              int limitsOfOperands2 = (int)(Math.random()*4);
              switch(limitsOfOperands2) {
                  case 0:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "*" + b + "+" + c + " = ");
                      int answer = scn.nextInt();
            
                      if (answer == a * b + c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 1:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "*" + b + "-" + c + " = ");
                      int answer1 = scn.nextInt();
            
                      if (answer1 == a * b - c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 2:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "*" + b + "*" + c + " = ");
                      int answer2 = scn.nextInt();
            
                      if (answer2 == a * b * c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 3:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "*" + b + "/" + c + " = ");
                      int answer3 = scn.nextInt();
            
                      if (answer3 == a * b / c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
               }//End of inside switch 
          case 3:
              int limitsOfOperands3 = (int)(Math.random()*4);
              switch(limitsOfOperands3) {
                  case 0:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "/" + b + "+" + c + " = ");
                      int answer = scn.nextInt();
            
                      if (answer == a / b + c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 1:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "/" + b + "-" + c + " = ");
                      int answer1 = scn.nextInt();
            
                      if (answer1 == a / b - c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 2:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "/" + b + "*" + c + " = ");
                      int answer2 = scn.nextInt();
            
                      if (answer2 == a / b * c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
                  case 3:
                      System.out.println(" ");
                      System.out.print("Q" + Qcount + "       ");
                      System.out.print(a + "/" + b + "/" + c + " = ");
                      int answer3 = scn.nextInt();
            
                      if (answer3 == a / b / c) {
                          System.out.print("        Correct");
                          return true;
                     } else {
                          System.out.print("        Wrong");
                          return false;
                     }
               }//End of inside switch       
      }//End of switch
     return false;
    }//End of Slevel
  //------------------------------------------------------- 
   public static void Spattern(int rows, int k) {
       
       System.out.println(" ");
       if(k < 3) {
        
        System.out.print("  ");   
        for (int a = 1; a <= rows; a++) {
           System.out.print("*");
        }
        for (int b = 1; b <= rows; b++) {
        for (int c = 1; c <= rows/3; c++) {
            System.out.print(" ");
        }
        }
        System.out.print("good");
        for (int d = 1; d <= rows; d++) {
        for (int e = 1; e <= rows/3; e++) {
            System.out.print(" ");
        }
        }
        for(int f = 1; f <= rows; f++) {
            System.out.print("*");
        }
        System.out.println(); 
      
        for (int i = 1; i <= rows; i++) {
      for(int s = 1; s <= rows; s++) {
        for (int m = 0; m <= i; m++)
        {
            System.out.print(" ");
        }
        for (int n = 0; n <= rows-i; n++) {
            System.out.print("*");
        }
    } 
      System.out.println();
     } 
           } else {
        int Nrows = ((3 * k) / 4);
        
        System.out.print("  ");
        for (int a = 1; a <= Nrows; a++) {
           System.out.print("*");
        }
        for(int b = 1; b <= Nrows; b++) {
        for (int c = 1; c <= Nrows; c++) {
            System.out.print(" ");
        }
        }
        System.out.print("very good");
        for (int d = 1; d <= Nrows; d++) {
        for (int e = 1; e <= Nrows; e++) {
            System.out.print(" ");
        }
        }
        for(int f = 1; f <= Nrows; f++) {
            System.out.print("*");
        }
        System.out.println(); 
        
        for (int i = 1; i <= Nrows; i++) {
      for(int s = 1; s <= rows; s++) {
        for (int m = 0; m <= i; m++)
        {
            System.out.print(" ");
        }
        for (int n = 0; n <= Nrows-i; n++) {
            System.out.print("*");
        }
    } 
      System.out.println();
     } 
           }//End of if statement
        
   }//End of Spattern
  //-------------------------------------------------------- 
   public static void stat1(int totalQ, int trueCounter, long time) {
        System.out.println(" ");
        System.out.println("TIME IS UP!");
        System.out.println(" ");
        
        System.out.println("Correct Answers: " + trueCounter);
        System.out.println("Total Questions: " + totalQ);
        System.out.println("Total Time: " + time);
        
        if (trueCounter <= (totalQ / 2) && totalQ < 15) {
            System.out.println("You are as fast as a turtle!");
            System.out.println("Sorry!!! You cannot advance to the next level !");
            System.exit(0);
        } else {
            System.out.println("You are as fast as a rabbit!");
            System.out.println("You can advance to the next level !");
            System.out.println("    ");
        }
   }//End of stat1--------------------------------------------
   public static void stat2(int totalQ, int trueCounter, long time) {
        System.out.println(" ");
        System.out.println("TIME IS UP!");
        System.out.println(" ");
        
        System.out.println("Correct Answers: " + trueCounter);
        System.out.println("Total Questions: " + totalQ);
        System.out.println("Total Time: " + time);
        
        if (trueCounter <= (totalQ / 2) && totalQ < 15) {
            System.out.println("You are as fast as a turtle!");
            System.out.println("Sorry! You are not advanced enough.");
        } else {
            System.out.println("You are as fast as 2 rabbits!");
            System.out.println("Congratulations! You just successfully completed two levels.");
        }
   }//End of stat2
 //—————————————————————————————————————————
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic's Exercise Program");
        System.out.println("—————————————————————————");
        Entrance();
       
        String i = scn.nextLine();
        
        if(i.equalsIgnoreCase("q")) {
         System.out.println("The End Of The Program");
         System.exit(0);
         } else {
            
        long time = 0;
        long start = (System.currentTimeMillis() / 1000);
       
        int count = 0;
        int count1 = 0; 
        int trueCounter = 0;
        int falseCounter = 0;
        int Qcount = 1;
        int k = 0;
        while(time < 90) {
            
            boolean result = Flevel(Qcount++);
            
            long current = (System.currentTimeMillis() / 1000);
            time = current-start;
            
            if (result) {
            
                count++; 
            //TIME PART------------------------     
            if (count % 5 == 0){
                time = (current - start) - 5;
                System.out.print(" " + "(You won 5 secs.)");
            }  
            } else {
                count = 0;
            }
            //PATTERN PART----------------------
            
            if (result) {
                
                count1++;
                
            if (count1 % 3 == 0) {
                k++;
                Spattern(k * 3, k);
            }    
            } else {
                count1 = 0;
                k = 0;
            }
            //STATISTIC PART------------------- 
            if (result) {
                trueCounter++;
                
            } else {
                falseCounter++;
            }
       }//End of while
      int totalQ = trueCounter + falseCounter;
      stat1(totalQ, trueCounter, (long)time);
        }// End of if and level 1
        
        //LEVEL 2———————————————————————— 
        Entrance(); 
        
        String m = scn.nextLine();
        
        if(m.equalsIgnoreCase("q")) {
         System.out.println("The End Of The Program");
         System.exit(0);
         } else {
           
        long time = 0;
        long start = (System.currentTimeMillis() / 1000);
       
        int count = 0;
        int count1 = 0; 
        int trueCounter = 0;
        int falseCounter = 0;
        int Qcount = 1;
        int k = 0;
        
        while(time < 90) {  
            
            boolean result = Slevel(Qcount++);
            
            long current = (System.currentTimeMillis() / 1000);
            time = current-start;
            
            if (result) {
            
                count++; 
            //TIME PART------------------------     
            if (count % 5 == 0){
                time = (current - start) - 5;
                System.out.print(" " + "(You won 5 secs.)");
            }  
            } else {
                count = 0;
            }
            //PATTERN PART----------------------
            if (result) {
                
                count1++;
                
            if (count1 % 3 == 0) {
                k++;
                Spattern(k * 3, k);
            }    
            } else {
                count1 = 0;
                k = 0;
            }    
            //STATISTIC 2 PART------------------- 
            if (result) {
                trueCounter++;
                
            } else {
                falseCounter++;
         }
     }//End of while
     int totalQ = trueCounter + falseCounter;
     stat2(totalQ, trueCounter, (long)time);
   }//End of if and level 2       
         
        
    }//End of main
}//End of class      */        
        
   
    
    

