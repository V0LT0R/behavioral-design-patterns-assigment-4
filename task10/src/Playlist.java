import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    // Method to get a Sequential Iterator
    public Iterator<Song> getSequentialIterator() {
        return new SequentialIterator();
    }

    // Method to get a Shuffle Iterator
    public Iterator<Song> getShuffleIterator() {
        return new ShuffleIterator();
    }

    // Method to get a Genre Filter Iterator
    public Iterator<Song> getGenreFilterIterator(String genre) {
        return new GenreFilterIterator(genre);
    }

    // Sequential Iterator Class
    private class SequentialIterator implements Iterator<Song> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < songs.size();
        }

        @Override
        public Song next() {
            return songs.get(index++);
        }
    }

    // Shuffle Iterator Class
    private class ShuffleIterator implements Iterator<Song> {
        private List<Song> shuffledSongs;
        private int index = 0;

        public ShuffleIterator() {
            shuffledSongs = new ArrayList<>(songs);
            java.util.Collections.shuffle(shuffledSongs);
        }

        @Override
        public boolean hasNext() {
            return index < shuffledSongs.size();
        }

        @Override
        public Song next() {
            return shuffledSongs.get(index++);
        }
    }

    // Genre Filter Iterator Class
    private class GenreFilterIterator implements Iterator<Song> {
        private List<Song> filteredSongs;
        private int index = 0;

        public GenreFilterIterator(String genre) {
            filteredSongs = new ArrayList<>();
            for (Song song : songs) {
                if (song.getGenre().equalsIgnoreCase(genre)) {
                    filteredSongs.add(song);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return index < filteredSongs.size();
        }

        @Override
        public Song next() {
            return filteredSongs.get(index++);
        }
    }
}
