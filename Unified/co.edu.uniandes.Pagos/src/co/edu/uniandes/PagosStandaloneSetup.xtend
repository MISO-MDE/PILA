/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PagosStandaloneSetup extends PagosStandaloneSetupGenerated {

	def static void doSetup() {
		new PagosStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
