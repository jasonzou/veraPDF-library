package org.verapdf.metadata.fixer.utils.model;

/**
 * Class represent description of the rule. Each rule must be
 * defined by applied object type and test condition
 * or null test (to define all tests for specific object).
 *
 * @author Evgeniy Muravitskiy
 */
public class RuleDescription {

	private final String objectType;
	private final String test;

	/**
	 * Default constructor.
	 *
	 * @param test       test condition for current object type
	 * @param objectType applied object type
	 */
	public RuleDescription(String test, String objectType) {
		this.test = test;
		this.objectType = objectType;
	}

	/**
	 * @return applied object type
	 */
	public String getObjectType() {
		return this.objectType;
	}

	/**
	 * @return test condition for current object type
	 */
	public String getTest() {
		return this.test;
	}

	/**
	 * Compare string representation of rule description
	 * with current rule description
	 *
	 * @param toCompareType passed object type of another rule description
	 * @param toCompareTest passed test of another rule description
	 *
	 * @return true if {@code objectType} and {@code test} are match
	 */
	public boolean compareTo(String toCompareType, String toCompareTest) {
		return this.objectType.equals(toCompareType) && (this.test == null || this.test.equals(toCompareTest));
	}
}
