package com.company.project.lesson08;

public class Train extends Vehicle{
    private int carCount = 0;

    public int getCarCount() {
        return carCount;
    }

    public boolean isClimateControl() {
        return isClimateControl;
    }

    private boolean isClimateControl = true;

    public void changeClimateControl() {
        isClimateControl = !isClimateControl;
    }

    public Train(String number, int maxSpeed, int carCount, boolean isClimateControl) {
        super(number, maxSpeed);
        this.carCount = carCount;
        this.isClimateControl = isClimateControl;
    }

    @Override
    public void repair(){
       if (carCount < 7 && carCount > 0) {
          if (levelOfWare >= 2) levelOfWare-= 2;
       } else {
          super.repair();
        }
    }

}




