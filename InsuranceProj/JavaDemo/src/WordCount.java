import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		String name = new String("amoltulshiram");


		List<String> s = Arrays.asList(name.split(""));

		//Map<String, Long> charCount = s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Long> charCount = s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount); 
	}
}
