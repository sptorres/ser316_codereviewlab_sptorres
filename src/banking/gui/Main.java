package banking.gui;

import javax.swing.JFrame;

/**
 * main method for running the program.
 * @author kevinagary
 *
 */
final class Main {
	/**
	 * Private constructor to address STYLE issue.
	 */
	private Main() {
	}
	
	/**
	 * All methods should have a Javadoc according to STYLE.
	 * @param args command-line arguments
	 * @throws Exception as per typical main specifications
	 */
	public static void main(final String[] args) throws Exception {
		
		String propertyFile = "my.properties";
		JFrame frame = new MainFrame(propertyFile);
		frame.setVisible(true);

	}
}
