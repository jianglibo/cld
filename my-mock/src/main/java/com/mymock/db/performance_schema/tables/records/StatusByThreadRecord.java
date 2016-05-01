/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.tables.StatusByThread;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class StatusByThreadRecord extends TableRecordImpl<StatusByThreadRecord> implements Record3<ULong, String, String> {

	private static final long serialVersionUID = 481138592;

	/**
	 * Setter for <code>performance_schema.status_by_thread.THREAD_ID</code>.
	 */
	public void setThreadId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.status_by_thread.THREAD_ID</code>.
	 */
	public ULong getThreadId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.status_by_thread.VARIABLE_NAME</code>.
	 */
	public void setVariableName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.status_by_thread.VARIABLE_NAME</code>.
	 */
	public String getVariableName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.status_by_thread.VARIABLE_VALUE</code>.
	 */
	public void setVariableValue(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.status_by_thread.VARIABLE_VALUE</code>.
	 */
	public String getVariableValue() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<ULong, String, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<ULong, String, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return StatusByThread.STATUS_BY_THREAD.THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return StatusByThread.STATUS_BY_THREAD.VARIABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return StatusByThread.STATUS_BY_THREAD.VARIABLE_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getVariableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getVariableValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatusByThreadRecord value1(ULong value) {
		setThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatusByThreadRecord value2(String value) {
		setVariableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatusByThreadRecord value3(String value) {
		setVariableValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatusByThreadRecord values(ULong value1, String value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StatusByThreadRecord
	 */
	public StatusByThreadRecord() {
		super(StatusByThread.STATUS_BY_THREAD);
	}

	/**
	 * Create a detached, initialised StatusByThreadRecord
	 */
	public StatusByThreadRecord(ULong threadId, String variableName, String variableValue) {
		super(StatusByThread.STATUS_BY_THREAD);

		setValue(0, threadId);
		setValue(1, variableName);
		setValue(2, variableValue);
	}
}
