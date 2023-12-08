package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
	
		File f = new File("C:\\Java File Handling\\fileOutputStream.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f,true);
			PrintStream ps = new PrintStream(fos);
			String str = "In the vibrant cityscape of serendipity, where the echoes of possibility dance in the alleys of imagination, "
					+ "a kaleidoscope of dreams unfolds. Whispers of adventure linger in the air, weaving tales of courage and "
					+ "discovery. Beneath the celestial canopy, a symphony of aspirations orchestrates the rhythm of life, "
					+ "painting each moment with the hues of passion and resilience. Embrace the enigma of the unknown,"
					+ " for within its tapestry lies the magic of infinite possibilities";
			
//			ps.print(str);
			byte [] dt = str.getBytes();
			fos.write(dt);
			System.out.println(dt);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
