package org.bcit.comp2522.labs.lab02;

import processing.core.PApplet;

/**
 * An example Abstract class to show shapes being drawn on a window..
 *
 * @author Gathrean Dela Cruz
 * @author Bardia Timouri
 * @version 1.0 Jan 12, 2023
 */
public class ExampleWindow extends PApplet {

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    ellipse(mouseX, mouseY, 50, 50);
  }

  /**
   * Changes the background of the window when mouse is clicked.
   */
  public void mousePressed() {
    background(64);
  }

  /**
   * The main method.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    String[] processingArgs = {"processingWindow"};
    ExampleWindow processingWindow = new ExampleWindow();
    PApplet.runSketch(processingArgs, processingWindow);
  }
}