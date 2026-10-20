package level2;

public class IncomeBasedTax {
    public static void main(String[] args){

    }

    public static void calculateTax(int income){
        if (income <= 0){
            System.out.println("Mức thu nhập không hợp lệ");
        } else if ( (income > 0) && (income <= 5_000_000) ) {
            System.out.println("Mức thuế thu nhập bạn phải đóng là 5%, bạn phải đóng: "+ (income *0.05));
        } else if ( (income > 5_000_000) && (income <= 10_000_000) ) {
            System.out.println("Mức thuế thu nhập bạn phải đóng là 10%, bạn phải đóng: "+ (income *0.1));
        } else if ( (income > 10_000_000) && (income <= 18_000_000) ) {
            System.out.println("Mức thuế thu nhập bạn phải đóng là 15%, bạn phải đóng: "+ (income *0.15));
        } else if ( (income > 18_000_000) && (income <= 32_000_000) ) {
            System.out.println("Mức thuế thu nhập bạn phải đóng là 20%, bạn phải đóng: "+ (income *0.2));
        } else if ( (income > 32_000_000) && (income <= 52_000_000) ) {
            System.out.println("Mức thuế thu nhập bạn phải đóng là 25%, bạn phải đóng: "+ (income *0.25));
        } else if ( (income > 52_000_000) && (income <= 80_000_000) ) {
            System.out.println("Mức thuế thu nhập bạn phải đóng là 30%, bạn phải đóng: "+ (income *0.3));
        }
        else {
            System.out.println("Mức thuế thu nhập bạn phải đóng là 35%, bạn phải đóng: "+ (income *0.35));
//            System.out.println("")
        }

    }
}
