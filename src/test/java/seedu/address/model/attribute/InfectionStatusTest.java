package seedu.address.model.attribute;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import seedu.address.model.attribute.InfectionStatus;

public class InfectionStatusTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new InfectionStatus(null));
    }

    @Test
    public void constructor_invalidInfectionStatus_throwsIllegalArgumentException() {
        String invalidInfectionStatus = "";
        assertThrows(IllegalArgumentException.class, () -> new InfectionStatus(invalidInfectionStatus));
    }

    @Test
    public void isValidInfectionStatus() {
        // null infection status
        assertThrows(NullPointerException.class, () -> InfectionStatus.isValidInfectionStatus(null));

        // invalid infection status
        assertFalse(InfectionStatus.isValidInfectionStatus("Nope")); // true or false only

        // valid infection statuses
        assertTrue(InfectionStatus.isValidInfectionStatus("true"));
        assertTrue(InfectionStatus.isValidInfectionStatus("FALSE")); // Upper case
        assertTrue(InfectionStatus.isValidInfectionStatus("fAlsE")); // Mixed case
    }

    @Test
    public void hashCode_success() {
        InfectionStatus infectionStatus = new InfectionStatus("true");
        assertEquals(Boolean.valueOf(true).hashCode(), infectionStatus.hashCode());
    }
}




