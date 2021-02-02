package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("against method")) {
            return "A 1975 book about the philosophy of science by Paul Feyerabend, in which the author argues that science is an anarchic enterprise, not a nomic (customary) one.[1] In the context of this work, the term anarchy refers to epistemological anarchy.";
        }
        if (query.toLowerCase().contains("what is your name")) {
                    return "Amor Fati";
        }
        if (query.toLowerCase().contains("Theresa May")) {
                    return "2016";
        }
        if (query.toLowerCase().contains("Eiffel")) {
                    return "Paris";
        }
        if (query.toLowerCase().contains("Dr No")) {
                    return "Sean Connery";
        }

        if (query.toLowerCase().contains("prime")) {
          String[] arr = query.split(": ");
					//for (int i = 2; i <= num / 2; ++i) {
						// condition for nonprime number
					//	if (num % i == 0) {
				//			flag = true;
					//		break;
					//	}
					//}
        }
        if (query.toLowerCase().contains("both a square and a cube")) {
                    String[] arr = query.split(": ");
                    arr = arr[2].split(", ");
                    for (String a : arr){
                      Integer curr = Integer.parseInt(a);
                      double sq = Math.sqrt(curr);
                      int cb = (int) Math.round(Math.pow(curr, 1.0/3.0));
                      if ((sq - Math.floor(sq)) == 0 && (curr == cb * cb * cb)) {
                        return curr.toString();
                      }
                    }
                    return arr[0];  
        }
        if (query.toLowerCase().contains("multiplied")) {
                    String[] arr = query.split(" ");
                    String first = arr[arr.length-4];
                    Integer one = Integer.parseInt(first);
                    String second = arr[arr.length-1];
                    Integer two = Integer.parseInt(second);
                    two *= one;
                    return two.toString(); 
        }
        if (query.toLowerCase().contains("minus")) {
                    String[] arr = query.split(" ");
                    String first = arr[arr.length-3];
                    Integer one = Integer.parseInt(first);
                    String second = arr[arr.length-1];
                    Integer two = Integer.parseInt(second);
                    one -= two;
                    return one.toString(); 
        }
        if (query.toLowerCase().contains("plus")) {
                    String[] arr = query.split(" ");
                    String first = arr[arr.length-3];
                    Integer one = Integer.parseInt(first);
                    String second = arr[arr.length-1];
                    Integer two = Integer.parseInt(second);
                    two += one;
                    return two.toString(); 
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest")) {
                    String[] arr = query.split(" ");
                    String first = arr[arr.length-2];
                    Integer one = Integer.parseInt(first.substring(0, first.length() - 1));
                    String second = arr[arr.length-1];
                    Integer two = Integer.parseInt(second);
                    if (one > two) {
                      return one.toString();
                    } else {
                      return two.toString();
                    }
        }
        return "";
    }
}
