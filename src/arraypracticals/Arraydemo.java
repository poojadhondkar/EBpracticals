package arraypracticals;

public class Arraydemo {

	public static void main(String[] args) {
		
	
		int[] arr= {10,20,30,40,50};
		arr =new int[5];//allocate the memory for array
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 arr[3] = 40;
		 arr[4] = 50;
		 int key=40;
		 int search=0;
		
		 for(int i=0;i<arr.length;i++)
		 {
			  if(arr[i]!=key) {
			  }
			 else 
				 search=key;
	    }
		  if(search==key)
			 System.out.println("value found "+search);
		 else
			  System.out.println("not found");
	}

}
