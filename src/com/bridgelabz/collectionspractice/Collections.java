package com.bridgelabz.collectionspractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Collections {
	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();
	}
	private static void doListDemo() {
		System.out.println("Is dostackDemo");
		List<String> list = new LinkedList<>();
		list.add("Govind");
		list.add("Arvind");
		list.add("Himanshu");
		list.add("Pooja");
		list.add("Pragati");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list);

	}
	private static void doStackDemo() {
		System.out.println("Is doStackDemo");
		Stack<String>stack= new Stack<>();
		stack.push("Govind");
		stack.push("Avinash");
		stack.push("Himanshu");
		stack.push("Govind");
		stack.push("Pooja");
		stack.push("Himanshu");
		//String Pop = stack.pop();
		Iterator<String> itr= stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	private static void doQueueDemo() {
		System.out.println("Is DequeueDemo");
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amit Kumar");
		queue.add("Govind Kumar");
		queue.add("Himanshu Patel");
		queue.add("Avinash Rajak");
		queue.add("Raj Sharma");
		queue.add("Chitra");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After remove string in queue");
		queue.remove();
		Iterator<String> itr1 = queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
	private static void doSetDemo() {
		System.out.println("Is doSetDemo");
		Set<String> set = new LinkedHashSet<>();
		set.add("Govind");
		set.add("Himanshu");
		set.add("Avinash");
		set.add("Govind");
		set.add("Himanshu");
		set.add("Pooja");
		for(String str:set) {
			System.out.println(str);
		}

	}
	private static void doMapDemo() {
		System.out.println("Is doMapDemo");
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Govind");
		map.put(2,"Avinash");
		map.put(3,"Himanshu");
		map.put(4,"Pooja");
		map.put(5,"Pragati");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
