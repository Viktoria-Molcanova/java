/**
 * 151. Reverse Words in a String
*/
class Solution
{
  public String reverseWords (String s)
  {
    List < String > result = new ArrayList < String > ();
    if (s.length () == 0)
      return s;

    int st = 0;
    while (st < s.length () && s.charAt (st) == ' ')
      st++;

    int i = st;
    while (i < s.length ())
      {
	while (i < s.length () && s.charAt (i) != ' ')
	  i++;
	String tmp = s.substring (st, i);
	  result.add (0, tmp);
	  st = i;
	while (st < s.length () && s.charAt (st) == ' ')
	  st++;
	  i = st + 1;
      }
    return String.join (" ", result);
  }
}

/**
 * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
*/
import java.util.stream.*;
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    int n = scanner.nextInt ();
    int sum = 0;
    int count = 0;
    int a = 0, b = 0;
      a = scanner.nextInt ();
    for (int i = 0; i < n; i++)
      {
	b = scanner.nextInt ();
	if (a > 0 && b < 0); sum = IntStream.of (a).sum ();
	a = b;
	count++;
      }
    System.out.println ("сумма = " + sum);

  }

}
