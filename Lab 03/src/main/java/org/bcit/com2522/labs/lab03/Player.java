package org.bcit.com2522.labs.lab03;

import java.awt.Color;
import processing.core.PVector;
import processing.event.KeyEvent;

/**
 * A Player class to represent a player object in the game.
 */
public class Player extends Sprite {

  /**
   * Constructor for creating a new Player object,
   * which calls the superclass constructor.
   *
   * @param position PVector
   * @param direction PVector
   * @param size float
   * @param speed float
   * @param color Color
   * @param window Window
   */
  public Player(PVector position,
                PVector direction,
                float size,
                float speed,
                Color color,
                Window window) {

    super(position, direction, size, speed, color, window);
  }

  @Override
  public void keyPressed(KeyEvent event) {
    int keyCode = event.getKeyCode();
    switch (keyCode) {
      case LEFT:
        // handle left
        this.setDirection(this.getDirection().rotate(-Window.PI / 4));
        break;
      case RIGHT:
        // handle right
        this.setDirection(this.getDirection().rotate(Window.PI / 4));
        break;
      default:
    }
  }
}
