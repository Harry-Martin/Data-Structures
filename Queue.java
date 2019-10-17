package dataStructures;

/**
 * Queue Interface for all implementations of Queue
 * @author Harry Martin
 *
 * @param <T>
 */

public interface Queue<T> {
	public void Enqueue(T e) throws Exception;
	public T Dequeue() throws Exception;
	public T First() throws Exception;
	public boolean Empty();
	public boolean Full();
}
