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

        Assertions.assertEquals(resident,b.getLastResident());
    }
    @Test
    public void testGetAnotherResident()
    {
        String resident2 = "Peter";
        Building b = new Building(0,resident2);

        Assertions.assertEquals(resident2,b.getLastResident());
    }

    @Test
    public void testGetMultibleResidents()
    {
        String resident = "hans";
        String resident2 = "hans2";
        String[] residents = {resident,resident2};
        Building b = new Building(0,residents);

        Assertions.assertEquals(resident2,b.getLastResident());
    }

    @Test
    public void testGetMultibleResidentsViaMethod()
    {
        String resident = "hans";
        Building b = new Building(0,resident);
        b.AddResident("hans2");

        Assertions.assertEquals("hans2",b.getLastResident());
    }

    @Test
    public void testIfSamePersonCanMoveInTwice()
    {
        String resident = "hans";
        Building b = new Building(0,resident);

        Assertions.assertEquals(1,b.numberOfResidents());

        b.AddResident("hans");
        Assertions.assertEquals(1,b.numberOfResidents());
    }

    @Test
    public void testRemoveingOfResident()
    {
        String resident = "hans";
        Building b = new Building(0,resident);

        Assertions.assertEquals(1,b.numberOfResidents());

        b.RemResident("hans");
        Assertions.assertEquals(0,b.numberOfResidents());
    }

    @Test
    public void testSilentFailIfMultibleTimesRemoved()
    {
        String resident = "hans";
        Building b = new Building(0,resident);

        Assertions.assertEquals(1,b.numberOfResidents());

        b.RemResident("hans");
        Assertions.assertEquals(0,b.numberOfResidents());


        b.RemResident("hans");
        Assertions.assertEquals(0,b.numberOfResidents());
    }
    @Test
    public void TestGetId()
    {
        String resident = "hans";
        Building b = new Building(0,resident);

        Assertions.assertEquals(0,b.getId());
    }

    @Test
    public void TestGetMoreId()
    {
        String resident = "hans";
        Building b = new Building(0,resident);

        Assertions.assertEquals(0,b.getId());

        String resident2 = "hans";
        Building b2 = new Building(1,resident2);

        Assertions.assertEquals(1,b2.getId());
    }
}
