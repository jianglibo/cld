/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.tables.EventsStagesSummaryByUserByEventName;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class EventsStagesSummaryByUserByEventNameRecord extends TableRecordImpl<EventsStagesSummaryByUserByEventNameRecord> implements Record7<String, String, ULong, ULong, ULong, ULong, ULong> {

	private static final long serialVersionUID = 2114981886;

	/**
	 * Setter for <code>performance_schema.events_stages_summary_by_user_by_event_name.USER</code>.
	 */
	public void setUser(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_stages_summary_by_user_by_event_name.USER</code>.
	 */
	public String getUser() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_stages_summary_by_user_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_stages_summary_by_user_by_event_name.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_stages_summary_by_user_by_event_name.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_stages_summary_by_user_by_event_name.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<String, String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<String, String, ULong, ULong, ULong, ULong, ULong> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_STAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME.MIN_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME.AVG_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME.MAX_TIMER_WAIT;
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
	public EventsStagesSummaryByUserByEventNameRecord value1(String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByUserByEventNameRecord value2(String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByUserByEventNameRecord value3(ULong value) {
		setCountStar(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByUserByEventNameRecord value4(ULong value) {
		setSumTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByUserByEventNameRecord value5(ULong value) {
		setMinTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByUserByEventNameRecord value6(ULong value) {
		setAvgTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByUserByEventNameRecord value7(ULong value) {
		setMaxTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesSummaryByUserByEventNameRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsStagesSummaryByUserByEventNameRecord
	 */
	public EventsStagesSummaryByUserByEventNameRecord() {
		super(EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised EventsStagesSummaryByUserByEventNameRecord
	 */
	public EventsStagesSummaryByUserByEventNameRecord(String user, String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait) {
		super(EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME);

		setValue(0, user);
		setValue(1, eventName);
		setValue(2, countStar);
		setValue(3, sumTimerWait);
		setValue(4, minTimerWait);
		setValue(5, avgTimerWait);
		setValue(6, maxTimerWait);
	}
}
