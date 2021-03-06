/**
 *
 * $Id$
 */
package pagos.validation;

import pagos.Intermediary;

/**
 * A sample validator interface for {@link pagos.Application}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ApplicationValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateIntermediary(Intermediary value);
}
