package com.mymock.ucenter.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.isEmptyString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.mymock.ucenter.UriPositionException;
import com.mymock.ucenter.utils.UriSegmentUtil;

public class UriSegmentUtilTest {

    @Test
    public void testNormal() throws UriPositionException {
        String uri = "/abc/22";
        String s = UriSegmentUtil.getSegmentFromEnd(uri, 0);
        assertThat(s, is("22"));
        
        s = UriSegmentUtil.getSegmentFromEnd(uri, 1);
        assertThat(s, is("abc"));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testUnNormal() {
        String uri = "/abc/22";
        String s = UriSegmentUtil.getSegmentFromEnd(uri, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUnNormal1() {
        String uri = "/abc/22";
        String s = UriSegmentUtil.getSegmentFromEnd(uri, -1);
    }
    
    @Test
    public void testUnNormal2() {
        String uri = "/";
        String s = UriSegmentUtil.getSegmentFromEnd(uri, 0);
        assertThat(s, isEmptyString());
    }
    
    @Test
    public void testLongValue() {
        String uri = "/abc/22";
        long l = UriSegmentUtil.getLongValueFromEnd(uri, 0);
        assertThat(l, is(22L));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testLongValue1() {
        String uri = "/";
        long l = UriSegmentUtil.getLongValueFromEnd(uri, 0);
        assertThat(l, is(0L));
    }

}
