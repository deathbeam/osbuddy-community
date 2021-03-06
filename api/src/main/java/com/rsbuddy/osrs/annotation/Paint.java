package com.rsbuddy.osrs.annotation;

import com.rsbuddy.osrs.game.ui.PaintHook;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Paint {
    PaintHook value();
}
