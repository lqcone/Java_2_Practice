public class Effectiveness {

    public static void main(String [] args){
        long startTime=System.currentTimeMillis();   //获取开始时间
        long currentTime=0;

        long i;
        long j=9;
        for(i=10;i>0;i--){
            j=i;
             currentTime=System.currentTimeMillis();
        }
        System.out.println("value "+j);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");


    }

}
