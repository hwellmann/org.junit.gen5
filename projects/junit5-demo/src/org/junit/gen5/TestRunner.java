package org.junit.gen5;

import java.util.logging.Level;

import org.junit.gen5.engine.discovery.ClassSelector;
import org.junit.gen5.launcher.Launcher;
import org.junit.gen5.launcher.TestDiscoveryRequest;
import org.junit.gen5.launcher.listeners.LoggingListener;
import org.junit.gen5.launcher.main.LauncherFactory;
import org.junit.gen5.launcher.main.TestDiscoveryRequestBuilder;
import org.junit.gen5.P1Test;

public class TestRunner {
    
	public static void main(String[] args) {
		Launcher launcher = LauncherFactory.create();
		launcher.registerTestExecutionListeners(LoggingListener.forJavaUtilLogging(Level.INFO));
		TestDiscoveryRequest request = TestDiscoveryRequestBuilder.request().select(ClassSelector.forClass(P1Test.class)).build();
		launcher.execute(request);
	}
}
