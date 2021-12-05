package by.academy.classwork.lesson13;

public class CustomLinkedList<T> {

	private Node last;
	private Node first;
	private int size;

	public int size() {
		return size;
	}

	public void add(T value) {
		Node next = null;
		Node prev = last;

		Node newNode = new Node(next, prev, value);

		if (prev == null) {
			last = newNode;
			first = newNode;
		} else {
			last.next = newNode;
			newNode.prev = last;
			last = newNode;
		}
		size++;
	}

	public void add(int index, T value) {
		if (size < index) {
			System.out.println("Ошибка");
			return;
		} else if (size == index) {
			add(value);
			return;
		} else {
			Node node = new Node(value);
			Integer counter = 0;
			Node current = first;
			while (counter < index) {
				current = current.next;
				counter++;
			}
			node.next = current;
			node.prev = current.prev;
			current.prev.next = node;
			current.prev = node;
		}
	}

	public Node getNode(int index) {
		if (index >= size) {
			System.err.println("index больше size");
			return null;
		}
		int counter = 0;
		Node current = first;
		while (current != null && counter <= index) {
			if (index == counter) {
				return current;
			}
			current = current.next;
			counter++;
		}
		return null;
	}

//	 private Node<T> getNode(int index) {
//         int counter = 0;
//         Node<T> node = head;
//         while (node != null) {
//             if (counter == index) {
//                 break;
//             }
//             node = node.next;
//             counter++;
//         }
//         return node;
//     }

	public T get(int index) {
		return getNode(index).value;
	}

	public void get(T object) {

	}

	public T remove(int index) {

		return null;

	}

//    public void remove(int index) {
//        if (size == 1 && index == 0) {
//            head = null;
//            tail = null;
//            size = 0;
//            return;
//        }
//        if (index == size - 1) {
//            Node<T> prev = tail.prev;
//            prev.next = null;
//            tail = prev;
//            size--;
//            return;
//        }
//        if (index >= 0 && index < size) {
//            Node<T> node = getNode(index);
//            Node<T> prev = node.prev;
//            Node<T> next = node.next;
//            if (index == 0) {
//                head = next;
//            }
//            if (prev != null) {
//                prev.next = next;
//            }
//            next.prev = prev;
//            size--;
//            return;
//        }
//        System.out.println("Index of bound");
//    }

	public void remove(T object) {

	}

//	public T getTailValue() {
//        if (tail != null) {
//            return tail.value;
//        }
//        return null;
//    }

//	public T getHeadValue() {
//        if (head != null) {
//            return head.value;
//        }
//        return null;
//    }
	
//	 public void print() {
//         Node node = first;
//         while (node != null) {
//             System.out.println(node.value);
//             node = node.next;
//         }
//         System.out.println();
//     }

	class Node {
		Node next;
		Node prev;
		T value;

		Node(T value) {
			super();
			this.value = value;
		}

		Node(Node prev, Node next, T value) {
			super();
			this.prev = prev;
			this.next = next;
			this.value = value;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [next=");
			builder.append(next);
			builder.append(", prev=");
			builder.append(prev);
			builder.append(", value=");
			builder.append(value);
			builder.append("]");
			return builder.toString();
		}

	}
}
