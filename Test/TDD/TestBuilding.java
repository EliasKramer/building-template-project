package TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBuilding {
    @Test
    public void testCreatingBuilding()
    {
        String resident = "hans";
        Building b = new Building(0,resident);

        String[] residents = {"hans","peter","paul"};
        Building b = new Building(1,residents);
    }
}
