package App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerToBinary {

	public static List getBinaryNumber(int n)
	{
		List<Integer> binaryNumber = new ArrayList<Integer>();

		while(n > 1)
		{
			if (0 == n%2)
			{
				n = n/2;
				binaryNumber.add(0);
			}else{
				n = n/2;
				binaryNumber.add(1);
			}
			if (1 == n)
			{
				binaryNumber.add(1);
				break;
			}
		}
		 Collections.reverse(binaryNumber);
		return binaryNumber;
	}
}
