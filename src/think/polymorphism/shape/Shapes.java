package think.polymorphism.shape;

public class Shapes {
    private static RandomShapeGenerator gen=new RandomShapeGenerator();
    public static void main(String args[]){
        //创建一个Shape类型的数组对象
        Shape s[]=new Shape[9];
        //用形状对象将数组填充
        for(int i=0;i<s.length;i++){
            s[i]=gen.next();
        }
        for(Shape shp:s){
            shp.draw();
        }
    }
}
