package think.interfaces;

interface Monster{
    void menace(); //威胁
}
interface DangerousMonster extends Monster{
    void destroy();
}
//致命
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    public void destroy(){}
    public void menace(){}
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}

class VeryBadVampire implements Vampire{
    public void drinkBlood(){}
    public void kill(){}
    public void menace(){}
    public void destroy(){}
}

public class HorrorShow {
    static void u(Monster b){b.menace();}
    static void v(DangerousMonster d){
        d.destroy();
        d.menace();
    }
    static void w(Lethal l){l.kill();}
    public static void main(String args[]){
        DragonZilla barney=new DragonZilla();
        u(barney);
        v(barney);
        //VeryBadVampire向上转型为Vampire
        Vampire vlad=new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
