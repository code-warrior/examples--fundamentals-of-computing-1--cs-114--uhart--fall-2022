// Read more at https://processing.org/reference/square_.html

void setup() {
  // Over-ride the default canvas size of 100×100 → the computer’s entire screen.
  fullScreen();
  
  // Remove the stroke around all boxes
  noStroke();
}

void draw() {
  /* Set the background to a pure gr{e|a}y */
  background(127);

  /*
   * Fill the color of the next shape, in this case a box, to white, with 50%
   * opacity.
   */
  fill(255, 255, 255, 127);

  /*
   * Draw a box whose top left corner is (0, 0) and whose width and height is equal
   * to the position of the mouse’s X position.
   */
  square(0, 0, mouseX);

  /*
   * Fill the color of the next shape, in this case a box, to white, with 50%
   * opacity.
   */
  fill(0, 0, 0, 127);

  /*
   * Draw a box whose top left corner is (0, 0) and whose width and height is equal
   * to the position of the mouse’s Y position.
   */
  square(0, 0, mouseY);
}
