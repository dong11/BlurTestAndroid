package at.favre.app.blurtest.models;

import java.util.ArrayList;
import java.util.List;

/**
* Created by PatrickF on 16.04.2014.
*/
public class BenchmarkResultList {
	private List<BenchmarkWrapper> benchmarkWrappers = new ArrayList<BenchmarkWrapper>();

	public BenchmarkResultList() {
	}

	public List<BenchmarkWrapper> getBenchmarkWrappers() {
		return benchmarkWrappers;
	}

	public void setBenchmarkWrappers(List<BenchmarkWrapper> benchmarkWrappers) {
		this.benchmarkWrappers = benchmarkWrappers;
	}
}
