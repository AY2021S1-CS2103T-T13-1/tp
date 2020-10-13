package seedu.address.testutil;

import static seedu.address.testutil.TypicalIndexes.INDEX_FIFTH;
import static seedu.address.testutil.TypicalIndexes.INDEX_FOURTH;
import static seedu.address.testutil.TypicalIndexes.INDEX_SECOND;
import static seedu.address.testutil.TypicalIndexes.INDEX_THIRD;
import static seedu.address.testutil.TypicalLocations.ALICE_LOCATION;
import static seedu.address.testutil.TypicalLocations.AMY_LOCATION;
import static seedu.address.testutil.TypicalLocations.BENSON_LOCATION;
import static seedu.address.testutil.TypicalLocations.BOB_LOCATION;
import static seedu.address.testutil.TypicalLocations.CARL_LOCATION;
import static seedu.address.testutil.TypicalLocations.DANIEL_LOCATION;
import static seedu.address.testutil.TypicalLocations.ELLE_LOCATION;
import static seedu.address.testutil.TypicalLocations.FIONA_LOCATION;
import static seedu.address.testutil.TypicalLocations.GEORGE_LOCATION;
import static seedu.address.testutil.TypicalLocations.HOON_LOCATION;
import static seedu.address.testutil.TypicalLocations.IDA_LOCATION;
import static seedu.address.testutil.TypicalPersons.ALICE;
import static seedu.address.testutil.TypicalPersons.AMY;
import static seedu.address.testutil.TypicalPersons.BENSON;
import static seedu.address.testutil.TypicalPersons.BOB;
import static seedu.address.testutil.TypicalPersons.CARL;
import static seedu.address.testutil.TypicalPersons.DANIEL;
import static seedu.address.testutil.TypicalPersons.ELLE;
import static seedu.address.testutil.TypicalPersons.FIONA;
import static seedu.address.testutil.TypicalPersons.GEORGE;
import static seedu.address.testutil.TypicalPersons.HOON;
import static seedu.address.testutil.TypicalPersons.IDA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.commons.core.index.Index;
import seedu.address.model.visit.Visit;
import seedu.address.model.visit.VisitBook;

/**
 * A utility class containing a list of {@code Visit} objects to be used in tests.
 */
public class TypicalVisits {
    public static final Visit FIRST_VISIT = new VisitBuilder().withPerson(BENSON)
            .withLocation(BENSON_LOCATION).withDate("2020-09-12").build();
    public static final Visit SECOND_VISIT = new VisitBuilder().withPerson(AMY)
            .withLocation(AMY_LOCATION).withDate("2020-09-12").build();
    public static final Visit THIRD_VISIT = new VisitBuilder().withPerson(ALICE)
            .withLocation(ALICE_LOCATION).withDate("2020-09-12").build();
    public static final Visit FOURTH_VISIT = new VisitBuilder().withPerson(BOB)
            .withLocation(BOB_LOCATION).withDate("2020-09-12").build();
    public static final Visit FIFTH_VISIT = new VisitBuilder().withPerson(CARL)
            .withLocation(CARL_LOCATION).withDate("2020-09-13").build();
    public static final Visit SIXTH_VISIT = new VisitBuilder().withPerson(DANIEL)
            .withLocation(DANIEL_LOCATION).withDate("2020-09-13").build();
    public static final Visit SEVENTH_VISIT = new VisitBuilder().withPerson(ELLE)
            .withLocation(ELLE_LOCATION).withDate("2020-09-13").build();
    public static final Visit EIGHTH_VISIT = new VisitBuilder().withPerson(FIONA)
            .withLocation(FIONA_LOCATION).withDate("2020-09-13").build();
    public static final Visit NINTH_VISIT = new VisitBuilder().withPerson(GEORGE)
            .withLocation(GEORGE_LOCATION).withDate("2020-09-14").build();
    public static final Visit TENTH_VISIT = new VisitBuilder().withPerson(HOON)
            .withLocation(HOON_LOCATION).withDate("2020-09-14").build();
    public static final Visit ELEVENTH_VISIT = new VisitBuilder().withPerson(IDA)
            .withLocation(IDA_LOCATION).withDate("2020-09-14").build();

    private TypicalVisits() {} // prevents instantiation

    /**
     * Returns a {@code VisitBook} with all the typical visits.
     */
    public static VisitBook getTypicalVisitBook() {
        VisitBook vb = new VisitBook();
        for (Visit visit : getTypicalVisits()) {
            vb.addVisit(visit);
        }
        return vb;
    }

    /**
     * Returns a {@code VisitBook} with all the all visits.
     */
    public static VisitBook getWholeVisitBook() {
        VisitBook vb = new VisitBook();
        for (Visit visit : getAllVisits()) {
            vb.addVisit(visit);
        }
        return vb;
    }

    /**
     * Returns a {@code VisitBook} with less than 60% visits are infected visits.
     */
    public static VisitBook getLessThanSixtyPercentVisitBook() {
        VisitBook vb = new VisitBook();
        for (Visit visit : getLessThanSixtyPercentInfectedVisits()) {
            vb.addVisit(visit);
        }
        return vb;
    }

    /**
     * Returns a {@code VisitBook} with more than 60% visits are infected visits.
     */
    public static VisitBook getMoreThanSixtyPercentVisitBook() {
        VisitBook vb = new VisitBook();
        for (Visit visit : getMoreThanSixtyPercentInfectedVisits()) {
            vb.addVisit(visit);
        }
        return vb;
    }

    public static List<Visit> getTypicalVisits() {
        return new ArrayList<>(Arrays.asList(FIRST_VISIT, SECOND_VISIT, THIRD_VISIT, FOURTH_VISIT,
                FIFTH_VISIT, SIXTH_VISIT, SEVENTH_VISIT, EIGHTH_VISIT));
    }

    public static List<Visit> getAllVisits() {
        return new ArrayList<>(Arrays.asList(FIRST_VISIT, SECOND_VISIT, THIRD_VISIT, FOURTH_VISIT,
                FIFTH_VISIT, SIXTH_VISIT, SEVENTH_VISIT, EIGHTH_VISIT, NINTH_VISIT, TENTH_VISIT,
                ELEVENTH_VISIT));
    }

    /**
     * Returns a list of {@code Visit} with 4 visits to location with id 2, 3 visits to location with id 3,
     * 2 visits to location with id 5 and 1 visit to location with id 4.
     */
    public static List<Visit> getVisitsForTest() {
        return new ArrayList<>(Arrays.asList(FIRST_VISIT, SECOND_VISIT, FOURTH_VISIT, FIFTH_VISIT,
                SIXTH_VISIT, SEVENTH_VISIT, NINTH_VISIT, TENTH_VISIT, ELEVENTH_VISIT, EIGHTH_VISIT));
    }

    /**
     * Returns a list of unique {@code LocationId} in the list of {@code Visit} provided
     * by {@code getVisitsForTest}
     */
    public static List<Index> getLocationsIdsFromVisitsForTest() {
        return new ArrayList<>(Arrays.asList(INDEX_SECOND, INDEX_THIRD, INDEX_FIFTH, INDEX_FOURTH));
    }

    /**
     * Returns a list of {@code Visit} where less than 60% of the Visits in this list consist of Person
     * that is infected
     */
    public static List<Visit> getLessThanSixtyPercentInfectedVisits() {
        // FIRST_VISIT ,SECOND_VISIT and THIRD_VISIT are non-infected Visits. The remaining Visits are
        // infected Visits.
        return new ArrayList<>(Arrays.asList(FIRST_VISIT, SECOND_VISIT, THIRD_VISIT, NINTH_VISIT,
                TENTH_VISIT, FIFTH_VISIT, FOURTH_VISIT));
    }

    /**
     * Returns a list of {@code Visit} where more than 60% of the Visits in this list consist of Person
     * that is infected
     */
    public static List<Visit> getMoreThanSixtyPercentInfectedVisits() {
        // FIRST_VISIT and SECOND_VISIT are non-infected Visits. The remaining Visits are infected Visits.
        return new ArrayList<>(Arrays.asList(FIRST_VISIT, SECOND_VISIT, SIXTH_VISIT, NINTH_VISIT,
                TENTH_VISIT, ELEVENTH_VISIT, THIRD_VISIT, EIGHTH_VISIT));
    }
}
