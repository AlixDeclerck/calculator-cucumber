package gui;

import calculator.Calculator;
import calculator.Expression;
import calculator.Parser;
import converter.Unit;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

import static converter.Unit.*;
import static gui.navigation.ModeEnum.CONVERTER_MODE;

/**
 * This controller handle the main graphical interface's actions.
 * Read the converter panel which contains functionalities
 * Switch mode
 */
public class ConverterController extends ControllerWithMemory {

    /**
     * Index for memory usage
     */
    public HBox ConverterMode;

    /**
     * Scrollable list of units types
     */
    @FXML
    ComboBox<String> typeConv;

    /**
     * Scrollable list of units from
     */
    @FXML
    ComboBox<String> fromUnit;

    /**
     * Scrollable list of units to
     */
    @FXML
    ComboBox<String> toUnit;

    /**
     * The calculator object
     */
    Calculator calculator;
    Parser parser;

    /**
     * Initialize the controller
     */
    public void initialize() {
        List<String> categories = getUnitCategories();
        typeConv.getItems().addAll(categories);
        typeConv.setValue(categories.get(0));
        updateUnits();
        calculator = new Calculator();
        parser = new Parser(calculator);
    }

    /**
     * Convert the value from the first unit to the second unit
     */
    public void submitButton() {
        Expression input = parser.parse(this.inputField.getText());
        Unit from = getUnitByName(fromUnit.getValue());
        Unit to = getUnitByName(toUnit.getValue());
        String result;
        if (from == null || to == null) {
            throw new IllegalArgumentException("Unit not found");
        }
        try {
            result = convert(input.toString(), from, to, calculator);
            this.outputField.setText(result);
            keepComponentValue(inputField.getText(), result, CONVERTER_MODE.id());
        } catch (Exception e) {
            this.showAlertMessage(e.getMessage());
        }
        this.setSubmitted(true);
    }

    /**
     * Update the units list if change of category
     */
    public void changeType() {
        updateUnits();
    }

    /**
     * Update the units list
     */
    public void updateUnits() {
        this.inputField.setText("");
        this.outputField.setText("");
        fromUnit.getItems().clear();
        toUnit.getItems().clear();
        List<Unit> units = getUnitsByCategory(typeConv.getValue());
        List<String> unitNames = units.stream().map(Unit::getUnitName).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        fromUnit.getItems().addAll(unitNames);
        fromUnit.setValue(unitNames.get(0));
        toUnit.getItems().addAll(unitNames);
        toUnit.setValue(unitNames.get(1));
    }
}