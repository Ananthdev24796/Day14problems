/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class MyLinkedList  {
	
	public static void main(String[] args) {
	
		 System.out.println("Welcome to linked list");
	         
			MyNode<Integer> thirdNode = new MyNode<Integer>(70);
	        MyNode<Integer> firstNode = new MyNode<Integer>(56);
	        MyNode<Integer> secondNode = new MyNode<Integer>(30);
	        
	        //create Linked list
	        MyNode<Integer> myNode = new MyNode<Integer>();
	        myNode.add(thirdNode);
	        myNode.add(secondNode);
	        myNode.add(firstNode);
	      
	       

	}

}
