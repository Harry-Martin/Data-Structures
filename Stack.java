package dataStructures;

/**
 * Interface for all implementations of Stack
 * @author Harry Martin
 *
 * @param <T>
 */

public interface Stack<T>{
	public void Push(T e) throws Exception;
	public T Pop() throws Exception;
	public T Peek() throws Exception;
	public boolean Empty();
	public boolean Full();
}
