/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.example.gradle.db.performance_schema.enums.PreparedStatementsInstancesOwnerObjectType;
import org.jooq.example.gradle.db.performance_schema.tables.PreparedStatementsInstances;
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
public class PreparedStatementsInstancesRecord extends TableRecordImpl<PreparedStatementsInstancesRecord> {

	private static final long serialVersionUID = 1224063680;

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public void setObjectInstanceBegin(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public ULong getObjectInstanceBegin() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.STATEMENT_ID</code>.
	 */
	public void setStatementId(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.STATEMENT_ID</code>.
	 */
	public ULong getStatementId() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.STATEMENT_NAME</code>.
	 */
	public void setStatementName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.STATEMENT_NAME</code>.
	 */
	public String getStatementName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SQL_TEXT</code>.
	 */
	public void setSqlText(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SQL_TEXT</code>.
	 */
	public String getSqlText() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.OWNER_THREAD_ID</code>.
	 */
	public void setOwnerThreadId(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.OWNER_THREAD_ID</code>.
	 */
	public ULong getOwnerThreadId() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.OWNER_EVENT_ID</code>.
	 */
	public void setOwnerEventId(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.OWNER_EVENT_ID</code>.
	 */
	public ULong getOwnerEventId() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_TYPE</code>.
	 */
	public void setOwnerObjectType(PreparedStatementsInstancesOwnerObjectType value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_TYPE</code>.
	 */
	public PreparedStatementsInstancesOwnerObjectType getOwnerObjectType() {
		return (PreparedStatementsInstancesOwnerObjectType) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_SCHEMA</code>.
	 */
	public void setOwnerObjectSchema(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_SCHEMA</code>.
	 */
	public String getOwnerObjectSchema() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_NAME</code>.
	 */
	public void setOwnerObjectName(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_NAME</code>.
	 */
	public String getOwnerObjectName() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.TIMER_PREPARE</code>.
	 */
	public void setTimerPrepare(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.TIMER_PREPARE</code>.
	 */
	public ULong getTimerPrepare() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.COUNT_REPREPARE</code>.
	 */
	public void setCountReprepare(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.COUNT_REPREPARE</code>.
	 */
	public ULong getCountReprepare() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.COUNT_EXECUTE</code>.
	 */
	public void setCountExecute(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.COUNT_EXECUTE</code>.
	 */
	public ULong getCountExecute() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_TIMER_EXECUTE</code>.
	 */
	public void setSumTimerExecute(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_TIMER_EXECUTE</code>.
	 */
	public ULong getSumTimerExecute() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.MIN_TIMER_EXECUTE</code>.
	 */
	public void setMinTimerExecute(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.MIN_TIMER_EXECUTE</code>.
	 */
	public ULong getMinTimerExecute() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.AVG_TIMER_EXECUTE</code>.
	 */
	public void setAvgTimerExecute(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.AVG_TIMER_EXECUTE</code>.
	 */
	public ULong getAvgTimerExecute() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.MAX_TIMER_EXECUTE</code>.
	 */
	public void setMaxTimerExecute(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.MAX_TIMER_EXECUTE</code>.
	 */
	public ULong getMaxTimerExecute() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_LOCK_TIME</code>.
	 */
	public void setSumLockTime(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_LOCK_TIME</code>.
	 */
	public ULong getSumLockTime() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_ERRORS</code>.
	 */
	public void setSumErrors(ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_ERRORS</code>.
	 */
	public ULong getSumErrors() {
		return (ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_WARNINGS</code>.
	 */
	public void setSumWarnings(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_WARNINGS</code>.
	 */
	public ULong getSumWarnings() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_AFFECTED</code>.
	 */
	public void setSumRowsAffected(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_AFFECTED</code>.
	 */
	public ULong getSumRowsAffected() {
		return (ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_SENT</code>.
	 */
	public void setSumRowsSent(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_SENT</code>.
	 */
	public ULong getSumRowsSent() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_EXAMINED</code>.
	 */
	public void setSumRowsExamined(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_EXAMINED</code>.
	 */
	public ULong getSumRowsExamined() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public void setSumCreatedTmpDiskTables(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public ULong getSumCreatedTmpDiskTables() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_TABLES</code>.
	 */
	public void setSumCreatedTmpTables(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_TABLES</code>.
	 */
	public ULong getSumCreatedTmpTables() {
		return (ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_JOIN</code>.
	 */
	public void setSumSelectFullJoin(ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_JOIN</code>.
	 */
	public ULong getSumSelectFullJoin() {
		return (ULong) getValue(24);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public void setSumSelectFullRangeJoin(ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public ULong getSumSelectFullRangeJoin() {
		return (ULong) getValue(25);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE</code>.
	 */
	public void setSumSelectRange(ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE</code>.
	 */
	public ULong getSumSelectRange() {
		return (ULong) getValue(26);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public void setSumSelectRangeCheck(ULong value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public ULong getSumSelectRangeCheck() {
		return (ULong) getValue(27);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_SCAN</code>.
	 */
	public void setSumSelectScan(ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_SCAN</code>.
	 */
	public ULong getSumSelectScan() {
		return (ULong) getValue(28);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SORT_MERGE_PASSES</code>.
	 */
	public void setSumSortMergePasses(ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SORT_MERGE_PASSES</code>.
	 */
	public ULong getSumSortMergePasses() {
		return (ULong) getValue(29);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SORT_RANGE</code>.
	 */
	public void setSumSortRange(ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SORT_RANGE</code>.
	 */
	public ULong getSumSortRange() {
		return (ULong) getValue(30);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SORT_ROWS</code>.
	 */
	public void setSumSortRows(ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SORT_ROWS</code>.
	 */
	public ULong getSumSortRows() {
		return (ULong) getValue(31);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_SORT_SCAN</code>.
	 */
	public void setSumSortScan(ULong value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_SORT_SCAN</code>.
	 */
	public ULong getSumSortScan() {
		return (ULong) getValue(32);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_NO_INDEX_USED</code>.
	 */
	public void setSumNoIndexUsed(ULong value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_NO_INDEX_USED</code>.
	 */
	public ULong getSumNoIndexUsed() {
		return (ULong) getValue(33);
	}

	/**
	 * Setter for <code>performance_schema.prepared_statements_instances.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public void setSumNoGoodIndexUsed(ULong value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>performance_schema.prepared_statements_instances.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public ULong getSumNoGoodIndexUsed() {
		return (ULong) getValue(34);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PreparedStatementsInstancesRecord
	 */
	public PreparedStatementsInstancesRecord() {
		super(PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES);
	}

	/**
	 * Create a detached, initialised PreparedStatementsInstancesRecord
	 */
	public PreparedStatementsInstancesRecord(ULong objectInstanceBegin, ULong statementId, String statementName, String sqlText, ULong ownerThreadId, ULong ownerEventId, PreparedStatementsInstancesOwnerObjectType ownerObjectType, String ownerObjectSchema, String ownerObjectName, ULong timerPrepare, ULong countReprepare, ULong countExecute, ULong sumTimerExecute, ULong minTimerExecute, ULong avgTimerExecute, ULong maxTimerExecute, ULong sumLockTime, ULong sumErrors, ULong sumWarnings, ULong sumRowsAffected, ULong sumRowsSent, ULong sumRowsExamined, ULong sumCreatedTmpDiskTables, ULong sumCreatedTmpTables, ULong sumSelectFullJoin, ULong sumSelectFullRangeJoin, ULong sumSelectRange, ULong sumSelectRangeCheck, ULong sumSelectScan, ULong sumSortMergePasses, ULong sumSortRange, ULong sumSortRows, ULong sumSortScan, ULong sumNoIndexUsed, ULong sumNoGoodIndexUsed) {
		super(PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES);

		setValue(0, objectInstanceBegin);
		setValue(1, statementId);
		setValue(2, statementName);
		setValue(3, sqlText);
		setValue(4, ownerThreadId);
		setValue(5, ownerEventId);
		setValue(6, ownerObjectType);
		setValue(7, ownerObjectSchema);
		setValue(8, ownerObjectName);
		setValue(9, timerPrepare);
		setValue(10, countReprepare);
		setValue(11, countExecute);
		setValue(12, sumTimerExecute);
		setValue(13, minTimerExecute);
		setValue(14, avgTimerExecute);
		setValue(15, maxTimerExecute);
		setValue(16, sumLockTime);
		setValue(17, sumErrors);
		setValue(18, sumWarnings);
		setValue(19, sumRowsAffected);
		setValue(20, sumRowsSent);
		setValue(21, sumRowsExamined);
		setValue(22, sumCreatedTmpDiskTables);
		setValue(23, sumCreatedTmpTables);
		setValue(24, sumSelectFullJoin);
		setValue(25, sumSelectFullRangeJoin);
		setValue(26, sumSelectRange);
		setValue(27, sumSelectRangeCheck);
		setValue(28, sumSelectScan);
		setValue(29, sumSortMergePasses);
		setValue(30, sumSortRange);
		setValue(31, sumSortRows);
		setValue(32, sumSortScan);
		setValue(33, sumNoIndexUsed);
		setValue(34, sumNoGoodIndexUsed);
	}
}
