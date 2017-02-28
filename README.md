# Use comments where helpful. Explain & document code. Write Javadoc.
Write you write some part of the code, you have to write down the java doc to help reader understand the code.

This is good-documenting.
```
	/**
	 * @return value of the coin.
	 */
	public double getValue( ) {
		return value;
	} 

	/**
	 * @return currency of the coin
	 */
	public String getCurrency() {
		return currency;
	}

```

This is bad-documenting
```
// if the piece is null then return
  if (piece == null) return;
  // add all the scores in list
  int total = scores.stream( ).sum( );

```


# Be consistent in naming and formatting
While you writing the code, you have to name the method or the attribute that make reader understand what are you creating.

This is good naming and formating	
```
public class Purse {
  List<Coin> items;
	int balance;

	public int getBalance( ) {
			balance = 0;
      for(Coin c: items) balance += c.getValue();
      return balance;
	}	
```
This is bad naming and formating
```
public class Purse {
  List<C> it;
	int b;

	public int getB( ) {
			b = 0;
      for(C c: it) b += c.getVal();
      return b;
	}	
```

	# codeguide
