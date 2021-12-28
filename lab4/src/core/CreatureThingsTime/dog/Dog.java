package core.CreatureThingsTime.dog;

import core.CreatureThingsTime.Creature;

public abstract class Dog extends Creature {
    @Override
    public CreatureType getCreatureType() {
        return CreatureType.Dog;
    }
}
