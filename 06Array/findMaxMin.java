public class findMaxMin{
    public static int max(int arr[]){
        int max=Integer.MIN_VALUE;
	    for(int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
    }
    public static int min(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
            
        }
        return min;
    }
        
	public static void main(String[] args) {
	    int arr[]={23,45,23,13,54};
;       int max=max(arr);
        int min=min(arr);	    
        System.out.println("\nMax="+max+"\nMin="+min);
		
	}
}
