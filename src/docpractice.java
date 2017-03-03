package exercise;
/*
 * Write the java doc in the code below
 * @author Theeruth Borisuth
 */
public class docpractice {
	
	public class Coin {
		/*
		 * TODO Write what this attribute is
		 */
		int value ;
		/*
		 * TODO Write what this method can do
		 */
		public Coin ()
		{
			this.value = 1 ;
		}
		/*
		 * TODO Write what this method can do
		 */
		public Coin(int value)
		{
			this.value = value ;
		}
		/*
		 * TODO Write what this method can do
		 */
		public void setValue(int value)
		{
			this.value = value ;
		}
		/*
		 * TODO Write what this method can do
		 */
		public int  getValue ()
		{
			return value ;
		}
		/*
		 * TODO Write what this method can do
		 */
		public String toString()
		{
			return this.value+" Baht Coin";
		}
		
	}
}
