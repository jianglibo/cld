/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables.records;


import com.mymock.db.sys.tables.X$latestFileIo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$latestFileIoRecord extends TableRecordImpl<X$latestFileIoRecord> implements Record5<String, String, ULong, String, Long> {

	private static final long serialVersionUID = -177107099;

	/**
	 * Setter for <code>sys.x$latest_file_io.thread</code>.
	 */
	public void setThread(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$latest_file_io.thread</code>.
	 */
	public String getThread() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$latest_file_io.file</code>.
	 */
	public void setFile(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$latest_file_io.file</code>.
	 */
	public String getFile() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$latest_file_io.latency</code>.
	 */
	public void setLatency(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$latest_file_io.latency</code>.
	 */
	public ULong getLatency() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$latest_file_io.operation</code>.
	 */
	public void setOperation(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$latest_file_io.operation</code>.
	 */
	public String getOperation() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$latest_file_io.requested</code>.
	 */
	public void setRequested(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$latest_file_io.requested</code>.
	 */
	public Long getRequested() {
		return (Long) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, ULong, String, Long> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, ULong, String, Long> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return X$latestFileIo.X$LATEST_FILE_IO.THREAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return X$latestFileIo.X$LATEST_FILE_IO.FILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return X$latestFileIo.X$LATEST_FILE_IO.LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return X$latestFileIo.X$LATEST_FILE_IO.OPERATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return X$latestFileIo.X$LATEST_FILE_IO.REQUESTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getThread();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFile();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getOperation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getRequested();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$latestFileIoRecord value1(String value) {
		setThread(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$latestFileIoRecord value2(String value) {
		setFile(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$latestFileIoRecord value3(ULong value) {
		setLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$latestFileIoRecord value4(String value) {
		setOperation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$latestFileIoRecord value5(Long value) {
		setRequested(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$latestFileIoRecord values(String value1, String value2, ULong value3, String value4, Long value5) {
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
	 * Create a detached X$latestFileIoRecord
	 */
	public X$latestFileIoRecord() {
		super(X$latestFileIo.X$LATEST_FILE_IO);
	}

	/**
	 * Create a detached, initialised X$latestFileIoRecord
	 */
	public X$latestFileIoRecord(String thread, String file, ULong latency, String operation, Long requested) {
		super(X$latestFileIo.X$LATEST_FILE_IO);

		setValue(0, thread);
		setValue(1, file);
		setValue(2, latency);
		setValue(3, operation);
		setValue(4, requested);
	}
}
