/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables.records;


import com.mymock.db.information_schema.tables.CollationCharacterSetApplicability;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class CollationCharacterSetApplicabilityRecord extends TableRecordImpl<CollationCharacterSetApplicabilityRecord> implements Record2<String, String> {

	private static final long serialVersionUID = 26411573;

	/**
	 * Setter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
	 */
	public void setCollationName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
	 */
	public String getCollationName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
	 */
	public void setCharacterSetName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
	 */
	public String getCharacterSetName() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getCollationName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCharacterSetName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollationCharacterSetApplicabilityRecord value1(String value) {
		setCollationName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollationCharacterSetApplicabilityRecord value2(String value) {
		setCharacterSetName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollationCharacterSetApplicabilityRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CollationCharacterSetApplicabilityRecord
	 */
	public CollationCharacterSetApplicabilityRecord() {
		super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);
	}

	/**
	 * Create a detached, initialised CollationCharacterSetApplicabilityRecord
	 */
	public CollationCharacterSetApplicabilityRecord(String collationName, String characterSetName) {
		super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

		setValue(0, collationName);
		setValue(1, characterSetName);
	}
}
