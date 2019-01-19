package learnTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 常用实现类
 * HashSet
 * LinkedHashSet
 * TreeSet
 * @author 41790
 *
 */
public class SetTest {

	public static void main(String[] args) {
		hashSet();
		linkedHashSet();
		treeSet();
		treeSetInt();
		
		

	}
	private static void treeSet() {
		Set<String> set = new TreeSet<>();
//		set.add(null);//发生 java.lang.NullPointerException异常
		set.add("");
		set.add(" ");
		set.add("hashSet2");
		set.add("hashSet100");
		set.add("hashSet1");
		set.add("hashSet2");
		int i = 0;
		for (String str : set) {
			i++;
			System.out.println(i+","+str);
		}
		
	}
	
	private static void treeSetInt() {
		Set<Integer> set = new TreeSet<>();
//		set.add(null);//发生 java.lang.NullPointerException异常
		set.add(1);
		set.add(8);
		set.add(2);
		set.add(100);
		set.add(-1);
		set.add(22);
		set.add(8);
		set.add(0);
		set.add(2);
		int i = 0;
		for (int str : set) {
			i++;
			System.out.println(i+","+str);
		}
		
	}
	private static void linkedHashSet() {
		Set<String> set = new LinkedHashSet<>();
		set.add(null);
		set.add("");
		set.add(" ");
		set.add("hashSet2");
		set.add("hashSet100");
		set.add("hashSet1");
		set.add("hashSet2");
		int i = 0;
		for (String str : set) {
			i++;
			System.out.println(i+","+str);
		}
	}

	private static void hashSet() {
		Set<String> set = new HashSet<>();
		set.add(null);
		set.add("");
		set.add(" ");
		set.add("hashSet2");
		set.add("hashSet100");
		set.add("hashSet1");
		set.add("hashSet2");
		int i = 0;
		for (String str : set) {
			i++;
			System.out.println(i+","+str);
		}
		
		
	}

}
