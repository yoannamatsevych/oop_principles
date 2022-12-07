package recap.abstraction;

public class ExtendingChild extends AbstractParent implements OptionalStuff{

    public ExtendingChild(int var1, String var2, boolean var3, int var4) {
        super(var1, var2, var3, var4);
    }

    @Override
    public int getSumOfVar1AndVar4() {
        return var1 + var4;
    }

    @Override
    public String firstThreeCharOfTheVar2() {
        return var2.substring(0, 3);
    }
    @Override
    public boolean isPhoneOnOrOff(String sentence) {
        return sentence.toLowerCase().contains("on");
    }

    public static void main(String[] args) {
        ExtendingChild extendingChild = new ExtendingChild(2, "String", true, 3);

        System.out.println(extendingChild.var1);
        System.out.println(extendingChild.var4);
        System.out.println("Sum of var1 and var4 = " + extendingChild.getSumOfVar1AndVar4());
        System.out.println(extendingChild.var2);
        System.out.println(extendingChild.firstThreeCharOfTheVar2());

        System.out.println(extendingChild.isPhoneOnOrOff("Phone is on"));


    }


}
