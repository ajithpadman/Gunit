package com.gunit.projectwizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;

public class UnitTestProjectNature implements IProjectNature {

	public static String NATURE_ID = "com.gunit.projectwizard.unittestprojectnature";
	@Override
	public void configure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public IProject getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProject(IProject project) {
		// TODO Auto-generated method stub

	}
	public static void addNature(IProject project)
	{
		 try {
			if (!project.hasNature(UnitTestProjectNature.NATURE_ID)) {
			        IProjectDescription description;
					description = project.getDescription();				
			        String[] prevNatures = description.getNatureIds();
			        String[] newNatures = new String[prevNatures.length + 1];
			        System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			        newNatures[prevNatures.length] = UnitTestProjectNature.NATURE_ID;
			        description.setNatureIds(newNatures);
 
			        IProgressMonitor monitor = null;
			        project.setDescription(description, monitor);
			    }
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
