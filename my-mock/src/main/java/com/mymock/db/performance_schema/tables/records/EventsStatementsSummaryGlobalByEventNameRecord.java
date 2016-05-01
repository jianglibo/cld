/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.tables.EventsStatementsSummaryGlobalByEventName;

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
public class EventsStatementsSummaryGlobalByEventNameRecord extends TableRecordImpl<EventsStatementsSummaryGlobalByEventNameRecord> {

	private static final long serialVersionUID = 1251474756;

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_LOCK_TIME</code>.
	 */
	public void setSumLockTime(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_LOCK_TIME</code>.
	 */
	public ULong getSumLockTime() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ERRORS</code>.
	 */
	public void setSumErrors(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ERRORS</code>.
	 */
	public ULong getSumErrors() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_WARNINGS</code>.
	 */
	public void setSumWarnings(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_WARNINGS</code>.
	 */
	public ULong getSumWarnings() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_AFFECTED</code>.
	 */
	public void setSumRowsAffected(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_AFFECTED</code>.
	 */
	public ULong getSumRowsAffected() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_SENT</code>.
	 */
	public void setSumRowsSent(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_SENT</code>.
	 */
	public ULong getSumRowsSent() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_EXAMINED</code>.
	 */
	public void setSumRowsExamined(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_EXAMINED</code>.
	 */
	public ULong getSumRowsExamined() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public void setSumCreatedTmpDiskTables(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public ULong getSumCreatedTmpDiskTables() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CREATED_TMP_TABLES</code>.
	 */
	public void setSumCreatedTmpTables(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CREATED_TMP_TABLES</code>.
	 */
	public ULong getSumCreatedTmpTables() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_FULL_JOIN</code>.
	 */
	public void setSumSelectFullJoin(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_FULL_JOIN</code>.
	 */
	public ULong getSumSelectFullJoin() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public void setSumSelectFullRangeJoin(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public ULong getSumSelectFullRangeJoin() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_RANGE</code>.
	 */
	public void setSumSelectRange(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_RANGE</code>.
	 */
	public ULong getSumSelectRange() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public void setSumSelectRangeCheck(ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public ULong getSumSelectRangeCheck() {
		return (ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_SCAN</code>.
	 */
	public void setSumSelectScan(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_SCAN</code>.
	 */
	public ULong getSumSelectScan() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_MERGE_PASSES</code>.
	 */
	public void setSumSortMergePasses(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_MERGE_PASSES</code>.
	 */
	public ULong getSumSortMergePasses() {
		return (ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_RANGE</code>.
	 */
	public void setSumSortRange(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_RANGE</code>.
	 */
	public ULong getSumSortRange() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_ROWS</code>.
	 */
	public void setSumSortRows(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_ROWS</code>.
	 */
	public ULong getSumSortRows() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_SCAN</code>.
	 */
	public void setSumSortScan(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_SCAN</code>.
	 */
	public ULong getSumSortScan() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_NO_INDEX_USED</code>.
	 */
	public void setSumNoIndexUsed(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_NO_INDEX_USED</code>.
	 */
	public ULong getSumNoIndexUsed() {
		return (ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public void setSumNoGoodIndexUsed(ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_global_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public ULong getSumNoGoodIndexUsed() {
		return (ULong) getValue(24);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsStatementsSummaryGlobalByEventNameRecord
	 */
	public EventsStatementsSummaryGlobalByEventNameRecord() {
		super(EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised EventsStatementsSummaryGlobalByEventNameRecord
	 */
	public EventsStatementsSummaryGlobalByEventNameRecord(String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong sumLockTime, ULong sumErrors, ULong sumWarnings, ULong sumRowsAffected, ULong sumRowsSent, ULong sumRowsExamined, ULong sumCreatedTmpDiskTables, ULong sumCreatedTmpTables, ULong sumSelectFullJoin, ULong sumSelectFullRangeJoin, ULong sumSelectRange, ULong sumSelectRangeCheck, ULong sumSelectScan, ULong sumSortMergePasses, ULong sumSortRange, ULong sumSortRows, ULong sumSortScan, ULong sumNoIndexUsed, ULong sumNoGoodIndexUsed) {
		super(EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME);

		setValue(0, eventName);
		setValue(1, countStar);
		setValue(2, sumTimerWait);
		setValue(3, minTimerWait);
		setValue(4, avgTimerWait);
		setValue(5, maxTimerWait);
		setValue(6, sumLockTime);
		setValue(7, sumErrors);
		setValue(8, sumWarnings);
		setValue(9, sumRowsAffected);
		setValue(10, sumRowsSent);
		setValue(11, sumRowsExamined);
		setValue(12, sumCreatedTmpDiskTables);
		setValue(13, sumCreatedTmpTables);
		setValue(14, sumSelectFullJoin);
		setValue(15, sumSelectFullRangeJoin);
		setValue(16, sumSelectRange);
		setValue(17, sumSelectRangeCheck);
		setValue(18, sumSelectScan);
		setValue(19, sumSortMergePasses);
		setValue(20, sumSortRange);
		setValue(21, sumSortRows);
		setValue(22, sumSortScan);
		setValue(23, sumNoIndexUsed);
		setValue(24, sumNoGoodIndexUsed);
	}
}
