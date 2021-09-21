import java.util.Arrays;
import java.util.StringJoiner;

import org.apache.commons.lang3.StringUtils;

public class Formatador {

    public String capAux(String s, Character c)
    {
        String[] div = s.split(c.toString());

        String ret;
        StringJoiner joiner = new StringJoiner(c.toString());
        Arrays.stream(div).forEach(x -> joiner.add(StringUtils.capitalize(x)));

        return joiner.toString();


    }


    public String capitalizaNomes (String s)
    {
        s = capAux(capAux(capAux(s, '\''), '-'), ' ');

        s =  StringUtils.capitalize(s);
        s = s.replace(" Da ", " da ");
        s = s.replace(" Das ", " das ");
        s = s.replace(" De ", " de ");
        s = s.replace(" Do ", " do ");
        s = s.replace(" Dos ", " dos ");

        return s;
    }
}
