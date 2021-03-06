//
//  ========================================================================
//  Copyright (c) 2018-2019 HuJian/Pandening soft collection.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the #{license} Public License #{version}
//  EG:
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  You should bear the consequences of using the software (named 'java-debug-tool')
//  and any modify must be create an new pull request and attach an text to describe
//  the change detail.
//  ========================================================================
//


package io.javadebug.core.claw;

import io.javadebug.core.exception.ClawScriptScanException;

import java.lang.reflect.Field;

public enum  SetClawImpl implements ObjectClawDefine {
    SET_CLAW;

    @Override
    public ObjectClawDefine set(Object originObject, Field classField, String targetVal) {
        return null;
    }

    @Override
    public void set(ClawMeta clawMeta) {
        throw new ClawScriptScanException("[sad] un-support operation: claw set");
    }
}
