class RemoveZeros{

    public static void main(String args[]){
	
	    String str = "000001235069";
		removeHeaderZeros(str);
	
	}

    public static void removeHeaderZeros(String str){
	
	    StringBuffer sb = new StringBuffer(str);
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            sb.deleteCharAt(i);
        }
          String result = sb.toString();

          System.out.println(result);
	}
}