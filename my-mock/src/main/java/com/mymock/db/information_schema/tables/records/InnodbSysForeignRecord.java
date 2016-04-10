/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables.records;


import com.mymock.db.information_schema.tables.InnodbSysForeign;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


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
public class InnodbSysForeignRecord extends TableRecordImpl<InnodbSysForeignRecord> implements Record5<String, String, String, UInteger, UInteger> {

	private static final long serialVersionUID = -2076203006;

	/**
	 * Setter for <code>information_schema.INNODB_SYS_FOREIGN.ID</code>.
	 */
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_FOREIGN.ID</code>.
	 */
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_FOREIGN.FOR_NAME</code>.
	 */
	public void setForName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_FOREIGN.FOR_NAME</code>.
	 */
	public String getForName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_FOREIGN.REF_NAME</code>.
	 */
	public void setRefName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_FOREIGN.REF_NAME</code>.
	 */
	public String getRefName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_FOREIGN.N_COLS</code>.
	 */
	public void setNCols(UInteger value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_FOREIGN.N_COLS</code>.
	 */
	public UInteger getNCols() {
		return (UInteger) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_FOREIGN.TYPE</code>.
	 */
	public void setType(UInteger value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_FOREIGN.TYPE</code>.
	 */
	public UInteger getType() {
		return (UInteger) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, String, UInteger, UInteger> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, String, UInteger, UInteger> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return InnodbSysForeign.INNODB_SYS_FOREIGN.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InnodbSysForeign.INNODB_SYS_FOREIGN.FOR_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return InnodbSysForeign.INNODB_SYS_FOREIGN.REF_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field4() {
		return InnodbSysForeign.INNODB_SYS_FOREIGN.N_COLS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field5() {
		return InnodbSysForeign.INNODB_SYS_FOREIGN.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getForName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getRefName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value4() {
		return getNCols();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value5() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysForeignRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysForeignRecord value2(String value) {
		setForName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysForeignRecord value3(String value) {
		setRefName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysForeignRecord value4(UInteger value) {
		setNCols(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysForeignRecord value5(UInteger value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysForeignRecord values(String value1, String value2, String value3, UInteger value4, UInteger value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbSysForeignRecord
	 */
	public InnodbSysForeignRecord() {
		super(InnodbSysForeign.INNODB_SYS_FOREIGN);
	}

	/**
	 * Create a detached, initialised InnodbSysForeignRecord
	 */
	public InnodbSysForeignRecord(String id, String forName, String refName, UInteger nCols, UInteger type) {
		super(InnodbSysForeign.INNODB_SYS_FOREIGN);

		setValue(0, id);
		setValue(1, forName);
		setValue(2, refName);
		setValue(3, nCols);
		setValue(4, type);
	}
}
