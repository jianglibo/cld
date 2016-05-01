/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.tables.SocketSummaryByEventName;

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
public class SocketSummaryByEventNameRecord extends TableRecordImpl<SocketSummaryByEventNameRecord> {

	private static final long serialVersionUID = -416756182;

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.COUNT_READ</code>.
	 */
	public void setCountRead(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.COUNT_READ</code>.
	 */
	public ULong getCountRead() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_READ</code>.
	 */
	public void setSumTimerRead(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_READ</code>.
	 */
	public ULong getSumTimerRead() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_READ</code>.
	 */
	public void setMinTimerRead(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_READ</code>.
	 */
	public ULong getMinTimerRead() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_READ</code>.
	 */
	public void setAvgTimerRead(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_READ</code>.
	 */
	public ULong getAvgTimerRead() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_READ</code>.
	 */
	public void setMaxTimerRead(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_READ</code>.
	 */
	public ULong getMaxTimerRead() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ</code>.
	 */
	public void setSumNumberOfBytesRead(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ</code>.
	 */
	public ULong getSumNumberOfBytesRead() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.COUNT_WRITE</code>.
	 */
	public void setCountWrite(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.COUNT_WRITE</code>.
	 */
	public ULong getCountWrite() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_WRITE</code>.
	 */
	public void setSumTimerWrite(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_WRITE</code>.
	 */
	public ULong getSumTimerWrite() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_WRITE</code>.
	 */
	public void setMinTimerWrite(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_WRITE</code>.
	 */
	public ULong getMinTimerWrite() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_WRITE</code>.
	 */
	public void setAvgTimerWrite(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_WRITE</code>.
	 */
	public ULong getAvgTimerWrite() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_WRITE</code>.
	 */
	public void setMaxTimerWrite(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_WRITE</code>.
	 */
	public ULong getMaxTimerWrite() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE</code>.
	 */
	public void setSumNumberOfBytesWrite(ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE</code>.
	 */
	public ULong getSumNumberOfBytesWrite() {
		return (ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.COUNT_MISC</code>.
	 */
	public void setCountMisc(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.COUNT_MISC</code>.
	 */
	public ULong getCountMisc() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_MISC</code>.
	 */
	public void setSumTimerMisc(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_MISC</code>.
	 */
	public ULong getSumTimerMisc() {
		return (ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_MISC</code>.
	 */
	public void setMinTimerMisc(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_MISC</code>.
	 */
	public ULong getMinTimerMisc() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_MISC</code>.
	 */
	public void setAvgTimerMisc(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_MISC</code>.
	 */
	public ULong getAvgTimerMisc() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_MISC</code>.
	 */
	public void setMaxTimerMisc(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_MISC</code>.
	 */
	public ULong getMaxTimerMisc() {
		return (ULong) getValue(22);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SocketSummaryByEventNameRecord
	 */
	public SocketSummaryByEventNameRecord() {
		super(SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised SocketSummaryByEventNameRecord
	 */
	public SocketSummaryByEventNameRecord(String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countRead, ULong sumTimerRead, ULong minTimerRead, ULong avgTimerRead, ULong maxTimerRead, ULong sumNumberOfBytesRead, ULong countWrite, ULong sumTimerWrite, ULong minTimerWrite, ULong avgTimerWrite, ULong maxTimerWrite, ULong sumNumberOfBytesWrite, ULong countMisc, ULong sumTimerMisc, ULong minTimerMisc, ULong avgTimerMisc, ULong maxTimerMisc) {
		super(SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME);

		setValue(0, eventName);
		setValue(1, countStar);
		setValue(2, sumTimerWait);
		setValue(3, minTimerWait);
		setValue(4, avgTimerWait);
		setValue(5, maxTimerWait);
		setValue(6, countRead);
		setValue(7, sumTimerRead);
		setValue(8, minTimerRead);
		setValue(9, avgTimerRead);
		setValue(10, maxTimerRead);
		setValue(11, sumNumberOfBytesRead);
		setValue(12, countWrite);
		setValue(13, sumTimerWrite);
		setValue(14, minTimerWrite);
		setValue(15, avgTimerWrite);
		setValue(16, maxTimerWrite);
		setValue(17, sumNumberOfBytesWrite);
		setValue(18, countMisc);
		setValue(19, sumTimerMisc);
		setValue(20, minTimerMisc);
		setValue(21, avgTimerMisc);
		setValue(22, maxTimerMisc);
	}
}
