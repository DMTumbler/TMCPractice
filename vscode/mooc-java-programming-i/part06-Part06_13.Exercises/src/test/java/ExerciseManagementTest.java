import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseInList() {
        management.add("Test");
        assertTrue(management.exerciseList().contains("Test"));
    }

}
