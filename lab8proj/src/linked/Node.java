package linked;


/*
 * Convert to a generic class:
 * 
 * 1) Change declaration to "public class Node<T>"
 * 2) Change type of instance variable "data" from Object to T.
 * 3) In ctor, change arg type from Object to T.
 * 4) Change return type of getData().
 * 5) In remainder of class, change Node to Node<T>
 */



public class Node<T>
{
	private T					data;
	private Node				prev;	// previous
	private Node				next;	
	
	
	Node(T data)
	{
		this.data = data;
	}
	
	
	T getData()
	{
		return data;
	}
	
	
	Node<T> getNext()
	{
		return next;
	}
	
	
	void setNext(Node next)
	{
		this.next = next;
	}
	
	
	Node<T> getPrev()
	{
		return prev;
	}
	
	
	void setPrev(Node prev)
	{
		this.prev = prev;
	}
	
	
	// Returns data of prev node, this node, and next node. Uses "<" if prev is
	// null, and ">" if next is null.
	public String toString()
	{
		String s;
		if (prev == null)
			s = "<";
		else s = prev.data.toString();
		
		s += data;
		
		if (next == null)
			s += ">";
		else
			s += next.data;
		
		return s;
	}
}
