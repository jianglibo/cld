/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables.records;


import com.mymock.db.sys.tables.UserSummaryByFileIoType;

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
public class UserSummaryByFileIoTypeRecord extends TableRecordImpl<UserSummaryByFileIoTypeRecord> implements Record5<String, String, ULong, String, String> {

	private static final long serialVersionUID = -777719227;

	/**
	 * Setter for <code>sys.user_summary_by_file_io_type.user</code>.
	 */
	public void setUser(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.user_summary_by_file_io_type.user</code>.
	 */
	public String getUser() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.user_summary_by_file_io_type.event_name</code>.
	 */
	public void setEventName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.user_summary_by_file_io_type.event_name</code>.
	 */
	public String getEventName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.user_summary_by_file_io_type.total</code>.
	 */
	public void setTotal(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.user_summary_by_file_io_type.total</code>.
	 */
	public ULong getTotal() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>sys.user_summary_by_file_io_type.latency</code>.
	 */
	public void setLatency(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.user_summary_by_file_io_type.latency</code>.
	 */
	public String getLatency() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.user_summary_by_file_io_type.max_latency</code>.
	 */
	public void setMaxLatency(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.user_summary_by_file_io_type.max_latency</code>.
	 */
	public String getMaxLatency() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, ULong, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, ULong, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE.LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE.MAX_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getEventName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getMaxLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSummaryByFileIoTypeRecord value1(String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSummaryByFileIoTypeRecord value2(String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSummaryByFileIoTypeRecord value3(ULong value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSummaryByFileIoTypeRecord value4(String value) {
		setLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSummaryByFileIoTypeRecord value5(String value) {
		setMaxLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSummaryByFileIoTypeRecord values(String value1, String value2, ULong value3, String value4, String value5) {
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
	 * Create a detached UserSummaryByFileIoTypeRecord
	 */
	public UserSummaryByFileIoTypeRecord() {
		super(UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE);
	}

	/**
	 * Create a detached, initialised UserSummaryByFileIoTypeRecord
	 */
	public UserSummaryByFileIoTypeRecord(String user, String eventName, ULong total, String latency, String maxLatency) {
		super(UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE);

		setValue(0, user);
		setValue(1, eventName);
		setValue(2, total);
		setValue(3, latency);
		setValue(4, maxLatency);
	}
}
