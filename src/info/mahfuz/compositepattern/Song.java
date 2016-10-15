/**
 * @project DesignPatterns
 * @package info.mahfuz.compositepattern
 * @author mahfuz
 * @date Oct 15, 2016
 * @time 2:43:38 PM
 */
package info.mahfuz.compositepattern;

public class Song extends SongComponent {
	String name;
	String band;
	int releaseYear;
	/**
	 * @param name
	 * @param band
	 * @param releaseYear
	 */
	public Song(String name, String band, int releaseYear) {
		super();
		this.name = name;
		this.band = band;
		this.releaseYear = releaseYear;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the band
	 */
	public String getBand() {
		return band;
	}
	/**
	 * @param band the band to set
	 */
	public void setBand(String band) {
		this.band = band;
	}
	/**
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}
	/**
	 * @param releaseYear the releaseYear to set
	 */
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public void displaySongInfo() {
		System.out.println(getName() + " was recorded by " + getBand() + " in " + getReleaseYear());
	}
}
