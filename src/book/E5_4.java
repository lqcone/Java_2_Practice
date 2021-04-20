package book;

class University{
    void enterRule(double math,double englis,double chinese){
        double total=math+englis+chinese;
        if(total>=180)
            System.out.println(total+"分数达到大学录取线");
        else
            System.out.println(total+"分数未达到大学录取线");
    }
}

class ImportantUniversity extends University{
    void enterRule(double math,double englis,double chinese){
        double total=math+englis+chinese;
        if(total>=220)
            System.out.println(total+"分数达到重点大学录取线");
        else
            System.out.println(total+"分数未达到重点大学录取线");
    }
}

public class E5_4 {
    public static void main(String args[]){
        double math=62,enlish=76,chinese=67;
        ImportantUniversity univer=new ImportantUniversity();
        univer.enterRule(math,enlish,chinese); //调用重写的方法
        math=91;enlish=82;chinese=86;
        univer.enterRule(math,enlish,chinese);
    }
}
