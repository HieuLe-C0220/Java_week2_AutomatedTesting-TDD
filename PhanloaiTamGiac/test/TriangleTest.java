import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangleClassifier1() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;
        String result = Triangle.triangleClassifier(side1,side2,side3);
        String expected = "Tam giác đều";
        assertEquals(expected,result);
    }
    @Test
    void triangleClassifier2() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;
        String result = Triangle.triangleClassifier(side1,side2,side3);
        String expected = "Tam giác cân";
        assertEquals(expected,result);
    }
    @Test
    void triangleClassifier3() {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        String result = Triangle.triangleClassifier(side1,side2,side3);
        String expected = "Tam giác thường";
        assertEquals(expected,result);
    }
    @Test
    void triangleClassifier4() {
        double side1 = 8;
        double side2 = 2;
        double side3 = 3;
        String result = Triangle.triangleClassifier(side1,side2,side3);
        String expected = "Không phải là tam giác";
        assertEquals(expected,result);
    }
    @Test
    void triangleClassifier5() {
        double side1 = -1;
        double side2 = 2;
        double side3 = 1;
        String result = Triangle.triangleClassifier(side1,side2,side3);
        String expected = "Không phải là tam giác";
        assertEquals(expected,result);
    }
    @Test
    void triangleClassifier6() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;
        String result = Triangle.triangleClassifier(side1,side2,side3);
        String expected = "Không phải là tam giác";
        assertEquals(expected,result);
    }
}