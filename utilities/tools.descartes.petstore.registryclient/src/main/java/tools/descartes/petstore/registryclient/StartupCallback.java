package tools.descartes.petstore.registryclient;

/**
 * Interface for callback at startup.
 * @author Simon
 *
 */
@FunctionalInterface
public interface StartupCallback {
	/**
	 * This function is called to trigger callback.
	 */
	public void callback();

}