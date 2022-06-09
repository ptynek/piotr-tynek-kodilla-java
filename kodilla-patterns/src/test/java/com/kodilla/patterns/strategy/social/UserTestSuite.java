package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.websites.FacebookPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        User john = new YGeneration("John Wick");
        User camille = new ZGeneration("Camille Statham");
        User jessica = new Millenials("Jessica Strong");

        String johnShared = john.sharePost();
        System.out.println("John: " + johnShared);
        String camilleShared = camille.sharePost();
        System.out.println("Camille: " + camilleShared);
        String jessicaShared = jessica.sharePost();
        System.out.println("Jessica: " + jessicaShared);

        assertEquals("Shared on Snapchat", johnShared);
        assertEquals("Shared on Twitter", camilleShared);
        assertEquals("Shared on Facebook", jessicaShared);
    }

    @Test
    void testIndividualSharingStrategy(){
        User john = new YGeneration("John Wick");

        String johnShared = john.sharePost();
        System.out.println("John " + johnShared);
        john.setSharePost(new FacebookPublisher());
        johnShared = john.sharePost();
        System.out.println("John should: " + johnShared);

        assertEquals("Shared on Facebook", johnShared);
    }
}
