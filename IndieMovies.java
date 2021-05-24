class IndieMovies  { 
    
    public static void main(String[] args) {
    
        String film = "Indiana Jones";
		boolean vu = true;
		int date = 1989;
		double note = 8.2;
		
		String movie = film + " sorti en " + date + " et noté " + note;
		
		if (vu) {
			System.out.println("Il faut trop que tu regarde le film " + movie);
		} else{
            System.out.println("Oh ! Tu ne veux vraiment pas regardé le film " + movie);

        }
}


}
