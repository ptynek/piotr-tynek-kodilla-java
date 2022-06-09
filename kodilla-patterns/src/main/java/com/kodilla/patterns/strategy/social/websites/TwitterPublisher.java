package com.kodilla.patterns.strategy.social.websites;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Shared on Twitter";
    }
}
