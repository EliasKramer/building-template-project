package TDD;

import java.util.ArrayList;
import java.util.Arrays;

public class Building {
    private int _id;
    private ArrayList<String> _residents;
    public Building (int id, String initialResident)
    {
        _residents = new ArrayList<>();
        _residents.add(initialResident);
        _id = id;
    }
    public Building (int id, String[] residents)
    {
        _residents = new ArrayList<>();
        _residents.addAll(Arrays.asList(residents));
        _id = id;
    }

    public String getLastResident()
    {
        return _residents.get(_residents.size()-1);
    }
    public void AddResident(String s)
    {
        if(!_residents.contains(s))
        {
            _residents.add(s);
        }
    }
    public int numberOfResidents()
    {
        return _residents.size();
    }
    public void RemResident(String s)
    {
        if(_residents.contains(s))
        {
            _residents.remove(s);
        }
    }
    public int getId()
    {
        return _id;
    }
}
