/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class MyNode<K extends Object> {
	private K key;
	private MyNode next;
	public MyNode(K key) {
		super();
		this.key = key;
		this.next = null;
	}
	public MyNode() {
		super();
		this.key = null;
		this.next = null;
	}
	public K getKey() {
		return  key;
	}
	
	public void setNext(MyNode next) {
		this.next = next;
	}
	
	
	// Print Linked List
	public void printLinkedList() {
		MyNode<K> tempNode = this;
		while(tempNode.next != null){	    		
    		System.out.print(tempNode.getKey()+" -> ");
    		tempNode = tempNode.next;	    		
    	}
		System.out.print(tempNode.getKey());
	}
	
	 
}
