public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Shape of You", "Ed Sheeran", "Pop"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd", "Pop"));
        playlist.addSong(new Song("Rockstar", "Post Malone", "Hip Hop"));
        playlist.addSong(new Song("Thunder", "Imagine Dragons", "Rock"));
        playlist.addSong(new Song("Believer", "Imagine Dragons", "Rock"));
        playlist.addSong(new Song("Sunflower", "Post Malone", "Pop"));

        System.out.println("Sequential Iteration:");
        Iterator<Song> sequentialIterator = playlist.getSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        System.out.println("\nShuffle Iteration:");
        Iterator<Song> shuffleIterator = playlist.getShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        System.out.println("\nFiltered by Genre (Pop):");
        Iterator<Song> genreFilterIterator = playlist.getGenreFilterIterator("Pop");
        while (genreFilterIterator.hasNext()) {
            System.out.println(genreFilterIterator.next());
        }
    }
}
