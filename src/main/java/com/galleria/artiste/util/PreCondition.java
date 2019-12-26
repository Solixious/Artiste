package com.galleria.artiste.util;

import com.galleria.artiste.exception.NullParameterException;

public class PreCondition {
    public static void checkNotNull(Object obj, String message) throws NullParameterException {
        if(obj == null) {
            throw new NullParameterException(message);
        }
    }
}
