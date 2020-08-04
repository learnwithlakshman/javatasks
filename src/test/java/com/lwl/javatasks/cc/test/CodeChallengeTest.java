package com.lwl.javatasks.cc.test;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lwl.javatasks.cc.CodeChallegeImpl;
import com.lwl.javatasks.cc.CodeChallenge;

public class CodeChallengeTest {
	
	
		private CodeChallenge obj ;
		
		@BeforeEach
		public void init() {
			obj = new CodeChallegeImpl();
		}
		
	
		@Test
		public void isPrimeWithPrime() {
			int num = 7;
			boolean res = obj.isPrime(num);
			assertThat(res,is(true));
		}
		@Test
		public void isPrimeWith2() {
			int num = 2;
			boolean res = obj.isPrime(num);
			assertThat(res, is(true));
		}
		@Test
		public void isPrimeWithNnumber() {
			int num = -10;
			boolean res = obj.isPalindrome(num);
			assertThat(res, is(false));
		}
		
		@Test
		public void removeDuplicatesWithDuplicates() {
			List<Integer> list = Stream.of(1,2,3,4,5,6,2,3,4,5).collect(Collectors.toList());
			List<Integer> uniqueList = obj.removeDuplicates(list);
			assertThat(uniqueList,contains(1,2,3,4,5,6));
		}
		@Test
		public void removeDuplicatesWithOutDuplicates() {
			List<Integer> list = Stream.of(1,2,3,4,5,6).collect(Collectors.toList());
			List<Integer> uniqueList = obj.removeDuplicates(list);
			assertThat(uniqueList.size(),is(list.size()));
		}
}
