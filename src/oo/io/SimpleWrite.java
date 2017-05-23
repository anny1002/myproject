package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("data.txt");
			fos.write(66);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

}
