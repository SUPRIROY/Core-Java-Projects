
	import java.util.*;

	public class main
	{
	  static void invertCase (StringBuffer str)
	  {
	    int ln = str.length ();
	    for (int i = 0; i < ln; i++)
	      {
		Character c = str.charAt (i);
		if (Character.isLowerCase (c))
		    str.replace (i, i + 1, Character.toUpperCase (c) + "");
		else
		    str.replace (i, i + 1, Character.toLowerCase (c) + "");
	      }
	  }
	  public static String sentenceCase (String str)
	  {
	    String words[] = str.split ("\\s");
	    String Sentence = "";
	    int i;
	    for (i = 0; i < words.length - 1; i++)
	      {
		String ffirst = words[i].substring (words[i].length () - 1);
		if (ffirst.equals ("."))
		  {
		    String f = String.valueOf (words[i + 1].charAt (0));
		    words[i + 1] = f.toUpperCase () + words[i + 1].substring (1);
		  }
		Sentence += words[i] + " ";
	      }
	    Sentence += words[i] + " ";
	    return Sentence.trim ();
	  }

	  public static String capitalizeWord (String str)
	  {
	    String words[] = str.split ("\\s");
	    String capitalizeWord = "";
	  for (String w:words)
	      {

		String first = w.substring (0, 1);
		String ffirst = w.substring (w.length () - 1);
		String afterfirst = w.substring (1);
		capitalizeWord += first.toUpperCase () + afterfirst + " ";
	      }
	    return capitalizeWord.trim ();
	  }
	  public static void main (String args[])
	  {
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Enter a string: ");
	    String str = sc.nextLine ();
	    System.out.println ("UpperCase: " + str.toUpperCase ());
	    System.out.println ("LowerCase: " + str.toLowerCase ());
	    System.out.println ("Capitalize: " + capitalizeWord (str));
	    System.out.println ("Sentence case: " + sentenceCase (str));
	    StringBuffer inv = new StringBuffer (str);
	    invertCase (inv);
	    System.out.println ("Invert: " + inv);

	  }

	}

	

