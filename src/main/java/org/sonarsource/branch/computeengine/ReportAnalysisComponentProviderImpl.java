package org.sonarsource.branch.computeengine;

import java.util.Collections;
import java.util.List;

import org.sonar.api.ce.ComputeEngineSide;
import org.sonar.plugin.ce.ReportAnalysisComponentProvider;

@ComputeEngineSide
public class ReportAnalysisComponentProviderImpl implements ReportAnalysisComponentProvider {
	@Override
	public List<Object> getComponents() {
        return Collections.singletonList(BranchLoaderDelegateImpl.class);
    }
}
