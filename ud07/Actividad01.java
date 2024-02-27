package ud07;

import java.util.*;

public class Actividad01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> misNumeros = new ArrayList<>();
		misNumeros.add(1);
		misNumeros.add(6);
		misNumeros.add(3);
		misNumeros.add(2);
		misNumeros.add(0);
		misNumeros.add(4);
		misNumeros.add(5);
		for (Integer i : misNumeros) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(misNumeros.get(4));
		misNumeros.add(3, 8);
		System.out.println(misNumeros.get(3));
		misNumeros.set(0, 9);
		misNumeros.remove(5);
		misNumeros.remove(2);
		for (Integer i : misNumeros) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println(misNumeros.contains(0));
		System.out.println(misNumeros.contains(7));
		
		ArrayList<Integer> copiaArrayList = new ArrayList<>();
		copiaArrayList.addAll(misNumeros); 
		System.out.println(copiaArrayList);
		copiaArrayList.add(9);
		System.out.println(copiaArrayList.indexOf(9));
		System.out.println(copiaArrayList.lastIndexOf(9));
		copiaArrayList.removeAll(misNumeros);
		System.out.println(misNumeros);
		System.out.println(copiaArrayList.isEmpty());
		misNumeros.toArray();
		for (int i: misNumeros) {
			System.out.print(i + " ");
		}
	}

}
