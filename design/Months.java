package design;

public enum Months {
       January, February, March, April, May, June, July, August, September, October, November, December
}


public class CMonth {

    Months Months; //this come from enum Months

    public CMonth() {
    }

    public CMonth(CMonth CMonth) {
        this.Months = Months; //this come from enum Months
    }

    public void whichMonth(Months Months) {
        switch (Months) { //this come from enum Months
            case January:
                System.out.println("this is January month");
                break;
            case February:
                System.out.println("this is February");
                break;
            case March:
                System.out.println("this is March month");
                break;
            case April:
                System.out.println("this is April month");
                break;
            case May:
                System.out.println("this is May month");
                break;
            case June:
                System.out.println("this is June month");
                break;
            case July:
                System.out.println("this is July month");
                break;
            case August:
                System.out.println("this is August month");
                break;
            case September:
                System.out.println("this is September month");
                break;
            case October:
                System.out.println("this is Otober month");
                break;
            case November:
                System.out.println("this is November month");
                break;
            case December:
                System.out.println("this is December,MoMonth: month");
                break;

            default:
                break;

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CMonth obj = new CMonth(); //this Month Come From Month Class.

        obj.whichMonth(design.Months.August);//this Months come from enum Months.

    }
}


