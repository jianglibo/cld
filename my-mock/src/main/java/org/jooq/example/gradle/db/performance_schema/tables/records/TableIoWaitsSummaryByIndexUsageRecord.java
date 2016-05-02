/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.example.gradle.db.performance_schema.tables.TableIoWaitsSummaryByIndexUsage;
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
public class TableIoWaitsSummaryByIndexUsageRecord extends TableRecordImpl<TableIoWaitsSummaryByIndexUsageRecord> {

	private static final long serialVersionUID = -320257502;

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_TYPE</code>.
	 */
	public void setObjectType(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_TYPE</code>.
	 */
	public String getObjectType() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_SCHEMA</code>.
	 */
	public void setObjectSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_SCHEMA</code>.
	 */
	public String getObjectSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_NAME</code>.
	 */
	public void setObjectName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_NAME</code>.
	 */
	public String getObjectName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.INDEX_NAME</code>.
	 */
	public void setIndexName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.INDEX_NAME</code>.
	 */
	public String getIndexName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_READ</code>.
	 */
	public void setCountRead(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_READ</code>.
	 */
	public ULong getCountRead() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_READ</code>.
	 */
	public void setSumTimerRead(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_READ</code>.
	 */
	public ULong getSumTimerRead() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_READ</code>.
	 */
	public void setMinTimerRead(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_READ</code>.
	 */
	public ULong getMinTimerRead() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_READ</code>.
	 */
	public void setAvgTimerRead(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_READ</code>.
	 */
	public ULong getAvgTimerRead() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_READ</code>.
	 */
	public void setMaxTimerRead(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_READ</code>.
	 */
	public ULong getMaxTimerRead() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_WRITE</code>.
	 */
	public void setCountWrite(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_WRITE</code>.
	 */
	public ULong getCountWrite() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE</code>.
	 */
	public void setSumTimerWrite(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE</code>.
	 */
	public ULong getSumTimerWrite() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE</code>.
	 */
	public void setMinTimerWrite(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE</code>.
	 */
	public ULong getMinTimerWrite() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE</code>.
	 */
	public void setAvgTimerWrite(ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE</code>.
	 */
	public ULong getAvgTimerWrite() {
		return (ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE</code>.
	 */
	public void setMaxTimerWrite(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE</code>.
	 */
	public ULong getMaxTimerWrite() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_FETCH</code>.
	 */
	public void setCountFetch(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_FETCH</code>.
	 */
	public ULong getCountFetch() {
		return (ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH</code>.
	 */
	public void setSumTimerFetch(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH</code>.
	 */
	public ULong getSumTimerFetch() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH</code>.
	 */
	public void setMinTimerFetch(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH</code>.
	 */
	public ULong getMinTimerFetch() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH</code>.
	 */
	public void setAvgTimerFetch(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH</code>.
	 */
	public ULong getAvgTimerFetch() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH</code>.
	 */
	public void setMaxTimerFetch(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH</code>.
	 */
	public ULong getMaxTimerFetch() {
		return (ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_INSERT</code>.
	 */
	public void setCountInsert(ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_INSERT</code>.
	 */
	public ULong getCountInsert() {
		return (ULong) getValue(24);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT</code>.
	 */
	public void setSumTimerInsert(ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT</code>.
	 */
	public ULong getSumTimerInsert() {
		return (ULong) getValue(25);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT</code>.
	 */
	public void setMinTimerInsert(ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT</code>.
	 */
	public ULong getMinTimerInsert() {
		return (ULong) getValue(26);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT</code>.
	 */
	public void setAvgTimerInsert(ULong value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT</code>.
	 */
	public ULong getAvgTimerInsert() {
		return (ULong) getValue(27);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT</code>.
	 */
	public void setMaxTimerInsert(ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT</code>.
	 */
	public ULong getMaxTimerInsert() {
		return (ULong) getValue(28);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_UPDATE</code>.
	 */
	public void setCountUpdate(ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_UPDATE</code>.
	 */
	public ULong getCountUpdate() {
		return (ULong) getValue(29);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE</code>.
	 */
	public void setSumTimerUpdate(ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE</code>.
	 */
	public ULong getSumTimerUpdate() {
		return (ULong) getValue(30);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE</code>.
	 */
	public void setMinTimerUpdate(ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE</code>.
	 */
	public ULong getMinTimerUpdate() {
		return (ULong) getValue(31);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE</code>.
	 */
	public void setAvgTimerUpdate(ULong value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE</code>.
	 */
	public ULong getAvgTimerUpdate() {
		return (ULong) getValue(32);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE</code>.
	 */
	public void setMaxTimerUpdate(ULong value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE</code>.
	 */
	public ULong getMaxTimerUpdate() {
		return (ULong) getValue(33);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_DELETE</code>.
	 */
	public void setCountDelete(ULong value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_DELETE</code>.
	 */
	public ULong getCountDelete() {
		return (ULong) getValue(34);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE</code>.
	 */
	public void setSumTimerDelete(ULong value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE</code>.
	 */
	public ULong getSumTimerDelete() {
		return (ULong) getValue(35);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE</code>.
	 */
	public void setMinTimerDelete(ULong value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE</code>.
	 */
	public ULong getMinTimerDelete() {
		return (ULong) getValue(36);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE</code>.
	 */
	public void setAvgTimerDelete(ULong value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE</code>.
	 */
	public ULong getAvgTimerDelete() {
		return (ULong) getValue(37);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE</code>.
	 */
	public void setMaxTimerDelete(ULong value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE</code>.
	 */
	public ULong getMaxTimerDelete() {
		return (ULong) getValue(38);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TableIoWaitsSummaryByIndexUsageRecord
	 */
	public TableIoWaitsSummaryByIndexUsageRecord() {
		super(TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);
	}

	/**
	 * Create a detached, initialised TableIoWaitsSummaryByIndexUsageRecord
	 */
	public TableIoWaitsSummaryByIndexUsageRecord(String objectType, String objectSchema, String objectName, String indexName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countRead, ULong sumTimerRead, ULong minTimerRead, ULong avgTimerRead, ULong maxTimerRead, ULong countWrite, ULong sumTimerWrite, ULong minTimerWrite, ULong avgTimerWrite, ULong maxTimerWrite, ULong countFetch, ULong sumTimerFetch, ULong minTimerFetch, ULong avgTimerFetch, ULong maxTimerFetch, ULong countInsert, ULong sumTimerInsert, ULong minTimerInsert, ULong avgTimerInsert, ULong maxTimerInsert, ULong countUpdate, ULong sumTimerUpdate, ULong minTimerUpdate, ULong avgTimerUpdate, ULong maxTimerUpdate, ULong countDelete, ULong sumTimerDelete, ULong minTimerDelete, ULong avgTimerDelete, ULong maxTimerDelete) {
		super(TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);

		setValue(0, objectType);
		setValue(1, objectSchema);
		setValue(2, objectName);
		setValue(3, indexName);
		setValue(4, countStar);
		setValue(5, sumTimerWait);
		setValue(6, minTimerWait);
		setValue(7, avgTimerWait);
		setValue(8, maxTimerWait);
		setValue(9, countRead);
		setValue(10, sumTimerRead);
		setValue(11, minTimerRead);
		setValue(12, avgTimerRead);
		setValue(13, maxTimerRead);
		setValue(14, countWrite);
		setValue(15, sumTimerWrite);
		setValue(16, minTimerWrite);
		setValue(17, avgTimerWrite);
		setValue(18, maxTimerWrite);
		setValue(19, countFetch);
		setValue(20, sumTimerFetch);
		setValue(21, minTimerFetch);
		setValue(22, avgTimerFetch);
		setValue(23, maxTimerFetch);
		setValue(24, countInsert);
		setValue(25, sumTimerInsert);
		setValue(26, minTimerInsert);
		setValue(27, avgTimerInsert);
		setValue(28, maxTimerInsert);
		setValue(29, countUpdate);
		setValue(30, sumTimerUpdate);
		setValue(31, minTimerUpdate);
		setValue(32, avgTimerUpdate);
		setValue(33, maxTimerUpdate);
		setValue(34, countDelete);
		setValue(35, sumTimerDelete);
		setValue(36, minTimerDelete);
		setValue(37, avgTimerDelete);
		setValue(38, maxTimerDelete);
	}
}