import java.io.*;
import java.util.*;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.input.*;
import javafx.util.*;

public class BalloonArray {


public void BalloonArray (Group gr) {
	Group g = gr;

//Creation of Balloon array

Balloon[] bloons = new Balloon[10];

//Creation of each Balloon in array

for (int i = 0; i < bloons.length; i++)
	if (i <= 4){
		int x = 200;
		int y = 150;
		bloons[i] = new Balloon (x, y);
		bloons[i].drawBalloon(bloons[i].getEllipse1(), bloons[i].getEllipse2, g);
		x += 100;
}	else {
		x = 200;
		y = 350;
		bloons[i] = new Balloon(x, y);
		bloons[i].drawBalloon(bloons[i].getEllipse1(), bloons[i].getEllipse2, g);
		x += 100;
	}
}



//Creation of points array

int[] points = new int[10];

//Sets points array values

points[0] = 1;
points[1] = 10;
points[2] = 20;
points[3] = 30;
points[4] = 40;
points[5] = 50;
points[6] = 60;
points[7] = 70;
points[8] = 80;
points[9] = 90;


//Assigns points value to each Balloon

for (int i = 0; i < bloons.length; i++) {
	int r = (int) 10*Math.random();
	if (points[r] != 0) {
		bloons[i].setPoints(points[r]);
		points[r] = 0;
	}
	else
	i--;
}



}
