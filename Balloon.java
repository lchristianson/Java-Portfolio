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

public class Balloon {


//Class Variables
private Ellipse ellipse1, ellipse2;
private int xposition, yposition, points;
private boolean visible;

//Gets
public int getPoints () {return points;}
public int getX () {return xposition;}
public int getY () {return yposition;}
public Ellipse getEllipse1 () {return ellipse1;}
public Ellipse getEllipse2 () {return ellipse2;}
public boolean getVisible () {return visible;}

//Sets
public void setPoints (int p) {points = p;}
public void setX (int x) {xposition = x;}
public void setY (int y ) {yposition = y;}
public void setVisible (boolean v) {visible = v;}



//Ballon Constructor/////////////////////////////////////////////////////////
public Balloon (int x, int y) {

	visible = true;

	points = 0;

	//Balloon Body

	ellipse1 = new Ellipse();
	ellipse1.setCenterX(x);
	ellipse1.setCenterY(y);
	ellipse1.setRadiusX(50);
	ellipse1.setRadiusY(55);
	ellipse1.setFill(Color.CYAN);



	//Balloon Lip

	ellipse2 = new Ellipse();
	ellipse2.setCenterX(x);
	ellipse2.setCenterY(y+23);
	ellipse2.setRadiusX(10);
	ellipse2.setRadiusY(3);
	ellipse2.setFill(Color.CYAN);

	//Balloon String

	//

}
//End of Balloon Constructor//////////////////////////////////////////



// Draw Balloon Method

public void drawBalloon (Ellipse a, Ellipse b, Group gr) {
	Group g = gr;
	g.getChildren().add(a);
	g.getChildren().add(b);
	visible = true;
}


//Erase Balloon Method

public void eraseBalloon (Ellipse a, Ellipse b, Group gr) {
	Group g = gr;
	g.getChildren().remove(a);
	g.getChildren().remove(b);
	visible = false;
}
}