
public class zadanie2324 {
    public static void main(String[] args) {
        //some of Insects class objects
        Insects insect1 = new Insects("Bee", 6, true, "Makes Honey", true, true);
        Insects insect2 = new Insects("Spider", 8, false, "Makes Nets", false, true);
        Insects insect3 = new Insects("Butterfly", 6, true, "Is Beautiful", false, false);
        Insects insect4 = new Insects("Ant", 6, false, "Is Incredible Strength", true, false);
        Insects insect5 = new Insects("Mosquito", 6, true, "Drinks Blood", false, true);

        //presentation of objects
        System.out.println(insect1.name + " " + insect1.abilities + "\n" +
        insect2.name + " " + insect2.abilities +"\n" +
        insect3.name + " " + insect3.abilities + "\n" +
        insect4.name + " " + insect4.abilities +"\n" +
        insect5.name + " " + insect5.abilities +"\n");
    }
}
