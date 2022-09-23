/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class MyNode<K extends Object> implements INode<K>  {
	
	private K key;
	private MyNode next;
	private MyNode head;
	private MyNode tail;
	
	public MyNode(K key) {
		
		this.key = key;
		this.next = null;
		this.head = null;
	}
	public MyNode() {
	
	this.key = null;
	this.next = null;
	this.head = null;
}
	public MyNode<K> getTail() {
		return tail;
	}
	
	public void setTail(MyNode<K> tail) {
		this.tail = tail;
	}
	
	
		
	public void setHead(MyNode<K> head) {
		this.head = head;
	}
	public MyNode<K> getHead() {
		return head;
	}

	
	public void setNext(MyNode<K> next) {
		this.next = next;
	}
	public MyNode<K> getNext() {
		return next;
	}

		
	public K getKey() {
		return  key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
	
	// Print Linked List
	public void printLinkedList() {
		
		MyNode<K> tempNode = head;
		while(tempNode.next != null) {
			System.out.print(tempNode.getKey()+"->");
			tempNode =tempNode.next;		
			}
		System.out.print(tempNode.getKey());
		
	}

	
	
	// To Add element at begining
	
	public void add(MyNode newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
			newNode.next =null;
		}
		else {
			MyNode<K> tempNode = this.head;
			this.head=newNode;
			newNode.next=tempNode;
		}
		 System.out.println("\nLinked list after adding "+newNode.key+" at start");
		 this.printLinkedList();
	}
	
	// To Appending Node
	
	public void addAtEnd(MyNode newNode) {
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			newNode.next= null;
		}
		else
		{
			this.tail.next = newNode;
            newNode.next =null;
           this.tail = this.tail.next;
			
		}
		 System.out.println("\nLinked list after appending "+newNode.key);
		 this.printLinkedList();
		
	}
	
	//Insert
	public void insert(MyNode myNode1,MyNode newNode,MyNode myNode3) {	
		myNode1.next =newNode;
		newNode.next=myNode3;
		System.out.println("\nAfter inserting"+newNode.key);
		this.printLinkedList();
}
	
	// Delete First element of linked list
	
	public void pop() {
		this.head = head.getNext();
		System.out.println("\n After Deleting 1st Element");
		this.printLinkedList();
		
		}
	// Delete Last element of linked list
	public void popAtEnd()
	{
		MyNode tempNode = head;
		while(!tempNode.next.equals(tail)) {
			tempNode=tempNode.next;
			
			
		}
				
		tempNode.next=null;
		System.out.println("\n After deleting last element");
		this.printLinkedList();
	}
	
	//Find the node
	public MyNode search(Integer key) {
		MyNode tempNode = head;
			while(head != null) {
				if(tempNode.key == key) {
					System.out.println("\n"+tempNode.key +"\nsucess");
				return tempNode ;
				}
				tempNode =tempNode.next;
				}
			
			return null;
	}
	
	////Add node to linkedlist
    public void addNewNode(MyNode newNode) {   
  	  
    	MyNode resultNode = search(30);	    	
    	newNode.next =  resultNode.next;
    	resultNode.next = newNode;
    }
  //Delete any node from linkedlist
    public void removeNode(Integer searchKey) {
  
    	MyNode currentNode = head;
    	while(head!=null) {
    	
			if(currentNode.next.key == searchKey) {
				currentNode.next = currentNode.next.next;
				return;
			}			
			currentNode = currentNode.next;				
		}	    
    }
}
