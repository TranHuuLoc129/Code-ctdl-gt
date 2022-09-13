import java.util.*;

public interface StackADT <E> {
	// check whether stack is empty
	public boolean empty(); 

	// retrieve topmost item on stack // lấy vật phẩm trên cùng trên ngăn xếp
	public E       peek() throws EmptyStackException;

	// remove and return topmost item on stack  v// xóa và trả lại mục trên cùng trên ngăn xếp
	public E       pop() throws EmptyStackException;

	// insert item onto stack
	public void    push(E item);

   public int size();

    public boolean contains(E item);

    public void print();

}
