package com.plaid.client;

/**
 * The Plaid environment to be used when making API calls.
 * <br>
 * See <a href="https://plaid.com/docs/quickstart/">quickstart</a> for the difference between them.
 * @author Sam Hieken
 *
 */
public enum Environment {
	PRODUCTION, DEVELOPMENT, SANDBOX;
	
	/**
	 * Converts the Plaid environment into its URL form.
	 */
	@Override
	public String toString() {
		switch (this) {
		
		case PRODUCTION:
			return "https://production.plaid.com/";
		case DEVELOPMENT:
			return "https://development.plaid.com/";
		case SANDBOX:
			return "https://sandbox.plaid.com/";
		}
		
		return null;
	}
}
