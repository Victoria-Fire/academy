package by.academy.homework.hw5;

import java.io.IOException;
import java.util.Scanner;

public class Task_7 {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}
			this.tail = node;
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
		while (node != null) {
			System.out.print(String.valueOf(node.data));
			node = node.next;
			if (node != null) {
				System.out.print(sep);
			}
		}
	}

	public static DoublyLinkedListNode reverse(DoublyLinkedList list) {
		while (list.head != null) {
			DoublyLinkedListNode current = list.head.next;
			list.head.next = list.head.prev;
			list.head.prev = current;
			if (current == null) {
				break;
			}
			list.head = current;
		}
		return list.head;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		DoublyLinkedList llist = new DoublyLinkedList();

		int llistCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if ((llistCount >= 0) && (llistCount <= 1000)) {
			for (int i = 0; i < llistCount; i++) {
				int llistItem = scanner.nextInt();
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
				if ((llistItem >= 0) && (llistItem <= 1000)) {

					llist.insertNode(llistItem);
				} else {
					System.out.println(
							"Не правильно введен элемент двусвязного списка! (0 <= DoubleLinkedListNode.data <= 1000)");
					return;
				}
			}
			DoublyLinkedListNode llist1 = reverse(llist);

			printDoublyLinkedList(llist1, " ");
		} else {
			System.out.println("Не правильно введено количество элементов в списке! (0 <= n <= 1000)");
			return;
		}
		scanner.close();
	}
}
