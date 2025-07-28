package ch10.introduction;

public class TestWrapperClasses {

	public static void main(String[] args) {
//		  Integer i1 = new Integer("23");
//		  Integer i2 = new Integer(23);
		  Integer i3 = Integer.valueOf("23");
		  Integer i4 = Integer.parseInt("23", 8);
//		  Double d1 = new Double();
		  Double d2 = Double.valueOf("23.45");
		  int i5 = (Integer.valueOf("23")).intValue();
		  double d3 = (Double.valueOf("23.4")).doubleValue();
		  int i6 = (Double.valueOf("23.4")).intValue();
		  String s = (Double.valueOf("23.4")).toString();
		  
		    Integer x = 3;
		    System.out.println(x.intValue());
		    System.out.println(x.compareTo(4)); // -1
		    
		    System.out.println(Integer.parseInt("10"));
		    System.out.println(Integer.parseInt("10", 10));
		    System.out.println(Integer.parseInt("10", 16));
		    System.out.println(Integer.parseInt("11"));
		    System.out.println(Integer.parseInt("11", 10));
		    System.out.println(Integer.parseInt("11", 16));
	}
}
