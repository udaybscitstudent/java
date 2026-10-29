package General_program.difficult_program;  //it is not compulsory , it is the folder name of the program

import java.util.Scanner;
public class number_to_words {
     public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n=1;
        while(n!=-1){
            System.out.println("\nEnter Below 10,00000[-1 for exit]");
            n = obj.nextInt();
            int digit = String.valueOf(Math.abs((long)n)).length();
            while(n!=0){
                if(digit==6){
                    int r = n/100000;
                    n=n%100000;
                    digit=5;
                    switch(r){
                        case 1:
                            System.out.print("One Lakh ");break;
                        case 2:
                            System.out.print("Two Lakh ");break;
                        case 3:
                            System.out.print("Three Lakh ");break;
                        case 4:
                            System.out.print("Four Lakh ");break;
                        case 5:
                            System.out.print("Five Lakh ");break;
                        case 6:
                            System.out.print("Six Lakh ");break;
                        case 7:
                            System.out.print("Seven Lakh ");break;
                        case 8:
                            System.out.print("Eight Lakh ");break;
                        case 9:
                            System.out.print("Nine Lakh ");break;
                    }
                }
                // woring for fifth digit number
                else if(digit==5){
                    int r = n/1000;
                    n=n%1000;
                    digit =3;
                    //two digit thousands
                    int sd=r;
                    while(sd!=0){
                        if(r>=20){
                            int td = r/10;
                                r=r%10;
                            switch(td){
                                case 2:
                                    System.out.print("Twenty ");break;
                                case 3:
                                    System.out.print("Thirty ");break;
                                case 4:
                                    System.out.print("Forty ");break;
                                case 5:
                                    System.out.print("Fifty ");break;
                                case 6:
                                    System.out.print("Sixty ");break;
                                case 7:
                                    System.out.print("Seventy ");break;
                                case 8:
                                    System.out.print("Eighty ");break;
                                case 9:
                                    System.out.print("Ninty ");break;
                            }
                        }
                        else if(r<20){
                            sd=0;
                            switch(r){
                                case 19:
                                    System.out.print("Nineteen Thousand ");break;
                                case 18:
                                    System.out.print("Eighteen Thousand ");break;
                                case 17:
                                    System.out.print("Seventeen Thousand ");break;
                                case 16:
                                    System.out.print("Sixteen Thousand ");break;
                                case 15:
                                    System.out.print("Fifteen Thousand ");break;
                                case 14:
                                    System.out.print("Fourteen Thousand ");break;
                                case 13:
                                    System.out.print("Thirteen Thousand ");break;
                                case 12:
                                    System.out.print("Twelve Thousand ");break;
                                case 11:
                                    System.out.print("Eleven Thousand ");break;
                                case 10:
                                    System.out.print("Ten Thousand ");break;
                                case 9:
                                    System.out.print("Nine Thousand ");break;
                                case 8:
                                    System.out.print("Eight Thousand ");break;
                                case 7:
                                    System.out.print("Seven Thousand ");break;
                                case 6:
                                    System.out.print("Six Thousand ");break;
                                case 5:
                                    System.out.print("Five Thousand ");break;
                                case 4:
                                    System.out.print("Four Thousand ");break;
                                case 3:
                                    System.out.print("Three Thousand ");break;
                                case 2:
                                    System.out.print("Two Thousand ");break;
                                case 1:
                                    System.out.print("One Thousand ");break;
                                case 0:
                                    System.out.print("Thousand ");break;
                            }
                        }
                    }
                }
                
                // woring for fourth digit number
                else if(digit==4){
                    int r = n/1000;
                    n=n%1000;
                    digit = 3;
                    switch(r){
                        case 1:
                            System.out.print("One Thousand ");break;
                        case 2:
                            System.out.print("Two Thousand ");break;
                        case 3:
                            System.out.print("Three Thousand ");break;
                        case 4:
                            System.out.print("Four Thousand ");break;
                        case 5:
                            System.out.print("Five Thousand ");break;
                        case 6:
                            System.out.print("Six Thousand ");break;
                        case 7:
                            System.out.print("Seven Thousand ");break;
                        case 8:
                            System.out.print("Eight Thousands ");break;
                        case 9:
                            System.out.print("Nine Thousands ");break;
                    }
                    
                }
                
                // working for third digit number
                else if(digit==3){
                    int r = n/100;
                    n=n%100;
                    digit = 2;
                    switch(r){
                        case 0:
                            System.out.print("");break;
                        case 1:
                            System.out.print("One Hundred ");break;
                        case 2:
                            System.out.print("Two Hundred ");break;
                        case 3:
                            System.out.print("Three Hundred ");break;
                        case 4:
                            System.out.print("Four Hundred ");break;
                        case 5:
                            System.out.print("Five Hundred ");break;
                        case 6:
                            System.out.print("Six Hundred ");break;
                        case 7:
                            System.out.print("Seven Hundred ");break;
                        case 8:
                            System.out.print("Eight Hundred ");break;
                        case 9:
                            System.out.print("Nine Hundred ");break;
                    }
                    
                }
                
                // working for second digit number
                else if(digit==2 && n>=20){
                    int r = n/10;
                    n=n%10;
                    switch(r){
                        case 2:
                            System.out.print("Twenty ");break;
                        case 3:
                            System.out.print("Thirty ");break;
                        case 4:
                            System.out.print("Forty ");break;
                        case 5:
                            System.out.print("Fifty ");break;
                        case 6:
                            System.out.print("Sixty ");break;
                        case 7:
                            System.out.print("Seventy ");break;
                        case 8:
                            System.out.print("Eighty ");break;
                        case 9:
                            System.out.print("Ninty ");break;
                    }
                }
                else if(n>=1 && n<20){
                    int r=n;
                    n=0;
                    switch(r){
                        case 19:
                            System.out.print("Nineteen ");break;
                        case 18:
                            System.out.print("Eighteen ");break;
                        case 17:
                            System.out.print("Seventeen ");break;
                        case 16:
                            System.out.print("Sixteen ");break;
                        case 15:
                            System.out.print("Fifteen ");break;
                        case 14:
                            System.out.print("Fourteen ");break;
                        case 13:
                            System.out.print("Thirteen ");break;
                        case 12:
                            System.out.print("Twelve ");break;
                        case 11:
                            System.out.print("Eleven ");break;
                        case 10:
                            System.out.print("Ten ");break;
                        case 9:
                            System.out.print("Nine ");break;
                        case 8:
                            System.out.print("Eight ");break;
                        case 7:
                            System.out.print("Seven ");break;
                        case 6:
                            System.out.print("Six ");break;
                        case 5:
                            System.out.print("Five ");break;
                        case 4:
                            System.out.print("Four ");break;
                        case 3:
                            System.out.print("Three ");break;
                        case 2:
                            System.out.print("Two ");break;
                        case 1:
                            System.out.print("One ");break;
                    }
                }
                else{
                    System.out.println("\nPlease Enter Till Six Digit Number");
                    break;
                }
            }
            System.out.println();
        }
        obj.close();
    }
}
