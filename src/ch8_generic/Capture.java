package ch8_generic;

import java.util.*;

public class Capture
{

    static <T> Set<T> listToSet( List<T> list ) {
        Set<T> set = new HashSet<T>();
        set.addAll( list );
        System.out.println(list);
        return set;
    }

    public static void main( String [] args )
    {
        List<?> list = new ArrayList<Date>();
        Set<?> set = listToSet( list );
    }
}
