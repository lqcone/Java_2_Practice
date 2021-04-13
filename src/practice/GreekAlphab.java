package practice;

public class GreekAlphab {
    public static void main(String args[]){
        int startPostion=0,endPostion=0;
        char cStart='α',cEnd='ω';
        startPostion=(int) cStart;//将cStart做int型转换，并将结果赋值给startPostion
        endPostion=(int)cEnd;//将cend做int型转换，并将结果赋值给endPostion
        System.out.println("xilazimu \'α\'在unicode表中的顺序位置："+startPostion);
        System.out.println("希腊字母表：");
        for(int i=startPostion;i<=endPostion;i++){
            char c='\0';
            c=(char)i;//i做char类型转换，并将结果赋值给c
            System.out.print(" "+c);
            if((i-startPostion+1)%10==0){
                System.out.println("");
            }
        }
    }
}
