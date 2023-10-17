package solution01;

public class Box<T extends Person> {
   private T obj;
   public void getTotalSalary() {
	   obj.totalSalary();
   }
   
   public void set(T val) {
	   this.obj = val;
   }
   
   public T get() {
	  return this.obj;
   }
}
