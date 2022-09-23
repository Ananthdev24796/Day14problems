package com.bridgelabz;

public interface INode<K> {
	public void printLinkedList();
	public void add(MyNode newNode);
	public void addAtEnd(MyNode newNode);
	public void insert(MyNode myNode1,MyNode newNode,MyNode myNode3);
	public void pop();
	public void popAtEnd();
	public MyNode search(Integer key);
	public void addNewNode(MyNode newNode);
}
