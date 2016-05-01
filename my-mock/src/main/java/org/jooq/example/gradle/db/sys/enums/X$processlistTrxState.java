/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.enums;


import javax.annotation.Generated;

import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum X$processlistTrxState implements EnumType {

	ACTIVE("ACTIVE"),

	COMMITTED("COMMITTED"),

	ROLLED_BACK("ROLLED BACK");

	private final String literal;

	private X$processlistTrxState(String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "x$processlist_trx_state";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLiteral() {
		return literal;
	}
}
