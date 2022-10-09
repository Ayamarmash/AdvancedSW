package AdvancedSW.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Entity{
    Monster() {
        attribute= new ArrayList<MonsterAttribute>();
    }
    private List<MonsterAttribute> attribute;
    public List<MonsterAttribute> getAttributes() {
        return this.attribute;
    }

    public void Render() {
        if(attribute.size() > 0) {
            for (MonsterAttribute extra : attribute) {
                extra.Render();
            }
        }
        else {
            super.Render();
        }
    }

    public void Move() {
        if(attribute.size() > 0) {
            for (MonsterAttribute extra : attribute) {
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
