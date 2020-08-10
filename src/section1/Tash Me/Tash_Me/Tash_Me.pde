
PImage must_ache;
PImage thing;
void setup() {
thing = loadImage("thing.jpg");
size(800, 600);
thing.resize(width,height);
must_ache = loadImage("must_ache.png");
}

void draw() {
image(thing,0,0);
image(must_ache,150,400);
}
