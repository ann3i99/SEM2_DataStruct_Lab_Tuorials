package Week1;

// TUTORIAL QUESTION 1
public class Telephone {

    private String areaCode;
    private String number;
    private static int numberOfTelephoneObject;

    Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String  getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    public String makeFullNumber(){
        return areaCode + "-" + number;
        // return areaCode.concat(number);
    }

    public static void main(String[] args) {
        Telephone t[] = new Telephone[5];

        t[0] = new Telephone("03","79676300" );
        t[1] = new Telephone("03","79676301" );
        t[2] = new Telephone("03","79676302" );
        t[3] = new Telephone("03","79676303" );
        t[4] = new Telephone("03","79676304" );

        for (int i=0; i<t.length; i++){
            System.out.println(t[i].makeFullNumber());
        }

    }

}
