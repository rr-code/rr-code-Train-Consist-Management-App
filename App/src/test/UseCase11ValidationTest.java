package test;

import main.UseCase11Validation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase11ValidationTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(UseCase11Validation.isValidTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(UseCase11Validation.isValidTrainID("TRAIN12"));
        assertFalse(UseCase11Validation.isValidTrainID("TRN12A"));
        assertFalse(UseCase11Validation.isValidTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(UseCase11Validation.isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(UseCase11Validation.isValidCargoCode("PET-ab"));
        assertFalse(UseCase11Validation.isValidCargoCode("PET123"));
        assertFalse(UseCase11Validation.isValidCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(UseCase11Validation.isValidTrainID("TRN-123"));
        assertFalse(UseCase11Validation.isValidTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(UseCase11Validation.isValidCargoCode("PET-Ab"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(UseCase11Validation.isValidTrainID(""));
        assertFalse(UseCase11Validation.isValidCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(UseCase11Validation.isValidTrainID("TRN-1234XYZ"));
    }
}