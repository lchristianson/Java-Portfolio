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

public class Balloons extends Application {

	private Text title, start, quit;
	private Button titlebtn, startbtn, quitbtn, resetbtn;

public static void main(String[] args) {
	launch(args);
}
public void start (Stage primaryStage) {

	//Group creation
	Group g = new Group();

	//Scene creation
	Scene scene = new Scene(g, 800, 600);

	//Stage
	primaryStage.setTitle("Bloons, or No Bloons!");
	primaryStage.setScene(scene);
	primaryStage.show();

	//
	BallonArray(g).run();

}
}


