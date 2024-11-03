package ua.ucu.edu.apps.FlowerStoreContinue.payment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentTest {

    private Payment creditCardPayment;
    private Payment payPalPayment;

    @BeforeEach
    void setUp() {
        creditCardPayment = new CreditCardPaymentStrategy();
        payPalPayment = new PayPalPaymentStrategy();
    }

    @Test
    void testCreditCardPaymentAlwaysSucceeds() {
        assertTrue(creditCardPayment.pay(100.0));
        assertTrue(creditCardPayment.pay(0.0));
    }

    @Test
    void testPayPalPaymentAlwaysFails() {
        assertTrue(payPalPayment.pay(100.0));
    }

    @Test
    void testPayPalDiscountApplied() {
        double originalPrice = 100.0;
        double expectedDiscountedPrice = originalPrice * 0.95;
        payPalPayment.pay(originalPrice);
        assertEquals(expectedDiscountedPrice, originalPrice * 0.95);
    }
}
