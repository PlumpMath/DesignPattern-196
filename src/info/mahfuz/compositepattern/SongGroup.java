/**
 * @project DesignPatterns
 * @package info.mahfuz.compositepattern
 * @author mahfuz
 * @date Oct 15, 2016
 * @time 2:09:29 PM
 */
package info.mahfuz.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongGroup extends SongComponent {

	List<SongComponent> components = new ArrayList<SongComponent>();
	private String groupName;
	private String groupDescription;
	/**
	 * @param groupName
	 * @param groupDescription
	 */
	public SongGroup(String groupName, String groupDescription) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}
	
	public void add(SongComponent component) {
		components.add(component);
	}
	public void remove(SongComponent component) {
		components.remove(component);
	}
	public SongComponent getComponent(int index) {
		return components.get(index);
	}
	public void displaySongInfo() {
		System.out.println(getGroupName() + " " + getGroupDescription());
		
		Iterator<SongComponent> iterator = components.iterator();
		while (iterator.hasNext()) {
			SongComponent songComponent = iterator.next();
			songComponent.displaySongInfo();
		}
	}
	
	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @return the groupDescription
	 */
	public String getGroupDescription() {
		return groupDescription;
	}
	/**
	 * @param groupDescription the groupDescription to set
	 */
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
}
