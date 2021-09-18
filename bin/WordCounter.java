import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter 
{
	String finishedProduct;
	String[] inputArray;
	Map<String, Integer> hash = new HashMap<String, Integer>();
	
	/*
	 * Constructor of WordCounter
	 * Program takes in string and counts the number of times each word shows up
	 * Starts out by putting the inputString into an array
	 */
	public WordCounter(String inputString)
	{
		inputArray = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
		hashSort();
	}
	
	
	
	/*
	 * Method compiles strings to hashes, alphabetize hash to array
	 * puts everything together
	 */
	public void hashSort()
	{
		
		int length = inputArray.length;
		
		for (int i = 0 ; i<length; i++)
		{
			if(hash.containsKey(inputArray[i]) == false)
			{
				hash.put(inputArray[i], 1);
			}
			else
			{
				hash.put(inputArray[i], hash.get(inputArray[i]) + 1);
			}
		}

		
		
		
	}
	
	public void alphabetical()
	{
		String[] finArray = new String[hash.size()];
		int index = 0;
		for (Map.Entry<String, Integer> mapEntry : hash.entrySet()) 
		{
			finArray[index] = mapEntry.getKey() + ": " + mapEntry.getValue().toString();
		    index++;
		}
		String last ="<html>";

		Arrays.sort(finArray);
		
		for(int i = 0; i<finArray.length; i++)
		{
			last = last + finArray[i] + "<br>";
		}
		
		finishedProduct = last + "</html>";
	}
	
	public void numerical()
	{
		String[] finArray = new String[hash.size()];
		int index = 0;
		for (Map.Entry<String, Integer> mapEntry : hash.entrySet()) 
		{
			finArray[index] = mapEntry.getValue().toString() + ": " + mapEntry.getKey();
		    index++;
		}
		String last ="<html>";

		Arrays.sort(finArray);
		
		for(int i = 0; i<finArray.length; i++)
		{
			last = last + finArray[i] + "<br>";
		}
		
		finishedProduct = last + "</html>";
	}
	

}
