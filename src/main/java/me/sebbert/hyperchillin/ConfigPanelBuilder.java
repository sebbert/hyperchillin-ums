package me.sebbert.hyperchillin;
import javax.swing.*;
import java.awt.BorderLayout;

public class ConfigPanelBuilder {
	private JPanel _panel;
	private static ConfigPanelBuilder _instance = null;
	
	private ConfigPanelBuilder() {
		_panel = new JPanel(new BorderLayout());
		
	}
	
	public JPanel build() {
		
		return null;
	}
	
	public interface Callbacks {
		
	}
}
