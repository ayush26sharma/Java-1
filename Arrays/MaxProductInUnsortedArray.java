/*Algorithm and Approach:

1. define a class{
2. define method in that class{
3. a. array len <2=> -1
   b. array len =2 => mul of those 2
4.  condition for smallest
    condition for secsmallest
    

    cond for greatest
    cond for secgreat



    for loop{
      updation:
      if any ele is less than smallest
      else if
      

      if any ele is grater than great
      else if

     }
     first 2;
     last 2;
      


     return;
     

Main{
    new;
    int arr[]
    println;
}

Time Complexity: O(n)
Space Complexity:O(1)

If you use Naive Approach and keep multiplying each element: O(n^2) ;S.C:O(1)
If you use Sort :O(nlogn); S.C:O(1)
     
*/




class arrayimp{
    public int getMaxMul(int arr[]){
        if(arr.length<2){
            return -1;
        }
        if(arr.length==2){
            return (arr[0]*arr[1]);
        }
        
        
        int smallest=arr[0]<arr[1]?arr[0]:arr[1];
        int secsmallest=arr[0]>arr[1]? arr[0]:arr[1];
        
        int greatest=arr[0]>arr[1]? arr[0]:arr[1];
        int secgreatest=arr[0]<arr[1]?arr[0]:arr[1];
        
        for(int i=2;i<arr.length;i++){
            if(arr[i]<smallest){
                secsmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<secsmallest){
                secsmallest=arr[i];
            }
            
            if(arr[i]>greatest){
                secgreatest=greatest;
                greatest=arr[i];
            }else if(arr[i]>secgreatest){
                secgreatest=arr[i];
            }
        }
            int firsttwo=smallest*secsmallest;
            int lasttwo=greatest*secgreatest;
            
            return firsttwo>lasttwo? firsttwo:lasttwo;
        
        
    }

}
public class MaxProductInUnsortedArray
{
	public static void main(String[] args) {
		arrayimp a=new arrayimp();
		int arr[]={-11,-2,0,3,5};
	
		System.out.println(a.getMaxMul(arr));
	}
}
