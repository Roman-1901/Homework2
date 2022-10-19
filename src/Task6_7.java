public class Task6_7 {
    public static void main(String[] args) {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sumBoxers = firstBoxer + secondBoxer;
        System.out.println("Общая сумма двух боксеров равна " + sumBoxers + "кг");

        var minusBoxer = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров равна " + minusBoxer+ "кг (используя вычитание)");
        minusBoxer = secondBoxer % firstBoxer;
        System.out.println("Разница в весе боксеров равна " + minusBoxer + "кг (используя остаток от деления)");
    }
}

