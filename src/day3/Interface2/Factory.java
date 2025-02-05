package day3.Interface2;

public abstract class Factory {
    private int openHour;
    private int closeHour;
    private String name;

    public Factory(int openHour, int closeHour, String name) {
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.name = name;
    }

    public Factory() {

    }

    public int getOpenHour() {
        return openHour;
    }

    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(int closeHour) {
        this.closeHour = closeHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactoryName() {
        return name;
    }

    public int getWorkingTime(){
        int workingTime = closeHour - openHour;
        return workingTime;
    }

    abstract int makeProducts(char skill);
}
