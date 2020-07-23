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
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		_unitTestProjectPage1 = new WizardNewProjectCreationPage(WizardName);
		_unitTestProjectPage1.setTitle(Messages.UnitTestProjectWizard_Title);
		_unitTestProjectPage1.setDescription(Messages.UnitTestProjectWizard_Description);
		
		
	}
	

}
