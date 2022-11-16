// Read more at https://processing.org/reference/point_.html
// Over-ride the default canvas size of 100×100 → 400×400.
size(400, 400);

/*
 * Set the color of the point to white, then draw the point at co-ordinates
 * (120, 80). Zoom in to see it.
 */
stroke(255);
point(120, 80);

/*
 * Set the color of the point to red, increase the weight of the stroke to 20 pixels,
 * then explicitly set the cap of the stroke to round, which is the default for
 * method strokeCap(). Draw the point at co-ordinates (10, 10).
 */
stroke(#ff0000);
strokeWeight(20);
strokeCap(ROUND);
point(10, 10);

/*
 * Set the color of the point to gr{e|a}y, decrease the weight of the stroke to 10
 * pixels, then set the cap of the stroke to square. Draw the point at co-ordinates
 * (20, 20).
 *
 * Note: Points with a stroke cap of square are invisible. Thus, nothing will be seen.
 */
stroke(127);
strokeWeight(10);
strokeCap(SQUARE);
point(20, 20);

/*
 * And, finally, set the color of the point to green, increase the stroke weight to
 * 200 pixels, and make the cap of the stroke round (strokeCap(PROJECT)). Draw the
 * point in the middle of the canvas.
 */
stroke(#00ff00);
strokeWeight(200);
strokeCap(PROJECT);
point((width / 2), (height / 2));
