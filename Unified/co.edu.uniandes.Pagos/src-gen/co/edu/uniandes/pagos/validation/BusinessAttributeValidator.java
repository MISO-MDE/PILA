/**
 *
 * $Id$
 */
package co.edu.uniandes.pagos.validation;

import co.edu.uniandes.pagos.Expression;

/**
 * A sample validator interface for {@link co.edu.uniandes.pagos.BusinessAttribute}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BusinessAttributeValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateType(String value);
	boolean validateExp(Expression value);
	boolean validateIsIndex(String value);
}