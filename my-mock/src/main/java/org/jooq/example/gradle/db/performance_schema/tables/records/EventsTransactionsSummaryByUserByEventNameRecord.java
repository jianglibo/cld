/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByUserByEventName;
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
public class EventsTransactionsSummaryByUserByEventNameRecord extends TableRecordImpl<EventsTransactionsSummaryByUserByEventNameRecord> implements Record17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

	private static final long serialVersionUID = -2130631959;

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.USER</code>.
	 */
	public void setUser(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.USER</code>.
	 */
	public String getUser() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_WRITE</code>.
	 */
	public void setCountReadWrite(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_WRITE</code>.
	 */
	public ULong getCountReadWrite() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_WRITE</code>.
	 */
	public void setSumTimerReadWrite(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_WRITE</code>.
	 */
	public ULong getSumTimerReadWrite() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_WRITE</code>.
	 */
	public void setMinTimerReadWrite(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_WRITE</code>.
	 */
	public ULong getMinTimerReadWrite() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_WRITE</code>.
	 */
	public void setAvgTimerReadWrite(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_WRITE</code>.
	 */
	public ULong getAvgTimerReadWrite() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_WRITE</code>.
	 */
	public void setMaxTimerReadWrite(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_WRITE</code>.
	 */
	public ULong getMaxTimerReadWrite() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_ONLY</code>.
	 */
	public void setCountReadOnly(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_ONLY</code>.
	 */
	public ULong getCountReadOnly() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_ONLY</code>.
	 */
	public void setSumTimerReadOnly(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_ONLY</code>.
	 */
	public ULong getSumTimerReadOnly() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_ONLY</code>.
	 */
	public void setMinTimerReadOnly(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_ONLY</code>.
	 */
	public ULong getMinTimerReadOnly() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_ONLY</code>.
	 */
	public void setAvgTimerReadOnly(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_ONLY</code>.
	 */
	public ULong getAvgTimerReadOnly() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_ONLY</code>.
	 */
	public void setMaxTimerReadOnly(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_ONLY</code>.
	 */
	public ULong getMaxTimerReadOnly() {
		return (ULong) getValue(16);
	}

	// -------------------------------------------------------------------------
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
		return (Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
		return (Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_STAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MIN_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.AVG_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MAX_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field8() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field9() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_TIMER_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MIN_TIMER_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field11() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.AVG_TIMER_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field12() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MAX_TIMER_READ_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field13() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field14() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_TIMER_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field15() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MIN_TIMER_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field16() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.AVG_TIMER_READ_ONLY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field17() {
		return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MAX_TIMER_READ_ONLY;
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
		return getCountStar();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getSumTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getMinTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getAvgTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value7() {
		return getMaxTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value8() {
		return getCountReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value9() {
		return getSumTimerReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getMinTimerReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value11() {
		return getAvgTimerReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value12() {
		return getMaxTimerReadWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value13() {
		return getCountReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value14() {
		return getSumTimerReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value15() {
		return getMinTimerReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value16() {
		return getAvgTimerReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value17() {
		return getMaxTimerReadOnly();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value1(String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value2(String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value3(ULong value) {
		setCountStar(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value4(ULong value) {
		setSumTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value5(ULong value) {
		setMinTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value6(ULong value) {
		setAvgTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value7(ULong value) {
		setMaxTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value8(ULong value) {
		setCountReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value9(ULong value) {
		setSumTimerReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value10(ULong value) {
		setMinTimerReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value11(ULong value) {
		setAvgTimerReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value12(ULong value) {
		setMaxTimerReadWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value13(ULong value) {
		setCountReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value14(ULong value) {
		setSumTimerReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value15(ULong value) {
		setMinTimerReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value16(ULong value) {
		setAvgTimerReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord value17(ULong value) {
		setMaxTimerReadOnly(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsTransactionsSummaryByUserByEventNameRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, ULong value12, ULong value13, ULong value14, ULong value15, ULong value16, ULong value17) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsTransactionsSummaryByUserByEventNameRecord
	 */
	public EventsTransactionsSummaryByUserByEventNameRecord() {
		super(EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised EventsTransactionsSummaryByUserByEventNameRecord
	 */
	public EventsTransactionsSummaryByUserByEventNameRecord(String user, String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countReadWrite, ULong sumTimerReadWrite, ULong minTimerReadWrite, ULong avgTimerReadWrite, ULong maxTimerReadWrite, ULong countReadOnly, ULong sumTimerReadOnly, ULong minTimerReadOnly, ULong avgTimerReadOnly, ULong maxTimerReadOnly) {
		super(EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME);

		setValue(0, user);
		setValue(1, eventName);
		setValue(2, countStar);
		setValue(3, sumTimerWait);
		setValue(4, minTimerWait);
		setValue(5, avgTimerWait);
		setValue(6, maxTimerWait);
		setValue(7, countReadWrite);
		setValue(8, sumTimerReadWrite);
		setValue(9, minTimerReadWrite);
		setValue(10, avgTimerReadWrite);
		setValue(11, maxTimerReadWrite);
		setValue(12, countReadOnly);
		setValue(13, sumTimerReadOnly);
		setValue(14, minTimerReadOnly);
		setValue(15, avgTimerReadOnly);
		setValue(16, maxTimerReadOnly);
	}
}