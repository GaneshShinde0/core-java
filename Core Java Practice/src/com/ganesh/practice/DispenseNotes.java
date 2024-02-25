package com.ganesh.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DispenseNotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw :");
		Integer n = sc.nextInt();
		List<Integer> denomiation = List.of(100, 200, 500, 2000);
		HashMap<Integer, Integer> notesInAtm = new HashMap<>();
		HashMap<Integer, Integer> notesToUser = new HashMap<>();

		final Integer HUNDRED = 100;
		final Integer TWO_HUNDRED = 200;
		final Integer FIVE_HUNDRED = 500;
		final Integer TWO_THOUSAND = 2000;
		int yetToGiveToUser =0;
		while (n > 0) {
			if (n >= TWO_THOUSAND) {
				notesToUser.put(TWO_THOUSAND, n / TWO_THOUSAND);
				yetToGiveToUser = (n%TWO_THOUSAND);
				n -= (n/TWO_THOUSAND);
				n = yetToGiveToUser;
				continue;
			}
			if(n>=FIVE_HUNDRED && n<TWO_THOUSAND) {
				notesToUser.put(FIVE_HUNDRED, n / FIVE_HUNDRED);
				yetToGiveToUser=(n%FIVE_HUNDRED);
				n -= (n/FIVE_HUNDRED);
				n = yetToGiveToUser;
				continue;
			}
			if(n>=TWO_HUNDRED && n<FIVE_HUNDRED) {
				notesToUser.put(TWO_HUNDRED, n / TWO_HUNDRED);
				yetToGiveToUser=(n%TWO_HUNDRED);
				n -=(n/TWO_HUNDRED);
				n = yetToGiveToUser;
				continue;
			}
			if(n>=HUNDRED && n<TWO_HUNDRED) {
				notesToUser.put(HUNDRED, n / HUNDRED);
				yetToGiveToUser = (n%HUNDRED);
				n -= (n/HUNDRED);
				n = yetToGiveToUser;
				continue;
			}
			System.out.println(n);
		}
		System.out.println(notesToUser);

	}
}