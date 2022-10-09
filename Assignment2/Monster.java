package AdvancedSW.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Entity{
    Monster() {
        Attribute= new ArrayList<monsterAttribute>();
    }
    private List<monsterAttribute> Attribute;
    public List<monsterAttribute> getAttributes() {
        return this.Attribute;
    }

    public void Render() {
        if(Attribute.size() > 0) {
            for (monsterAttribute extra : Attribute) {
                extra.Render();
            }
        }
        else {
            super.Render();
        }
    }

    public void Move() {
        if(Attribute.size() > 0) {
            for (monsterAttribute extra : Attribute) {
                extra.Move();
            }
        }
        else {
            super.Move();
        }
    }

    public void MakeNoise() {
        System.out.println(this.getClass().toString() + " is making noise");
    }

}
