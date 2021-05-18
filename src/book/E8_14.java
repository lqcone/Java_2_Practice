package book;

public class E8_14 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("卡拉是条狗");
        System.out.println("str: "+str);
        System.out.println("length: "+str.length());
        System.out.println("capacity: "+str.capacity());
        str.setCharAt(0,'艾');
        str.setCharAt(1,'虎');
        System.out.println(str);
        str.insert(5,"漂亮的");
        System.out.println(str);
        int index=str.indexOf("是");
        str.replace(index,str.length(),"不OK");
        System.out.println(str);

    }
}
