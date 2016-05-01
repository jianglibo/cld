/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.enums.EventsTransactionsHistoryLongAccessMode;
import com.mymock.db.performance_schema.enums.EventsTransactionsHistoryLongAutocommit;
import com.mymock.db.performance_schema.enums.EventsTransactionsHistoryLongNestingEventType;
import com.mymock.db.performance_schema.enums.EventsTransactionsHistoryLongState;
import com.mymock.db.performance_schema.tables.EventsTransactionsHistoryLong;

import javax.annotation.Generated;

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
public class EventsTransactionsHistoryLongRecord extends TableRecordImpl<EventsTransactionsHistoryLongRecord> {

	private static final long serialVersionUID = 1150361184;

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.THREAD_ID</code>.
	 */
	public void setThreadId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.THREAD_ID</code>.
	 */
	public ULong getThreadId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.EVENT_ID</code>.
	 */
	public void setEventId(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.EVENT_ID</code>.
	 */
	public ULong getEventId() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.END_EVENT_ID</code>.
	 */
	public void setEndEventId(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.END_EVENT_ID</code>.
	 */
	public ULong getEndEventId() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.STATE</code>.
	 */
	public void setState(EventsTransactionsHistoryLongState value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.STATE</code>.
	 */
	public EventsTransactionsHistoryLongState getState() {
		return (EventsTransactionsHistoryLongState) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.TRX_ID</code>.
	 */
	public void setTrxId(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.TRX_ID</code>.
	 */
	public ULong getTrxId() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.GTID</code>.
	 */
	public void setGtid(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.GTID</code>.
	 */
	public String getGtid() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.XID_FORMAT_ID</code>.
	 */
	public void setXidFormatId(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.XID_FORMAT_ID</code>.
	 */
	public Integer getXidFormatId() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.XID_GTRID</code>.
	 */
	public void setXidGtrid(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.XID_GTRID</code>.
	 */
	public String getXidGtrid() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.XID_BQUAL</code>.
	 */
	public void setXidBqual(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.XID_BQUAL</code>.
	 */
	public String getXidBqual() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.XA_STATE</code>.
	 */
	public void setXaState(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.XA_STATE</code>.
	 */
	public String getXaState() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.SOURCE</code>.
	 */
	public void setSource(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.SOURCE</code>.
	 */
	public String getSource() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.TIMER_START</code>.
	 */
	public void setTimerStart(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.TIMER_START</code>.
	 */
	public ULong getTimerStart() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.TIMER_END</code>.
	 */
	public void setTimerEnd(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.TIMER_END</code>.
	 */
	public ULong getTimerEnd() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.TIMER_WAIT</code>.
	 */
	public void setTimerWait(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.TIMER_WAIT</code>.
	 */
	public ULong getTimerWait() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.ACCESS_MODE</code>.
	 */
	public void setAccessMode(EventsTransactionsHistoryLongAccessMode value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.ACCESS_MODE</code>.
	 */
	public EventsTransactionsHistoryLongAccessMode getAccessMode() {
		return (EventsTransactionsHistoryLongAccessMode) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.ISOLATION_LEVEL</code>.
	 */
	public void setIsolationLevel(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.ISOLATION_LEVEL</code>.
	 */
	public String getIsolationLevel() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.AUTOCOMMIT</code>.
	 */
	public void setAutocommit(EventsTransactionsHistoryLongAutocommit value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.AUTOCOMMIT</code>.
	 */
	public EventsTransactionsHistoryLongAutocommit getAutocommit() {
		return (EventsTransactionsHistoryLongAutocommit) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.NUMBER_OF_SAVEPOINTS</code>.
	 */
	public void setNumberOfSavepoints(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.NUMBER_OF_SAVEPOINTS</code>.
	 */
	public ULong getNumberOfSavepoints() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
	 */
	public void setNumberOfRollbackToSavepoint(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
	 */
	public ULong getNumberOfRollbackToSavepoint() {
		return (ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT</code>.
	 */
	public void setNumberOfReleaseSavepoint(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT</code>.
	 */
	public ULong getNumberOfReleaseSavepoint() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public void setObjectInstanceBegin(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public ULong getObjectInstanceBegin() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.NESTING_EVENT_ID</code>.
	 */
	public void setNestingEventId(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.NESTING_EVENT_ID</code>.
	 */
	public ULong getNestingEventId() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.events_transactions_history_long.NESTING_EVENT_TYPE</code>.
	 */
	public void setNestingEventType(EventsTransactionsHistoryLongNestingEventType value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.events_transactions_history_long.NESTING_EVENT_TYPE</code>.
	 */
	public EventsTransactionsHistoryLongNestingEventType getNestingEventType() {
		return (EventsTransactionsHistoryLongNestingEventType) getValue(23);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsTransactionsHistoryLongRecord
	 */
	public EventsTransactionsHistoryLongRecord() {
		super(EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG);
	}

	/**
	 * Create a detached, initialised EventsTransactionsHistoryLongRecord
	 */
	public EventsTransactionsHistoryLongRecord(ULong threadId, ULong eventId, ULong endEventId, String eventName, EventsTransactionsHistoryLongState state, ULong trxId, String gtid, Integer xidFormatId, String xidGtrid, String xidBqual, String xaState, String source, ULong timerStart, ULong timerEnd, ULong timerWait, EventsTransactionsHistoryLongAccessMode accessMode, String isolationLevel, EventsTransactionsHistoryLongAutocommit autocommit, ULong numberOfSavepoints, ULong numberOfRollbackToSavepoint, ULong numberOfReleaseSavepoint, ULong objectInstanceBegin, ULong nestingEventId, EventsTransactionsHistoryLongNestingEventType nestingEventType) {
		super(EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG);

		setValue(0, threadId);
		setValue(1, eventId);
		setValue(2, endEventId);
		setValue(3, eventName);
		setValue(4, state);
		setValue(5, trxId);
		setValue(6, gtid);
		setValue(7, xidFormatId);
		setValue(8, xidGtrid);
		setValue(9, xidBqual);
		setValue(10, xaState);
		setValue(11, source);
		setValue(12, timerStart);
		setValue(13, timerEnd);
		setValue(14, timerWait);
		setValue(15, accessMode);
		setValue(16, isolationLevel);
		setValue(17, autocommit);
		setValue(18, numberOfSavepoints);
		setValue(19, numberOfRollbackToSavepoint);
		setValue(20, numberOfReleaseSavepoint);
		setValue(21, objectInstanceBegin);
		setValue(22, nestingEventId);
		setValue(23, nestingEventType);
	}
}
