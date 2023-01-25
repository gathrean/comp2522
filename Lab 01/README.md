# Lab-01
## Lab 01: Getting started

Welcome to a new term! If you haven't yet, it's time to start you programming setup. This page will introduce you to our course technologies. Importantly, it also will introduce you to the documentation you'll need to start solving your own build problems.

Complete this on your own BEFORE the next lab. It's important to develop your own problem-solving skills early. Take note of what you, personally, need to learn. It will be different for everyone: I'm a build-first-and-ask-questions-later kind of person, but many people are not.

### TODO 1: Install IDE and JDK.
Download and install the [Intellij IDE](https://www.jetbrains.com/idea/) and the latest [Java SDK](https://www.oracle.com/java/technologies/downloads/) (version 17 or 18 should be fine). 

### TODO 2: Create a Gradle Project in Intellij.
Gradle is a build system that we will be using for the term. It manages many of the configuration files that are needed to manage software deployments. 

Follow **Step 1** of the [Getting Started with Gradle guide](https://www.jetbrains.com/help/idea/getting-started-with-gradle.html). You can follow more than Step 1 if you'd like to learn more about Gradle, but it is not required for the lab.

### TODO 3: Connect your repo to GitHub.
Connect this remote GitHub repository to your local Git repository. Note the difference: GitHub is a hosting platform for remote repositories whereas Git is the Version Control System (VCS) that we're using. [Follow this guide](https://www.jetbrains.com/help/idea/using-git-integration.html). Note that this will be a DIFFERENT repo than the one you're currently reading from.

### TODO 4: Refactor your package name.
Following the [instructions here](https://www.jetbrains.com/help/idea/rename-refactorings.html), refactor your package name to `org.bcit.comp2522.labs.lab01`. Make sure to change it BOTH in your `build.gradle` file and within your packages.

### TODO 5: Push a unique "Hello, world!" greeting.
In the `Main.java` under the `main` method, change the "Hello, world!" greeting to something unique, such as your favourite animal or baseball team. Add to your current commit and push to the remote branch by [following these instructions](https://www.jetbrains.com/help/idea/commit-and-push-changes.html). Always make sure to write an informative commit message!

Ensure that your change is reflected on your remote repository.

### TODO 7: Install and use helpful plugins.

[Learn how to install plugins here](https://www.jetbrains.com/help/idea/managing-plugins.html). Install the following:
+ Checkstyle-IDEA by Jamie Shiell. Install it, and reboot IntelliJ if required.
+ SpotBugs by Tagir Valeev. Install this too, and reboot IntelliJ if required.
+ PMDPlugin by Amit Dev. Install it and (you guessed it) reboot if required.

### TODO 8: Fix style errors.

![checkstyle](https://user-images.githubusercontent.com/3506567/187993163-4bbedf60-30d3-445b-9c15-041061b9f765.png)

Now run CheckStyle using the Google Checks rules. You should see a few style errors show up. Fix them. You'll have to add a comment like this:

```java
/**
* Your comment here.
*/
```

See the course style guide below for mandatory standards, and the link below for Google's style guide.

You may need to [update the indention settings](https://www.jetbrains.com/help/idea/reformat-and-rearrange-code.html#tabs_and_indents). Style is very important in coding and following style is **absolutely mandatory** in this class. Check out this resource if you want to learn more about [Google style](https://google.github.io/styleguide/javaguide.html).

Note that [you may need to change the default indentation for your install of Intellij](https://www.jetbrains.com/help/idea/reformat-and-rearrange-code.html#tabs_and_indents).

### TODO 9: Add the Processing.org JAR to your build path
From this repo, copy the entire `library/` folder into the root of your project. Update your `build.gradle` file to include:

```
dependencies {
    implementation fileTree(dir: 'library', include: ['*.jar'])
    ...
 }
```

Where the `...` just means "all of the other stuff you already have in there." 

[Now, reload your Gradle as per the instructions on this page](https://www.jetbrains.com/idea/guide/tutorials/working-with-gradle/syncing-and-reloading/).

### TODO 10: Create a new class called `Window`

Create a new class in your package called `Window` and paste in the following code:

```
public class Window extends PApplet {

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    ellipse(mouseX, mouseY, 50, 50);
  }

  public void mousePressed() {
    background(64);
  }

  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}
```
Resolve the package and imports. Run it to ensure that you installed the above library correctly. You should see a window pop up and circles appear under your mouse. When you click, they should disappear.

### TODO 11: Draw something interesting
Look at the [Processing.org](https://processing.org/reference) documentation under `2D Primitives`. You can see many different geometric primitives that you can use to draw something. Define a new method that draws something reasonably interesting (i.e., uses at least four different primitives). Write the Javadocs and comments needed to satisfy the style requirements below. Run Checkstyle and resolve all issues. Push this to your GitHub repo.

### TODO 12: Hand in your code
For today's project, I've asked you to make your own repo. However, this is the handin location for your current repo. You'll need to find a way to get your files into this repo. There are multiple strategies you could employ:
- Clone this repo and copy all of your project files (except the `.git` director) into this folder
- Clone this repo, copy the `.git` directory into your current project folder, and add your current project files to that repo
- Clone this repo, create a new module within this folder, and copy only the files you have personally changed into this repo

My suggestion would be to try different strategies and attempt to understand what the difference is. It will be a little confusing, but it will help you understand the difference between your project files, your computer directory files, and what's on GitHub. If you have pushed everything to GitHub, you should feel relatively free to make changes and play around with things until they break. Break them and see why they break. That's one of the best problem solving methods you can develop as a coder.

## Submission requirements
This lab must be completed and pushed to GitHub Classroom before 23:59:59 the night before the next lab. This lab will be checked visually at the beginning of the next lab since it is done outside of lab time. Usually, handin time will be at the END of each lab.

Push early, push often, and please make sure your commit comments are short, clear and specific. I cannot possibly check every commit comment you make, but if I noticed bad commit messages and I can't understand what you're doing, then I may take off style points for that submission.

When you commit, please tell me EXACTLY what you did. Start with a verb in present tense. What does this commit do? Implement? Test? Debug? Add? Remove? Fix? Write? Complete? Refactor? Polish?

You must not ignore Checkstyle warnings or the code style warnings produced by IntelliJ unless directed otherwise. Check on Discord.

You must style your code so that it does not generate any warnings.

When code is underlined in red, IntelliJ is telling us there is an error. Mouse over the error to (hopefully!) learn more.

When code is underlined in a different colour, we are being warned about something. We can click the warning triangle in the upper right hand corner of the editor window, or we can mouse over the warning to learn more. If the warning seems silly, tell me about it, and I will investigate and possibly ask the class to modify some settings to eliminate it once and for all!

## Code style requirements that you must observe:
1. Your code must compile.
2. Your code must not generate any IntelliJ code warnings or problems.
3. Your code must execute without crashing.
4. Your code must not generate any Checkstyle complaints (unless they are complains I have specifically said you can ignore).
5. Don’t squeeze your code together. Put a blank space on either side of your operands, for example. I will be assessing the readability and clarity of your code.
6. All of your program classes must be in package ca.bcit.comp2522.xxx (replace xxx as required by the assignment, lab, quiz, etc.). For example, Lab XX’s work should go in the ca.bcit.comp2522.labs.labXX package.
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

### Grading Scheme (out of 100)
Each TODO is worth 10 points for a total of 100.
