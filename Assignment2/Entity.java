package AdvancedSW.Assignment2;

public abstract class Entity {

    public void Move(){
        System.out.println(this.getClass().toString()+ " Is Moving..");
    }

    public void Render(){
        System.out.println(this.getClass().toString()+ " Is Rendering..");
    }

}
