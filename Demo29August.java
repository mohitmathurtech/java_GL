/** 29 August Monday
 * _________ H A S H I N G     a n d     B I T    M A N I P U L A T I O N 
 * 
 * _________ S E S S I O N   ->  1 
 *
 * HashMap sample
 * 
int[] findTwoSum(int [] nums, int target) {
	Map < Integer, Integer > numMap = new HashMap<> ();
	
	for(int i = 0; i < nums.length; i++ ){
		numMap.put(nums[i],i);
	}
	
	for(int i = 0; i < nums.length; i++){
		int current = nums[i];
		int elementToFind = target - nums[i];
		if( numMap.containsKey(elementToFind){
			int ans[] = new int[2];
			ans[0] = current;
			ans[1] = elementToFind;
			return ans;
		}
	}
}

*
* 
// TRIAL TEST CODE

int findDuplicate(int[] arr){
	Map< Integer, Integer > arrMap = new HashMap<> ();

	for(i = 0; i < arr.length; i++){
		int key = arr[i];
		if(arrMap.containsKey(key))
			arrMap.put( nums[i], arrMap.get(arr[i]+ 1) );

		else
			arrMap.put(key, 1)
	}
	int result = 0;
	for(i = 0; i < arr.length; i++){
		int key = arr[i];
		if(arrMap.get(key) > 1)
			result++;

		return result;
}

* 
* 
*    SIR
int duplicateCount(int arr[]){
	Map< Integer, Integer> count = new HashMap <>();
	
	for(int i=0;i< arr.length;i++){
		if(count.containsKey(nums[i]){
			int currValue = count.get(nums[i])
			count.put(nums[i], currValue + 1);
		}
		else{
			count.put(nums[i], 1);
		}
	}
	int cnt = 0;
	
	//__________ to iterate over a hashmap

	for(Map.Entry< Interger, Interger > currElement = count.entrySet()){
	
		Integer key   = currElement.getKey();
		Integer value = currElement.getValue();
		if(value > 1){
			cnt++;
		}
	}
	return cnt;
}

*
* Q2 _____ ANAGRAMS -> same words same character then return the anagrams 
* Rohit's code
public void FindSameWords(String[] words)
{
	Map<HashSet<Character>, List<String>> hashMap = new HashMap<>();
	
	for (int i = 0; i < words.length; i++)
	{
		HashSet<Character> hashSet = new HashSet<>();
		for (Character item : words[i])
		{
			hashSet.put(item);
		}

		if (!hashMap.containsKey(hashSet))
			hashMap.put(hashSet, new List<String>());

		List<String> currentList = hashMap.get(hashSet);
		currentList.add(words[i]);
		hashMap.put(hashSet, currentList);
	}

	for (HashSet<Character> item : hashMap.keySet())
	{
		for (String str : hashMap.get(item))
		{
			System.out.print(str + "	");
		}
		System.out.println();
	}
}
*
*
* ___ SIR CODE

return type     functionName  arguments
List< String > findAnagrams(String [] words) {

  //     key datatype       value datatype  name of MAP to be used
	Map<HashSet<Character>, List<String>>    map = new HashMap<>();

  // for loop to tyraverse the array and put in MAP
	for(int i = 0; i< words.length; i++) {

		//Created new hashset -> named SET for storing characters per string
		Hashset<Character> set = new HashSet<>();
		
		// EVERY String in the passed array itself is a array of charcters 
		for(int j=0; j<words[i].lenght; j++) {
			set.put(words[i][j])     // storing word by word in SET                                         
		}

		// if the created hashset is not present in map add that to map and also make a new list<string>
		if(!map.contains(set){
			map.put(set, new List<String>());
		}

		// if hashset is already present in the map
		else{
			// a list of current words present in MAP    get them and save in currWords list<String>
			List<String> currWords = map.get(set)
			//add the word to list -> currWords
			currWords.append(words[i])
			//put that to MAP in value set     OR update the value set for key whose hashset is present in the MAP
			map.put(set, currWords)
		}
	}
	
	//for each entry of the map entry name -> curr
	
	for(Map.Entry<HashSet<Character>, List<String>> curr = map.entrySet()){
		
		//store the value of list in currList
		
		List<String> currList = curr.getValue();

		// if the list vlaue or list contain more than one word return the LIST
		if( currList.size() > 1){
			return currList;
		}
	}

}
* 
* 

*/


