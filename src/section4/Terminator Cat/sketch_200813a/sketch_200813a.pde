PImage catPic;
int speed = 5; 
int leftX = 200;
int Y = 170;
int rightX = 258;

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
ellipse(leftX,Y,30,30);
ellipse(rightX,Y,30,30);
}
void keyPressed(){
leftX+=2*speed;
Y+=2*speed;
rightX+=2*speed;
if (rightX > width){
rightX = 258;
Y = 170;
leftX = 200;
background(catPic);
}

}
