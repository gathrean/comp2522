package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * Window class for carrying the shapes.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class Window extends PApplet {

  public void settings() {
    size(500, 500);
  }

  /**
   * Method to draw shape of Pizza and Plate.
   */
  public void draw() {
    // Circle shaped as the Plate (with offset shape for 3D effect)
    circle(250, 250, 350);
    circle(248, 248, 300);
    circle(250, 250, 300);

    // Arc shaped as Pizza slice and its crust.
    arc(200, 200, 320, 320, 0, QUARTER_PI, PIE);
    arc(200, 200, 290, 290, 0, QUARTER_PI, PIE);

    // Circles shaped as Pepperonis with varying sizes.
    circle(310, 220, 29);
    circle(290, 250, 26);
    circle(250, 222, 22);

    // Squares shaped as cheese slices..
    square(185, 130, 50);
    square(185, 280, 50);

    // Triangle shaped as a weird butter knife.
    triangle(0, 500, 100, 300, 100, 400);

    circle(mouseX, mouseY, 10);
  }

  /**
   * The main method.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}