package dataStructures;

/**
 * Queue ADT (Fixed Head) implementation
 * @author Harry Martin
 *
 * @param <T>
 */

public class FixedHeadQueue<T> implements Queue<T>{
	
	private final Object[] data;
	private int tail;
	private int head;
	
	
	public FixedHeadQueue(int size) {
		data = new Object[size];
	}


	public void Enqueue(T e) throws Exception {
		if(Full()) {
			throw new Exception(String.format("Cannot Enqueue element (%s) because queue is full", e));
		}else {
			data[tail++] = e;
		}
	}


	@SuppressWarnings("unchecked")
	public T Dequeue() throws Exception{
		if(Empty()) {
			throw new Exception("Cannot Dequeue element because Queue is empty");
		}else {
			T element = (T) data[head];
			for(int i = 1; i < tail; i++) {
				data[i-1] = data[i];
			}
			tail--;
			return element;
		}
	}


	@SuppressWarnings("unchecked")
	public T First() throws Exception{
		if(Empty()) {
			throw new Exception("Cannot get First element of empty Queue");
		}else {
			return (T) data[head];
		}
	}


	public boolean Empty() {
		return tail == head;
	}


	public boolean Full() {
		return tail == data.length;
	}
	
	
}
