/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.mysql.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.example.gradle.db.mysql.enums.EventIntervalField;
import org.jooq.example.gradle.db.mysql.enums.EventOnCompletion;
import org.jooq.example.gradle.db.mysql.enums.EventStatus;
import org.jooq.example.gradle.db.mysql.tables.Event;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Events
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventRecord extends UpdatableRecordImpl<EventRecord> implements Record22<String, String, byte[], String, Timestamp, Integer, EventIntervalField, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, EventStatus, EventOnCompletion, String, String, UInteger, String, String, String, String, byte[]> {

	private static final long serialVersionUID = 830674257;

	/**
	 * Setter for <code>mysql.event.db</code>.
	 */
	public void setDb(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.event.db</code>.
	 */
	public String getDb() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.event.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.event.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.event.body</code>.
	 */
	public void setBody(byte[] value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.event.body</code>.
	 */
	public byte[] getBody() {
		return (byte[]) getValue(2);
	}

	/**
	 * Setter for <code>mysql.event.definer</code>.
	 */
	public void setDefiner(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.event.definer</code>.
	 */
	public String getDefiner() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>mysql.event.execute_at</code>.
	 */
	public void setExecuteAt(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.event.execute_at</code>.
	 */
	public Timestamp getExecuteAt() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>mysql.event.interval_value</code>.
	 */
	public void setIntervalValue(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.event.interval_value</code>.
	 */
	public Integer getIntervalValue() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>mysql.event.interval_field</code>.
	 */
	public void setIntervalField(EventIntervalField value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.event.interval_field</code>.
	 */
	public EventIntervalField getIntervalField() {
		return (EventIntervalField) getValue(6);
	}

	/**
	 * Setter for <code>mysql.event.created</code>.
	 */
	public void setCreated(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mysql.event.created</code>.
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>mysql.event.modified</code>.
	 */
	public void setModified(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>mysql.event.modified</code>.
	 */
	public Timestamp getModified() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>mysql.event.last_executed</code>.
	 */
	public void setLastExecuted(Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>mysql.event.last_executed</code>.
	 */
	public Timestamp getLastExecuted() {
		return (Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>mysql.event.starts</code>.
	 */
	public void setStarts(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>mysql.event.starts</code>.
	 */
	public Timestamp getStarts() {
		return (Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>mysql.event.ends</code>.
	 */
	public void setEnds(Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>mysql.event.ends</code>.
	 */
	public Timestamp getEnds() {
		return (Timestamp) getValue(11);
	}

	/**
	 * Setter for <code>mysql.event.status</code>.
	 */
	public void setStatus(EventStatus value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>mysql.event.status</code>.
	 */
	public EventStatus getStatus() {
		return (EventStatus) getValue(12);
	}

	/**
	 * Setter for <code>mysql.event.on_completion</code>.
	 */
	public void setOnCompletion(EventOnCompletion value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>mysql.event.on_completion</code>.
	 */
	public EventOnCompletion getOnCompletion() {
		return (EventOnCompletion) getValue(13);
	}

	/**
	 * Setter for <code>mysql.event.sql_mode</code>.
	 */
	public void setSqlMode(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>mysql.event.sql_mode</code>.
	 */
	public String getSqlMode() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>mysql.event.comment</code>.
	 */
	public void setComment(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>mysql.event.comment</code>.
	 */
	public String getComment() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>mysql.event.originator</code>.
	 */
	public void setOriginator(UInteger value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>mysql.event.originator</code>.
	 */
	public UInteger getOriginator() {
		return (UInteger) getValue(16);
	}

	/**
	 * Setter for <code>mysql.event.time_zone</code>.
	 */
	public void setTimeZone(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>mysql.event.time_zone</code>.
	 */
	public String getTimeZone() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>mysql.event.character_set_client</code>.
	 */
	public void setCharacterSetClient(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>mysql.event.character_set_client</code>.
	 */
	public String getCharacterSetClient() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>mysql.event.collation_connection</code>.
	 */
	public void setCollationConnection(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>mysql.event.collation_connection</code>.
	 */
	public String getCollationConnection() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>mysql.event.db_collation</code>.
	 */
	public void setDbCollation(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>mysql.event.db_collation</code>.
	 */
	public String getDbCollation() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>mysql.event.body_utf8</code>.
	 */
	public void setBodyUtf8(byte[] value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>mysql.event.body_utf8</code>.
	 */
	public byte[] getBodyUtf8() {
		return (byte[]) getValue(21);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<String, String> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record22 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row22<String, String, byte[], String, Timestamp, Integer, EventIntervalField, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, EventStatus, EventOnCompletion, String, String, UInteger, String, String, String, String, byte[]> fieldsRow() {
		return (Row22) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row22<String, String, byte[], String, Timestamp, Integer, EventIntervalField, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, EventStatus, EventOnCompletion, String, String, UInteger, String, String, String, String, byte[]> valuesRow() {
		return (Row22) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Event.EVENT.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Event.EVENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field3() {
		return Event.EVENT.BODY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Event.EVENT.DEFINER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return Event.EVENT.EXECUTE_AT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Event.EVENT.INTERVAL_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<EventIntervalField> field7() {
		return Event.EVENT.INTERVAL_FIELD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return Event.EVENT.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return Event.EVENT.MODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field10() {
		return Event.EVENT.LAST_EXECUTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return Event.EVENT.STARTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field12() {
		return Event.EVENT.ENDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<EventStatus> field13() {
		return Event.EVENT.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<EventOnCompletion> field14() {
		return Event.EVENT.ON_COMPLETION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return Event.EVENT.SQL_MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return Event.EVENT.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field17() {
		return Event.EVENT.ORIGINATOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field18() {
		return Event.EVENT.TIME_ZONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field19() {
		return Event.EVENT.CHARACTER_SET_CLIENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field20() {
		return Event.EVENT.COLLATION_CONNECTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field21() {
		return Event.EVENT.DB_COLLATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field22() {
		return Event.EVENT.BODY_UTF8;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getDb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value3() {
		return getBody();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDefiner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getExecuteAt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getIntervalValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventIntervalField value7() {
		return getIntervalField();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value10() {
		return getLastExecuted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getStarts();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value12() {
		return getEnds();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventStatus value13() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventOnCompletion value14() {
		return getOnCompletion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getSqlMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value17() {
		return getOriginator();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value18() {
		return getTimeZone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value19() {
		return getCharacterSetClient();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value20() {
		return getCollationConnection();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value21() {
		return getDbCollation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value22() {
		return getBodyUtf8();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value1(String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value3(byte[] value) {
		setBody(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value4(String value) {
		setDefiner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value5(Timestamp value) {
		setExecuteAt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value6(Integer value) {
		setIntervalValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value7(EventIntervalField value) {
		setIntervalField(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value8(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value9(Timestamp value) {
		setModified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value10(Timestamp value) {
		setLastExecuted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value11(Timestamp value) {
		setStarts(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value12(Timestamp value) {
		setEnds(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value13(EventStatus value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value14(EventOnCompletion value) {
		setOnCompletion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value15(String value) {
		setSqlMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value16(String value) {
		setComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value17(UInteger value) {
		setOriginator(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value18(String value) {
		setTimeZone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value19(String value) {
		setCharacterSetClient(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value20(String value) {
		setCollationConnection(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value21(String value) {
		setDbCollation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value22(byte[] value) {
		setBodyUtf8(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord values(String value1, String value2, byte[] value3, String value4, Timestamp value5, Integer value6, EventIntervalField value7, Timestamp value8, Timestamp value9, Timestamp value10, Timestamp value11, Timestamp value12, EventStatus value13, EventOnCompletion value14, String value15, String value16, UInteger value17, String value18, String value19, String value20, String value21, byte[] value22) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		value19(value19);
		value20(value20);
		value21(value21);
		value22(value22);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventRecord
	 */
	public EventRecord() {
		super(Event.EVENT);
	}

	/**
	 * Create a detached, initialised EventRecord
	 */
	public EventRecord(String db, String name, byte[] body, String definer, Timestamp executeAt, Integer intervalValue, EventIntervalField intervalField, Timestamp created, Timestamp modified, Timestamp lastExecuted, Timestamp starts, Timestamp ends, EventStatus status, EventOnCompletion onCompletion, String sqlMode, String comment, UInteger originator, String timeZone, String characterSetClient, String collationConnection, String dbCollation, byte[] bodyUtf8) {
		super(Event.EVENT);

		setValue(0, db);
		setValue(1, name);
		setValue(2, body);
		setValue(3, definer);
		setValue(4, executeAt);
		setValue(5, intervalValue);
		setValue(6, intervalField);
		setValue(7, created);
		setValue(8, modified);
		setValue(9, lastExecuted);
		setValue(10, starts);
		setValue(11, ends);
		setValue(12, status);
		setValue(13, onCompletion);
		setValue(14, sqlMode);
		setValue(15, comment);
		setValue(16, originator);
		setValue(17, timeZone);
		setValue(18, characterSetClient);
		setValue(19, collationConnection);
		setValue(20, dbCollation);
		setValue(21, bodyUtf8);
	}
}