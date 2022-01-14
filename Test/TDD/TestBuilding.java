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
        Building b1 = new Building(1,residents);
    }
    @Test
    public void testGetResident()
    {
        String resident = "hans";
        Building b = new Building(0,resident);

        Assertions.assertEquals(resident,b.getResidents());
    }
}
