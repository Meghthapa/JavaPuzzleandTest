package collection.dheeruClass;

import java.io.File;
import java.io.IOException;

public class ReadingTextFromFile {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\meght\\workspace\\NewWorkspace\\JavaPractice\\src\\collection\\dheeruClass\\read.txt");
		
		System.out.println("GetAbsolutePath()"+f.getAbsolutePath());
		System.out.println("CanonicalPath"+f.getCanonicalPath());
		System.out.println("Seperator:"+f.separator);
		System.out.println("seperatechar"+f.separatorChar);
		System.out.println("GetParent"+f.getParent());
		System.out.println("lastModified"+f.lastModified());
		System.out.println("Exists()"+f.exists());
		System.out.println("IsFile()"+f.isFile());
		System.out.println("IsDirectory"+f.isDirectory());
		System.out.println("length()"+f.length());
		System.out.println("System.getProperty"+System.getProperty("user.dir"));
		System.out.println("Creating a new directory"+ new File("Megh").mkdirs());
		System.out.println("Creating a new file"+ new File("Megh\\test").mkdirs());
		System.out.println("Delating a directory"+new File("Megh").delete());
		System.out.println("Creating a multiple directory"+new File("Megh\\test1\\test2").mkdirs());
		
		File file2=new File("temp.txt");
		System.out.println("file2.createNewFile()"+file2.createNewFile());
		System.out.println("file2.rename()"+file2.renameTo(new File("Megh\\temp1")));
		dirFilter(true);
		
		
		
	}
	public static void dirFilter(boolean applyFilter){
		
		File path = new File(".");
		String[] list;
		
		if(!applyFilter){
			list=path.list();
		}else{
			list=path.list();
			
			for(String diritem: list){
				System.out.println(diritem);
			}
		}
		
	}

}
