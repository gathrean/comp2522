package org.bcit.com2522.labs.lab03;

import java.awt.Color;
import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PVector;
import processing.event.KeyEvent;

/**
 * Lab-02 starter code.
 * Runs the applet for the Lab-02 bouncing
 * balls starter code.
 * Based on code from Keith Peters demonstrating
 * multiple-object collision.
 *
 * @author paul_bucci
 *
 */
public class Window extends PApplet {
  ArrayList<Sprite> sprites;
  ArrayList<Sprite> enemies;
  Wall wall;
  Sprite player;
  int numEnemies = 10;
  int minSize = 10;
  int maxSize = 20;

  /**
   * Called once at the beginning of the program.
   */
  public void settings() {
    size(640, 360);
  }


  /**
   * Called once at the beginning of the program.
   * Initializes all objects.
   */
  public void setup() {
    this.init();
  }

  /**
   * Method to initialize the game by creating new instances of
   * Sprite for Enemies, Player, and a new Wall object.
   *
   */
  public void init() {
    enemies = new ArrayList<Sprite>();
    sprites = new ArrayList<Sprite>();
    wall = new Wall(
        new PVector(100, 100),
        null,
        35,
        2,
        new Color(0, 255, 0),
        this
    );
    player = new Player(
        new PVector(this.width / 2, this.height / 2),
        new PVector(0, 1),
        minSize + 15,
        2,
        new Color(0, 255, 0),
      this);

    for (int i = 0; i < numEnemies; i++) {
      enemies.add(new Enemy(
          new PVector(random(0, this.width), random(0, this.height)),
          new PVector(random(-1, 1), random(-1, 1)),
          random(minSize, maxSize),
          random(0, 2),
          new Color(255, 0, 0),
          this
      ));
    }
    sprites.addAll(enemies);
    sprites.add(player);
  }

  @Override
  public void keyPressed(KeyEvent event) {
    player.keyPressed(event);
  }

  /**
   * Called on every frame. Updates scene object
   * state and redraws the scene. Drawings appear
   * in order of function calls.
   */
  public void draw() {
    background(0);
    wall.draw();
    for (Sprite sprite : sprites) {
      if (Sprite.collided(sprite, wall)) {
        sprite.setDirection(sprite.getDirection().rotate((float) (Math.PI / 2)));
      }
      sprite.update();
      sprite.draw();
    }
    ArrayList<Sprite> toRemove = new ArrayList<Sprite>();
    for (Sprite enemy : enemies) {
      if (Sprite.collided(player, enemy)) {
        toRemove.add(enemy);
      }
    }
    for (Sprite enemy : toRemove) {
      if (player.compareTo(enemy) > 0) {
        sprites.remove(enemy);
        enemies.remove(enemy);
      } else {
        init();
      }
    }

  }


  /**
   * Main function.
   *
   * @param passedArgs arguments from command line
   */
  public static void main(String[] passedArgs) {
    String[] appletArgs = new String[]{"eatBubbles"};
    Window eatBubbles = new Window();
    PApplet.runSketch(appletArgs, eatBubbles);
  }
}