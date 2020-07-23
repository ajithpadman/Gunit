/**
 * 
 */
package com.gunit.projectwizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

/**
 * @author ajith
 *
 */
public class UnitTestProjectWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage _unitTestProjectPage1 = null;
	/**
	 * 
	 */
	public UnitTestProjectWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		_unitTestProjectPage1 = new WizardNewProjectCreationPage("Unit Test Project Wizard");
		
		
		
	}
	

}
