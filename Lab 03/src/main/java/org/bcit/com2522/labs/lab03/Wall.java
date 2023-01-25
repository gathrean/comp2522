package org.bcit.com2522.labs.lab03;

import java.awt.Color;
import processing.core.PVector;

/**
 * A Java program that initializes a "wall" shape inside the window
 * for the Sprites to bounce off from.
 */
public class Wall extends Sprite {
  private double position;
  private Window window;

  public Wall(PVector position,
              PVector direction,
              float size,
              float speed,
              Color color,
              Window window) {
    super(position, direction, size, speed, color, window);
  }
}
