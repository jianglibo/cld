/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.example.gradle.db.information_schema.tables.InnodbFtConfig;
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
public class InnodbFtConfigRecord extends TableRecordImpl<InnodbFtConfigRecord> implements Record2<String, String> {

	private static final long serialVersionUID = 1649165944;

	/**
	 * Setter for <code>information_schema.INNODB_FT_CONFIG.KEY</code>.
	 */
	public void setKey(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_CONFIG.KEY</code>.
	 */
	public String getKey() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_FT_CONFIG.VALUE</code>.
	 */
	public void setValue(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_CONFIG.VALUE</code>.
	 */
	public String getValue() {
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
		return InnodbFtConfig.INNODB_FT_CONFIG.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InnodbFtConfig.INNODB_FT_CONFIG.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtConfigRecord value1(String value) {
		setKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtConfigRecord value2(String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtConfigRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbFtConfigRecord
	 */
	public InnodbFtConfigRecord() {
		super(InnodbFtConfig.INNODB_FT_CONFIG);
	}

	/**
	 * Create a detached, initialised InnodbFtConfigRecord
	 */
	public InnodbFtConfigRecord(String key, String value) {
		super(InnodbFtConfig.INNODB_FT_CONFIG);

		setValue(0, key);
		setValue(1, value);
	}
}
