package JalaAssignments;

public class Strings 
{
	public static void main(String[] args)
    {
       char keyPressed = 'q';
        String fullName = "Ian Sheperd";//String is a collection of characters.A String object stores text and presents the text to user.
        System.out.println(fullName);
        System.out.println(fullName.charAt(10));
        System.out.println(fullName.length());
        System.out.println("\"\'Sharknado\' is an hour and a half of your "
        + "life that you'll never get back.\nAnd you won't want to.\"\n"
        + "\t-- David Hinckley, New York Daily News");// + operator in strings is called concatenation operator
        String firstName = "Kashish";
        String lastName = "Goyal";
        System.out.println(firstName + ' ' + lastName);// 
        int age = 18;
        System.out.println(firstName + ' ' + lastName + "'s age is:" + age);// if atleast 1 variable or object is of type String then we can concatenate anytype of variable with strings and the whole expression will get converted into a text of string.
        System.out.println(firstName.substring(3));
        System.out.println(firstName.substring(0));
        System.out.println(lastName.substring(0, 5));
        System.out.println(firstName + '\n' + lastName);
        System.out.println(firstName.contains("K"));// KS is a subsequence of the string "Kashish"
        System.out.println(lastName.contains("Goyal"));
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());
        String a = "ABC";
        String b = "ABC";// Java Virtual Machine keeps track of string objects made without new operator.If all such objects have same string value then all those objects are treated as one object.
        String d = "ABC";
        String f = "ABC";
        String g = "ABC";
        // all of these string objects are made without new operator and have same text value "ABC" so they all will be treated as one single object by Java Virtual machine.
        String h = "FGH";
        String i = h;
        System.out.println(h == i);
        String c = new String("ABC");// here new String object named c is created.
        String j = new String("ABC");
        System.out.println(c == j);
        System.out.println(c.equals(j));
    }
}
