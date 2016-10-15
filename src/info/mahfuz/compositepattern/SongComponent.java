/**
 * @project DesignPatterns
 * @package info.mahfuz.compositepattern
 * @author mahfuz
 * @date Oct 15, 2016
 * @time 2:03:00 PM
 */
package info.mahfuz.compositepattern;

public abstract class SongComponent {
	
	public void add(SongComponent component) {
		throw new UnsupportedOperationException();
	}
	public void remove(SongComponent component) {
		throw new UnsupportedOperationException();
	}
	public SongComponent getComponent(int index) {
		throw new UnsupportedOperationException();
	}
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public int getReleaseYear() {
		throw new UnsupportedOperationException();
	}
	public void displaySongInfo() {
		throw new UnsupportedOperationException();
	}
}
