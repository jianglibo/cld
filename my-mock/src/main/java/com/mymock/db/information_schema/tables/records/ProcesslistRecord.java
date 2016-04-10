/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables.records;


import com.mymock.db.information_schema.tables.Processlist;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ProcesslistRecord extends TableRecordImpl<ProcesslistRecord> implements Record8<ULong, String, String, String, String, Integer, String, String> {

	private static final long serialVersionUID = 313383424;

	/**
	 * Setter for <code>information_schema.PROCESSLIST.ID</code>.
	 */
	public void setId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.ID</code>.
	 */
	public ULong getId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.USER</code>.
	 */
	public void setUser(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.USER</code>.
	 */
	public String getUser() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.HOST</code>.
	 */
	public void setHost(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.HOST</code>.
	 */
	public String getHost() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.DB</code>.
	 */
	public void setDb(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.DB</code>.
	 */
	public String getDb() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.COMMAND</code>.
	 */
	public void setCommand(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.COMMAND</code>.
	 */
	public String getCommand() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.TIME</code>.
	 */
	public void setTime(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.TIME</code>.
	 */
	public Integer getTime() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.STATE</code>.
	 */
	public void setState(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.STATE</code>.
	 */
	public String getState() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.INFO</code>.
	 */
	public void setInfo(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.INFO</code>.
	 */
	public String getInfo() {
		return (String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<ULong, String, String, String, String, Integer, String, String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<ULong, String, String, String, String, Integer, String, String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return Processlist.PROCESSLIST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Processlist.PROCESSLIST.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Processlist.PROCESSLIST.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Processlist.PROCESSLIST.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Processlist.PROCESSLIST.COMMAND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Processlist.PROCESSLIST.TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Processlist.PROCESSLIST.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Processlist.PROCESSLIST.INFO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCommand();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getInfo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value1(ULong value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value2(String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value3(String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value4(String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value5(String value) {
		setCommand(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value6(Integer value) {
		setTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value7(String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value8(String value) {
		setInfo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord values(ULong value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProcesslistRecord
	 */
	public ProcesslistRecord() {
		super(Processlist.PROCESSLIST);
	}

	/**
	 * Create a detached, initialised ProcesslistRecord
	 */
	public ProcesslistRecord(ULong id, String user, String host, String db, String command, Integer time, String state, String info) {
		super(Processlist.PROCESSLIST);

		setValue(0, id);
		setValue(1, user);
		setValue(2, host);
		setValue(3, db);
		setValue(4, command);
		setValue(5, time);
		setValue(6, state);
		setValue(7, info);
	}
}
