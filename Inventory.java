import java.util.Scanner;
public class Inventory {

public static void main(String[] args) {
        Tool tool = new Tool();
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("Please enter the number of tools to enter: ");
        int counter = keyboard.nextInt();
        for(int i=0; i<counter; i++)
        { 
    
        System.out.println("Please enter the tool ID: ");
        tool.setToolID(keyboard.nextInt());
        System.out.println("Please enter the tool name: ");
        tool.setToolName(keyboard.next());
        System.out.println("Please enter the quantity: ");
        tool.setToolQuantity(keyboard.nextInt());
        System.out.println("Please enter the price: ");
        tool.setToolPrice(keyboard.nextDouble());
        
        tool.saveData(); 
        
        }
    }
}
