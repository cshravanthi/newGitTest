import java.util.Arrays;
import java.util.List;

public class GenericsMethods {

	//Java Generic Method
	public static <T> boolean isEqual(String g1, int g2){
		return g1.equals(g2);
	}
	
	public static void main(String args[]){
		GenericsType<String> g1 = new GenericsType<>();
		g1.set("Pankaj");
		
		GenericsType<String> g2 = new GenericsType<>();
		g2.set("Pankaj");
		
	//	boolean isEqual = GenericsMethods.<String>isEqual("shravs",18);
	//	System.out.println(isEqual);
		//above statement can be written simply as
	boolean	isEqual = GenericsMethods.isEqual("shravs",18);
		System.out.println(isEqual);
		//This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
		//Compiler will infer the type that i()s needed
		GenericsMethods g=new GenericsMethods();
		g.getGenericPair();
		//g1.getType("shravs");
		g1.getType(18);
		g1.getType(18.4);
		g.addNumbers(Arrays.asList(18,44));
		g.addNumbers(Arrays.asList(18.4,44.4));
		
	}
	
	
	public void getGenericPair(){
		Pair<String,String> p1=new GenericPair<>("shravs","shravanthi");
		Pair<Integer,String> p2=new GenericPair<>(18,"shravanthi");
		
		System.out.println(p1.getKey()+","+p1.getValue());
		System.out.println(p2.getKey()+","+p2.getValue());
	}
	
	public void addNumbers(List<? extends Number> numbers){
		
		double sum=0.0;
		for(Number n:numbers){
			sum+=n.doubleValue();
		}
		System.out.println(sum);
	}
}