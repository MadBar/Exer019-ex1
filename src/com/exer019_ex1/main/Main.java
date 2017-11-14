package com.exer019_ex1.main;

import com.exer019_ex1.classes.MyRandomMethods;

public class Main {
	public static void main(String[] args) {
		MyRandomMethods mRM = new MyRandomMethods();

		System.out.println(mRM.randomBetween1And10());
		System.out.println(mRM.randomBetween11And20());
		System.out.println(mRM.randomBetween21And30());
		System.out.println(mRM.randomBetween31And40());
		System.out.println(mRM.randomBetween41And50());
	}
}
