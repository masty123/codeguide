package exercise;
/*
 * Write the java doc in the code below
 * @author Theeruth Borisuth
 */
public class docpractice {
	
	public class Coin {
		/*
		 * 
		 */
		int value ;
		/*
		 * 
		 */
		public Coin ()
		{
			this.value = 1 ;
		}
		/*
		 * 
		 */
		public Coin(int value)
		{
			this.value = value ;
		}
		/*
		 * 
		 */
		public void setValue(int value)
		{
			this.value = value ;
		}
		/*
		 * 
		 */
		public int  getValue ()
		{
			return value ;
		}
		/*
		 * 
		 */
		public String toString()
		{
			return this.value+" Baht Coin";
		}
		
	}
}
