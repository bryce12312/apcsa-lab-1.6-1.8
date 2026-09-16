/**
 * AP CSA Lab 1.6-1.8 - Compound Assignment, Libraries, and Comments
 *
 * Fill in the body of each method below. Do not rename anything, do not change
 * the parameter lists, and do not change the return types. The grader compiles
 * against these exact signatures.
 *
 * Run the program with:  mvn -q compile exec:java
 * Or from your IDE, just run main.
 */
public class ToolkitLab
{
    // ---------------------------------------------------------------
    // PART 1: += does the arithmetic and the assignment in one statement
    //
    // Add bonus to score using the compound operator += , then return score.
    //
    //     score += bonus;   is exactly   score = score + bonus;
    //
    // Java takes the variable's current value, applies the operator to the
    // value on the right, and stores the result back in the same variable.
    //
    // Example: addBonus(40, 10) is 50
    // Example: addBonus(7, 7)   is 14
    //
    // Careful: score += bonus does NOT mean "add nothing". It always stores
    // the result back in score. And watch the order of the two symbols:
    // score =+ bonus compiles, but it is plain assignment followed by a plus
    // sign, so it just sets score to bonus and throws the old value away.
    // ---------------------------------------------------------------
    public static int addBonus(int score, int bonus)
    {
        // TODO Part 1: use += to add bonus to score, then return score
        score +=bonus;
        return score;
    }

    // ---------------------------------------------------------------
    // PART 2a: /= on an int still does integer division
    //
    // Divide total by people using /= , then return total.
    //
    // The shorthand never changes the arithmetic. total is an int, so this is
    // integer division and the decimal part is thrown away before you ever
    // see it.
    //
    // Example: splitEvenly(9, 2)  is 4, not 4.5 and not 5
    // Example: splitEvenly(11, 2) is 5
    // Example: splitEvenly(7, 10) is 0, because 7 / 10 has no whole part
    // ---------------------------------------------------------------
    public static int splitEvenly(int total, int people)
    {
        // TODO Part 2a: use /= to divide total by people, then return total
        total /= people;
        return total;
    }

    // ---------------------------------------------------------------
    // PART 2b: the same /= on a double keeps the decimal part
    //
    // Divide total by people using /= , then return total.
    //
    // This is the same operator and the same two numbers as Part 2a. The only
    // difference is that total is a double here, so the division is real
    // division. The type of the variable decides the arithmetic, not the
    // shorthand.
    //
    // Example: splitExactly(9.0, 2) is 4.5
    // Example: splitExactly(1.0, 8) is 0.125
    //
    // Compare this with Part 2a. Same operator, same numbers, two different
    // answers.
    // ---------------------------------------------------------------
    public static double splitExactly(double total, int people)
    {
        // TODO Part 2b: use /= to divide total by people, then return total
        total /= people;
        return total;
    }

    // ---------------------------------------------------------------
    // PART 3: %= stores the remainder, not the quotient
    //
    // Use %= to replace items with what is left over after items has been
    // handed out in whole groups of groupSize, then return items.
    //
    //     items %= groupSize;   is exactly   items = items % groupSize;
    //
    // Example: leftoverItems(17, 5) is 2, because 17 is three 5s plus 2
    // Example: leftoverItems(19, 4) is 3, because 19 is four 4s plus 3
    // Example: leftoverItems(7, 10) is 7, because no whole group of 10 fits,
    //          so all 7 are left over
    //
    // Careful: % is not division. leftoverItems(17, 5) is 2, not 3.
    // ---------------------------------------------------------------
    public static int leftoverItems(int items, int groupSize)
    {
        // TODO Part 3: use %= to store the remainder in items, then return it
        items %= groupSize;
        return items;
    }

    // ---------------------------------------------------------------
    // PART 4: ++ adds one, on a line of its own
    //
    // Use the post-increment operator ++ to add 1 to counter, then return
    // counter.
    //
    //     counter++;   is exactly   counter = counter + 1;
    //
    // Write counter++ as a statement on its own line, then return counter on
    // the next line. On the AP exam ++ and -- only ever appear as standalone
    // statements, so that is how you should write them here.
    //
    // Example: nextTicket(1)  is 2
    // Example: nextTicket(99) is 100
    //
    // Careful: counter++ adds one. It does not double anything, so it is not
    // the same as counter += counter. And do not write "return counter++;"
    // as one line -- putting the operator inside a larger expression is
    // outside the scope of this course, and it hands back the OLD value.
    // ---------------------------------------------------------------
    public static int nextTicket(int counter)
    {
        // TODO Part 4: add 1 to counter with ++ on its own line, then return it
        counter++;
        return counter;
    }

    // ---------------------------------------------------------------
    // PART 5: using a library class you did not write
    //
    // Return the area of a circle with the given radius.
    //
    // The Math class is part of Java's standard library. It lives in the
    // package java.lang, which every program imports automatically, so you do
    // not write an import statement for it. You have never read the code
    // inside Math and you never need to -- the API documentation tells you
    // what each member needs and what it gives back, and that is enough.
    //
    // Two members of Math matter here, and they are different kinds of thing:
    //
    //     Math.PI          an ATTRIBUTE: data stored in the class,
    //                      the value 3.141592653589793
    //     Math.pow(b, e)   a BEHAVIOR: a method, something the class can do.
    //                      It needs two doubles and gives back a double.
    //
    // Attributes are what a class has. Behaviors are what it can do.
    //
    // The area of a circle is PI times the radius squared. You may square the
    // radius with Math.pow(radius, 2) or by multiplying it by itself.
    //
    // Example: circleArea(1.0) is 3.141592653589793
    // Example: circleArea(2.0) is 12.566370614359172
    //
    // Careful: use Math.PI, not 3.14. The rounded-off version is close enough
    // to look right and far enough off to be marked wrong.
    // ---------------------------------------------------------------
    public static double circleArea(double radius)
    {
        // TODO Part 5: return Math.PI times the radius squared
     
        return Math.PI * Math.pow(radius,2);
    }

    // ---------------------------------------------------------------
    // PART 6: a precondition tells you what you may assume
    //
    // Return the average score, as a double, for a student who earned
    // totalPoints across tests tests.
    //
    // Precondition:  tests > 0
    // Postcondition: returns totalPoints divided by tests, with the decimal
    //                part kept
    //
    // A precondition is a condition that must be true just before the method
    // runs for it to behave as documented, and there is no expectation that
    // the method will check it. That is the caller's job. So you do NOT write
    // any code here that looks at whether tests is zero -- the documentation
    // already promises it is not, which means less code, not more.
    //
    // A postcondition is a condition that must always be true after the
    // method finishes. It describes the result, never the technique.
    //
    // Example: averageScore(450, 5) is 90.0
    // Example: averageScore(7, 2)   is 3.5, not 3.0
    //
    // Careful: totalPoints and tests are both ints, so plain
    // totalPoints / tests is integer division and 7 / 2 would be 3. Cast one
    // operand to a double before the division happens, the way you did in
    // Lab 1.5.
    // ---------------------------------------------------------------
    public static double averageScore(int totalPoints, int tests)
    {
        // TODO Part 6: return the exact average, keeping the decimal part
        
        return ((double)totalPoints / tests);
    }

    // ---------------------------------------------------------------
    // PART 7: a comment never runs
    //
    // This method should add 5 to score and then double the result, and
    // return it.
    //
    // Someone tried to write that below, but the two statements are trapped
    // inside a /* */ block comment. Java strips all three comment forms --
    // // for one line, /* */ for a block, and /** */ for Javadoc -- before it
    // compiles anything, so those two lines do not exist as far as the
    // program is concerned. A comment can never fix a bug and can never cause
    // one; it simply is not there when the program runs.
    //
    // Leave the comment alone and write the two statements again below it,
    // outside the comment, so that they actually run. Compound operators are
    // the natural way to write them.
    //
    // Example: finalScore(10) is 30, because 10 + 5 is 15 and 15 doubled is 30
    // Example: finalScore(0)  is 10
    // ---------------------------------------------------------------
    public static int finalScore(int score)
    {

        // TODO Part 7: write those two statements again here, outside the
        // comment, then return score
        score += 5;
        score *= 2;
        return score;
    }

    // ---------------------------------------------------------------
    // Run this to see your own work. The grader does not test main, so you
    // may change it freely while you experiment.
    // ---------------------------------------------------------------
    public static void main(String[] args)
    {
        System.out.println("addBonus(40, 10)      = " + addBonus(40, 10));
        System.out.println("splitEvenly(9, 2)     = " + splitEvenly(9, 2));
        System.out.println("splitExactly(9.0, 2)  = " + splitExactly(9.0, 2));
        System.out.println("leftoverItems(17, 5)  = " + leftoverItems(17, 5));
        System.out.println("nextTicket(1)         = " + nextTicket(1));
        System.out.println("circleArea(2.0)       = " + circleArea(2.0));
        System.out.println("averageScore(7, 2)    = " + averageScore(7, 2));
        System.out.println("finalScore(10)        = " + finalScore(10));
    }
}
