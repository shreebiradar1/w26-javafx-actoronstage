package org.dnyanyog;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ActotOnStage extends Application{

	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setTitle("Actor on Stage");
		
		Text actorText = new Text();
		actorText.setText("Hello World");
		actorText.setFont(Font.font("Verdana",50));
		actorText.setFill(Color.ALICEBLUE);
		actorText.setX(50);
		actorText.setY(50);
		
		Line line = new Line();
		line.setStroke(Color.ALICEBLUE);
		line.setStrokeWidth(5);
		line.setStartX(60);
		line.setStartY(60);
		line.setEndX(370);
		line.setEndY(60);
		
		Rectangle rect = new Rectangle();
		rect.setFill(Color.ALICEBLUE);
		rect.setX(80);
		rect.setY(80);
		rect.setWidth(250);
		rect.setHeight(250);
		
		Group group = new Group();
		group.getChildren().add(actorText);
		group.getChildren().add(line);
		group.getChildren().add(rect);
		
		Scene scene = new Scene(group, Color.BLACK);
		
		stage.setScene(scene);
		
		stage.show();
	}

}
