package listasSimples;

public class UnorderedDoubleLinkedList<T> extends DoubleLinkedList<T> implements UnorderedListADT<T> {
	
    @Override
    public void addToFront(T elem) {
        Node<T> berria = new Node<>(elem);
        berria.next = first;              
        berria.prev = null; 
        if (isEmpty()) {
            last = berria;
        } else {
            first.prev = berria;
        }
        first = berria;
        count++;
    } //KOSTUA addToFront(T elem): O(1)

    @Override
    public void addToRear(T elem) {
        Node<T> berria = new Node<>(elem);
        berria.next = null;              
        berria.prev = last; 
        if (isEmpty()) {
            first = berria;
        } else {
            last.next = berria;
        }
        last = berria;
        count++;
    } //KOSTUA addToRear(T elem): O(1)

    @Override
    public void addAfter(T elem, T target) {
        Node<T> unekoa = first;
        while (unekoa != null && !unekoa.data.equals(target)) {
            unekoa = unekoa.next;
        }

        if (unekoa != null) {
            Node<T> berria = new Node<>(elem);
            berria.next = unekoa.next;              
            berria.prev = unekoa; 
            if (unekoa.next != null) {
                unekoa.next.prev = berria;
            } else {
                last = berria;
            }
            unekoa.next = berria;
            count++;
        }
    } //KOSTUA addAfter(T elem, T target): O(n)

}
