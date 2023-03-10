/**
 * 
 */
package ustbatchno3.junittestcase;

/**
 * @author Administrator
 *
 */
	import java.time.LocalDate;
	import java.util.Collection;
	import java.util.List;
	import java.util.stream.Stream;

	public class Industry {

		

		public static long countgarments(List<String> items, LocalDate dateBefore) {
			// TODO Auto-generated method stub
			return items.stream().count();
		}

		public static long countprice(List<Integer> price, LocalDate dateBefore) {
			return price.stream().mapToInt(Integer::intValue).sum();
		};
		}

