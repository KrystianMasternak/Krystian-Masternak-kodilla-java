package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {


    @Test
    void testDefaultSharingStrategies() {
        //Given
        User jonh = new Millenials("Jonh");
        User steven = new YGeneration("Steven");
        User jack = new ZGeneration("Jack");

        //When
        String jonhPosting = jonh.sharePost();
        System.out.println("Jonh " + jonhPosting);
        String stevenPosting = steven.sharePost();
        System.out.println("Steven " + stevenPosting);
        String jackPosting = jack.sharePost();
        System.out.println("Jack " + jackPosting);

        //Then
        assertEquals("Share on Facebook.", jonhPosting);
        assertEquals("Share on Snapchat.", stevenPosting);
        assertEquals("Share on Twitter.", jackPosting);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User jack = new Millenials("Jack");

        //When
        String jackPosting = jack.sharePost();
        System.out.println("Jack " + jackPosting);
        jack.setSocialPublisher(new SnapchatPublisher());
        jackPosting = jack.sharePost();
        System.out.println("Jack now " + jackPosting);

        //Then
        assertEquals("Share on Snapchat.", jackPosting);
    }

}
