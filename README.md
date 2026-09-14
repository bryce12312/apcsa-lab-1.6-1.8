# Lab 1.6-1.8 — Compound Assignment, Libraries, and Comments

Eight short methods in `ToolkitLab.java`, most of them one line. The
instructions for each one are in the comment block directly above the method,
so read them there — this page is just the map.

Plan on 30 to 45 minutes.

## What you will practice

- Writing `+=`, `-=`, `*=`, `/=` and `%=`, and knowing the expanded form of
  each.
- Seeing that the shorthand never changes the arithmetic: the variable's type
  still decides whether a division truncates.
- Using `++` as a standalone statement that adds one.
- Calling a class from Java's standard library, and telling an attribute
  (`Math.PI`) from a behavior (`Math.pow`).
- Reading a precondition and a postcondition, and writing only the code the
  precondition leaves you.
- Proving to yourself that a comment never runs.

## Getting started

1. Open this folder in your editor.
1. Open `src/main/java/ToolkitLab.java`. That is the only file you change.
1. Work down the file. Each part is marked with a comment that starts with
   `TODO`; replace the placeholder line under it with your own code.

To run your program and see your output:

```sh
mvn -q compile exec:java
```

Your teacher will run a separate set of tests on your work when you turn it in.

## The parts

| Part | Method | What it is about |
| --- | --- | --- |
| 1 | `addBonus(int, int)` | `+=` |
| 2a | `splitEvenly(int, int)` | `/=` on an `int` truncates |
| 2b | `splitExactly(double, int)` | the same `/=` on a `double` |
| 3 | `leftoverItems(int, int)` | `%=` stores the remainder |
| 4 | `nextTicket(int)` | `++` on a line of its own |
| 5 | `circleArea(double)` | `Math.PI` and `Math.pow` |
| 6 | `averageScore(int, int)` | a documented precondition |
| 7 | `finalScore(int)` | code trapped inside a comment |

## Before you turn it in

- [ ] Every `TODO` comment has been replaced with real code.
- [ ] `mvn -q compile exec:java` runs without errors.
- [ ] Parts 2a and 2b give different answers for the same two numbers. If they
      agree, look at the type of `total` in each one.
- [ ] Part 4 uses `counter++` on its own line. `return counter++;` is not what
      you want, and prefix form `++counter` is outside this course.
- [ ] Part 7 leaves the block comment where it is and adds real statements
      below it.
- [ ] You did not rename any method, change any parameter list, or change any
      return type. The grader compiles against those exact signatures, so a
      rename means a zero even if your logic is perfect.
- [ ] You may change `main` however you like. It is not graded.

## Optional extension, not graded

Add this to `main` and run it:

```java
System.out.println(averageScore(450, 0));
```

Part 6 is documented `Precondition: tests > 0`, and you were told not to check
for it. Write one sentence saying what happened, and whose mistake it was.
