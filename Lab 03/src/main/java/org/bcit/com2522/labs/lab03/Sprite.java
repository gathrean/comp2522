package org.bcit.com2522.labs.lab03;

import java.awt.Color;
import processing.core.PApplet;
import processing.core.PVector;
import processing.event.KeyEvent;

/**
 * A Java program that serves as a base class for other classes such as
 * Player, Enemy, and Wall... which have more specific behavior.
 */
public class Sprite extends PApplet implements Comparable {
  protected PVector position;
  protected PVector direction;
  private float size;
  protected float speed;
  private Color color;
  public Window window;


  /**
   * Method to initialize the following fiels by using the parameters passed to it.
   *
   * @param position PVector
   * @param direction PVector
   * @param size float
   * @param speed speed
   * @param color Color
   * @param window Window
   */
  public Sprite(PVector position,
                PVector direction,
                float size,
                float speed,
                Color color,
                Window window) {
    this.position = position;
    this.direction = direction;
    this.size = size;
    this.speed = speed;
    this.window = window;
    this.color = color;
  }

  /**
   * Method that is used to change the direction of the sprite
   * when it hits the edge of the screen (Bounce off the wall).
   */
  public void bounce() {
    if (
        this.position.x <= 0
        || this.position.x >= window.width
        || this.position.y <= 0
        || this.position.y >= window.height) {
      this.direction.rotate(window.HALF_PI);
    }
  }

  public PVector getDirection() {
    return direction.copy();
  }

  public float getSpeed() {
    return speed;
  }

  public void setSize(float size) {
    this.size = size;
  }

  public PVector getPosition() {
    return position.copy();
  }

  public void update() {
    this.bounce();
    this.position = this.getPosition().add(this.direction.copy().mult(speed));
  }

  public float getSize() {
    return size;
  }

  /**
   * Method to check if two Sprites have collided,
   * by calculating the distance between the center of the two sprites.
   *
   * @param a Sprite
   * @param b Sprite
   * @return Boolean
   */
  public static boolean collided(Sprite a, Sprite b) {
    float distance = PVector.dist(a.getPosition(), b.getPosition());
    if (distance <= (a.getSize() + b.getSize() / 4)) {
      return true;
    }
    return false;
  }

  @Override
  public void keyPressed(KeyEvent event) {
  }

  /**
   * Method for rendering the sprite on the screen.
   */
  public void draw() {
    window.pushStyle();
    window.fill(this.color.getRed(), this.color.getGreen(), this.color.getBlue());
    window.ellipse(this.position.x, this.position.y, size, size);
    window.popStyle();
  }

  /**
   * Method for setting the direction of the Sprite.
   *
   * @param direction PVector
   */
  public void setDirection(PVector direction) {
    this.direction = direction;
  }

  /**
   * Method for determining if two Sprite objects are equal.
   *
   * @param o Object
   * @return Boolean
   */
  public boolean equals(Object o) {
    if (o instanceof Sprite) {
      return (this.size == ((Sprite) o).size);
    }
    return false;
  }

  @Override
  public int compareTo(Object o) {
    Sprite sprite = (Sprite) o;
    if (this.equals(o)) {
      return 0;
    }
    return (int) (this.size - sprite.size);
  }
}
