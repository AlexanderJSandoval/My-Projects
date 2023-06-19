package CS120.ASandoval;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MainPain {

	// This section will Serve to initialize all the various things I'll need in
	// this class
	protected BorderPane root;
	protected FlowPane phlo;
	private Label textFont; // This will be the label for the drop-down menu for choosing Font
	private ComboBox<String> boxFont; // This will be the drop-down menu for choosing Font
	private Label textWeight; // This will be the label for the drop-down menu for choosing Weight
	private ComboBox<String> boxWeight; // This will be the drop-down menu for choosing Weight
	private Label textSize; // This will be the label for the drop-down menu for choosing Size
	private ComboBox<Integer> boxSize; // This will be the drop-down menu for choosing Size
	private Label textInput;
	private TextField boxInput;
	//This section of variables is for selecting the shape
	private Label shapeSel;
	private RadioButton shapeThree;
	private RadioButton shapeTwo;
	private RadioButton shapeOne;
	private ToggleGroup shapeSelector;
	//These are the colors and labels
	private Label color;
	private Label labRed;
	private Slider red;
	private Label labGreen;
	private Slider green;
	private Label labBlue;
	private Slider blue;
	//This is my StackPane for rendering the new drawing
	private StackPane rendering;
	//These are the two buttons in the bottom right
	private Button renderBTN; 
	private Button quitBTN;

	/*
	 * This will serve as the constructor for the mainPain Class
	 */
	public MainPain() {
		root = new BorderPane();
		// These serve to show what text will be shown in the various labels
		var font = new Label("Font Choices"); // This designates the text for the label for font
		var weight = new Label("Weight Choices"); // This designates the text for the label for weight
		var size = new Label("Size CHoices"); // This designates the text for the label for size

//		 ComboBox<String> fontBox = new ComboBox<>();
//		 fontBox.getItems().addAll(Font.getFontNames());

		topBar();
		leftBar();
		rightBar();
		bottomBar();
	}

	// This renders the top of the pane
	public void topBar() {
		// This get the Font for the words
		textFont = new Label("Font");
		boxFont = new ComboBox<String>();
		boxFont.getItems().addAll(Font.getFontNames());

		boxFont.toString();
		// This gets the weight of the words
		textWeight = new Label("weight");
		boxWeight = new ComboBox<String>();

		boxWeight.getItems().add(FontWeight.LIGHT.toString());
		boxWeight.getItems().add(FontWeight.NORMAL.toString());
		boxWeight.getItems().add(FontWeight.BOLD.toString());
		boxWeight.getItems().add(FontWeight.EXTRA_BOLD.toString());
		// This gets the text size
		textSize = new Label("Size");
		boxSize = new ComboBox<Integer>();
		boxSize.getItems().addAll(8, 12, 16, 24);

		phlo = new FlowPane();
		phlo.setHgap(5);
		phlo.getChildren().addAll(textFont, boxFont, textWeight, boxWeight, textSize, boxSize);
		// This sends the final product to be rendered
		root.setTop(phlo);
	}

	// THis renders the left side of the pane
	public void leftBar() {
		// THis takes text inputs
		textInput = new Label("Text:");
		boxInput = new TextField();
		HBox texty = new HBox(textInput, boxInput);
		texty.setPadding(new Insets(15));
		// This takes shape inputs
		shapeSel = new Label("Shape");
		shapeThree = new RadioButton("Rectangle");
		shapeTwo = new RadioButton("Ellipses");
		shapeOne = new RadioButton("Star");
		VBox shapy = new VBox(shapeThree, shapeTwo, shapeOne);

		HBox shapest = new HBox(shapeSel, shapy);
		shapest.setPadding(new Insets(15));

		shapeSelector = new ToggleGroup();

		shapeThree.setToggleGroup(shapeSelector);
		shapeTwo.setToggleGroup(shapeSelector);
		shapeOne.setToggleGroup(shapeSelector);
		// This takes color inputs
		color = new Label("Color:");

		labRed = new Label("Red");
		red = new Slider();
		red.setMin(0);
		red.setMax(255);
		labGreen = new Label("Green");
		green = new Slider();
		green.setMin(0);
		green.setMax(255);
		labBlue = new Label("Blue");
		blue = new Slider();
		blue.setMin(0);
		blue.setMax(255);
		VBox slidyLab = new VBox(labRed, labGreen, labBlue);
		VBox slidy = new VBox(red, blue, green);

		HBox totColor = new HBox(color, slidy, slidyLab);
		totColor.setPadding(new Insets(15));

		VBox aLL = new VBox(texty, shapest, totColor);
		aLL.setPadding(new Insets(15));
		// This sends it all to be rendered
		root.setLeft(aLL);

	}

	// This controls the right side of the screen
	public void rightBar() {

		rendering = new StackPane(); // This sets up the stackPane to draw on

		// These rectangles setup the drawing area
		Rectangle rectBack = new Rectangle(400, 400, 415, 315); // This creates a black border
		Rectangle rect = new Rectangle(250, 350, 400, 300); // This creates the main rectangle
		rect.setFill(Color.WHITE); // sets colors to white

		rendering.getChildren().add(rectBack); // This renders the Background rectangle
		rendering.getChildren().add(rect); // This renders the main rectangle

		// These if statements will create the shape based on the selected criteria
		if (shapeSelector.getSelectedToggle() == shapeThree) { // Checks which shape is selected
			Rectangle shape3 = new Rectangle(415, 415, 200, 200); // Draws selected shape
			shape3.setFill(Color.rgb((int) red.getValue(), (int) green.getValue(), (int) blue.getValue())); // Plugs in
																											// color
																											// variables
			rendering.getChildren().add(shape3); // This sends the final product to be rendered

			// This creates the text in the middle, but seems to not be working quite right
			Text text3 = new Text();
			text3.setFont(Font.font(boxFont.getValue(), boxSize.getValue()));
			text3.setText(boxInput.getText());
			text3.setX(shape3.getLayoutX());
			text3.setY(shape3.getLayoutY());
			rendering.getChildren().add(text3);

		}
		// These if statements will create the shape based on the selected criteria
		if (shapeSelector.getSelectedToggle() == shapeTwo) { // Checks which shape is selected
			Ellipse shape2 = new Ellipse(415, 415, 75, 50);
			shape2.setFill(Color.rgb((int) red.getValue(), (int) green.getValue(), (int) blue.getValue())); // Plugs in
																											// color
																											// variables
			rendering.getChildren().add(shape2); // This sends the final product to be rendered

			// This creates the text in the middle, but seems to not be working quite right
			Text text3 = new Text();
			text3.setFont(Font.font(boxFont.getValue(), boxSize.getValue()));
			text3.setText(boxInput.getText());
			text3.setX(shape2.getCenterX());
			text3.setY(shape2.getCenterY());
			rendering.getChildren().add(text3);
		}
		// These if statements will create the shape based on the selected criteria
		if (shapeSelector.getSelectedToggle() == shapeOne) { // Checks which shape is selected
			Rectangle star = new Rectangle(415, 415, 250, 250);
			star.setFill(Color.rgb((int) red.getValue(), (int) green.getValue(), (int) blue.getValue())); // Plugs in
																											// color
																											// variables
			rendering.getChildren().add(star); // This sends the final product to be rendered

			// This creates the text in the middle, but seems to not be working quite right
			Text text3 = new Text();
			text3.setFont(Font.font(boxFont.getValue(), boxSize.getValue()));
			text3.setText(boxInput.getText());
			text3.setX(star.getLayoutX());
			text3.setY(star.getLayoutY());
			rendering.getChildren().add(text3);
		}

		root.setCenter(rendering);
	}

	// This Will control things at the very bottom of the box
	public void bottomBar() {

		renderBTN = new Button("Render"); // This button will render the new drawing
		quitBTN = new Button("Exit"); // This Button will exit the program


		// This event will activate when the button is pushed
		renderBTN.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				rightBar(); // This will rerun the code that is in the rightBar()
				System.out.println("Square refreshed"); // This is for console purposes
			}
		});
		;
		quitBTN.setOnAction(new EventHandler<ActionEvent>() { // This code will run when the quit button is pushed
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Box Closed"); // This is for console purposes
				java.lang.System.exit(1); // I used this code to close the window for the program
			}
		});
		;

		HBox boxest = new HBox(renderBTN, quitBTN); // This will setup the buttons next to each other
		boxest.setLayoutX(800); // This sets where the box will be
		boxest.setAlignment(Pos.CENTER_RIGHT);
		// boxest.setLayoutY();
		root.setBottom(boxest); // This adds the buttons to the pane
	}

}
