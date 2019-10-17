package dataStructures;

public abstract class Stack<T>{
	public abstract void Push(T e) throws Exception;
	public abstract T Pop() throws Exception;
	public abstract T Peek() throws Exception;
	public abstract boolean Empty();
	public abstract boolean Full();
}
