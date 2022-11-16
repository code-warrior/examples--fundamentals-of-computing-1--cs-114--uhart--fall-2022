// Read more at https://processing.org/reference/l_.html

final int OFFSET = 40;

// Over-ride the default canvas size of 100×100 → 400×400.
size(400, 400);

// Set the background color to a pink/mauve
background(#ffaaff);

/*
 * Set the color of the line to white, the width of the stroke to 10 pixels, then
 * draw a line from the top left corner to the bottom right corner and another from
 * the top right corner to the bottom left. In other words, draw an “X”.
 */
stroke(255);
strokeWeight(10);
line(0, 0, width, height);
line(width, 0, 0, height);

/*
 * Now draw a blue “X” with a smaller stroke at 50% opacity, but make it smaller by
 * the OFFSET amount from all four corners.
 */
stroke(#0000ff, 127);
strokeWeight(4);
strokeCap(ROUND);
line(OFFSET, OFFSET, (width - OFFSET), (height - OFFSET));
line((width - OFFSET), OFFSET, OFFSET, (height - OFFSET));
