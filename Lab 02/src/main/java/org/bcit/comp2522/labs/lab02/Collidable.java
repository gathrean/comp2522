package org.bcit.comp2522.labs.lab02;

abstract class Collidable {
  Collidable(float xpos) {
    this.xpos = xpos;
  }

  abstract void draw();

  abstract void collide();

  abstract void move();

  protected float xpos;

}
