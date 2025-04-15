package oops;

class Demo{
    private int hour;
    private int min;
    private double sec;

    public Demo(){
        this.hour=0;
        this.min=0;
        this.sec=0;
    }

    public Demo(int hour, int min, double sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }

    //for Hour
    public double getHour(){
        return hour;
    }
    public void setHour(int hour){
        this.hour=hour;
    } 
    //for Minute
    public double getMin(){
        return min;
    }
    public void setMin(int min){
        this.min=min;
    } 
    //for Second
    public double getSec(){
        return sec;
    }
    public void setSec(double sec){
        this.sec=sec;
    } 

    public String toString(){
        return String.format("%2d:%2d:%4.1f", this.hour, this.min, this.sec);
    }
}


class GetterAndSetter{
    public static void main(String[] args) {
        Demo d1 = new Demo(11,16,56.4);
        System.out.println(d1);
    }
}