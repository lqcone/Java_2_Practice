package practice;

class Village{
    static int waterAmount;
    int peopleNumber;
    String name;
    Village(String s){
        name=s;
    }
    static void setWaterAmount(int m){
        if(m>0){
            waterAmount=m;
        }
    }
    void drinkWater(int n) {
        if (waterAmount - n >= 0) {
            waterAmount = waterAmount - n;
            System.out.println(name + "喝了" + n + "升水");
        } else
            waterAmount = 0;
    }
    static int lookWater(){
        return waterAmount;
    }
    void setPeopleNumber(int n){
        peopleNumber=n;
    }
    int getPeopleNumber(){
        return peopleNumber;
    }


    }


public class Land {
    public static void main(){
        Village.setWaterAmount(200);
        int leftWater=Village.lookWater();
        System.out.println("水＃中有"+leftWater+"升水");
        Village zhaoZhuang,majiahezi;
        zhaoZhuang=new Village("赵庄");
        majiahezi=new Village("马家河子");
        zhaoZhuang.setPeopleNumber(80);
        majiahezi.setPeopleNumber(120);
        zhaoZhuang.drinkWater(50);
        //leftWater=
    }
}
