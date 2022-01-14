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

        Assertions.assertEquals(resident,b.getFirstResident());
    }
    @Test
    public void testGetAnotherResident()
    {
        String resident2 = "Peter";
        Building b = new Building(0,resident2);

        Assertions.assertEquals(resident2,b.getFirstResident());
    }

    @Test
    public void testGetMultibleResidents()
    {
        String resident = "hans";
        String resident2 = "hans2";
        String[] residents = {resident,resident2};
        Building b = new Building(0,residents);

        Assertions.assertEquals(resident,b.getFirstResident());
    }
}
