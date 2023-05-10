package com.test.deutche;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSum {

	public static void main(String[] args) {
		//int[] input= {1, 5, 17, 3, 9, 96, -8};
		//test
		int[] input= {1, 5, 4, 3, 9, 2, 8};
		ArrayList<Integer> indexes=new ArrayList<Integer>();
		indexes=FindSum.findSumfromArray(input,9);
		if(indexes!=null)
		{
			System.out.println(indexes);
		}
		else
		{
			System.out.println("elements are not present in the given array for the sum");
		}
		//output should have the indexes of array
		
	}

	public static ArrayList<Integer> findSumfromArray(int[] input,int sum)
	{
		ArrayList<Integer> indexes=new ArrayList<Integer>();
		Arrays.sort(input);
		//-8,1,3,9,17,96
		// 1 2 3 4 5 8 9 
		
		int first=0;
		int end=input.length-1;
		int mid=(first+end)/2;
		while(first<end)
		{
			if(input[first]+input[mid]>9)
			{
				first=mid;
			}
			else if(input[first]+input[mid]<9)
			{
				end=mid;
			}
			else if(input[first]+input[mid]==9)
			{
				//System.out.println("elements are found");
				indexes.add(first);
				indexes.add(mid);
				return indexes;
			}
			mid=first+end/2;
		}
		//System.out.println("elements are not present in the array");
		return null;
	}
}
