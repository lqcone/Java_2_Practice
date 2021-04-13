package book;

class Battery{
    int electricityAmount;
    Battery(int amount){
        electricityAmount=amount;
    }
}

class Radio{
    void openRadio(Battery battery){
        battery.electricityAmount=battery.electricityAmount-10;
    }
}

public class E4_7 {
    public int getSum(int... x){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum=sum+x[i];
        }
        return sum;
    }
    public static void main(String args[]){
        Battery nanfu=new Battery(100);
        System.out.println("南孚电池的电量是："+nanfu.electricityAmount);
        Radio radio=new Radio();
        System.out.println("收音机开始收听");
        radio.openRadio(nanfu);
        System.out.println("目前南孚电池的电量是"+nanfu.electricityAmount);
    }
}
