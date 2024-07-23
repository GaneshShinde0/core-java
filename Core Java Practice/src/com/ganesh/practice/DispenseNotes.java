package com.ganesh.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DispenseNotes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw :");
		int amount = sc.nextInt();
		sc.close();

		List<Integer> denominations = List.of(2000, 500, 200, 100);
		HashMap<Integer, Integer> notesToUser = new HashMap<>();

		for (int denomination : denominations) {
			if (amount >= denomination) {
				int count = amount / denomination;
				notesToUser.put(denomination, count);
				amount %= denomination;
			}
		}

		if (amount > 0) {
			System.out.println("Cannot dispense the remaining amount: " + amount);
		}

		System.out.println("Dispensed notes: " + notesToUser);
	}
}
