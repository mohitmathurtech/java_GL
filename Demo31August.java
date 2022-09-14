/**
 *  Porblem 1
 *   given 2 arrays find their union and intersection 
 * 
 * 

int[] findUnionIntersection(Integer [] arr1, Integer [] arr2) {

		Hashset<Integer> union = new HashSet<>();
		Hashset<Integer> intersection = new HashSet<>(); 
		
		for(int i=0; i<arr1.lenght; i++) {
			union.put(arr1[i]);                                 
		}

		
		for(int i=0; i<arr2.lenght; i++) {
		if(!union.contains(arr2[i]){
			union.put(arr2[i]);
		}
		else
		{
			intersection.put(arr2[i]);
		}

	}
	List<Integre> result = new List<> ();
	result.add(union);
	result.add(intersection);

	return result;
	}
___________________________________________________


int checkRepeatingElements(int[] arr, int k){
	
	Map< Integer, Integer> map = new HashMap<> ();

	for(int i = 0; i < k; i++){
		if(map.containsKey(arr[i]){
			int currValue = map.get(nums[i])
			count.put(nums[i], currValue + 1);
		}
		else{
			map.put(arr[i] , 1)
		}	
	}
	
	for(int i = 0; i< arr.length; i++)
		int count = map.getValue(arr[i]);
		if ()
}
________________________________________

void countDistinct(int arr[], int K)
    {
        HashMap<Integer, Integer> hM  = new HashMap<Integer, Integer>();
 
        for (int i = 0; i < K; i++)
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
		for (int i = K; i < arr.length; i++) {
			if (hM.get(arr[i - K]) == 1) {
                hM.remove(arr[i - K]);
            }
 
            else 
                hM.put(arr[i - K], hM.get(arr[i - K]) - 1);
 
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
 
            if(hM.size()==k){
				return i-k + 1;
			}
        }
		return -1;
    }



*/

public class Demo31August{




}



/**
 * chat codes
 * 

From Vipul gl to Everyone 09:21 PM

public static void main(String[] args) {
        int[] arr1 = {10, 15, 4, 20};
        int[] arr2 = {8, 4, 2, 10};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

________________________________

From Akshay M gl to Everyone 09:22 PM

public static void findUnion(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        System.out.println(set);
    }

 public static void findIntersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1){
            set.add(i);
        }
        for (int i : arr2) {
            if (set.contains(i))
                System.out.print(i + " ");
        }
    }
____________________________________________

From Vipul gl to Everyone 09:27 PM

	int[] arr1 = {10, 15, 4, 20};
    int[] arr2 = {8, 4, 2, 10};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){
                result.add(arr2[i]);
            }
        }

        for (Integer integer : result) {
            System.out.print(integer);
        }
_________________________________________________________

From Rohit Nagaraj gl to Everyone 09:28 PM

public int[] FindUnion(int[] nums1, int[] nums2)
{
	HashSet<Integer> hashSet = new HashSet<Integer>();
	for (int i = 0; i < nums1.Length; i++)
		hashSet.add(nums1[i]);
	for (int i = 0; i < nums2.Length; i++)
		hashSet.add(nums2[i]);
	
	int[] nums = new int[hashSet.size()];
	set.toArray(nums);
	
	return nums;
}

public int[] FindUnion(int[] nums1, int[] nums2)
{
	HashSet<Integer> hashSet = new HashSet<Integer>();
	for (int i = 0; i < nums1.Length; i++)
		hashSet.add(nums1[i]);
	
	List<Integer> nums = new ArrayList<>();
	for (int i = 0; i < nums2.Length; i++)
	{
		if (hashSet.contains(nums2[i]))
			nums.add(nums2[i]);
	}
	
	return nums.toArrray(new int[nums.size()]);
}

second code is for intersection

From Himanshu gl to Everyone 09:28 PM
void Union()

{
int a[] = {10,15,4,20};
int b[] = {8,4,2,10};

HashSet<Integer> union = new HashSet<>();

for(int i=0; i<a.length; i++)
union.add(a[i]);
for(int i=0; i<b.length; i++)
union.add(b[i]);
}


void Intersection()

{
int a[] = {10,15,4,20};
int b[] = {8,4,2,10};

HashSet<Integer> intersection= new HashSet<>();
for(int i=0; i<a.length; i++)
intersection.add(a[i]);

for(int i=0; i<b.length; i++)
{if(!set.contains(b[i]))
intersection.add(b[i]);
}
}

_______________________________________________________

From Deepika Paryani gl to Everyone 09:31 PM

public void solution(int[] arr1, int[] arr2){
	int length = arr1.length() + arr2.length();
	int[] union = new Array()[length];
	int[] intersection = new Array()[length];
	
	for(int i = 0 ; i < arr1.length ;i++){
		union[i]=arr1[i];
	}
	for( int j = 0;j < arr2.length , j++){
		if(union[j] == arr2[j]){
		 intersection[i]= arr2[i]; 
		}else{
			union[i]= arr1[i]; 
		}
		
	}
	for(int i = 0;i<intersection.length;i++){
	system.out.println(" "+ intersection[i]);
	}
	for(int i = 0;i<union.length;i++){
	system.out.println(" "+ union[i]);
	}
}

__________________________________________________________________

From Aniruth Raghuraman gl to Everyone 09:31 PM
public static void findUnionAndIntersection(int[] a, int[] b) {
        HashSet<Integer> union = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            union.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            union.add(b[i]);
        }
        HashSet<Integer> intersection = new HashSet<>();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int num : a) {
            if (Arrays.binarySearch(b, num) >= 0) {
                intersection.add(num);
            }
        }
        System.out.println("Union: " + union.toString());
        System.out.println("Intersection: " + intersection.toString());
    }



PROBLEM 2

public static void main(String[] args) {

        String str = "aaababacz";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                break; 
            }
        }
        
    }


_____________________________________________________
char firstNonRepeatedchar(String str)
{
HashMap<Character, Integer> check = new HashMap<>();

for(int i=0; i<str.length; i++)
{
if(!check.containsKey(str.chatAt(i)))
check.put(str.chatAt(i),1)
else
check.put(str.chatAt(i),check.get(str.chatAt(i)) + 1)
}

for(int i=0; i<str.length; i++)
{
if(check.get(str.chatAt(i)) == 1)
return str.charAt(i);
}

____________________________________________________________________

PROBLEM 3

public int FindIndexofFirstKNonRepeatingNumbers(int[] nums, int k)
{
	HashMap<Integer, Integer> hashMap = new HashMap<>();
	
	for (int i = 0; i < nums.Length; i++)
	{
		if (!hashMap.containsKey(nums[i]))
			hashMap.put(nums[i], 0);

		int count = hashMap.get(nums[i]);
		hashMap.put(nums[i], count+1);
		
		if (i >= k-1)
		{
			if (hashMap.size() == k)
			{
				return i-k;
			}
		}
		else 
		{
			count = hashMap.get(nums[i-k]);
			if (count == 1)
				hashMap.remove(nums[i-k]);
			else
				hashMap.put(nums[i-k], count-1);
		}
	}

	return -1;
}



}
