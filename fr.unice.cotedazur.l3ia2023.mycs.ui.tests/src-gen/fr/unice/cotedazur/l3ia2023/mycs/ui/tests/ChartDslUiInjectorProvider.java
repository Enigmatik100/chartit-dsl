/*
 * generated by Xtext 2.25.0
 */
package fr.unice.cotedazur.l3ia2023.mycs.ui.tests;

import com.google.inject.Injector;
import fr.unice.cotedazur.l3ia2023.mycs.ui.internal.MycsActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ChartDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MycsActivator.getInstance().getInjector("fr.unice.cotedazur.l3ia2023.mycs.ChartDsl");
	}

}
