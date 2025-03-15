package Module23_OPPS;

public  class Student{
    public  String name;
    private int rollNo;
    double percentage;

    public int getRollNo(){ //this is getter.it is a function ,but we can also call attributes in this case.
        return rollNo;
    }

    public void setRollNo(int roll){
        rollNo=roll;
    }
}