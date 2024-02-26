package com.apccb.Utils;

import java.awt.image.BufferedImage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;
public class CaptchaInternalData {
	public static String imgToBase64String(final BufferedImage img) {
		final ByteArrayOutputStream os = new ByteArrayOutputStream();   // This class implements an output stream in which the data iswritten into a byte array. The buffer automatically grows as datais written to it.The data can be retrieved using toByteArray() and toString(). 

		try {
			ImageIO.write(img, "png", os);  // A class containing static convenience methods for locating ImageReaders and ImageWriters, andperforming simple encoding and decoding.


			return DatatypeConverter.printBase64Binary(os.toByteArray());  //  Converts an array of bytes into a string.
			                                                                // Parameters:val An array of bytesReturns:A string containing a lexical representation of xsd:base64Binary

		} catch (final IOException ioe) {
			throw new UncheckedIOException(ioe);
		}
	}
	public String getSaltString() {
		String SALTCHARS = "ABCDEFGHIJKLMNPQRSTUVWXYZ123456789";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 6) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}
}
