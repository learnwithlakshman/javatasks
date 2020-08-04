package com.lwl.javatasks.cc;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CodeChallegeImpl implements CodeChallenge {

	@Override
	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		if (num != 2 && num % 2 == 0) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
	     	if (num % i == 0)
				return false;
		}
		return true;
	}

	@Override
	public int reverse(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumOfDigits(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Integer> primeNumberInRange(int lb, int ub) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> primeNumbers(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> converToList(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> removeDuplicates(List<Integer> list) {
		return list.stream().distinct().collect(Collectors.toList());
	}

	@Override
	public Set<Integer> uniqueValue(List<Integer> list1, List<Integer> list2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int biggest(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int biggest(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean search(int[] arr, int ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int[] reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSubSet(int[] superArr, int[] subArr) {
		// TODO Auto-generated method stub
		return false;
	}

}
