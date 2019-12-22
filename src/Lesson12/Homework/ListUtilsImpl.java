package Lesson12.Homework;

import java.util.ArrayList;
import java.util.List;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList list  = new ArrayList<>(strings);
        return null;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        return null;
    }
}
