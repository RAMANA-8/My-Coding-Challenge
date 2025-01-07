import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(new Integer[] {10, 20, 30, 40, 50}));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(new Integer[] {40, 50, 60, 70, 80}));
	
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		//Intersection on s1
		System.out.println("s1.retainAll(s2): "+s1.retainAll(s2));
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		//Intersection on s2
		System.out.println("s2.retainAll(s1): "+s2.retainAll(s1));
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		//Union on s1
		s1.addAll(s2);
		System.out.println("s1: Union: " + s1);
		s1.add(100);
		
		//Union on s2
		s2.addAll(s1);
		System.out.println("s2: Union: " + s2);
		
		
		//Difference on s1
		System.out.println("s1.removeAll(s2): "+s1.removeAll(s2));
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		s1.add(100);
		
		//Difference on s2
		System.out.println("s2.removeAll(s1): "+s2.removeAll(s1));
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		HashSet<Integer> s3 = new HashSet<>(Arrays.asList(new Integer[] {10, 20, 30}));
		HashSet<Integer> s4 = new HashSet<>(Arrays.asList(new Integer[] {40, 50, 60, 70, 80}));
		
		System.out.println(Collections.disjoint(s3, s4));
		
		
		
		LinkedHashSet<Integer> s5 = new LinkedHashSet<>();
		
		s5.add(99);
		s5.add(88);
		s5.add(77);
		s5.add(99);
		s5.add(99);
		s5.add(66);
		
		System.out.println(s5);
		inp.close();
	}
}

