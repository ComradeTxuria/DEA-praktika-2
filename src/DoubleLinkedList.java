package listasSimples;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements ListADT<T> {

	// Atributuak
	protected Node<T> first; // lehenengoaren erreferentzia
	protected Node<T> last; // azkenengoaren erreferentzia
	protected String deskr; // deskribapena
	protected int count;

	public DoubleLinkedList() {
		first = null;
		last = null;
		deskr = "";
		count = 0;
	}

	public void setDeskr(String ize) {
		deskr = ize;
	}

	public String getDeskr() {
		return deskr;
	}

	public T removeFirst() {
		// listako lehen elementua kendu da
		// Aurrebaldintza:
		// KODEA OSATU ETA KOSTUA KALKULATU
		
		T itzuli = first.data; 
		
		if (isEmpty()) {}
		else {
			first = null;
		}
		
		return itzuli;
	}

	public T removeLast() {
		// listako azken elementua kendu da
		// Aurrebaldintza:
		// KODEA OSATU ETA KOSTUA KALKULATU
		
		T itzuli = last.data; 
		
		if (last == null) {}
		else {
			last = null;
		}
		
		return itzuli;
	}

	public T remove(T elem) {
		// Aurrebaldintza:
		// Balio hori listan baldin badago, bere lehen agerpena ezabatuko dut. Kendutako
		// objektuaren erreferentzia
		// bueltatuko du (null ez baldin badago)
		// KODEA OSATU ETA KOSTUA KALKULATU
		
		if (isEmpty()) 
		{
			return null;
		}
		else 
		{
			while (first != null) 
			{
				if (first.data == elem) 
				{
					first = null;
					return elem; 
				}
				first = first.next;
			}
			
		}
		return null;
	}

	public void removeAll(T elem) 
	{
		// Balio horretako elementu guztiak ezabatuko ditu
		
		if (isEmpty()) {}
		else 
		{
			while (first != null) 
			{
				if (first.data == elem) 
				{
					first = null;
				}
				first = first.next;
			}
		}
	}

	public T first() {
		// listako lehen elementua ematen du
		
		if (isEmpty())
			return null;
		else
			return first.data;
	}

	public T last() {
		// listako azken elementua ematen du

		if (isEmpty())
			return null;
		else
			return last.data;
	}

	public ListADT<T> clone() {
		// Zerrendaren kopia bat bueltatuko du (adabegi guztiak kopiatuko dira)
		
		if (isEmpty())
			return null;
		else
		{
			ListADT<T> clone = new DoubleLinkedList<T>();
			while(first != last)
			{
				clone
			}
		}
	}

	public boolean contains(T elem) {
		// Egiazkoa bueltatuko du aurkituz gero, eta false bestela
		if (isEmpty())
			return false;

		// KODEA OSATU ETA KOSTUA KALKULATU
	}

	public T find(T elem) {
		// Elementua bueltatuko du aurkituz gero, eta null bestela

		// KODEA OSATU ETA KOSTUA KALKULATU
	}

	public boolean isEmpty() {
		return first == null;
	};

	public int size() {
		return count;
	};

	/** Return an iterator to the stack that iterates through the items . */
	public Iterator<T> iterator() {
		return new ListIterator();
	}

	// an iterator, doesn't implement remove() since it's optional
	private class ListIterator implements Iterator<T> {

		// KODEA OSATU
	} // private class

	public void adabegiakInprimatu() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		String result;
		Iterator<T> it = iterator();
		while (it.hasNext()) {
			T elem = it.next();
			result = result + "[" + elem.toString() + "] \n";
		}
		return "DoubleLinkedList " + result + "]";
	}

}
