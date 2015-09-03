package me.sebbert.hyperchillin;

import javax.swing.JComponent;
import javax.swing.JPanel;

import net.pms.dlna.DLNAResource;
import net.pms.dlna.virtual.VirtualFolder;
import net.pms.external.AdditionalFolderAtRoot;
import net.pms.dlna.WebVideoStream;

public class Plugin implements AdditionalFolderAtRoot {
	VirtualFolder _root;
	
	public Plugin() {
		_root = new VirtualFolder("Superchillin", "img/icon.png");
		WebVideoStream stream = new WebVideoStream(
				"test", "http://superchillin.com/dl/20/398897c0cc86e04e577bdfb49e/episode_24193.mp4", null);
		_root.addChild(stream);
	}
	
	@Override
	public JComponent config() {
		return new JPanel();
	}

	@Override
	public String name() {
		return "Hyperchillin";
	}

	@Override
	public void shutdown() {
		
		
	}

	@Override
	public DLNAResource getChild() {
		return _root;
	}
}
