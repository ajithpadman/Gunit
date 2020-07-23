package com.gunit.projectwizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.gunit.projectwizard.messages"; //$NON-NLS-1$
	public static String UnitTestProjectWizard_Description;
	public static String UnitTestProjectWizard_Title;
	public static String UnitTestProjectWizard_WizardName;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
