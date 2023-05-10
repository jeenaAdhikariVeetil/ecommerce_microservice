/**
 * 
 */
package com.test.luxoft;

/**
 * @author Jeena A V
 *
 */
public class Assesment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1=new int[] {2,3,4,5,6};
		int[] arr2=new int[] {1,7,8,9,10,11};
		int[] arr3=new int[11];
		//int arr1 = [2,3,4,5,6];
		//int arr2 = [1,7,8,9,10,11];

		//merge both the arrays in such a way that the result array is also sorted without using any collections and sorting technique.

		//result array should be arr3=[1,2,3,4,5,6,7,8,9,10,11];
		//steps, loop arr1 set all to arr3, 
		//loop arr2 ,set all to arr3 ,start loop position 
for(int i=0;i<=arr1.length-1;i++)
{
	arr3[i]=arr1[i];
}
for(int j=arr1.length-1;j<arr2.length;j++)
{
	arr3[j]=arr2[j];
}

for(int k=0;k<arr3.length;k++)
{
	System.out.println(arr3[k]);
}

	}

}
