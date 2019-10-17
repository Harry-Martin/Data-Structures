package dataStructures;

/**
 * Stack ADT implementation using a static Array
 * @author Harry Martin
 *
 * @param <T>
 */

public class StaticStack<T> {
	
	private final Object[] data;
	private int top;
	
	public StaticStack(int size){
		data = new Object[size];
	}
	
	public boolean Empty() {
		return top < 1;
	}
	
	public boolean Full() {
		return top == data.length;
	}
	
	public void push(T e) throws Exception {
		
		if(Empty()) {
			data[top++] = e;
			
		}else if(Full()) {
			throw new Exception(String.format("Cannot push element (%s) to stack because stack is full", e));
		
		}else {
			data[top++] = e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T pop() throws Exception{
		if(Empty()) {
			throw new Exception("Cannot pop element from stack because stack is empty");
		}else {
			return (T)data[--top];
		}
	}
	
	@SuppressWarnings("unchecked")
	public T peek() throws Exception{
		if(Empty()) {
			throw new Exception("Cannot peek element in stack because stack is empty");
		}else {
			return (T)data[top-1];
		}
	}
	
}
