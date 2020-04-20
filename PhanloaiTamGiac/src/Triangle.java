public class Triangle {
    public static String triangleClassifier(double side1,double side2,double side3) {
        if (side1+side2>side3 && side2+side3>side1 && side1+side3>side2 && side1>0 && side2>0 && side3>0) {
            if (side1==side2 && side2==side3) {
                return "Tam giác đều";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        } else {
            return "Không phải là tam giác";
        }
    }
}
