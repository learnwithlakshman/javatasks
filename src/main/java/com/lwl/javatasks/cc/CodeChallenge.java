package com.lwl.javatasks.cc;

import java.util.List;
import java.util.Set;

public interface CodeChallenge {

	public boolean isPrime(int num);

	public int reverse(int num);

	public int sumOfDigits(int num);

	public boolean isPalindrome(int num);

	public List<Integer> primeNumberInRange(int lb, int ub);

	public List<Integer> primeNumbers(int arr[]);

	public List<Integer> converToList(int arr[]);

	public List<Integer> removeDuplicates(List<Integer> list);

	public Set<Integer> uniqueValue(List<Integer> list1, List<Integer> list2);

	public int biggest(int a, int b, int c);

	public int biggest(int[] arr);

	public boolean search(int[] arr, int ele);

	public int[] reverseArray(int[] arr);

	public boolean isSubSet(int[] superArr, int[] subArr);
}
