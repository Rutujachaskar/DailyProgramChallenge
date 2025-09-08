package com.daily.programming.challenge;

public class MergeSortedList {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node mergesortedlist(Node l1,Node l2) {
		if(l1==null) {
			return l2;
		}
		if(l2==null) {
			return l1;
		}
		Node dummy=new Node(-1);
		Node tail=dummy;
		while(l1!=null&&l2!=null) {
			if(l1.data<=l2.data) {
				tail.next=l1;
				l1=l1.next;
			}
			else {
				tail.next=l2;
				l2=l2.next;
			}
			tail=tail.next;
		}
		while(l1!=null) {
			tail.next=l1;
			l1=l1.next;
			tail=tail.next;
		}
		while(l2!=null) {
			tail.next=l2;
			l2=l2.next;
			tail=tail.next;
		}
		return dummy.next;
		
	}
	public static void printlist(Node tail) {
		while(tail!=null) {
			System.out.print(tail.data+" ");
			tail=tail.next;
		}
	}

	public static void main(String[] args) {
		Node head1=new Node(1);
		head1.next=new Node(2);
		head1.next.next=new Node(4);
		
		Node head2=new Node(1);
		head2.next=new Node(3);
		head2.next.next=new Node(4);
		
		Node mergehead=mergesortedlist(head1,head2);
		printlist(mergehead);
		

	}

}
