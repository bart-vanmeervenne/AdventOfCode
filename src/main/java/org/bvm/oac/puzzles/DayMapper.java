package org.bvm.oac.puzzles;

import org.bvm.oac.puzzles.day2.Second;

import java.util.HashMap;
import java.util.Map;

public class DayMapper {

    public static Map<Integer, BaseDay> getBaseDays() {
        HashMap<Integer, BaseDay> result = new HashMap<>();
        //result.put(1, new First());
        result.put(2, new Second());
        return result;
    }
}
