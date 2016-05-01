package com.mymock.webproxy.util;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MirrorListHandlerTest {
    
//        http://mirrors.skyshe.cn/centos/7.2.1511/os/x86_64/
//        http://mirrors.hust.edu.cn/centos/7.2.1511/os/x86_64/
//        http://mirror.neu.edu.cn/centos/7.2.1511/os/x86_64/
//        http://mirrors.btte.net/centos/7.2.1511/os/x86_64/
//        http://mirrors.cug.edu.cn/centos/7.2.1511/os/x86_64/
//        http://mirrors.aliyun.com/centos/7.2.1511/os/x86_64/
//        http://ftp.sjtu.edu.cn/centos/7.2.1511/os/x86_64/
//        http://mirror.bit.edu.cn/centos/7.2.1511/os/x86_64/
//        http://mirrors.zju.edu.cn/centos/7.2.1511/os/x86_64/
//        http://mirrors.pubyun.com/centos/7.2.1511/os/x86_64/

    @Test
    public void t() {
        String oneline = "http://mirrors.skyshe.cn/centos/7.2.1511/os/x86_64/";
        int thirdSlash = oneline.indexOf('/', 9);
        String sufix = oneline.substring(thirdSlash);
        assertThat(sufix, equalTo("/centos/7.2.1511/os/x86_64/"));
    }
}
