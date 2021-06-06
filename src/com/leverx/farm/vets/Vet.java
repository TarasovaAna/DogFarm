package com.leverx.farm.vets;

import com.leverx.farm.Group;
import com.leverx.farm.classes.Dog;

public class Vet implements BasicVet{
    @Override
    public boolean checked(Group group) {
        return false;
    }
}
