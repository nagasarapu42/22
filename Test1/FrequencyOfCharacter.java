import java.util.*;
class FrequencyOfCharacter{

public static void findFrequency(String result){

Map<Character, Integer> frequency = new HashMap<>();

for(int i=0; i<result.length(); i++){
char c = result.charAt(i);
frequency.put(c, frequency.getOrDefault(c, 0) + 1);

} 
for(Map.Entry<Character, Integer> entry : frequency.entrySet()) {
System.out.println(entry.getKey()+"  " + entry.getValue());
}
}

public static void main(String[] args){
String value = "shivaprasad";
findFrequency(value);
} 


}