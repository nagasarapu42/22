import java.util.*;
import java.util.stream.Collectors;
class PrintList{

public static void printLists(){

List<Integer> nums = Arrays.asList(1 , 2, 3, 4, 5, 6, 7, 8, 9, 10);

List<Integer> evenNumbers  = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

System.out.println(" even Numbers" + evenNumbers);

List<Integer> oddNumbers = nums.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
System.out.println(" Odd Numbers" + oddNumbers);

}

public static void main(String args[]){
printLists();
}
}