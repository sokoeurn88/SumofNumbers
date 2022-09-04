package sum;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumber {

	public static void main(String[] args) {
		// give me a scenario sum all the number in ArrayList
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Optional sum1 = list.stream().reduce((a,b) -> a+b);
		System.out.println("sum of numbers: "+ sum1.get());

	}

}
