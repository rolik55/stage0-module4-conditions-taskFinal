package school.mjc.stage0.conditions.finalTask;


import org.junit.jupiter.api.Test;
import school.mjc.stage0.base.BaseIOTest;

class TriangleSidesValidatorTest extends BaseIOTest {

    @Test
    void validate3PointsBuildUpValidTriangle() {
        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();

        triangleSidesValidator.validate(1, 4, 4);

        assertOutEquals("this is a valid triangle\n");
    }

    @Test
    void validate3PointsBuildUpInvalidTriangleZeroLength() {
        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();

        triangleSidesValidator.validate(1, 0, 4);

        assertOutEquals("it's not a triangle\n");
    }

    @Test
    void validate3PointsBuildUpInvalidTriangleNegativeLength() {
        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();

        triangleSidesValidator.validate(1, -1, 4);

        assertOutEquals("it's not a triangle\n");
    }

    @Test
    void validate3PointsBuildUpInvalidTriangleTooLongSide() {
        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();

        triangleSidesValidator.validate(1, 7, 4);

        assertOutEquals("it's not a triangle\n");
    }
}
