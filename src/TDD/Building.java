package TDD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Building {
    ArrayList<String> _residents;
    public Building (int id, String initialResident)
    {
        _residents = new ArrayList<>();
        _residents.add(initialResident);

    }
    public Building (int id, String[] residents)
    {
        _residents = new ArrayList<>();
        _residents.addAll(Arrays.asList(residents));
    }

    public String getLastResident()
    {
        return _residents.get(_residents.size()-1);
    }
    public void AddResident(String s)
    {
        _residents.add(s);
    }
}
