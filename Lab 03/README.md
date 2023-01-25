# Lab-03
## Lab-03: Polymorphism
This lab is all about [polymorphism](http://underpop.online.fr/j/java/help/polymorphism-java-game.html.gz). As said in lecture last week, a lot of Java programming actually ends up being data design. This lab will help illustrate that.

Start by making sure you can run the file. Use the arrow keys to direct the green `Player`. You may need to click on the `Window` to make the interaction work.

## TODO 1: Refactor such that `Enemy` and `Player` extend `Sprite`
Refactoring is iterative. Start by making the most easy refactoring, which will be to create special concrete classes for each of `Player` and `Enemy` which extend `Sprite`. Refactor any code you need to from `Window`. While doing so, try to focus on _Single Responsibility_. Make sure that each class contains the code that handles only itself, and nothing more.

## TODO 2: Make it so that `Sprite` implements `Comparable`.
Make it so that `Sprite` implements the Java library's `Comparable`. Start by defining an `equals` method. Then create the `compareTo` method such that it agrees with the `equals` method. Write a test (or multiple tests) to ensure that your `compareTo` and `equals` are working the way you expect them to. 

## TODO 3: Only remove an `Enemy` if it is smaller than the `Player`
Ensure that the remove functionality in `Window` only works if an `Enemy` is smaller than the `Player`. Otherwise, the `Player` loses and the game must restart. (Hint: use `init`).

## TODO 4: Add a `Wall` class and implement a clear, polymorphic design
Now, add a `Wall` class that does NOT make use of `Comparable`. Both `Enemy` and `Player` should bounce off of the wall. Using interfaces to describe the differnt abilities (as from lecture), create a set of polymorphic calls that check for `collisions`, `draw`, and `remove` in the most polymorphic way possible.

## TODO 5: Project group and pitch draft due for next class
For next week, you'll want to have a clear idea of what your project is going to be. Then, next lab, I will help you scope your project appropriately.
In this repo, write the following:
1) A one-liner (exactly 1 sentence) that describes your project.
2) A list of points (about 5-10 sentences) that describes how your project meets each of the requirment criteria.
3) Answers to the below group discussion items (meetings, communication, roles, and expectations).

A large portion of your mark for this course will be work that you do within the context of a group. My expectations are that all group members contribute fully to the best of their abilities. Since everyone will have different abilities, preferences, and interests, this can sometimes be difficult to negotiate.

When you start your group work, you will be expected to decide the following and adhere to your decisions. I will provide an outline here as a minimum requirement, but you are expected to explicitly negotiate group norms and expectations on top of what I provide.

1. Every group member must be on a common chat application, and must check and respond to messages within a day during normal business hours.
2. Every group member must volunteer to take on project tasks and complete them by the associated deadlines. These tasks MUST be managed using GitHub issues. Each group member is responsible for creating and closing GitHub issues for tasks they have taken on.
3. The group must meet at least once during the week outside of class time to discuss the status of project tasks. All group members must be present during this meeting.
4. For official/important decision-making meetings, an ongoing minutes document must be maintained where attendance and group decisions are recorded.
5. Groups must decide on a way of formally negotiating disputes. Default will be consensus with 2/3rds majority vote unless another system is explicitly decided upon.

If there are disputes that require mediation from me, I will be happy to help the group find a solution that is amenable to all. In your first group meeting, you will want to discuss the following:

1. Meeting time and format: when will you meet and how?
2. Communications expectations and format: what times of day are people available and by which medium?
3. Roles and responsibilities: who will do what part of the group aspects of the project, including project management?
4. Abilities and expectations: how much effort do people want to put into the project and in what areas do they have expertise?

I encourage people to put significant thought into the format and procedures of their meetings so that there are clear expectations outlined, but to approach it with an attitude of grace and hospitality. For example, I like to do post-mortem reviews each week with my teams and keep that as a pretty strict rule that that is how we begin meetings, but if it's not working for some reason, we can discuss that together and skip the pomo.

## Submission Requirements

This lab must be completed and pushed to GitHub Classroom at or before 23:59:59 the night before lab.

I will mark the final commit pushed to GitHub before this time. Push often, and please make sure your commit comments are short and clear and specific. When you commit, please tell me EXACTLY what you did. Start with a verb in present tense. What does this commit do? Implement? Test? Debug? Add? Remove? Fix? Write? Complete? Refactor? Polish?

You must not ignore Checkstyle warnings or the code style warnings produced by IntelliJ.

You must style your code so that it does not generate any warnings.

When code is underlined in red, IntelliJ is telling us there is an error. Mouse over the error to (hopefully!) learn more.

When code is underlined in a different colour, we are being warned about something. We can click the warning triangle in the upper right hand corner of the editor window, or we can mouse over the warning to learn more. If the warning seems silly, tell me about it, and I will investigate and possibly ask the class to modify some settings to eliminate it once and for all!

## Code style requirements that you must observe:
1. Your code must compile.
2. Your code must not generate any IntelliJ code warnings or problems.
3. Your code must execute without crashing.
4. Your code must not generate any Checkstyle complaints (unless they are complains I have specifically said you can ignore).
5. Don’t squeeze your code together. Put a blank space on either side of your operands, for example. I will be assessing the readability and clarity of your code.
6. All of your program classes must be in package ca.bcit.comp2522.xxx (replace xxx as required by the assignment, lab, quiz, etc.). For example, today’s work should go in the ca.bcit.comp2522.labs.lab0X package.
7. All classes require Javadoc comments including the @author tag AND the @version tag. Class comments go after the package and import statements. There should be no blank lines between a class comment and the class it describes.
8. Public constants require Javadoc comments, private constants do not. Constants should be the first thing in your class.
9. Constants should be static and final, are often public, and should be followed by instance variables.
10. Instance variables have private or protected visibility, never public or default visibility.
11. Public and protected methods require Javadoc comments including @param tag(s)the @return tag, and the @throws tag where needed (we won’t worry about throws until we talk about exceptions in depth).
12. A method’s comment must begin with verbs describing what the method does, i.e., Calculates, Returns, Sets, Prints, etc. Note that we use present tense in Java – Returns, not Return. Prints, not Print.
13. The @return and @param tags go AFTER the description.
14. Private methods require non-Javadoc comments (the comments that start with a slash and a single asterisk).
15. Do comment complicated logical blocks of code inside methods with sparse, clear inline comments.
16. Do not use magic numbers (you must use constants instead). Remember that a magic number is any numeric literal. A constant can be local in a method (use the final keyword with it) or class-level (make it static and ALL_CAPS).
17. All method parameters that are object references must be made final (so we don’t forget parameters are passed by value):
(a) Nice to prevent erroneous assignments, and necessary if parameter is referenced by inner class, but that is perhaps a little advanced for now.
(b) References made final mean that the reference, once pointing to an object, cannot be changed to point at a different object.
18. Consider making your methods final:
(a) Making a method final prevents subclasses (those that inherit the method) from changing its meaning.
(b) Final methods are more efficient (the methods become inline, thus avoiding the stack and generating overhead).
19. Data and methods that work together must be encapsulated in the same class.
20. Code duplication must be minimized.
21. The values of local variables that are primitives are set when they are declared, and local variables are not declared until they are needed.
22. Every class that stores state needs an equals method, a hashCode method, and a toString method.
23. In general, we enforce a fairly hard maximum method length of 20 lines of code. Aim for 10 (excluding braces).
