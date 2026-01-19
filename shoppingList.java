import java.util.ArrayList;
public class shoppingList {
public static void main(String[] args) {
ArrayList<String> shoppingList = new ArrayList<String>();
shoppingList.add("Bananas");
shoppingList.add("Apples");
shoppingList.add("Oranges");
shoppingList.add("Grapes");
for(String x: shoppingList){
System.out.println(x+" ");
}
}
}