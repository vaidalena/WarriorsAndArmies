package org.pract;

import org.pract.characters.Warrior;

public class Battle {
    public static boolean fight(Warrior warrior1, Warrior warrior2)
    {
        while(true)
        {
            if(!warrior1.isAlive())
            {
                break;
            }
            warrior1.hit(warrior2);

            if(!warrior2.isAlive())
            {
                break;
            }
            warrior2.hit(warrior1);
        }
        return warrior1.isAlive();
    }

    public static boolean fight(Army army1, Army army2)
    {
        var it1 = army1.firstAlive();
        var it2 = army2.firstAlive();
        while(it1.hasNext() && it2.hasNext())
        {
            fight(it1.next(), it2.next());
        }
        return it1.hasNext();
    }
}
