package com.ganesh.others;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaFunction {
	boolean isArmstrong(String num) {

		long ans = Long.parseLong(num);
		long temp, digits = 0, last = 0, sum = 0;
		temp = ans;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = ans;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (ans == sum) {
			return true;
		} else {
			return false;
		}
	}

	public List<Long> functionalProgramming(List<String> listOfIntegers) {
		List<Long> outputList = listOfIntegers.stream().filter(x -> isArmstrong(x)).map(s -> Long.parseLong(s))
				.collect(Collectors.toList());
		System.out.println(outputList.toString());
		return outputList;
	}

}