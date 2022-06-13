package com.kodilla.extra.creditcard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTestSuite {


    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        CreditCard creditCard = new CreditCard();

        assertEquals("5###########0694", creditCard.maskify("5512103073210694"));
    }

    @Test
    public void shouldMaskDigitsForDifferentLengths() {
        CreditCard creditCard = new CreditCard();

        assertEquals("6######5616", creditCard.maskify("64607935616"));
    }


    @Test
    public void shouldMaskDigitsForCreditCardsWithDashes() {
        CreditCard creditCard = new CreditCard();

        assertEquals("4###-####-####-5616", creditCard.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldNotMaskString() {
        CreditCard creditCard = new CreditCard();

        assertEquals("Skippy", creditCard.maskify("Skippy"));
    }

    @Test
    public void shouldHandleEmptyString() {
        CreditCard creditCard = new CreditCard();

        assertEquals("", creditCard.maskify(""));
        assertEquals("", creditCard.maskify(null));
    }

    @Test
    public void shouldNotMaskIfShorterThanDesiredLength() {
        CreditCard creditCard = new CreditCard();

        assertEquals("12345asdf", creditCard.maskify("12345asdf"));
        assertEquals("12345", creditCard.maskify("12345"));
        assertEquals("123", creditCard.maskify("123"));
    }

}
