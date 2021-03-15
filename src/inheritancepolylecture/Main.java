package inheritancepolylecture;

public class Main {

        public static void main(String[] args) {

            Ingredient pb = new PeanutButter();
            pb.brandName = "JIF";
            System.out.println(pb.brandName);
            pb.setBrandName("PeterPan");
            System.out.println(pb.getBrandName());
            pb.throwAway();

            Ingredient j = new Jelly();
            j.throwAway();

            Bread b = new Bread();
            b.throwAway();


            KitchenTool k = new Knife();
            k.isSharp = true;
            System.out.println(k.getSharp());
            k.numberOf = 8;
            System.out.println(k.getNumberOf());
            k.wash();

            KitchenTool p = new Plate();
            p.isSharp = false;
            System.out.println(p.getSharp());
            p.numberOf = 6;
            System.out.println(p.getNumberOf());
            p.wash();





        }

}
