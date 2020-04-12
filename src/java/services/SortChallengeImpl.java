package java.services;

public class SortChallengeImpl{

	public static void main(String[] args) {
		int[] list = {1,5,3,6,8,2};
		SortChallengeImpl s = new SortChallengeImpl();
		//int[] sortedList = s.simpleSort(list, false);
		
		for (int i=0; i<list.length; i++)
		{
			System.out.println(list[i]);
		}

	}

	public  int[] simpleSort(int[] list, boolean ascending) {
		int count = 0;
		int position = 0;
		int[] sortedArray = new int[list.length];
		while(count <= list.length)
		{
			int val1 = list[count];
			for (int j = 0; j<=list.length; j++)
			{
				//int val1 = list[position];
				int val2 = list[j+1];
				if (val1 > val2)
				{					
					list[position] = val2;
					list[j] = val1;
					position ++;
				} else if (val1 <= val2)
				{
					val1 = val2;
					position++;
				}
			}
			count ++;
		}
		return list;
	}

	public void printSortedFrequency(int[] list) {
		// TODO Auto-generated method stub
		
	}

	public int numberOfUniqueValues(int[] list) {
		// TODO Auto-generated method stub
		return 0;
	}

}
