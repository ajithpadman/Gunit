/**
 * 
 */
package com.gunit.projectwizard;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * @author ajith
 *
 */
public class UnitTestProjectWizard extends Wizard implements INewWizard,IExecutableExtension {

	private WizardNewProjectCreationPage _unitTestProjectPage1 = null;
	 IConfigurationElement _configurationElement;
	private static String WizardName = Messages.UnitTestProjectWizard_WizardName;
	/**
	 * 
	 */
	public UnitTestProjectWizard() {
		setWindowTitle(WizardName);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		 String name = _unitTestProjectPage1.getProjectName();
		    URI location = null;
		    if (!_unitTestProjectPage1.useDefaults()) {
		        location = _unitTestProjectPage1.getLocationURI();
		        System.err.println("location: " + location.toString()); //$NON-NLS-1$
		    } // else location == null
		 
		    UnitTestProjectSupport.createProject(name, location);
		   
			// Add this
		    BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
		 
		    return true;
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		_unitTestProjectPage1 = new WizardNewProjectCreationPage(WizardName);
		_unitTestProjectPage1.setTitle(Messages.UnitTestProjectWizard_Title);
		_unitTestProjectPage1.setDescription(Messages.UnitTestProjectWizard_Description);
		addPage(_unitTestProjectPage1);
		
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		_configurationElement = config;
		
	}
	

}
