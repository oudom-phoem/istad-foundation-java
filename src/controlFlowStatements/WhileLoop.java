package controlFlowStatements;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {

        String welcomeMessage = """
                
                ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗
                ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝
                ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗ \s
                ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝ \s
                ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗
                 ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝
                                                                             \s
                
               """;

        int i = 0;
        while (true) {
            Thread.sleep(10);
            System.out.print(welcomeMessage.charAt(i));
            i++;
            if (i == welcomeMessage.length()) {
                break;
            }
        }

        programLoop:
        while (true){
            System.out.println("""
                \n1. Get all Products
                2. Search Product by UUID
                3. Delete Product by UUID
                4. Exit
                """);
            System.out.print("[+] Insert option: ");
            int opt = new Scanner(System.in).nextInt();
            switch (opt){
                case 1,10,100-> System.out.println("Option 1");
                case 2-> System.out.println("Option 2");
                case 3-> System.out.println("Option 3");
                case 4-> {
                    System.out.println("Option 4");
                    break programLoop;
                }
            }
        }

    }
}
