package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewController {
	@FXML
	private Button buttonSquirtle, buttonBulbasaur, buttonCharmander;
	@FXML
	private Button evolveSquirtle, evolveBulbasaur, evolveCharmander;
	@FXML
	private ImageView imageSquirtle, imageBulbasaur, imageCharmander;	
	
	public void onEvolveCharmander() {
		
		
		if (buttonCharmander.getText() == "Charmeleon") {
			Image image1 = new Image("C:\\Users\\joao.reis\\Desktop\\Fotos\\Charizard.gif");
			imageCharmander.setImage(image1);
			buttonCharmander.setText("Charizard");
			evolveCharmander.setVisible(false);
			imageCharmander.setFitWidth(198);
			imageCharmander.setFitHeight(202);
			imageCharmander.setLayoutX(533);
			imageCharmander.setLayoutY(213);
		} else if (buttonCharmander.getText() != "Charizard") {
			buttonCharmander.setText("Charmeleon");
			Image image = new Image("C:\\Users\\joao.reis\\Desktop\\Fotos\\Charmeleon.gif");
			imageCharmander.setImage(image);
		}
	}
	
	public void onEvolveSquirtle() {

		if (buttonSquirtle.getText() == "Wartortle") {
			Image image1 = new Image("C:\\Users\\joao.reis\\Desktop\\Fotos\\Blastoice.gif");
			imageSquirtle.setImage(image1);
			buttonSquirtle.setText("Blastoise");
			evolveSquirtle.setVisible(false);
		} else if (buttonSquirtle.getText() != "Blastoise") {
			buttonSquirtle.setText("Wartortle");
			Image image = new Image("C:\\Users\\joao.reis\\Desktop\\Fotos\\Wartortle.gif");
			imageSquirtle.setImage(image);
		}
	}

	public void onEvolveBulbasaur() {

		if (buttonBulbasaur.getText() == "Ivysaur") {
			Image image1 = new Image("C:\\Users\\joao.reis\\Desktop\\Fotos\\Venosaur.gif");
			imageBulbasaur.setImage(image1);
			imageBulbasaur.setFitWidth(178);
			imageBulbasaur.setFitHeight(140);
			imageBulbasaur.setLayoutX(284);
			imageBulbasaur.setLayoutY(273);
			buttonBulbasaur.setText("Venosaur");
			evolveBulbasaur.setVisible(false);
		} else if (buttonBulbasaur.getText() != "Venosaur") {
			buttonBulbasaur.setText("Ivysaur");
			Image image = new Image("C:\\Users\\joao.reis\\Desktop\\Fotos\\Ivysaur.gif");
			imageBulbasaur.setImage(image);
			imageBulbasaur.setFitWidth(187);
			imageBulbasaur.setFitHeight(149);
			imageBulbasaur.setLayoutX(277);
			imageBulbasaur.setLayoutY(264);
		}
	}

	public void onSquirtleAction() {
		try {
			Alerts.showAlert("Pokemon", "Squirtle - Water type",
					"It evolves into Warturtle starting at level 16, which evolves into Blastoise starting at level 32.",
					AlertType.CONFIRMATION);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void onBulbasaurAction() {
		Alerts.showAlert("Pokemon", "Bulbasaur - Grass/Poison type",
				"It evolves into Ivysaur starting at level 16, which evolves into Venusaur starting at level 32.",
				AlertType.CONFIRMATION);
	}

	public void onCharmanderAction() {
		Alerts.showAlert("Pokemon", "Charmander - Fire type",
				"It evolves into Charmeleon starting at level 16, which evolves into Charizard starting at level 36.",
				AlertType.CONFIRMATION);
	}
}
