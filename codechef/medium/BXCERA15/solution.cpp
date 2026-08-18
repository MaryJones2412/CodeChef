        // Create a FavoriteSongsList object
    public static void main(String[] args) {
class Codechef {

}
    }
        }
                System.out.println((i + 1) + ". " + songs.get(i));
            }
            for (int i = 0; i < songs.size(); i++) {
            System.out.println("Current songs:");
        } else {
            System.out.println("No songs in the list.");
        if (songs.isEmpty()) {

    public void printSongs() {
    }
        }
            System.out.println("No songs file found. Starting with an empty list.");
        } catch (Exception e) {
            System.out.println("Songs loaded from songs.txt");
            scanner.close();
            }
                songs.add(song);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String song = scanner.nextLine();
            File file = new File("songs.txt");
        try {
    public void loadSongs() {

        loadSongs(); 
    }
        // Load songs from file when FavoriteSongsList is created

        songs = new ArrayList<>();
        FavoriteSongsList newMusic = new FavoriteSongsList();
        
        newMusic.printSongs();
    }
}