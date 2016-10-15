/**
 * @project DesignPatterns
 * @package info.mahfuz.compositepattern
 * @author mahfuz
 * @date Oct 15, 2016
 * @time 2:50:43 PM
 */
package info.mahfuz.compositepattern;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SongComponent industrial = new SongGroup("industrial", "Industrial song group");
		SongComponent hiphop = new SongGroup("hip hop", "hip hop song group");
		SongComponent jazz = new SongGroup("jazz", "jazz song group");
		SongComponent classical = new SongGroup("classical", "classical song group");
		SongComponent romantic = new SongGroup("romantic", "romantic song group");
		
		classical.add(romantic);
		industrial.add(new Song("Test1", "Band1", 1990));
		industrial.add(new Song("Test2", "Band2", 1990));
		hiphop.add(new Song("Test3", "Band3", 1990));
		hiphop.add(new Song("Test4", "Band4", 1990));
		jazz.add(new Song("Test5", "Band5", 1990));
		jazz.add(new Song("Test6", "Band6", 1990));
		romantic.add(new Song("Test7", "Band7", 1990));
		romantic.add(new Song("Test8", "Band8", 1990));
		
		SongGroup allComponents = new SongGroup("All songs", "All songs list");
		allComponents.add(industrial);
		allComponents.add(hiphop);
		allComponents.add(jazz);
		allComponents.add(classical);
		
		allComponents.displaySongInfo();
		

	}

}
