/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.enums;


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
public enum EventsTransactionsCurrentAccessMode implements EnumType {

	READ_ONLY("READ ONLY"),

	READ_WRITE("READ WRITE");

	private final String literal;

	private EventsTransactionsCurrentAccessMode(String literal) {
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
		return "events_transactions_current_ACCESS_MODE";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLiteral() {
		return literal;
	}
}
