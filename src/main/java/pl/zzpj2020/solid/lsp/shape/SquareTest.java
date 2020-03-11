package pl.zzpj2020.solid.lsp.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void performCalculations() {
        Square s = new Square(5.0);
        assertEquals(25.0, s.getArea());
        assertEquals(20.0, s.getPerimeter());
    }
}