import java.util.*;
import java.util.stream.Collectors;
class AddTwoList{

public static void addLists(){

List<Integer> list1 = Arrays.asList(1 , 2, 3);
List<Integer> list2 = Arrays.asList(2, 3, 4);

List<Integer> sumList = list1.stream().map(i -> i + list2.get(list1.indexOf(i))).collect(Collectors.toList());

System.out.println(" Sum List: " + sumList);
}

public static void main(String[] args){

addLists();
}
}