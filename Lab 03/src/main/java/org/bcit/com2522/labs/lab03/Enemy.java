package org.bcit.com2522.labs.lab03;

import java.awt.Color;
import processing.core.PVector;

/**
 * An Enemy class to represent an enemy object in the game.
 */
public class Enemy extends Sprite {

  /**
   * Constructor for creating a new Enemy object,
   * which calls the superclass constructor.
   *
   * @param position PVector
   * @param direction PVector
   * @param size float
   * @param speed float
   * @param color Color
   * @param window Window
   */

  public Enemy(PVector position,
               PVector direction,
               float size,
               float speed,
               Color color,
               Window window) {

    super(position, direction, size, speed, color, window);

  }
}
