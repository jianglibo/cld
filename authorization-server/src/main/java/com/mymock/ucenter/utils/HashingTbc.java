
package com.mymock.ucenter.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;


/**
 * @author jianglibo@gmail.com
 *         2015年8月28日
 *
 */
public class HashingTbc {
    
    public static String hashFileMd5(File f) throws IOException {
        HashCode md5 = com.google.common.io.Files.hash(f, Hashing.md5());
        return md5.toString();
    }
    
    public static String hashFileMd5(Path p) throws IOException {
        return hashFileMd5(p.toFile());
    }


}
