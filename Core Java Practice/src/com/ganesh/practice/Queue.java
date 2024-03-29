package com.ganesh.practice;

public class Queue {
	private Node front, rear; // front points to the beginning of the queue
	// rear points to the end of the queue
	private int size; // to keep track of the number of nodes in the queue

	public Queue() {
		front = null;
		rear = null;
		size = 0;
	}

	class Node // inner class Node is the element of the queue
	{
		int value;
		Node next;

		private Node(int v) {
			value = v;
			next = null;
		}
	}

	// check whether the queue is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// return a node from the front
	public Node peek() {
		return front;
	}

	// remove a node from the front
	public Node dequeue() {
		if (isEmpty()) {
			return null;
		}
		Node temp = front;
		front = front.next;
		temp.next = null;
		size--;
		if (front == null) {
			rear = null; // If front becomes null, rear should also be null
		}
		return temp;
	}

	// add a new node at the end
	public void enqueue(Node item) {
		if (isEmpty()) {
			front = item;
			rear = item;
		} else {
			rear.next = item;
			rear = item;
		}
		size++;
	}

	public int size() {
		return size;
	}
}
