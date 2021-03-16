package inheritancepolylecture;

public class KitchenMain {

        public static void main(String[] args) {

            Ingredient pb = new PeanutButter("JIF", "Crunchy");
//            pb.brandName = "JIF";
//            System.out.println(pb.brandName);
            pb.setBrandName("PeterPan");
            System.out.println(pb.getBrandName());
//            System.out.println(pb.getTexture()); // Cast like below if setting obj instance to "ingredient", otherwise set obj instance to specific subclass
            pb.throwAway();

            Jelly j1 = new Jelly("Welches", false);
            Ingredient j2 = new Jelly("Smuckers", true);
            j1.calories = 80;
            j2.calories = 110;
            System.out.println(j1.getBrandName());
            System.out.println(j2.getBrandName());
            System.out.println(j1.getCalories());
            System.out.println(j2.getCalories());
            System.out.println(j1.isSugarFree() + " sugar free");
            System.out.println(((Jelly) j2).isSugarFree() + " sugar free");
            j2.throwAway();

            Bread b = new Bread("HEB");
            b.throwAway();


            KitchenTool k = new Knife();
//            k.isSharp = true;
            System.out.println(k.getSharp());
            k.numberOf = 8;
            System.out.println(k.getNumberOf());
            k.wash();

            KitchenTool p = new Plate(true);
            p.isSharp = false;
            System.out.println(p.getSharp());
            p.numberOf = 6;
            System.out.println(p.getNumberOf());
            p.wash();


            throwAwayItem(p);

        }



        public static void throwAwayItem(KitchenTool obj) {
            System.out.println(obj.getNumberOf() - 1);
        }


}
