import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class transup {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("LOGIN");
        System.out.println("--------------------------------");
        BufferedReader jp = new BufferedReader(new FileReader("D:\\japanese.txt"));
        String jline;
        int i=0;
        while ((jline = jp.readLine()) != null){
            String[] jstr = jline.split("-");
            System.out.println(jstr[0]);
        }
        System.out.println("--------------------------------");
        System.out.println("1.add\n2.translate\n3.exit");
        while (true){
            String opt = sc.nextLine();
            if(opt.equals("3")){
                break;
            }
            else if(opt.equals("1")){
                add();
            }
            else if(opt.equals("2")){
                System.out.println("Select your language :");
                System.out.println("1.Tamil\n2.Japanese\n3.German");
                String choice = sc.nextLine();
                if(choice.equals("1")){
                    tamil();
                }
                else if(choice.equals("2")){
                    japanese();
                }
                else if(choice.equals("3")){
                    german();
                }
                else{
                    System.out.println("Invalid Choice entered");
                }
            }
        }

    }

    private static void add() throws IOException {
        System.out.println("enter the field to add");
        String word = sc.nextLine();
        System.out.println("enter Tamil meaning");
        String tamil = sc.nextLine();
        System.out.println("enter Japanese meaning");
        String japanese = sc.nextLine();
        System.out.println("enter German meaning");
        String german = sc.nextLine();
        FileWriter gfr = new FileWriter("D:\\german.txt",true);
        BufferedWriter gbr = new BufferedWriter(gfr);
        PrintWriter gpr = new PrintWriter(gbr);
        FileWriter twr = new FileWriter("D:\\tamil.txt",true);
        BufferedWriter tbr = new BufferedWriter(twr);
        PrintWriter tpr = new PrintWriter(tbr);
        FileWriter jwr = new FileWriter("D:\\japanese.txt",true);
        BufferedWriter jbr = new BufferedWriter(jwr);
        PrintWriter jpr = new PrintWriter(jbr);
        jpr.print(word);
        jpr.print("-");
        jpr.print(japanese);
        jpr.println();
        jpr.close();
        gpr.print(word);
        gpr.print("-");
        gpr.print(german);
        gpr.println();
        gpr.close();
        tpr.print(word);
        tpr.print("-");
        tpr.print(tamil);
        tpr.println();
        tpr.close();
        System.out.println("added successfully !");
        System.out.println("1.add\n2.translate\n3.exit");
    }


    private static void german() throws IOException {
        BufferedReader gr = new BufferedReader(new FileReader("D:\\german.txt"));
        String gline;
        int i=0;
        System.out.println("LOGIN");
        System.out.println("--------------------------------");
        while ((gline = gr.readLine()) != null){
            String[] gstr = gline.split("-");
            System.out.println( gstr[1]);
        }
        System.out.println("--------------------------------");
        System.out.println("1.add\n2.translate\n3.exit");
    }

    private static void japanese() throws IOException {
        BufferedReader jp = new BufferedReader(new FileReader("D:\\japanese.txt"));
        String jline;
        int i=0;
        System.out.println("LOGIN");
        System.out.println("--------------------------------");
        while ((jline = jp.readLine()) != null){
            String[] jstr = jline.split("-");
            System.out.println(jstr[1]);
        }
        System.out.println("--------------------------------");
        System.out.println("1.add\n2.translate\n3.exit");
    }

    private static void tamil() throws IOException {
        BufferedReader tp = new BufferedReader(new FileReader("D:\\tamil.txt"));
        String tline;
        int i=0;
        System.out.println("LOGIN");
        System.out.println("--------------------------------");
        while ((tline = tp.readLine()) != null){
            String[] tstr = tline.split("-");
            System.out.println(tstr[1]);
        }
        System.out.println("--------------------------------");
        System.out.println("1.add\n2.translate\n3.exit");
    }
}