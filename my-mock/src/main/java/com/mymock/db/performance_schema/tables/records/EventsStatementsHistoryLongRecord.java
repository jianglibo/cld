/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.enums.EventsStatementsHistoryLongNestingEventType;
import com.mymock.db.performance_schema.tables.EventsStatementsHistoryLong;

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
public class EventsStatementsHistoryLongRecord extends TableRecordImpl<EventsStatementsHistoryLongRecord> {

	private static final long serialVersionUID = -290219049;

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.THREAD_ID</code>.
	 */
	public void setThreadId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.THREAD_ID</code>.
	 */
	public ULong getThreadId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.EVENT_ID</code>.
	 */
	public void setEventId(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.EVENT_ID</code>.
	 */
	public ULong getEventId() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.END_EVENT_ID</code>.
	 */
	public void setEndEventId(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.END_EVENT_ID</code>.
	 */
	public ULong getEndEventId() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SOURCE</code>.
	 */
	public void setSource(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SOURCE</code>.
	 */
	public String getSource() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.TIMER_START</code>.
	 */
	public void setTimerStart(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.TIMER_START</code>.
	 */
	public ULong getTimerStart() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.TIMER_END</code>.
	 */
	public void setTimerEnd(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.TIMER_END</code>.
	 */
	public ULong getTimerEnd() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.TIMER_WAIT</code>.
	 */
	public void setTimerWait(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.TIMER_WAIT</code>.
	 */
	public ULong getTimerWait() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.LOCK_TIME</code>.
	 */
	public void setLockTime(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.LOCK_TIME</code>.
	 */
	public ULong getLockTime() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SQL_TEXT</code>.
	 */
	public void setSqlText(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SQL_TEXT</code>.
	 */
	public String getSqlText() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.DIGEST</code>.
	 */
	public void setDigest(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.DIGEST</code>.
	 */
	public String getDigest() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.DIGEST_TEXT</code>.
	 */
	public void setDigestText(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.DIGEST_TEXT</code>.
	 */
	public String getDigestText() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.CURRENT_SCHEMA</code>.
	 */
	public void setCurrentSchema(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.CURRENT_SCHEMA</code>.
	 */
	public String getCurrentSchema() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.OBJECT_TYPE</code>.
	 */
	public void setObjectType(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.OBJECT_TYPE</code>.
	 */
	public String getObjectType() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.OBJECT_SCHEMA</code>.
	 */
	public void setObjectSchema(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.OBJECT_SCHEMA</code>.
	 */
	public String getObjectSchema() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.OBJECT_NAME</code>.
	 */
	public void setObjectName(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.OBJECT_NAME</code>.
	 */
	public String getObjectName() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public void setObjectInstanceBegin(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public ULong getObjectInstanceBegin() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.MYSQL_ERRNO</code>.
	 */
	public void setMysqlErrno(Integer value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.MYSQL_ERRNO</code>.
	 */
	public Integer getMysqlErrno() {
		return (Integer) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.RETURNED_SQLSTATE</code>.
	 */
	public void setReturnedSqlstate(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.RETURNED_SQLSTATE</code>.
	 */
	public String getReturnedSqlstate() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.MESSAGE_TEXT</code>.
	 */
	public void setMessageText(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.MESSAGE_TEXT</code>.
	 */
	public String getMessageText() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.ERRORS</code>.
	 */
	public void setErrors(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.ERRORS</code>.
	 */
	public ULong getErrors() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.WARNINGS</code>.
	 */
	public void setWarnings(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.WARNINGS</code>.
	 */
	public ULong getWarnings() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.ROWS_AFFECTED</code>.
	 */
	public void setRowsAffected(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.ROWS_AFFECTED</code>.
	 */
	public ULong getRowsAffected() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.ROWS_SENT</code>.
	 */
	public void setRowsSent(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.ROWS_SENT</code>.
	 */
	public ULong getRowsSent() {
		return (ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.ROWS_EXAMINED</code>.
	 */
	public void setRowsExamined(ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.ROWS_EXAMINED</code>.
	 */
	public ULong getRowsExamined() {
		return (ULong) getValue(24);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.CREATED_TMP_DISK_TABLES</code>.
	 */
	public void setCreatedTmpDiskTables(ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.CREATED_TMP_DISK_TABLES</code>.
	 */
	public ULong getCreatedTmpDiskTables() {
		return (ULong) getValue(25);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.CREATED_TMP_TABLES</code>.
	 */
	public void setCreatedTmpTables(ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.CREATED_TMP_TABLES</code>.
	 */
	public ULong getCreatedTmpTables() {
		return (ULong) getValue(26);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SELECT_FULL_JOIN</code>.
	 */
	public void setSelectFullJoin(ULong value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SELECT_FULL_JOIN</code>.
	 */
	public ULong getSelectFullJoin() {
		return (ULong) getValue(27);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SELECT_FULL_RANGE_JOIN</code>.
	 */
	public void setSelectFullRangeJoin(ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SELECT_FULL_RANGE_JOIN</code>.
	 */
	public ULong getSelectFullRangeJoin() {
		return (ULong) getValue(28);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SELECT_RANGE</code>.
	 */
	public void setSelectRange(ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SELECT_RANGE</code>.
	 */
	public ULong getSelectRange() {
		return (ULong) getValue(29);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SELECT_RANGE_CHECK</code>.
	 */
	public void setSelectRangeCheck(ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SELECT_RANGE_CHECK</code>.
	 */
	public ULong getSelectRangeCheck() {
		return (ULong) getValue(30);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SELECT_SCAN</code>.
	 */
	public void setSelectScan(ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SELECT_SCAN</code>.
	 */
	public ULong getSelectScan() {
		return (ULong) getValue(31);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SORT_MERGE_PASSES</code>.
	 */
	public void setSortMergePasses(ULong value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SORT_MERGE_PASSES</code>.
	 */
	public ULong getSortMergePasses() {
		return (ULong) getValue(32);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SORT_RANGE</code>.
	 */
	public void setSortRange(ULong value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SORT_RANGE</code>.
	 */
	public ULong getSortRange() {
		return (ULong) getValue(33);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SORT_ROWS</code>.
	 */
	public void setSortRows(ULong value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SORT_ROWS</code>.
	 */
	public ULong getSortRows() {
		return (ULong) getValue(34);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.SORT_SCAN</code>.
	 */
	public void setSortScan(ULong value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.SORT_SCAN</code>.
	 */
	public ULong getSortScan() {
		return (ULong) getValue(35);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.NO_INDEX_USED</code>.
	 */
	public void setNoIndexUsed(ULong value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.NO_INDEX_USED</code>.
	 */
	public ULong getNoIndexUsed() {
		return (ULong) getValue(36);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.NO_GOOD_INDEX_USED</code>.
	 */
	public void setNoGoodIndexUsed(ULong value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.NO_GOOD_INDEX_USED</code>.
	 */
	public ULong getNoGoodIndexUsed() {
		return (ULong) getValue(37);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.NESTING_EVENT_ID</code>.
	 */
	public void setNestingEventId(ULong value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.NESTING_EVENT_ID</code>.
	 */
	public ULong getNestingEventId() {
		return (ULong) getValue(38);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.NESTING_EVENT_TYPE</code>.
	 */
	public void setNestingEventType(EventsStatementsHistoryLongNestingEventType value) {
		setValue(39, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.NESTING_EVENT_TYPE</code>.
	 */
	public EventsStatementsHistoryLongNestingEventType getNestingEventType() {
		return (EventsStatementsHistoryLongNestingEventType) getValue(39);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_history_long.NESTING_EVENT_LEVEL</code>.
	 */
	public void setNestingEventLevel(Integer value) {
		setValue(40, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_history_long.NESTING_EVENT_LEVEL</code>.
	 */
	public Integer getNestingEventLevel() {
		return (Integer) getValue(40);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsStatementsHistoryLongRecord
	 */
	public EventsStatementsHistoryLongRecord() {
		super(EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG);
	}

	/**
	 * Create a detached, initialised EventsStatementsHistoryLongRecord
	 */
	public EventsStatementsHistoryLongRecord(ULong threadId, ULong eventId, ULong endEventId, String eventName, String source, ULong timerStart, ULong timerEnd, ULong timerWait, ULong lockTime, String sqlText, String digest, String digestText, String currentSchema, String objectType, String objectSchema, String objectName, ULong objectInstanceBegin, Integer mysqlErrno, String returnedSqlstate, String messageText, ULong errors, ULong warnings, ULong rowsAffected, ULong rowsSent, ULong rowsExamined, ULong createdTmpDiskTables, ULong createdTmpTables, ULong selectFullJoin, ULong selectFullRangeJoin, ULong selectRange, ULong selectRangeCheck, ULong selectScan, ULong sortMergePasses, ULong sortRange, ULong sortRows, ULong sortScan, ULong noIndexUsed, ULong noGoodIndexUsed, ULong nestingEventId, EventsStatementsHistoryLongNestingEventType nestingEventType, Integer nestingEventLevel) {
		super(EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG);

		setValue(0, threadId);
		setValue(1, eventId);
		setValue(2, endEventId);
		setValue(3, eventName);
		setValue(4, source);
		setValue(5, timerStart);
		setValue(6, timerEnd);
		setValue(7, timerWait);
		setValue(8, lockTime);
		setValue(9, sqlText);
		setValue(10, digest);
		setValue(11, digestText);
		setValue(12, currentSchema);
		setValue(13, objectType);
		setValue(14, objectSchema);
		setValue(15, objectName);
		setValue(16, objectInstanceBegin);
		setValue(17, mysqlErrno);
		setValue(18, returnedSqlstate);
		setValue(19, messageText);
		setValue(20, errors);
		setValue(21, warnings);
		setValue(22, rowsAffected);
		setValue(23, rowsSent);
		setValue(24, rowsExamined);
		setValue(25, createdTmpDiskTables);
		setValue(26, createdTmpTables);
		setValue(27, selectFullJoin);
		setValue(28, selectFullRangeJoin);
		setValue(29, selectRange);
		setValue(30, selectRangeCheck);
		setValue(31, selectScan);
		setValue(32, sortMergePasses);
		setValue(33, sortRange);
		setValue(34, sortRows);
		setValue(35, sortScan);
		setValue(36, noIndexUsed);
		setValue(37, noGoodIndexUsed);
		setValue(38, nestingEventId);
		setValue(39, nestingEventType);
		setValue(40, nestingEventLevel);
	}
}
