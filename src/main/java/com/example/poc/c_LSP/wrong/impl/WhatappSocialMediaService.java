package com.example.poc.c_LSP.wrong.impl;

import com.example.poc.c_LSP.wrong.AbstractSocialMediaService;

public class WhatappSocialMediaService extends AbstractSocialMediaService {

    public void chatWithFriends() {

    }

    public void publishPost() {
        // FIXME: NOT APPLICABLE TO WHATSAPP, por ende no cumple LSP esta clase hija no es intercambiable por su clase padre porque esta operacion no esta soportada
        throw new UnsupportedOperationException();
    }
}
