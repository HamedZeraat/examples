package one;

public interface Vehicle {
    Propulsion getMechanism();
    void setMechanism(Propulsion p);
    // what Vehicles do
    Position move();
}

abstract class Car implements Vehicle {
    protected Propulsion mechanism;

    @Override
    public Position move(){
        return new PositionImpl();
    }

    @Override
    public Propulsion getMechanism() {
        return new PropulsionImpl("Default");
    }

    @Override
    public void setMechanism(Propulsion p) {
        mechanism = p;
    }
}

// Vehicle -> Car -> {Hybrid, Petrol, Diesel}

class Hybrid extends Car {

    @Override
    public Propulsion getMechanism() {
        return new PropulsionImpl("Empty");
    }

    @Override
    public void setMechanism(Propulsion p) {
        // specific to Hybrid's
    }
}

class Petrol extends Car {

}

class Diesel extends Car {


}