package com.mymock.ucenter.utils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public class UploadUtil {

	public static void copyToFile(InputStream is, Path dest, long maxStop) throws UploadCopyFileException {
		OutputStream out = null;
		try {
			int bufferSize = 1024;
			// Read bytes and write to destination until eof
			out = new BufferedOutputStream(new FileOutputStream(dest.toFile()));
			byte[] buf = new byte[bufferSize];
			int len = 0;
			while ((len = is.read(buf)) >= 0) {
				out.write(buf, 0, len);
			}
			out.close();
		} catch (Exception e) {
			throw new UploadCopyFileException();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static class UploadCopyFileException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	}
}
