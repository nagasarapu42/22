class CompareStrings{

public static void main(String args[]){

String str1 = "apple";
String str2 = "apple";
checkStrings(str1, str2);
}

public static void checkStrings(String str1, String str2){


int result = str1.compareTo(str2);

System.out.println(result);
}


}