package org.sonarsource.branch.server;

import org.sonar.api.server.ServerSide;
import org.sonar.server.branch.BranchFeatureExtension;

@ServerSide
public class BranchFeatureExtensionImpl implements BranchFeatureExtension {
	
	@Override
	public boolean isEnabled() {
        return true;
    }
}
