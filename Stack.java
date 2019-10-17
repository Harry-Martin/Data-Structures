package dataStructures;

public interface Stack<T>{
	public void Push(T e) throws Exception;
	public T Pop() throws Exception;
	public T Peek() throws Exception;
	public boolean Empty();
	public boolean Full();
}
