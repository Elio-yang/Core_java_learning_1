package chapter4;

/**
 * Created by Elio Yang on 2020/7/4.
 */
public class Manager extends EquEmployee {
    private double bones;
    public Manager(String n,double salary, int y,int m, int d){
        super(n,salary,y,m,d);
        bones=0;
    }
    @Override
    public double getSalary() {
        return super.getSalary()+bones;
    }
    public void setBones(double bones) {
        this.bones = bones;
    }


    public static void main(String[] args) {
        Manager boss=new Manager("Carl",23000,2001,9,21);
        boss.setBones(5000);
        EquEmployee[] staff= new EquEmployee[3];
        staff[0]=boss;
        staff[1]=new EquEmployee("Elio",3000,2020,3,23);
        staff[2]=new EquEmployee();
        for(EquEmployee e:staff){
            System.out.println(e.toString());
        }

    }
}
