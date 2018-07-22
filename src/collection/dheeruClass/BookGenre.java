package collection.dheeruClass;

public enum BookGenre {
	
	BIOGRAPHY(12),
	HORROR(15);
	
	private BookGenre(int minAgeToRead){
		this.minAgeToRead=minAgeToRead;
		
	}
	private int minAgeToRead;
	public int getminAgeToRead(){
		return minAgeToRead;
	}
	public static void main(String[] args) {
		for(BookGenre bookGenre:BookGenre.values()){
			//System.out.println(bookGenre);
			//System.out.println(bookGenre.name());
			//System.out.println(bookGenre.ordinal());
			//System.out.println(bookGenre.BIOGRAPHY);
//			System.out.println(bookGenre.getDeclaringClass());
//			System.out.println(bookGenre.HORROR);
			System.out.println(bookGenre.getminAgeToRead());
		}
	}

}
