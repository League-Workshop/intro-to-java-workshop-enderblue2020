PImage catPic;
int leftX = 200;
int leftY = 170;
int rightX = 258;
int rightY = 170;
void setup(){
  size (500,500);
  catPic = loadImage("cat.jpeg");
  catPic.resize(500,500);
  background(catPic);
}

void draw(){
  if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" +
"Mouse’s y-position: " + mouseY + "\n");}
fill(#FF0000);
noStroke();
ellipse(leftX,leftY,30,30);
ellipse(rightX,rightY,30,30);
}
void keyPressed(){
leftX++;
leftY++;
rightX++;
rightY++;
}
