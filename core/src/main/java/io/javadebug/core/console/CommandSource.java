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


/**
 *   Copyright © 2019-XXX HJ All Rights Reserved
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
//  Author : HJ


package io.javadebug.core.console;

/**
 * Created on 2019/4/29 22:28.
 *
 * @author <a href="H.J"> HuJian </a>
 */
public interface CommandSource {

    /**
     *  用于生成一条命令输入，比如可以使用命令行，或者从某个队列取，只要能生成
     *  一条命令输入即可;
     *  这个source就像是一个水龙头，只要把水龙头打开，下游就会拿到水，如果你需要监听
     *  命令执行结果，那么可以在 {@link io.javadebug.core.transport.NettyTransportClusterClient}
     *  上面安装一个{@link CommandSink}，sink可以安装多个，同一份结果会广播给所有安装了的sink
     *
     * @return 命令输入，比如 "fc -class String"
     */
    String source();

}
